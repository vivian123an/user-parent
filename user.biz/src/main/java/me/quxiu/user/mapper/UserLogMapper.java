package me.quxiu.user.mapper;

import java.util.List;
import java.util.Map;

import me.quxiu.user.base.BaseMapper;
import me.quxiu.user.model.UserLog;

public interface UserLogMapper extends BaseMapper<UserLog>{

    public List<UserLog> getUserLogListPage(Map<String, Object> params);
    
    public int delete(long userLogId);
    
}