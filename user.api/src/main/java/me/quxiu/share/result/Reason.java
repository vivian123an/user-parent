package me.quxiu.share.result;

import java.io.Serializable;

import org.apache.commons.lang.StringUtils;

/**
 * @author wenan.chen@quxiu.me
 * @version 2015年9月7日 下午5:45:30
 * 
 */

public class Reason implements Serializable {

	private static final long serialVersionUID = -8794409324121418468L;
	
	/**
	 * 返回信息
	 */
	private String code = StringUtils.EMPTY;
	/**
	 * 预留
	 */
	private String type = StringUtils.EMPTY;
	/**
	 * 返回信息
	 */
	private String msg = StringUtils.EMPTY;
	/**
	 * 返回信息代码
	 * @return code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * 返回信息代码
	 * @param code
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * 预留
	 * @return type
	 */
	public String getType() {
		return type;
	}
	/**
	 * 预留
	 * @param type
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * 返回信息
	 * @return msg
	 */
	public String getMsg() {
		return msg;
	}
	/**
	 * 返回信息
	 * @param msg
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}

	
	
}
