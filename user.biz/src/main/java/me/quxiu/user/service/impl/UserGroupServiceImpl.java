package me.quxiu.user.service.impl;

import java.util.HashMap;
import java.util.Map;

import me.quxiu.share.query.UserGroupQuery;
import me.quxiu.share.result.ResultEntity;
import me.quxiu.user.base.impl.BaseServiceImpl;
import me.quxiu.user.mapper.UserGroupMapper;
import me.quxiu.user.model.UserGroup;
import me.quxiu.user.service.UserGroupService;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 * 用户分组
 * 
 * @author wenan.chen@quxiu.me
 * @version 2015年7月29日 上午11:45:52
 * 
 */

@Service("userGroupService")
@Transactional(readOnly = true, propagation = Propagation.REQUIRED, rollbackFor = { Exception.class })
public class UserGroupServiceImpl extends BaseServiceImpl<UserGroup> implements UserGroupService{

	protected final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	UserGroupMapper userGroupMapper;
	
	@Override
	protected void initMapper() {
		mapper = userGroupMapper;
	}
	
	@Override
	public ResultEntity<UserGroup> getSimpleUserGroupList(UserGroupQuery queryDto) {
		ResultEntity<UserGroup> resultDO = new ResultEntity<UserGroup>();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("query", queryDto);
		resultDO.getResponseBody().setData(userGroupMapper.getSimpleUserGroupListPage(params));
		resultDO.setQuery(queryDto);
		return resultDO;
	}

	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED , isolation= Isolation.READ_COMMITTED ,rollbackFor = { Exception.class })
	public ResultEntity<UserGroup> addUserGroup(UserGroup entityDO) {
		ResultEntity<UserGroup> resultDO = new ResultEntity<UserGroup>();
		
		if(StringUtils.isBlank(entityDO.getName())){
			resultDO.setStatusCode(ResultEntity.STATUSCODE_REQUEST_ERROR);
			resultDO.setReasonMsg("添加会员分组失败！name不能为空");
            return resultDO;
		}
		if(entityDO.getDiscount() == null){
            resultDO.setStatusCode(ResultEntity.STATUSCODE_REQUEST_ERROR);
            resultDO.setReasonMsg("添加会员分组失败！discount不能为空");
            return resultDO;
		}
		int affectedRows = userGroupMapper.save(entityDO);
        if(0 == affectedRows){
            resultDO.setStatusCode(ResultEntity.STATUSCODE_REQUEST_ERROR);
            resultDO.setReasonMsg("添加会员分组信息失败！");
            return resultDO;
        }
        resultDO.setData(entityDO);
		return resultDO;
	}

	@Override
	@Transactional(readOnly = false,  propagation = Propagation.REQUIRED)	
	public ResultEntity<UserGroup> updateUserGroup(UserGroup entityDO) {
		ResultEntity<UserGroup> resultDO = new ResultEntity<UserGroup>();
		UserGroup entity = userGroupMapper.get(entityDO.getId());
        if(null == entity){
        	resultDO.setStatusCode(ResultEntity.STATUSCODE_ERROR_NULLID);
            resultDO.setReasonMsg("会员分组不存在,UserGroupId:"+entityDO.getId());
            return resultDO;
        }
        entity.setName(entityDO.getName());
        entity.setScore(entityDO.getScore());
        entity.setDiscount(entityDO.getDiscount());
        int affectedRows = userGroupMapper.update(entity);
        if(0 == affectedRows){
            resultDO.setStatusCode(ResultEntity.STATUSCODE_REQUEST_ERROR);
            resultDO.setReasonMsg("更新会员分组信息失败,UserGroupId:"+entityDO.getId());
            return resultDO;
        }
        resultDO.setData(entity);
		return resultDO;
	}

	@Override
	@Transactional(readOnly = false,  propagation = Propagation.REQUIRED)
	public ResultEntity<UserGroup> deleteUserGroup(Integer[] ids) {
		ResultEntity<UserGroup> resultDO = new ResultEntity<UserGroup>();
		
		for(Integer id:ids){
			UserGroup userGroup = userGroupMapper.get(id);
			if(null == userGroup){
				resultDO.setStatusCode(ResultEntity.STATUSCODE_ERROR_NULLID);
	            resultDO.setReasonMsg("记录不存在,UserGroupId:"+id);
	            return resultDO;
			}
	        int affectedRows = userGroupMapper.delete(id);
	        if(0 == affectedRows){
	            resultDO.setStatusCode(ResultEntity.STATUSCODE_REQUEST_ERROR);
	            resultDO.setReasonMsg("删除会员分组信息失败,UserGroupId:"+id);
	            return resultDO;
	        }
		}

		return resultDO;
	}

	

}
