package me.quxiu.user.mapper;

import java.util.List;
import java.util.Map;

import me.quxiu.user.base.BaseMapper;
import me.quxiu.user.dto.UserDTO;
import me.quxiu.user.model.User;

public interface UserMapper extends BaseMapper<User>{

    public List<User> getSimpleUserListPage(Map<String, Object> params);
    
    public List<UserDTO> getUserListPage(Map<String, Object> params);
    
}