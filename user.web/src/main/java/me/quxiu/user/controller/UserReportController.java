package me.quxiu.user.controller;

import javax.annotation.Resource;

import me.quxiu.share.query.UserReportQuery;
import me.quxiu.share.result.ResultDO;
import me.quxiu.user.model.UserReport;
import me.quxiu.user.service.UserReportService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/user")
@ResponseBody
public class UserReportController {
	
	@Resource
	UserReportService userReportService;
	
	/**
	 * @param queryDto
	 * @return
	 */
	@RequestMapping(value="/userReportList")
	public ResultDO<UserReport> userReportService(UserReportQuery queryDto){
		
		return userReportService.getUserReportList(queryDto);
	}
	
	
	
	
	

}
