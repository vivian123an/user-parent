package me.quxiu.user.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import me.quxiu.share.query.AppFeedbackQuery;
import me.quxiu.share.result.ResponseBody;
import me.quxiu.share.result.ResultEntity;
import me.quxiu.user.mapper.AppFeedBackMapper;
import me.quxiu.user.model.AppFeedBack;
import me.quxiu.user.service.AppFeedBackService;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service("appFeedBackService")
@Transactional(readOnly = true, propagation = Propagation.REQUIRED, rollbackFor = { Exception.class })
public class AppFeedBackServiceImpl implements AppFeedBackService {

	protected final Logger logger = LoggerFactory.getLogger(getClass());
	@Resource
	private AppFeedBackMapper appFeedBackMapper;
	
	@Override
	public ResultEntity<AppFeedBack> queryAppFeedBackList(AppFeedbackQuery query) {
		
		
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("query", query);
		//查询总数
		Integer allNum = appFeedBackMapper.queryAllRows(params);
		if(allNum<=0){
			return null;
		}
		query.setTotalRecord(allNum);
		int pageIndex = query.getPageIndex()<=0?1:query.getPageIndex();
		params.put("startIndex", (pageIndex-1)*query.getPageSize());
		params.put("pageSize", query.getPageSize());
		List<AppFeedBack> list = appFeedBackMapper.queryInfoList(params);
		//data
		ResultEntity<AppFeedBack> result = new ResultEntity<AppFeedBack>();
		ResponseBody<AppFeedBack> body = new ResponseBody<AppFeedBack>();
		body.setData(list);
		result.setResponseBody(body);
		result.setStatusCode(ResultEntity.STATUSCODE_OK);
		result.setQuery(query);
		return result;
	}

	@Override
	public ResultEntity<AppFeedBack> deleteByIds(String ids) {
		
		String statusCode = ResultEntity.STATUSCODE_SERVER_ERROR;
		String message=StringUtils.EMPTY;
		ResultEntity<AppFeedBack> result = new ResultEntity<AppFeedBack>();
		if(StringUtils.isBlank(ids)||ids.split(",")==null||ids.split(",").length==0){
			message="参数不合法:ids=["+ids+"]";
		}else{
			try {
				appFeedBackMapper.deleteByIds(ids);
				statusCode=ResultEntity.STATUSCODE_OK;
			} catch (Exception e) {
				logger.error(e.getMessage());
				message=e.getMessage();
			}
		}
		result.setStatusCode(statusCode);
		result.setReasonMsg(message);
		return result;
	}
	
	

}
