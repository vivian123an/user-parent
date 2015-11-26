package me.quxiu.user.service;

import me.quxiu.share.query.BaseQuery;
import me.quxiu.share.result.ResultEntity;
import me.quxiu.user.model.MsgSystem;
import me.quxiu.user.model.MsgSystemDto;

public interface MsgSystemService {
	
	
	public ResultEntity<MsgSystem> queryMsgSysList(BaseQuery query);
	
	
	public  ResultEntity<MsgSystem> deleteByIds(String ids);
	
	
	public ResultEntity<MsgSystem> updateMsgSys(MsgSystemDto msgSystemDto);
	
	

}
