package me.quxiu.user.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import me.quxiu.share.query.UserLevelQuery;
import me.quxiu.share.result.ResultDO;
import me.quxiu.share.result.ResultEntity;
import me.quxiu.share.result.ResultSupport;
import me.quxiu.user.base.impl.BaseServiceImpl;
import me.quxiu.user.mapper.UserLevelMapper;
import me.quxiu.user.model.UserLevel;
import me.quxiu.user.service.UserLevelService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author wenan.chen@quxiu.me
 * @version 2015年7月28日 下午3:07:23
 * 
 */

@Service("userLevelService")
@Transactional(readOnly = true, propagation = Propagation.REQUIRED, rollbackFor = { Exception.class })
public class UserLevelServiceImpl extends BaseServiceImpl<UserLevel> implements UserLevelService {

	protected final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	UserLevelMapper userLevelMapper;
	
	@Override
	protected void initMapper() {
		mapper = userLevelMapper;
	}
	
	@Override
	public ResultEntity<UserLevel> getSimpleUserLevelList(UserLevelQuery queryDto) {
		ResultEntity<UserLevel> resultDO = new ResultEntity<UserLevel>();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("query", queryDto);
		resultDO.getResponseBody().setData(userLevelMapper.getSimpleUserLevelListPage(params));
		resultDO.setQuery(queryDto);
		return resultDO;
	}

	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED , isolation= Isolation.READ_COMMITTED ,rollbackFor = { Exception.class })
	public ResultEntity<UserLevel> addUserLevel(UserLevel entityDO) {
		ResultEntity<UserLevel> resultDO = new ResultEntity<UserLevel>();
		int affectedRows = userLevelMapper.save(entityDO);
        if(0 == affectedRows){
        	resultDO.setStatusCode(ResultEntity.STATUSCODE_REQUEST_ERROR);
            resultDO.setReasonMsg("添加会员等级信息失败！");
            return resultDO;
        }
        resultDO.setData(entityDO);
		return resultDO;
	}
	
	@Override
	@Transactional(readOnly = false,  propagation = Propagation.REQUIRED)
	public ResultEntity<UserLevel> updateUserLevel(UserLevel entityDO) {
		ResultEntity<UserLevel> resultDO = new ResultEntity<UserLevel>();
		UserLevel entity = userLevelMapper.get(entityDO.getId());
        if(null == entity){
            resultDO.setStatusCode(ResultEntity.STATUSCODE_ERROR_NULLID);
            resultDO.setReasonMsg("会员等级不存在,UserLevelId:"+entityDO.getId());
            return resultDO;
        }
        entity.setName(entityDO.getName());
        entity.setPoint(entityDO.getPoint());
        int affectedRows = userLevelMapper.update(entity);
        if(0 == affectedRows){
            resultDO.setStatusCode(ResultEntity.STATUSCODE_REQUEST_ERROR);
            resultDO.setReasonMsg("更新会员等级信息失败,UserLevelId:"+entityDO.getId());
            return resultDO;
        }
        resultDO.setData(entity);
		return resultDO;
	}
	
	@Override
	@Transactional(readOnly = false,  propagation = Propagation.REQUIRED)
	public ResultEntity<UserLevel> deleteUserLevel(Integer[] ids) {
		ResultEntity<UserLevel> resultDO = new ResultEntity<UserLevel>();
		
		List<UserLevel> models = new ArrayList<UserLevel>();
		for(Integer id: ids){
			UserLevel userLevel = userLevelMapper.get(id);
			if(null == userLevel){
				resultDO.setStatusCode(ResultEntity.STATUSCODE_ERROR_NULLID);
	            resultDO.setReasonMsg("删除等级信息失败,UserLevelId:"+id);
	            return resultDO;
			}
			
	        int affectedRows = userLevelMapper.delete(id);
	        if(0 == affectedRows){
	            resultDO.setStatusCode(ResultEntity.STATUSCODE_REQUEST_ERROR);
	            resultDO.setReasonMsg("删除等级信息失败,UserLevelId:"+id);
	            return resultDO;
	        }
	        models.add(userLevel);
	        resultDO.getResponseBody().setData(models);
		}
		return resultDO;
	}
}
