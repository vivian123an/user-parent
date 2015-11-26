package me.quxiu.user.controller;

import me.quxiu.share.query.UserGroupQuery;
import me.quxiu.share.result.ResultDO;
import me.quxiu.share.result.ResultEntity;
import me.quxiu.user.model.UserGroup;
import me.quxiu.user.service.UserGroupService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 会员分组基础信息管理
 * 
 * @author wenan.chen@quxiu.me
 * @version 2015年7月29日 下午3:13:30
 * 
 */

@Controller
@RequestMapping("/user/userGroup")
@ResponseBody
public class UserGroupController {
	
	protected final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private UserGroupService userGroupService;
	
	/**
	 * 会员分组信息分页查询
	 * @param orderQuery
	 * @return
	 */
	@RequestMapping(value="/searchList")
	public ResultEntity<UserGroup> searchUserGroup(UserGroupQuery queryDto){
		return userGroupService.getSimpleUserGroupList(queryDto);
	}
	
	/**
	 * 更新会员分组信息
	 * @param userGroup
	 * @return
	 */
	@RequestMapping(value="/update")
	public ResultEntity<UserGroup> updateUserGroup(UserGroup userGroup){
		return userGroupService.updateUserGroup(userGroup);
	}
	
	/**
	 * 新增会员分组信息
	 * @param userGroup
	 * @return
	 */
	@RequestMapping(value="/add")
	public ResultEntity<UserGroup> addUserGroup(UserGroup userGroup){
		return userGroupService.addUserGroup(userGroup);
	}
	
	/**
	 * 物理删除会员分组信息
	 * @param userGroup
	 * @return
	 */
	@RequestMapping(value="/delete")
	public ResultEntity<UserGroup> deleteUserGroup(@RequestBody UserGroupQuery queryDto){
		return userGroupService.deleteUserGroup(queryDto.getIds());
	}
}
