package me.quxiu.user.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import me.quxiu.share.query.ReferralsQuery;
import me.quxiu.share.result.ResultEntity;
import me.quxiu.user.base.impl.BaseServiceImpl;
import me.quxiu.user.mapper.ReferralsMapper;
import me.quxiu.user.mapper.UserMapper;
import me.quxiu.user.model.Referrals;
import me.quxiu.user.model.User;
import me.quxiu.user.service.ReferralsService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * 返利service
 * 
 * @author wenan.chen@quxiu.me
 * @version 2015年8月3日 下午4:02:42
 * 
 */

@Service("referralsService")
@Transactional(readOnly = true, propagation = Propagation.REQUIRED, rollbackFor = { Exception.class })
public class ReferralsServiceImpl extends BaseServiceImpl<Referrals> implements ReferralsService {

	protected final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	ReferralsMapper referralsMapper;
	@Autowired
	UserMapper userMapper;
	
	@Override
	protected void initMapper() {
		mapper = referralsMapper;
	}
	
	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED , isolation= Isolation.READ_COMMITTED ,rollbackFor = { Exception.class })
	public ResultEntity<Referrals> getReferralsPageList(ReferralsQuery queryDto) {
		ResultEntity<Referrals> resultDO = new ResultEntity<Referrals>();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("query", queryDto);
		resultDO.getResponseBody().setData(referralsMapper.getReferralsListPage(params));
		resultDO.setQuery(queryDto);
		return resultDO;
	}

	@Override
	@Transactional(readOnly = false,  propagation = Propagation.REQUIRED)
	public ResultEntity<Referrals> deleteReferrals(Integer[] ids) {
		ResultEntity<Referrals> resultDO = new ResultEntity<Referrals>();
		
		for(Integer referralsId:ids){
			
			Referrals referrals = referralsMapper.get(referralsId);
			if(null == referrals){
	            resultDO.setStatusCode(ResultEntity.STATUSCODE_ERROR_NULLID);
	            resultDO.setReasonMsg("返利记录不存在,ReferralsId:"+referralsId);
	            return resultDO;
			}
	        int affectedRows = referralsMapper.delete(referralsId);
	        if(0 == affectedRows){
	            resultDO.setStatusCode(ResultEntity.STATUSCODE_REQUEST_ERROR);
	            resultDO.setReasonMsg("删除返利记录失败,ReferralsId:"+referralsId);
	            return resultDO;
	        }
	        resultDO.setData(referrals);
		}

		return resultDO;
	}

	@Override
	@Transactional(readOnly = false,  propagation = Propagation.REQUIRED)
	public ResultEntity<Referrals> payReferrals(long referralsId) {
		ResultEntity<Referrals> resultDO = new ResultEntity<Referrals>();
		Referrals referrals = referralsMapper.get(referralsId);
		if(null == referrals){
            resultDO.setStatusCode(ResultEntity.STATUSCODE_ERROR_NULLID);
            resultDO.setReasonMsg("返利记录不存在,ReferralsId:"+referralsId);
            return resultDO;
		}		
		User user = userMapper.get(referrals.getUserId());
		if(null == user){
            resultDO.setStatusCode(ResultEntity.STATUSCODE_ERROR_NULLID);
            resultDO.setReasonMsg("手动发放返利失败，推荐人不存在,userId:"+referrals.getUserId());
            return resultDO;
		}
		user.setMoney(user.getMoney()+referrals.getMoney());
		user.setScore(user.getScore()+referrals.getScore());
		userMapper.update(user);
		resultDO.setData(referrals);
		return resultDO;
	}

	
}
