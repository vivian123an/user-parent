package me.quxiu.user.mapper;

import java.util.List;
import java.util.Map;

import me.quxiu.user.base.BaseMapper;
import me.quxiu.user.model.MsgBox;

public interface MsgBoxMapper extends BaseMapper<MsgBox>{
	
	
	public List<MsgBox> getMsgBoxList(Map<String,Object> params);
	
	public int queryAllRows();
	
	public void deleteByIds(String ids);
	
}