package me.quxiu.user.model;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Referrals implements Serializable{
	
	private static final long serialVersionUID = 7317675456888943082L;

	/**
	 * 主键
	 */
	private long id;

	/**
	 * 推荐人名称
	 */
    private String userName;

    /**
     * 推荐人Id
     */
    private Integer userId;

    /**
     * 购买人名称
     */
    private String relUserName;

    /**
     * 购买人Id
     */
    private Integer relUserId;

    /**
     * 返利金额
     */
    private Double money;

    /**
     * 创建时间
     */
    private Date timeCreate;

    /**
     * 返利发放时间
     */
    private Date timePay;

    private Integer createTimeBak;

    private Integer payTimeBak;

    /**
     * 订单主键
     */
    private Integer orderId;

    /**
     * 返利积分
     */
    private Integer score;

	/**
	 * 主键
	 * @return id
	 */
	public long getId() {
		return id;
	}

	/**
	 * 主键
	 * @param id
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * 推荐人名称
	 * @return userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * 推荐人名称
	 * @param userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
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
	 * 购买人名称
	 * @return relUserName
	 */
	public String getRelUserName() {
		return relUserName;
	}

	/**
	 * 购买人名称
	 * @param relUserName
	 */
	public void setRelUserName(String relUserName) {
		this.relUserName = relUserName;
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
	 * 返利金额
	 * @return money
	 */
	public Double getMoney() {
		return money;
	}

	/**
	 * 返利金额
	 * @param money
	 */
	public void setMoney(Double money) {
		this.money = money;
	}

	/**
	 * 创建时间
	 * @return timeCreate
	 */
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	public Date getTimeCreate() {
		return timeCreate;
	}

	/**
	 * 创建时间
	 * @param timeCreate
	 */
	public void setTimeCreate(Date timeCreate) {
		this.timeCreate = timeCreate;
	}

	/**
	 * 返利发放时间
	 * @return timePay
	 */
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	public Date getTimePay() {
		return timePay;
	}

	/**
	 * 返利发放时间
	 * @param timePay
	 */
	public void setTimePay(Date timePay) {
		this.timePay = timePay;
	}

	/**
	 * createTimeBak
	 * @return createTimeBak
	 */
	public Integer getCreateTimeBak() {
		return createTimeBak;
	}

	/**
	 * createTimeBak
	 * @param createTimeBak
	 */
	public void setCreateTimeBak(Integer createTimeBak) {
		this.createTimeBak = createTimeBak;
	}

	/**
	 * payTimeBak
	 * @return payTimeBak
	 */
	public Integer getPayTimeBak() {
		return payTimeBak;
	}

	/**
	 * payTimeBak
	 * @param payTimeBak
	 */
	public void setPayTimeBak(Integer payTimeBak) {
		this.payTimeBak = payTimeBak;
	}

	/**
	 * 订单主键
	 * @return orderId
	 */
	public Integer getOrderId() {
		return orderId;
	}

	/**
	 * 订单主键
	 * @param orderId
	 */
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	/**
	 * 返利积分
	 * @return score
	 */
	public Integer getScore() {
		return score;
	}

	/**
	 * 返利积分
	 * @param score
	 */
	public void setScore(Integer score) {
		this.score = score;
	}

    
}