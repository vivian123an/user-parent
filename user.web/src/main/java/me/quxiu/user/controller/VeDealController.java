package me.quxiu.user.controller;

import javax.annotation.Resource;

import me.quxiu.share.result.ResultDO;
import me.quxiu.share.result.ResultSupport;
import me.quxiu.user.dto.VeDealDto;
import me.quxiu.user.service.VeDealService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wenan.chen@quxiu.me
 * @version 2015年9月28日 下午3:36:52
 * 
 */

@Controller
@RequestMapping("/utils")
@ResponseBody
public class VeDealController {

	@Resource
	VeDealService veDealService;
	
	@RequestMapping("/dealCopy")
	public ResultDO<VeDealDto> copyDeal(VeDealDto dto){
		ResultDO<VeDealDto> result = new ResultSupport<VeDealDto>();
		if(dto.getUserId()==null || dto.getVeDealId()==null){
			result.setSuccess(false);
			result.setModel(dto);
			return result;
		}
		
		return veDealService.copyDeal(dto);
	}
}
