package me.quxiu.user.service;

import me.quxiu.share.query.UserLevelQuery;
import me.quxiu.share.result.ResultDO;
import me.quxiu.share.result.ResultEntity;
import me.quxiu.user.base.BaseService;
import me.quxiu.user.model.UserLevel;

/**
 * @author wenan.chen@quxiu.me
 * @version 2015年7月28日 下午3:05:01
 * 
 */

public interface UserLevelService extends BaseService<UserLevel>{

	/**
	 * 分页取用户等级
	 * @param queryDto
	 * @return
	 */
	public ResultEntity<UserLevel> getSimpleUserLevelList(UserLevelQuery queryDto);
	
	/**
	 * 新增会员等级
	 * @param entity
	 * @return
	 */
	public ResultEntity<UserLevel> addUserLevel(UserLevel entityDO);
	
	/**
	 * 更新会员等级
	 * @param entity
	 * @return
	 */
	public ResultEntity<UserLevel> updateUserLevel(UserLevel entityDO);
	
	/**
	 * 物理删除会员等级
	 * @param entity
	 * @return
	 */
	public ResultEntity<UserLevel> deleteUserLevel(Integer[] ids);
}
