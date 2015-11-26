package me.quxiu.user.controller;

import me.quxiu.share.query.ReferralsQuery;
import me.quxiu.share.result.ResultDO;
import me.quxiu.share.result.ResultEntity;
import me.quxiu.user.model.Referrals;
import me.quxiu.user.service.ReferralsService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * 邀请返利记录
 * 
 * @author wenan.chen@quxiu.me
 * @version 2015年8月3日 下午5:14:48
 * 
 */

@Controller
@RequestMapping("/user/referrals")
@ResponseBody
public class ReferralsController {

	protected final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private ReferralsService referralsService;
	
	/**
	 * 推荐返利记录
	 * @param orderQuery
	 * @return
	 */
	@RequestMapping(value="/searchList")
	public ResultEntity<Referrals> search(ReferralsQuery queryDto){
		return referralsService.getReferralsPageList(queryDto);
	}
	
	/**
	 * 逻辑删除
	 * @return
	 */
	@RequestMapping(value="/delete")
	public ResultEntity<Referrals> deleteUser(@RequestBody ReferralsQuery params){
		return referralsService.deleteReferrals(params.getIds());
	}

	/**
	 * 手动发放返利
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/pay/{id}")
	public ResultEntity<Referrals> payReferrals(@PathVariable("id")Long id){
		return referralsService.payReferrals(id);
	}
}
