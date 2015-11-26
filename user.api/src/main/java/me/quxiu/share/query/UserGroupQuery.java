package me.quxiu.share.query;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 会员分组查询DO
 * 
 * @author wenan.chen@quxiu.me
 * @version 2015年7月29日 上午11:29:36
 * 
 */

public class UserGroupQuery  extends BaseQuery implements Serializable{

	private static final long serialVersionUID = 2973716105065011722L;

	/**
	 * 主键数组
	 */
	private Integer[] ids;
	
	/**
	 * 主键
	 */
	private Integer id;

	/**
	 * 组名称
	 */
    private String name;

    /**
     * 积分
     */
    private Integer score;

    /**
     * 折扣
     */
    private Double discount;

    
    
    
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
	 * 组名称
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * 组名称
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 积分
	 * @return score
	 */
	public Integer getScore() {
		return score;
	}

	/**
	 * 积分
	 * @param score
	 */
	public void setScore(Integer score) {
		this.score = score;
	}

	/**
	 * 折扣
	 * @return discount
	 */
	public Double getDiscount() {
		return discount;
	}

	/**
	 * 折扣
	 * @param discount
	 */
	public void setDiscount(Double discount) {
		this.discount = discount;
	}

}
