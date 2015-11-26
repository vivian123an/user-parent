package me.quxiu.share.query;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;


public class UserQuery extends BaseQuery implements Serializable{
	private static final long serialVersionUID = -8349630226011774700L;
	
	/**
	 * 主键数组
	 */
	private Integer[] ids;
	
	/**
	 * 主键
	 */
	private Integer id;
	
	/**
	 * 会员名称
	 */
	private String userName;
	
	/**
	 *  会员邮箱
	 */
	private String email;
	
	/**
	 * 手机号
	 */
	private String mobile;

	/**
	 * 账户余额
	 */
	private Double money;
	
	/**
	 * 经验值
	 */
	private Integer point;
	
	/**
	 * 积分
	 */
	private Integer score;
	
	/**
	 * 会员分组Id
	 */
	private Integer groupId;
	
	/**
	 * 推荐人名称
	 */
	private String pName;
	
	/**
	 * 邀请人名称
	 */
	private String inviteName;

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
	 * 会员名称
	 * @return userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * 会员名称
	 * @param userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * 会员邮箱
	 * @return email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * 会员邮箱
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 手机号
	 * @return mobile
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * 手机号
	 * @param mobile
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * 账户余额
	 * @return money
	 */
	public Double getMoney() {
		return money;
	}

	/**
	 * 账户余额
	 * @param money
	 */
	public void setMoney(Double money) {
		this.money = money;
	}

	/**
	 * 经验值
	 * @return point
	 */
	public Integer getPoint() {
		return point;
	}

	/**
	 * 经验值
	 * @param point
	 */
	public void setPoint(Integer point) {
		this.point = point;
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
	 * 会员分组Id
	 * @return groupId
	 */
	public Integer getGroupId() {
		return groupId;
	}

	/**
	 * 会员分组Id
	 * @param groupId
	 */
	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	/**
	 * 推荐人名称
	 * @return pName
	 */
	public String getpName() {
		return pName;
	}

	/**
	 * 推荐人名称
	 * @param pName
	 */
	public void setpName(String pName) {
		this.pName = pName;
	}

	/**
	 * 邀请人名称
	 * @return inviteName
	 */
	public String getInviteName() {
		return inviteName;
	}

	/**
	 * 邀请人名称
	 * @param inviteName
	 */
	public void setInviteName(String inviteName) {
		this.inviteName = inviteName;
	}

	
}
