package me.quxiu.user.service;

import me.quxiu.share.query.UserQuery;
import me.quxiu.share.result.ResultEntity;
import me.quxiu.user.base.BaseService;
import me.quxiu.user.dto.UserDTO;
import me.quxiu.user.model.User;

public interface UserService extends BaseService<User> {

	/**
	 * 根据userId取用户
	 * @param orderId
	 * @return
	 */
	public ResultEntity<User> qryByUserId(long userId);
	
	/**
	 * 用户列表数据，只返回简单的User对象
	 * @param queryDto
	 * @return
	 */
	public ResultEntity<User> getSimpleUserList(UserQuery queryDto);
	
	/**
	 * 取用户分页数据
	 * 包含用户分组名称，级别名称，邀请人名称，推荐人名称
	 * @param queryDto
	 * @return
	 */
	public ResultEntity<UserDTO> getUserListPage(UserQuery queryDto);
	
	/**
	 * 新增用户信息
	 * @param user
	 * @return
	 */
	public ResultEntity<User> addUser(User user);
	
	/**
	 * 更新账户余额、经验、积分
	 * 
	 * <p>正数对应增加，负数对应减少</p>
	 * 
	 * @param money
	 * @param point
	 * @param score
	 * @return
	 */
	public ResultEntity<User> updateMoneyPointScore(long userId,double money,int point,int score);
	
	/**
	 * 删除用户帐号（逻辑删除）
	 * @return
	 */
	public ResultEntity<User> deleteUser(Integer[] ids);
	
	/**
	 * 恢复删除的会员账号
	 * @param userId
	 * @return
	 */
	public ResultEntity<User> resumeUser(Integer[] ids);
	
	/**
	 * 更新用户信息
	 * @param user
	 * @return
	 */
	public ResultEntity<User> updateUser(User userDto);
	
}
