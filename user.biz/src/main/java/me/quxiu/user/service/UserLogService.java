package me.quxiu.user.service;

import me.quxiu.share.query.UserLogQuery;
import me.quxiu.share.result.ResultEntity;
import me.quxiu.user.base.BaseService;
import me.quxiu.user.model.UserLog;

/**
 * @author wenan.chen@quxiu.me
 * @version 2015年7月29日 下午4:14:40
 * 
 */

public interface UserLogService extends BaseService<UserLog> {

	/**
	 * 分页取账户明细
	 * @param queryDto
	 * @return
	 */
	public ResultEntity<UserLog> getUserLogList(UserLogQuery queryDto);
	
	/**
	 * 物理删除账户明细
	 * @param userLogId
	 * @return
	 */
	public ResultEntity<UserLog> delete(Integer[] ids);
}
