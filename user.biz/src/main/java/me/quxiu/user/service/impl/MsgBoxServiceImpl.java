package me.quxiu.user.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import me.quxiu.share.query.BaseQuery;
import me.quxiu.share.result.ResponseBody;
import me.quxiu.share.result.ResultEntity;
import me.quxiu.user.mapper.MsgBoxMapper;
import me.quxiu.user.model.MsgBox;
import me.quxiu.user.service.MsgBoxService;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service("msgBoxService")
@Transactional(readOnly = true, propagation = Propagation.REQUIRED, rollbackFor = { Exception.class })
public class MsgBoxServiceImpl implements MsgBoxService {

	protected final Logger logger = LoggerFactory.getLogger(getClass());
	@Resource
	MsgBoxMapper msgBoxMapper;
	
	@Override
	public ResultEntity<MsgBox> queryMsgBoxList(BaseQuery query) {
		
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("query", query);
		//查询总数
		Integer allNum = msgBoxMapper.queryAllRows();
		if(allNum<=0){
			return null;
		}
		query.setTotalRecord(allNum);
		int pageIndex = query.getPageIndex()<=0?1:query.getPageIndex();
		params.put("startIndex", (pageIndex-1)*query.getPageSize());
		params.put("pageSize", query.getPageSize());
		List<MsgBox> list = msgBoxMapper.getMsgBoxList(params);
		ResultEntity<MsgBox> result = new ResultEntity<MsgBox>();
		ResponseBody<MsgBox> body = new ResponseBody<MsgBox>();
		body.setData(list);
		result.setResponseBody(body);
		result.setStatusCode(ResultEntity.STATUSCODE_OK);
		result.setQuery(query);
		return result;
	}

	@Override
	public ResultEntity<MsgBox> deleteByIds(String ids) {
		String statusCode = ResultEntity.STATUSCODE_SERVER_ERROR;
		String message=StringUtils.EMPTY;
		ResultEntity<MsgBox> result = new ResultEntity<MsgBox>();
		if(StringUtils.isBlank(ids)||ids.split(",")==null||ids.split(",").length==0){
			message="参数不合法:ids=["+ids+"]";
		}else{
			try {
				msgBoxMapper.deleteByIds(ids);
				statusCode= ResultEntity.STATUSCODE_OK;
			} catch (Exception e) {
				logger.error(e.getMessage());
				message=e.getMessage();
			}
		}
		result.setStatusCode(statusCode);
		result.setReasonMsg(message);
		return result;
	}

	@Override
	public ResultEntity<MsgBox> findMsgSysById(Long id) {
		
		String statusCode = ResultEntity.STATUSCODE_SERVER_ERROR;
		String message=StringUtils.EMPTY;
		ResultEntity<MsgBox> result = new ResultEntity<MsgBox>();
		if(id==null||id==0){
			message="参数不合法:id=["+id+"]";
		}else{
			try {
				MsgBox msgBox = msgBoxMapper.get(id);
				result.setData(msgBox);
				statusCode= ResultEntity.STATUSCODE_OK;
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
