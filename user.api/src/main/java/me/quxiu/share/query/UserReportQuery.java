package me.quxiu.share.query;

import java.io.Serializable;

public class UserReportQuery extends BaseQuery implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8690514720804642982L;
	
	private String userName;//用户名称
	private String toRegistTime;//注册时间
	private String endRegistTime;
	private String referee;//推荐人
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getToRegistTime() {
		return toRegistTime;
	}
	public void setToRegistTime(String toRegistTime) {
		this.toRegistTime = toRegistTime;
	}
	public String getEndRegistTime() {
		return endRegistTime;
	}
	public void setEndRegistTime(String endRegistTime) {
		this.endRegistTime = endRegistTime;
	}
	public String getReferee() {
		return referee;
	}
	public void setReferee(String referee) {
		this.referee = referee;
	}
	
	

}
