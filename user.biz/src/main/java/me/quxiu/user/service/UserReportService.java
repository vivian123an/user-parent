package me.quxiu.user.service;

import me.quxiu.share.query.UserReportQuery;
import me.quxiu.share.result.ResultDO;
import me.quxiu.user.model.UserReport;

public interface UserReportService {

	
	public ResultDO<UserReport> getUserReportList(UserReportQuery query);
}
