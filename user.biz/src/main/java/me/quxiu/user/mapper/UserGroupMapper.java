package me.quxiu.user.mapper;

import java.util.List;
import java.util.Map;

import me.quxiu.user.base.BaseMapper;
import me.quxiu.user.model.UserGroup;

public interface UserGroupMapper extends BaseMapper<UserGroup>{
	
	public List<UserGroup> getSimpleUserGroupListPage(Map<String, Object> params);
	
	public int delete(long id);
}