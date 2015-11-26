package me.quxiu.user.service;

import me.quxiu.share.query.BaseQuery;
import me.quxiu.share.result.ResultEntity;
import me.quxiu.user.model.MsgBox;

public interface MsgBoxService {
	
	
	public ResultEntity<MsgBox> queryMsgBoxList(BaseQuery query);
	
	
	public  ResultEntity<MsgBox> deleteByIds(String ids);
	
	
	public ResultEntity<MsgBox> findMsgSysById(Long id);
	
	

}
