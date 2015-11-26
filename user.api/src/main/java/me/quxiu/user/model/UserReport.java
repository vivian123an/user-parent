package me.quxiu.user.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 会员报表返回列表对象
 * @author lenovo
 *
 */
public class UserReport implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3298608485550142927L;
	
	private int finish;
	private long id;
	private int order;
	private int pay;
	private String referee;
	private String refereeDept;
	private Date registTime;
	private int returnGoods;
	private String userName;
	public int getFinish() {
		return finish;
	}
	public void setFinish(int finish) {
		this.finish = finish;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getOrder() {
		return order;
	}
	public void setOrder(int order) {
		this.order = order;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public String getReferee() {
		return referee;
	}
	public void setReferee(String referee) {
		this.referee = referee;
	}
	public String getRefereeDept() {
		return refereeDept;
	}
	public void setRefereeDept(String refereeDept) {
		this.refereeDept = refereeDept;
	}
	public int getReturnGoods() {
		return returnGoods;
	}
	public void setReturnGoods(int returnGoods) {
		this.returnGoods = returnGoods;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Date getRegistTime() {
		return registTime;
	}
	public void setRegistTime(Date registTime) {
		this.registTime = registTime;
	}
	
	

}
