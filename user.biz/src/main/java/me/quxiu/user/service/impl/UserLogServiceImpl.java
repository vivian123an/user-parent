package me.quxiu.user.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import me.quxiu.share.query.UserLogQuery;
import me.quxiu.share.result.ResultEntity;
import me.quxiu.user.base.impl.BaseServiceImpl;
import me.quxiu.user.mapper.UserLogMapper;
import me.quxiu.user.mapper.UserMapper;
import me.quxiu.user.model.User;
import me.quxiu.user.model.UserLog;
import me.quxiu.user.service.UserLogService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author wenan.chen@quxiu.me
 * @version 2015年7月29日 下午4:38:49
 * 
 */

@Service("userLogService")
@Transactional(readOnly = true, propagation = Propagation.REQUIRED, rollbackFor = { Exception.class })
public class UserLogServiceImpl extends BaseServiceImpl<UserLog> implements UserLogService {
	
	protected final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	UserLogMapper userLogMapper;
	@Autowired
	UserMapper userMapper;
	
	@Override
	protected void initMapper() {
		mapper = userLogMapper;
	}
	
	@Override
	public ResultEntity<UserLog> getUserLogList(UserLogQuery queryDto) {
		ResultEntity<UserLog> resultDO = new ResultEntity<UserLog>();
		User user = userMapper.get(queryDto.getUserId());
		if(user==null){
			resultDO.setStatusCode(ResultEntity.STATUSCODE_ERROR_NULLID);
			resultDO.setReasonMsg("用户不存在,userId:"+queryDto.getUserId());
			return resultDO;
		}
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("query", queryDto);
		resultDO.getResponseBody().setData(userLogMapper.getUserLogListPage(params));
		resultDO.setQuery(queryDto);
		return resultDO;
	}

	@Override
	@Transactional(readOnly = false,  propagation = Propagation.REQUIRED)
	public ResultEntity<UserLog> delete(Integer[] ids) {
		ResultEntity<UserLog> resultDO = new ResultEntity<UserLog>();
		
		List<UserLog> models = new ArrayList<UserLog>();
		for(Integer id:ids){
			UserLog entity = userLogMapper.get(id);
			if(null == entity){
				resultDO.setStatusCode(ResultEntity.STATUSCODE_ERROR_NULLID);
	            resultDO.setReasonMsg("账户明细不存在,userLogId:"+id);
	            return resultDO;
			}
			
	        int affectedRows = userLogMapper.delete(id);
	        if(0 == affectedRows){
	        	resultDO.setStatusCode(ResultEntity.STATUSCODE_REQUEST_ERROR);
	            resultDO.setReasonMsg("删除账户明细失败,userLogId:"+id);
	            return resultDO;
	        }
	        models.add(entity);
	        resultDO.getResponseBody().setData(models);
		}
		
		return resultDO;
	}

}
