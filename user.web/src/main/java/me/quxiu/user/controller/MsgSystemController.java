package me.quxiu.user.controller;

import javax.annotation.Resource;

import me.quxiu.share.query.BaseQuery;
import me.quxiu.share.result.ResultEntity;
import me.quxiu.user.model.MsgSystem;
import me.quxiu.user.model.MsgSystemDto;
import me.quxiu.user.service.MsgSystemService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/user")
@ResponseBody
public class MsgSystemController {
	
	@Resource
	MsgSystemService msgSystemService;
	
	/**
	 * 反馈列表
	 * @param queryDto
	 * @return
	 */
	@RequestMapping(value="/msgSysList")
	public ResultEntity<MsgSystem> msgSysList(BaseQuery queryDto){
		
		return msgSystemService.queryMsgSysList(queryDto);
	}
	
	@RequestMapping(value="/deleteMsgSys")
	public ResultEntity<MsgSystem> deleteMsgSys(String ids){
		
		return msgSystemService.deleteByIds(ids);
	}
	
	
	@RequestMapping(value="/updateMsgSys")
	public ResultEntity<MsgSystem> updateMsgSys(MsgSystemDto msgSystemDto){
		
		return msgSystemService.updateMsgSys(msgSystemDto);
	}
	
	
	
	

}
