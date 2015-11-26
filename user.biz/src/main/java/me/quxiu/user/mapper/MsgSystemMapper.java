package me.quxiu.user.mapper;

import java.util.List;
import java.util.Map;

import me.quxiu.user.base.BaseMapper;
import me.quxiu.user.model.MsgSystem;

public interface MsgSystemMapper extends BaseMapper<MsgSystem>{
	
	
	public List<MsgSystem> getMsgSystemList(Map<String,Object> params);
	
	public int queryAllRows();
	
	public void deleteByIds(String ids);
	
	
}