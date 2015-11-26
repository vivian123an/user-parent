package me.quxiu.share.result;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import me.quxiu.share.query.BaseQuery;

/**
 * 针对趣秀前端框架定义的返回对象
 * 
 * @author wenan.chen@quxiu.me
 * @version 2015年9月7日 下午5:42:05
 * 
 */

public class ResultEntity<T> implements Serializable{
	
	private static final long serialVersionUID = 4981497296158297367L;

	public static final String STATUSCODE_OK = "200";
	public static final String STATUSCODE_REQUEST_ERROR = "400";
	public static final String STATUSCODE_ERROR_NULLID = "401";
	public static final String STATUSCODE_SERVER_ERROR = "500";
	
	/**
	 * 200代表返回数据成功
	 */
	private String statusCode = STATUSCODE_OK;
	
	private ResponseBody<T> responseBody = new ResponseBody<T>();
	
	private BaseQuery query;

	/**
	 * 200代表返回数据成功
	 * @return statusCode
	 */
	public String getStatusCode() {
		return statusCode;
	}

	/**
	 * 200代表返回数据成功
	 * @param statusCode
	 */
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public ResponseBody<T> getResponseBody() {
		return responseBody;
	}

	public void setResponseBody(ResponseBody<T> responseBody) {
		this.responseBody = responseBody;
	}

	public BaseQuery getQuery() {
		return query;
	}

	public void setQuery(BaseQuery query) {
		this.query = query;
	}

	/**
	 * 设置reason实体msg值
	 * @param msg
	 */
	public void setReasonMsg(String msg){
		this.getResponseBody().getResponseInfo().getReasons().setMsg(msg);
	}
	
	/**
	 * 设置单个返回实体
	 * @param t
	 */
	public void setData(T t){
		List<T> list = new ArrayList<T>();
		list.add(t);
		this.getResponseBody().setData(list);
	}
}
