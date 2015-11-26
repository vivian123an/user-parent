package me.quxiu.user.controller;

import javax.annotation.Resource;

import me.quxiu.share.query.BaseQuery;
import me.quxiu.share.result.ResultEntity;
import me.quxiu.user.model.MsgBox;
import me.quxiu.user.service.MsgBoxService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/user")
@ResponseBody
public class MsgBoxController {
	
	@Resource
	MsgBoxService msgBoxService;
	

	@RequestMapping(value="/msgBoxList")
	public ResultEntity<MsgBox> msgBoxList(BaseQuery query){
		
		return msgBoxService.queryMsgBoxList(query);
	}
	
	@RequestMapping(value="/deleteMsgBox")
	public ResultEntity<MsgBox> deleteMsgBox(String ids){
		
		return msgBoxService.deleteByIds(ids);
	}
	
	@RequestMapping(value="/getMsgBox")
	public ResultEntity<MsgBox> getMsgBox(Long  id){
		
		return msgBoxService.findMsgSysById(id);
	}
	
	
	
	

}
