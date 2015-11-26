package me.quxiu.share.result;

import java.io.Serializable;
import java.util.List;

/**
 * @author wenan.chen@quxiu.me
 * @version 2015年9月7日 下午5:50:11
 * 
 */

public class ResponseBody<T> implements Serializable {

	private static final long serialVersionUID = 9013859616185884178L;
	
	private ResponseInfo responseInfo = new ResponseInfo();
	
	private List<T> data;

	/**
	 * responseInfo
	 * @return responseInfo
	 */
	public ResponseInfo getResponseInfo() {
		return responseInfo;
	}

	/**
	 * responseInfo
	 * @param responseInfo
	 */
	public void setResponseInfo(ResponseInfo responseInfo) {
		this.responseInfo = responseInfo;
	}

	/**
	 * data
	 * @return data
	 */
	public List<T> getData() {
		return data;
	}

	/**
	 * data
	 * @param data
	 */
	public void setData(List<T> data) {
		this.data = data;
	}
	
	
}
