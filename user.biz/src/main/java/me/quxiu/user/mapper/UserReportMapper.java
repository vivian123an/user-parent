package me.quxiu.user.mapper;

import java.util.List;
import java.util.Map;

import me.quxiu.user.model.UserReport;

public interface UserReportMapper {
	
	
	public List<UserReport> queryUserReportList(Map<String,Object> params);
	
	public int queryAllRows(Map<String,Object> params);

}
