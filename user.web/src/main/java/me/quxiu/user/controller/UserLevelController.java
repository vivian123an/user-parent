package me.quxiu.user.controller;

import me.quxiu.share.query.UserLevelQuery;
import me.quxiu.share.result.ResultDO;
import me.quxiu.share.result.ResultEntity;
import me.quxiu.user.model.UserLevel;
import me.quxiu.user.service.UserLevelService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * 会员等级Controller
 * 
 * @author wenan.chen@quxiu.me
 * @version 2015年7月22日 下午4:10:58
 * 
 */

@Controller
@RequestMapping("/user/userLevel")
@ResponseBody
public class UserLevelController {

	protected final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private UserLevelService userLevelService;
	
	/**
	 * 会员等级信息分页查询
	 * @param orderQuery
	 * @return
	 */
	@RequestMapping(value="/searchList")
	public ResultEntity<UserLevel> searchUserLevel(UserLevelQuery queryDto){
		return userLevelService.getSimpleUserLevelList(queryDto);
	}
	
	/**
	 * 更新会员等级信息
	 * @param userLevel
	 * @return
	 */
	@RequestMapping(value="/update")
	public ResultEntity<UserLevel> updateUserLevel(UserLevel userLevel){
		return userLevelService.updateUserLevel(userLevel);
	}
	
	/**
	 * 新增会员等级信息
	 * @param userLevel
	 * @return
	 */
	@RequestMapping(value="/add")
	public ResultEntity<UserLevel> addUserLevel(UserLevel userLevel){
		return userLevelService.addUserLevel(userLevel);
	}
	
	/**
	 * 物理删除会员等级信息
	 * @param userLevel
	 * @return
	 */
	@RequestMapping(value="/delete")
	public ResultEntity<UserLevel> deleteUserLevel(@RequestBody UserLevelQuery queryDto){
		return userLevelService.deleteUserLevel(queryDto.getIds());
	}
}
