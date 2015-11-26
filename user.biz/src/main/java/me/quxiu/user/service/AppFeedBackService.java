package me.quxiu.user.service;

import me.quxiu.share.query.AppFeedbackQuery;
import me.quxiu.share.result.ResultEntity;
import me.quxiu.user.model.AppFeedBack;

public interface AppFeedBackService {
	
	
	public ResultEntity<AppFeedBack> queryAppFeedBackList(AppFeedbackQuery query);
	
	
	public  ResultEntity<AppFeedBack> deleteByIds(String ids);
	
	

}
