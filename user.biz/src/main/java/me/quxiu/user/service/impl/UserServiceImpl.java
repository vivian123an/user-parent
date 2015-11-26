package me.quxiu.user.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import me.quxiu.share.query.UserQuery;
import me.quxiu.share.result.ResultEntity;
import me.quxiu.user.base.impl.BaseServiceImpl;
import me.quxiu.user.dto.UserDTO;
import me.quxiu.user.mapper.UserMapper;
import me.quxiu.user.model.User;
import me.quxiu.user.service.UserService;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * 用户ve_user表service
 * 
 * @author  wenan.chen@quxiu.me
 * @version 2015年8月6日 下午4:18:53
 */

@Service("userService")
@Transactional(readOnly = true, propagation = Propagation.REQUIRED, rollbackFor = { Exception.class })
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {

	protected final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	UserMapper userMapper;
	
	@Override
	protected void initMapper() {
		mapper = userMapper;
	}

	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED , isolation= Isolation.READ_COMMITTED ,rollbackFor = { Exception.class })
	public ResultEntity<User> addUser(User user) {
		ResultEntity<User> resultDO = new ResultEntity<User>();
		int affectedRows = userMapper.save(user);
        if(0 == affectedRows){
            resultDO.setStatusCode(ResultEntity.STATUSCODE_SERVER_ERROR);
            resultDO.setReasonMsg("添加用户信息失败！");
            return resultDO;
        }
        resultDO.setData(user);
        return resultDO;
	}
	
	@Override
	public ResultEntity<User> qryByUserId(long userId) {
		ResultEntity<User> resultDO = new ResultEntity<User>();
		resultDO.setData(userMapper.get(userId));
		return resultDO;
	}

	@Override
	public ResultEntity<User> getSimpleUserList(UserQuery queryDto) {
		ResultEntity<User> resultDO = new ResultEntity<User>();
		resultDO.getResponseBody().setData(userMapper.getSimpleUserListPage(buildUserListParams(queryDto)));
		resultDO.setQuery(queryDto);
		return resultDO;
	}
	
	@Override
	public ResultEntity<UserDTO> getUserListPage(UserQuery queryDto) {
		ResultEntity<UserDTO> resultDO = new ResultEntity<UserDTO>();
		resultDO.getResponseBody().setData(userMapper.getUserListPage(buildUserListParams(queryDto)));
		resultDO.setQuery(queryDto);
		return resultDO;
	}

	private Map<String, Object> buildUserListParams(UserQuery queryDto) {
		
		if (StringUtils.isNotBlank(queryDto.getUserName())) {
			queryDto.setUserName("%" + queryDto.getUserName() + "%");
		}
		if (StringUtils.isNotBlank(queryDto.getEmail())) {
			queryDto.setEmail("%" + queryDto.getEmail() + "%");
		}
		if (StringUtils.isNotBlank(queryDto.getpName())) {
			queryDto.setpName("%" + queryDto.getpName() + "%");
		}
		
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("query", queryDto);
		
		return params;
	}

	@Override
	@Transactional(readOnly = false,  propagation = Propagation.REQUIRED)
	public ResultEntity<User> updateMoneyPointScore(long userId, double money,
			int point, int score) {
		ResultEntity<User> result = new ResultEntity<User>();
		
		User user = userMapper.get(userId);
		if(user==null){
			result.setStatusCode(ResultEntity.STATUSCODE_ERROR_NULLID);
			result.setReasonMsg("用户不存在,userId:"+userId);
			return result;
		}
		user.setMoney(user.getMoney()+money);
		user.setPoint(user.getPoint()+point);
		user.setScore(user.getScore()+score);
		int affectedRows = userMapper.update(user);
		if(affectedRows == 0){
			result.setStatusCode(ResultEntity.STATUSCODE_SERVER_ERROR);
			result.setReasonMsg("数据更新异常,userId:"+userId);
			return result;
		}
		result.setData(user);
		return result;
	}

	@Override
	@Transactional(readOnly = false,  propagation = Propagation.REQUIRED)
	public ResultEntity<User> deleteUser(Integer[] ids) {
		ResultEntity<User> result = new ResultEntity<User>();
		
		List<User> models = new ArrayList<User>();
		for(Integer id:ids){
			User user = userMapper.get(id);
			if(user==null){
				result.setStatusCode(ResultEntity.STATUSCODE_ERROR_NULLID);
				result.setReasonMsg("用户不存在,userId:"+id);
				return result;
			}
			user.setIsDelete(true);
			int affectedRows = userMapper.update(user);
			if(affectedRows == 0){
				result.setStatusCode(ResultEntity.STATUSCODE_SERVER_ERROR);
				result.setReasonMsg("数据更新异常,userId:"+id);
				return result;
			}
			models.add(user);
			result.getResponseBody().setData(models);
		}

		return result;
	}
	
	@Override
	@Transactional(readOnly = false,  propagation = Propagation.REQUIRED)
	public ResultEntity<User> resumeUser(Integer[] ids) {
		ResultEntity<User> result = new ResultEntity<User>();
		
		List<User> models = new ArrayList<User>();
		for(Integer id: ids){
			User user = userMapper.get(id);
			if(user==null){
				result.setStatusCode(ResultEntity.STATUSCODE_ERROR_NULLID);
				result.setReasonMsg("用户不存在,userId:"+id);
				return result;
			}
			user.setIsDelete(false);
			int affectedRows = userMapper.update(user);
			if(affectedRows == 0){
				result.setStatusCode(ResultEntity.STATUSCODE_SERVER_ERROR);
				result.setReasonMsg("数据更新异常,userId:"+id);
				return result;
			}
			models.add(user);
			result.getResponseBody().setData(models);
		}

		return result;
	}	

	@Override
	@Transactional(readOnly = false,  propagation = Propagation.REQUIRED)
	public ResultEntity<User> updateUser(User userDto) {
		ResultEntity<User> result = new ResultEntity<User>();
		User user = userMapper.get(userDto.getId());
		if(user==null){
			result.setStatusCode(ResultEntity.STATUSCODE_ERROR_NULLID);
			result.setReasonMsg("用户不存在,userId:"+userDto.getId());
			return result;
		}
		
		user.setCity(userDto.getCity());
		user.setDivisionId(userDto.getDivisionId());
		user.setGroupId(userDto.getGroupId());
		user.setIdCardName(userDto.getIdCardName());
		user.setIdCardNo(userDto.getIdCardNo());
		user.setIdValidated(userDto.getIdValidated());
		user.setIsEffect(userDto.getIsEffect());
		user.setLevelId(userDto.getLevelId());
		user.setMobile(userDto.getMobile());
		user.setPid(userDto.getPid());
		user.setProvince(userDto.getProvince());
		user.setSex(userDto.getSex());
		user.setUserPwd(userDto.getUserPwd());
		
		int affectedRows = userMapper.update(user);
		if(affectedRows == 0){
			result.setStatusCode(ResultEntity.STATUSCODE_SERVER_ERROR);
			result.setReasonMsg("数据更新异常,userId:"+userDto.getId());
			return result;
		}
		
		result.setData(user);
		return result;
	}

	
}
