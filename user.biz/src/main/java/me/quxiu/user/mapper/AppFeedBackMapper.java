package me.quxiu.user.mapper;

import java.util.List;
import java.util.Map;

import me.quxiu.user.base.BaseMapper;
import me.quxiu.user.model.AppFeedBack;

public interface AppFeedBackMapper extends BaseMapper<AppFeedBack>{
	
	
	public List<AppFeedBack> queryInfoList(Map<String,Object> params);

	public int queryAllRows(Map<String,Object> params);
	
	public void deleteByIds(String ids);
	
}