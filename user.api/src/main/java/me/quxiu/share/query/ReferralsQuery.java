package me.quxiu.share.query;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author wenan.chen@quxiu.me
 * @version 2015年8月3日 下午4:01:26
 * 
 */

public class ReferralsQuery extends BaseQuery implements Serializable{

	private static final long serialVersionUID = -4208283042815194801L;
	
	/**
	 * 主键数组
	 */
	private Integer[] ids;
	
	/**
	 * 主键
	 */
	private Integer id;
	/**
	 * 推荐人Id
	 */
	private Integer userId;
	/**
	 * 购买人Id
	 */
	private Integer relUserId;
	/**
	 * 订单Id
	 */
	private Integer orderId;
	
	
	/**
	 * 主键数组
	 * @return ids
	 */
	@JsonIgnore
	public Integer[] getIds() {
		return ids;
	}
	/**
	 * 主键数组
	 * @param ids
	 */
	public void setIds(Integer[] ids) {
		this.ids = ids;
	}
	/**
	 * 主键
	 * @return id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 主键
	 * @param id
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 推荐人Id
	 * @return userId
	 */
	public Integer getUserId() {
		return userId;
	}
	/**
	 * 推荐人Id
	 * @param userId
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	/**
	 * 购买人Id
	 * @return relUserId
	 */
	public Integer getRelUserId() {
		return relUserId;
	}
	/**
	 * 购买人Id
	 * @param relUserId
	 */
	public void setRelUserId(Integer relUserId) {
		this.relUserId = relUserId;
	}
	/**
	 * 订单Id
	 * @return orderId
	 */
	public Integer getOrderId() {
		return orderId;
	}
	/**
	 * 订单Id
	 * @param orderId
	 */
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	
}
