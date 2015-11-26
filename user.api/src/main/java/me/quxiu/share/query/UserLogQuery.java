package me.quxiu.share.query;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 账户明细
 * 
 * @author wenan.chen@quxiu.me
 * @version 2015年7月29日 下午4:15:27
 * 
 */

public class UserLogQuery extends BaseQuery implements Serializable{

	private static final long serialVersionUID = -4815855393670345708L;

	/**
	 * 用户主键数组
	 */
	private Integer[] ids;
	
	/**
	 * 用户Id
	 */
    private Integer userId;

    /**
     * 主键
     */
    private Integer id;

	/**
	 * 用户主键数组
	 * @return ids
	 */
    @JsonIgnore
	public Integer[] getIds() {
		return ids;
	}

	/**
	 * 用户主键数组
	 * @param ids
	 */
	public void setIds(Integer[] ids) {
		this.ids = ids;
	}

	/**
	 * 用户Id
	 * @return userId
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * 用户Id
	 * @param userId
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
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

}
