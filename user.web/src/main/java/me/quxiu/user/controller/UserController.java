package me.quxiu.user.controller;

import me.quxiu.share.query.UserQuery;
import me.quxiu.share.result.ResultDO;
import me.quxiu.share.result.ResultEntity;
import me.quxiu.user.model.User;
import me.quxiu.user.service.UserService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 用户
 * 
 * @author  wenan.chen@quxiu.me
 * @version 2015年7月21日 上午9:54:12
 * 
 */

@Controller
@RequestMapping("/user/userInfo")
@ResponseBody
public class UserController {

	protected final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private UserService userService;
	
	/**
	 * 根据主键取用户
	 * @param id
	 * @return
	 */
	@RequestMapping("/qryByUserId")
	public ResultEntity<User> qryByUserId(Integer id){
		return userService.qryByUserId(id);
	}
	
	/**
	 * 新增会员信息
	 * @param user
	 * @return
	 */
	@RequestMapping("/add")
	public ResultEntity<User> saveUser(User user){
		return userService.addUser(user);
	}
	
	/**
	 *  会员信息分页列表
	 * @param orderQuery
	 * @return
	 */
	@RequestMapping(value="/searchList")
	public ResultEntity<User> search(UserQuery queryDto){
		return userService.getSimpleUserList(queryDto);
	}
	
	/**
	 * 更新账户余额，经验，积分 
	 * @return
	 */
	@RequestMapping(value="/updateAccountMoneyPointScore")
	public ResultEntity<User> updateMoneyPointScore(UserQuery userDto){
		return userService.updateMoneyPointScore(userDto.getId(), 
				userDto.getMoney(), userDto.getPoint(), userDto.getScore());
	}
	
	/**
	 * 逻辑删除会员账号
	 * @return
	 */
	@RequestMapping(value="/delete")
	public ResultEntity<User> deleteUser(@RequestBody UserQuery queryDto){
		return userService.deleteUser(queryDto.getIds());
	}
	
	/**
	 * 恢复删除会员账号
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/resume")
	public ResultEntity<User> resumeUser(@RequestBody UserQuery queryDto){
		return userService.resumeUser(queryDto.getIds());
	}
	
	/**
	 * 更新会员信息
	 * @param user
	 * @return
	 */
	@RequestMapping(value="/update")
	public ResultEntity<User> updateUser(User user){
		return userService.updateUser(user);
	}
	
	
}
