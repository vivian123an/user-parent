package me.quxiu.user.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import me.quxiu.share.query.BaseQuery;
import me.quxiu.share.result.ResponseBody;
import me.quxiu.share.result.ResultEntity;
import me.quxiu.user.mapper.MsgSystemMapper;
import me.quxiu.user.model.MsgSystem;
import me.quxiu.user.model.MsgSystemDto;
import me.quxiu.user.service.MsgSystemService;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service("msgSystemService")
@Transactional(readOnly = true, propagation = Propagation.REQUIRED, rollbackFor = { Exception.class })
public class MsgSystemServiceImpl implements MsgSystemService {

	protected final Logger logger = LoggerFactory.getLogger(getClass());
	@Resource
	private MsgSystemMapper msgSystemMapper;
	
	@Override
	public ResultEntity<MsgSystem> queryMsgSysList(BaseQuery query) {
		
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("query", query);
		//查询总数
		Integer allNum = msgSystemMapper.queryAllRows();
		if(allNum<=0){
			return null;
		}
		query.setTotalRecord(allNum);
		int pageIndex = query.getPageIndex()<=0?1:query.getPageIndex();
		params.put("startIndex", (pageIndex-1)*query.getPageSize());
		params.put("pageSize", query.getPageSize());
		List<MsgSystem> list = msgSystemMapper.getMsgSystemList(params);
		ResultEntity<MsgSystem> result = new ResultEntity<MsgSystem>();
		ResponseBody<MsgSystem> body = new ResponseBody<MsgSystem>();
		body.setData(list);
		result.setResponseBody(body);
		result.setStatusCode(ResultEntity.STATUSCODE_OK);
		result.setQuery(query);
		return result;
	}

	@Override
	public ResultEntity<MsgSystem> deleteByIds(String ids) {
		String statusCode = ResultEntity.STATUSCODE_SERVER_ERROR;
		String message=StringUtils.EMPTY;
		ResultEntity<MsgSystem> result = new ResultEntity<MsgSystem>();
		if(StringUtils.isBlank(ids)||ids.split(",")==null||ids.split(",").length==0){
			message="参数不合法:ids=["+ids+"]";
		}else{
			try {
				msgSystemMapper.deleteByIds(ids);
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
	public ResultEntity<MsgSystem> updateMsgSys(MsgSystemDto msgSystemDto) {
		String statusCode = ResultEntity.STATUSCODE_SERVER_ERROR;
		String message=StringUtils.EMPTY;
		ResultEntity<MsgSystem> result = new ResultEntity<MsgSystem>();
		if(msgSystemDto==null||msgSystemDto.getId()==0){
			message="参数不合法，未传入需要编辑的反馈编号ID";
		}else{
			try {
				msgSystemMapper.update(toMsgSystemFromDto(msgSystemDto));
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
	
	private MsgSystem toMsgSystemFromDto(MsgSystemDto msgSystemDto){
		MsgSystem msgSystem = new MsgSystem();
		msgSystem.setId(msgSystemDto.getId());
		msgSystem.setTitle(msgSystemDto.getTitle());
		msgSystem.setUserIds(msgSystemDto.getUser_ids());
		msgSystem.setEndTime(msgSystemDto.getEnd_time());
		msgSystem.setContent(msgSystem.getContent());
		return msgSystem;
	}
	
	

}
