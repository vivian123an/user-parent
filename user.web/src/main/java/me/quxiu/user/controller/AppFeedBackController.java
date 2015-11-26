package me.quxiu.user.controller;

import javax.annotation.Resource;

import me.quxiu.share.query.AppFeedbackQuery;
import me.quxiu.share.result.ResultEntity;
import me.quxiu.user.model.AppFeedBack;
import me.quxiu.user.service.AppFeedBackService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/user")
@ResponseBody
public class AppFeedBackController {
	
	@Resource
	AppFeedBackService appFeedBackService;
	
	/**
	 * 反馈列表
	 * @param AppFeedbackQuery
	 * @return
	 */
	@RequestMapping(value="/appFeedBackList")
	public ResultEntity<AppFeedBack> appFeedBackList(AppFeedbackQuery queryDto){
		
		return appFeedBackService.queryAppFeedBackList(queryDto);
	}
	
	@RequestMapping(value="/deleteFeekBack")
	public ResultEntity<AppFeedBack> deleteByIds(String ids){
		
		return appFeedBackService.deleteByIds(ids);
	}
	
	
	
	

}
