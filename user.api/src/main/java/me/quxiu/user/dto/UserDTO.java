package me.quxiu.user.dto;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @author wenan.chen@quxiu.me
 * @version 2015年9月10日 下午5:07:34
 * 
 */

public class UserDTO implements Serializable{

	private static final long serialVersionUID = 1365449148491883312L;

	/**
	 * 主键
	 */
	private long id;

	/**
	 * 用户名
	 */
    private String userName;

    /**
     * 密码
     */
    private String userPwd;

    /**
     * 最后登录时间 
     */
    private Date timeLogin;

    /**
     * 最后登录IP
     */
    private String loginIp;

    /**
     * 会员组ID
     */
    private long groupId;
    /**
     * 会员组名称
     */
    private String groupName;

    /**
     * 是否有效
     */
    private Boolean isEffect;

    /**
     * 是否删除
     */
    private Boolean isDelete;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 电话号码
     */
    private String mobile;

    /**
     * 积分
     */
    private int score;

    /**
     * 余额
     */
    private Double money;

    /**
     * 性别
     */
    private Boolean sex;
    
    /**
     * 省
     */
    private String province;

    /**
     * 城市
     */
    private String city;

    /**
     * 区级
     */
    private String area;

    /**
     * 地址
     */
    private String address;

    /**
     * 等级Id
     */
    private long levelId;
    /**
     * 等级名称
     */
    private String levelName; 

    /**
     * 经验值
     */
    private int point;

    /**
     * 电话
     */
    private String tel;

    /**
     * 用户头像地址
     */
    private String pic;

    /**
     * 渠道来源
     */
    private String sourceType;

    /**
     * 部门id
     */
    private long divisionId;

    /**
     * 推广端口:1为PC;2为WAP;3为Android;4为iPhone
     */
    private Boolean port;

    /**
     * 身份证名字
     */
    private String idCardName;

    /**
     * 身份证号码
     */
    private String idCardNo;

    /**
     * 身份证图片
     */
    private String idPics;

    /**
     * 身份证是否已经验证
     */
    private Boolean idValidated;

    /**
     * 用户邀请人id	
     */
    private long inviteId;
    /**
     * 邀请人名称
     */
    private String inviteName;
    
    /**
     * 推荐人id
     */
    private long pid;
    /**
     * 推荐人名称
     */
    private String pName;
    
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
	 * 用户名
	 * @return userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * 用户名
	 * @param userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * 密码
	 * @return userPwd
	 */
	public String getUserPwd() {
		return userPwd;
	}
	/**
	 * 密码
	 * @param userPwd
	 */
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	/**
	 * 最后登录时间
	 * @return timeLogin
	 */
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	public Date getTimeLogin() {
		return timeLogin;
	}
	/**
	 * 最后登录时间
	 * @param timeLogin
	 */
	public void setTimeLogin(Date timeLogin) {
		this.timeLogin = timeLogin;
	}
	/**
	 * 最后登录IP
	 * @return loginIp
	 */
	public String getLoginIp() {
		return loginIp;
	}
	/**
	 * 最后登录IP
	 * @param loginIp
	 */
	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}
	/**
	 * 会员组ID
	 * @return groupId
	 */
	public long getGroupId() {
		return groupId;
	}
	/**
	 * 会员组ID
	 * @param groupId
	 */
	public void setGroupId(long groupId) {
		this.groupId = groupId;
	}
	/**
	 * 会员组名称
	 * @return groupName
	 */
	public String getGroupName() {
		return groupName;
	}
	/**
	 * 会员组名称
	 * @param groupName
	 */
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	/**
	 * 是否有效
	 * @return isEffect
	 */
	public Boolean getIsEffect() {
		return isEffect;
	}
	/**
	 * 是否有效
	 * @param isEffect
	 */
	public void setIsEffect(Boolean isEffect) {
		this.isEffect = isEffect;
	}
	/**
	 * 是否删除
	 * @return isDelete
	 */
	public Boolean getIsDelete() {
		return isDelete;
	}
	/**
	 * 是否删除
	 * @param isDelete
	 */
	public void setIsDelete(Boolean isDelete) {
		this.isDelete = isDelete;
	}
	/**
	 * 邮箱
	 * @return email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * 邮箱
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * 电话号码
	 * @return mobile
	 */
	public String getMobile() {
		return mobile;
	}
	/**
	 * 电话号码
	 * @param mobile
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	/**
	 * 积分
	 * @return score
	 */
	public int getScore() {
		return score;
	}
	/**
	 * 积分
	 * @param score
	 */
	public void setScore(int score) {
		this.score = score;
	}
	/**
	 * 余额
	 * @return money
	 */
	public Double getMoney() {
		return money;
	}
	/**
	 * 余额
	 * @param money
	 */
	public void setMoney(Double money) {
		this.money = money;
	}
	/**
	 * 性别
	 * @return sex
	 */
	public Boolean getSex() {
		return sex;
	}
	/**
	 * 性别
	 * @param sex
	 */
	public void setSex(Boolean sex) {
		this.sex = sex;
	}
	/**
	 * 省
	 * @return province
	 */
	public String getProvince() {
		return province;
	}
	/**
	 * 省
	 * @param province
	 */
	public void setProvince(String province) {
		this.province = province;
	}
	/**
	 * 城市
	 * @return city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * 城市
	 * @param city
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * 区级
	 * @return area
	 */
	public String getArea() {
		return area;
	}
	/**
	 * 区级
	 * @param area
	 */
	public void setArea(String area) {
		this.area = area;
	}
	/**
	 * 地址
	 * @return address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * 地址
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * 等级Id
	 * @return levelId
	 */
	public long getLevelId() {
		return levelId;
	}
	/**
	 * 等级Id
	 * @param levelId
	 */
	public void setLevelId(long levelId) {
		this.levelId = levelId;
	}
	/**
	 * 等级名称
	 * @return levelName
	 */
	public String getLevelName() {
		return levelName;
	}
	/**
	 * 等级名称
	 * @param levelName
	 */
	public void setLevelName(String levelName) {
		this.levelName = levelName;
	}
	/**
	 * 经验值
	 * @return point
	 */
	public int getPoint() {
		return point;
	}
	/**
	 * 经验值
	 * @param point
	 */
	public void setPoint(int point) {
		this.point = point;
	}
	/**
	 * 电话
	 * @return tel
	 */
	public String getTel() {
		return tel;
	}
	/**
	 * 电话
	 * @param tel
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}
	/**
	 * 用户头像地址
	 * @return pic
	 */
	public String getPic() {
		return pic;
	}
	/**
	 * 用户头像地址
	 * @param pic
	 */
	public void setPic(String pic) {
		this.pic = pic;
	}
	/**
	 * 渠道来源
	 * @return sourceType
	 */
	public String getSourceType() {
		return sourceType;
	}
	/**
	 * 渠道来源
	 * @param sourceType
	 */
	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}
	/**
	 * 部门id
	 * @return divisionId
	 */
	public long getDivisionId() {
		return divisionId;
	}
	/**
	 * 部门id
	 * @param divisionId
	 */
	public void setDivisionId(long divisionId) {
		this.divisionId = divisionId;
	}
	/**
	 * 推广端口:1为PC;2为WAP;3为Android;4为iPhone
	 * @return port
	 */
	public Boolean getPort() {
		return port;
	}
	/**
	 * 推广端口:1为PC;2为WAP;3为Android;4为iPhone
	 * @param port
	 */
	public void setPort(Boolean port) {
		this.port = port;
	}
	/**
	 * 身份证名字
	 * @return idCardName
	 */
	public String getIdCardName() {
		return idCardName;
	}
	/**
	 * 身份证名字
	 * @param idCardName
	 */
	public void setIdCardName(String idCardName) {
		this.idCardName = idCardName;
	}
	/**
	 * 身份证号码
	 * @return idCardNo
	 */
	public String getIdCardNo() {
		return idCardNo;
	}
	/**
	 * 身份证号码
	 * @param idCardNo
	 */
	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}
	/**
	 * 身份证图片
	 * @return idPics
	 */
	public String getIdPics() {
		return idPics;
	}
	/**
	 * 身份证图片
	 * @param idPics
	 */
	public void setIdPics(String idPics) {
		this.idPics = idPics;
	}
	/**
	 * 身份证是否已经验证
	 * @return idValidated
	 */
	public Boolean getIdValidated() {
		return idValidated;
	}
	/**
	 * 身份证是否已经验证
	 * @param idValidated
	 */
	public void setIdValidated(Boolean idValidated) {
		this.idValidated = idValidated;
	}
	/**
	 * 用户邀请人id
	 * @return inviteId
	 */
	public long getInviteId() {
		return inviteId;
	}
	/**
	 * 用户邀请人id
	 * @param inviteId
	 */
	public void setInviteId(long inviteId) {
		this.inviteId = inviteId;
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
	/**
	 * 推荐人id
	 * @return pid
	 */
	public long getPid() {
		return pid;
	}
	/**
	 * 推荐人id
	 * @param pid
	 */
	public void setPid(long pid) {
		this.pid = pid;
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
	
    
}
