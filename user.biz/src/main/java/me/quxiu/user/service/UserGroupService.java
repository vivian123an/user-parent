package me.quxiu.user.service;

import me.quxiu.share.query.UserGroupQuery;
import me.quxiu.share.result.ResultDO;
import me.quxiu.share.result.ResultEntity;
import me.quxiu.user.base.BaseService;
import me.quxiu.user.model.UserGroup;

/**
 * @author wenan.chen@quxiu.me
 * @version 2015年7月29日 上午11:28:22
 * 
 */

public interface UserGroupService extends BaseService<UserGroup>{

	/**
	 * 分页取用户分组
	 * @param queryDto
	 * @return
	 */
	public ResultEntity<UserGroup> getSimpleUserGroupList(UserGroupQuery queryDto);
	
	/**
	 * 新增会员分组
	 * @param entity
	 * @return
	 */
	public ResultEntity<UserGroup> addUserGroup(UserGroup entityDO);
	
	/**
	 * 更新会员分组
	 * @param entity
	 * @return
	 */
	public ResultEntity<UserGroup> updateUserGroup(UserGroup entityDO);
	
	/**
	 * 物理删除会员分组
	 * @param entity
	 * @return
	 */
	public ResultEntity<UserGroup> deleteUserGroup(Integer[] ids);
}
