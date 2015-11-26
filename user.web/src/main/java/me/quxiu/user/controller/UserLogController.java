package me.quxiu.user.controller;

import me.quxiu.share.query.UserLogQuery;
import me.quxiu.share.result.ResultEntity;
import me.quxiu.user.model.UserLog;
import me.quxiu.user.service.UserLogService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 账户记录明细
 * 
 * @author wenan.chen@quxiu.me
 * @version 2015年7月29日 下午5:20:04
 * 
 */

@Controller
@RequestMapping("/user/userLog")
@ResponseBody
public class UserLogController {
	
	protected final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private UserLogService userLogService;
	
	/**
	 * 会员账户明细分页列表
	 * @param orderQuery
	 * @return
	 */
	@RequestMapping(value="/searchList")
	public ResultEntity<UserLog> searchUserLevel(UserLogQuery queryDto){
		return userLogService.getUserLogList(queryDto);
	}
	
	/**
	 * 物理删除账户明细
	 * @param userLevel
	 * @return
	 */
	@RequestMapping(value="/delete")
	public ResultEntity<UserLog> deleteUserLevel(@RequestBody UserLogQuery queryDto){
		return userLogService.delete(queryDto.getIds());
	}
}
