package me.quxiu.user.dto;

/**
 * @author wenan.chen@quxiu.me
 * @version 2015年9月28日 下午2:19:52
 * 
 */

public class VeDealDto {

	/**
	 * 操作人员Id
	 */
	private Integer userId;
	/**
	 * 操作人员名称
	 */
	private String userName;
	/**
	 * 被拷贝的ve_deal主键
	 */
	private Integer veDealId;
	/**
	 * 新生成的ve_deal主键
	 */
	private Integer newDealId;
	
	/**
	 * 操作人员Id
	 * @return userId
	 */
	public Integer getUserId() {
		return userId;
	}
	/**
	 * 操作人员Id
	 * @param userId
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	/**
	 * 操作人员名称
	 * @return userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * 操作人员名称
	 * @param userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * 被拷贝的ve_deal主键
	 * @return veDealId
	 */
	public Integer getVeDealId() {
		return veDealId;
	}
	/**
	 * 被拷贝的ve_deal主键
	 * @param veDealId
	 */
	public void setVeDealId(Integer veDealId) {
		this.veDealId = veDealId;
	}
	/**
	 * 新生成的ve_deal主键
	 * @return newDealId
	 */
	public Integer getNewDealId() {
		return newDealId;
	}
	/**
	 * 新生成的ve_deal主键
	 * @param newDealId
	 */
	public void setNewDealId(Integer newDealId) {
		this.newDealId = newDealId;
	} 
	


}
