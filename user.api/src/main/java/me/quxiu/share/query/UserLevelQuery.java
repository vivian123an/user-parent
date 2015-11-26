package me.quxiu.share.query;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author wenan.chen@quxiu.me
 * @version 2015年7月28日 下午3:12:16
 * 
 */

public class UserLevelQuery extends BaseQuery implements Serializable{

	private static final long serialVersionUID = 4136570444655070171L;

	/**
	 * 主键数组
	 */
	private Integer[] ids;
	
	/**
	 * 主键
	 */
    private Integer id;

    private String name;

    private Integer point;


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
	 * name
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * point
	 * @return point
	 */
	public Integer getPoint() {
		return point;
	}

	/**
	 * point
	 * @param point
	 */
	public void setPoint(Integer point) {
		this.point = point;
	}
    
    
}
