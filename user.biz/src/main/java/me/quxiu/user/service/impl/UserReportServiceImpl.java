package me.quxiu.user.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import me.quxiu.share.query.UserReportQuery;
import me.quxiu.share.result.ResultDO;
import me.quxiu.share.result.ResultSupport;
import me.quxiu.user.mapper.UserReportMapper;
import me.quxiu.user.model.AppFeedBack;
import me.quxiu.user.model.UserReport;
import me.quxiu.user.service.UserReportService;


@Service("userReportService")
@Transactional(readOnly = true, propagation = Propagation.REQUIRED, rollbackFor = { Exception.class })
public class UserReportServiceImpl implements UserReportService {
	
	protected final Logger logger = LoggerFactory.getLogger(getClass());
	
	
	@Resource
	UserReportMapper userReportMapper;
	
	public ResultDO<UserReport> getUserReportList(UserReportQuery query){
		
		
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("query", query);
		//查询总数
		Integer allNum = userReportMapper.queryAllRows(params);
		if(allNum<=0){
			return null;
		}
		query.setTotalRecord(allNum);
		int pageIndex = query.getPageIndex()<=0?1:query.getPageIndex();
		params.put("startIndex", (pageIndex-1)*query.getPageSize());
		params.put("pageSize", query.getPageSize());
		List<UserReport> list = userReportMapper.queryUserReportList(params);
		ResultDO<UserReport> result = new ResultSupport<UserReport>();
		
		result.setModels(list);
		result.setSuccess(true);
		result.setQuery(query);
		return result;
	}

}
