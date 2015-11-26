package me.quxiu.user.mapper;

import java.util.List;
import java.util.Map;

import me.quxiu.user.base.BaseMapper;
import me.quxiu.user.model.UserLevel;

public interface UserLevelMapper extends BaseMapper<UserLevel>{
	
	public List<UserLevel> getSimpleUserLevelListPage(Map<String, Object> params);
	
	public int delete(long id);
}