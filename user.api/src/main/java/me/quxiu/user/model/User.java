package me.quxiu.user.model;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 用户信息实体
 * @author  wenan.chen@quxiu.me
 * @version 2015年7月22日 下午5:41:32
 */

public class User implements Serializable {
	
	private static final long serialVersionUID = -2167567235516400457L;

	/**
	 * 主键
	 */
	private long id;

	/**
	 * 用户名
	 */
    private String userName;

    private String trueName;

    /**
     * 密码
     */
    private String userPwd;

    /**
     * 创建时间
     */
    private Date timeCreate;

    /**
     * 修改时间
     */
    private Date timeUpdate;

    /**
     * 最后登录时间 
     */
    private Date timeLogin;

    private String loginIp;

    private long groupId;

    private Boolean isEffect;

    private Boolean isDelete;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 电话号码
     */
    private String mobile;

    private int score;

    private Double money;

    private String verify;

    private String code;

    private long pid;

    /**
     * 转发数
     */
    private int referralCount;

    private String passwordVerify;

    /**
     * 整合ID
     */
    private long integrateId;

    /**
     * 抽奖手机
     */
    private String lotteryMobile;

    /**
     * 抽奖确认
     */
    private String lotteryVerify;

    private int verifyCreateTime;

    /**
     * 邀请码
     */
    private String referer;

    private int loginPayTime;

    /**
     * 邮编
     */
    private String zipCode;

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

    private Boolean sex;

    private Boolean isMerchant;

    private long locationId;

    private long levelId;

    private int point;

    private String pUserName;

    private String alipayId;

    private String sinaId;

    private String sinaToken;

    private Boolean isSynSina;

    private String tencentId;

    private String tAccessToken;

    private String tOpenkey;

    private String tOpenid;

    private Boolean isSynTencent;

    private String qqId;

    private String taobaoId;

    private Date birthday;

    private String profession;

    private int height;

    private int weight;

    private Date expected;

    private Boolean babysex;

    private Date babybirthday;

    /**
     * 电话
     */
    private String tel;

    /**
     * 用户头像地址
     */
    private String pic;

    private int pwdFix;

    /**
     * 第三方登录类型
     */
    private String authType;

    /**
     * 第三方登录openid
     */
    private String openid;

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
     * 渠道来源
     */
    private String utmMedium;

    /**
     * 用户邀请人id	
     */
    private long inviteId;

    private String myIntro;

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
	 * trueName
	 * @return trueName
	 */
	public String getTrueName() {
		return trueName;
	}

	/**
	 * trueName
	 * @param trueName
	 */
	public void setTrueName(String trueName) {
		this.trueName = trueName;
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
	 * 修改时间
	 * @return timeUpdate
	 */
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	public Date getTimeUpdate() {
		return timeUpdate;
	}

	/**
	 * 修改时间
	 * @param timeUpdate
	 */
	public void setTimeUpdate(Date timeUpdate) {
		this.timeUpdate = timeUpdate;
	}

	/**
	 * timeLogin
	 * @return timeLogin
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")  
	public Date getTimeLogin() {
		return timeLogin;
	}

	/**
	 * timeLogin
	 * @param timeLogin
	 */
	public void setTimeLogin(Date timeLogin) {
		this.timeLogin = timeLogin;
	}

	/**
	 * loginIp
	 * @return loginIp
	 */
	public String getLoginIp() {
		return loginIp;
	}

	/**
	 * loginIp
	 * @param loginIp
	 */
	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}

	/**
	 * groupId
	 * @return groupId
	 */
	public long getGroupId() {
		return groupId;
	}

	/**
	 * groupId
	 * @param groupId
	 */
	public void setGroupId(long groupId) {
		this.groupId = groupId;
	}

	/**
	 * isEffect
	 * @return isEffect
	 */
	public Boolean getIsEffect() {
		return isEffect;
	}

	/**
	 * isEffect
	 * @param isEffect
	 */
	public void setIsEffect(Boolean isEffect) {
		this.isEffect = isEffect;
	}

	/**
	 * isDelete
	 * @return isDelete
	 */
	public Boolean getIsDelete() {
		return isDelete;
	}

	/**
	 * isDelete
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
	 * score
	 * @return score
	 */
	public int getScore() {
		return score;
	}

	/**
	 * score
	 * @param score
	 */
	public void setScore(int score) {
		this.score = score;
	}

	/**
	 * money
	 * @return money
	 */
	public Double getMoney() {
		return money;
	}

	/**
	 * money
	 * @param money
	 */
	public void setMoney(Double money) {
		this.money = money;
	}

	/**
	 * verify
	 * @return verify
	 */
	public String getVerify() {
		return verify;
	}

	/**
	 * verify
	 * @param verify
	 */
	public void setVerify(String verify) {
		this.verify = verify;
	}

	/**
	 * code
	 * @return code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * code
	 * @param code
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * pid
	 * @return pid
	 */
	public long getPid() {
		return pid;
	}

	/**
	 * pid
	 * @param pid
	 */
	public void setPid(long pid) {
		this.pid = pid;
	}

	/**
	 * 转发数
	 * @return referralCount
	 */
	public int getReferralCount() {
		return referralCount;
	}

	/**
	 * 转发数
	 * @param referralCount
	 */
	public void setReferralCount(int referralCount) {
		this.referralCount = referralCount;
	}

	/**
	 * passwordVerify
	 * @return passwordVerify
	 */
	public String getPasswordVerify() {
		return passwordVerify;
	}

	/**
	 * passwordVerify
	 * @param passwordVerify
	 */
	public void setPasswordVerify(String passwordVerify) {
		this.passwordVerify = passwordVerify;
	}

	/**
	 * 整合ID
	 * @return integrateId
	 */
	public long getIntegrateId() {
		return integrateId;
	}

	/**
	 * 整合ID
	 * @param integrateId
	 */
	public void setIntegrateId(long integrateId) {
		this.integrateId = integrateId;
	}

	/**
	 * 抽奖手机
	 * @return lotteryMobile
	 */
	public String getLotteryMobile() {
		return lotteryMobile;
	}

	/**
	 * 抽奖手机
	 * @param lotteryMobile
	 */
	public void setLotteryMobile(String lotteryMobile) {
		this.lotteryMobile = lotteryMobile;
	}

	/**
	 * 抽奖确认
	 * @return lotteryVerify
	 */
	public String getLotteryVerify() {
		return lotteryVerify;
	}

	/**
	 * 抽奖确认
	 * @param lotteryVerify
	 */
	public void setLotteryVerify(String lotteryVerify) {
		this.lotteryVerify = lotteryVerify;
	}

	/**
	 * verifyCreateTime
	 * @return verifyCreateTime
	 */
	public int getVerifyCreateTime() {
		return verifyCreateTime;
	}

	/**
	 * verifyCreateTime
	 * @param verifyCreateTime
	 */
	public void setVerifyCreateTime(int verifyCreateTime) {
		this.verifyCreateTime = verifyCreateTime;
	}

	/**
	 * 邀请码
	 * @return referer
	 */
	public String getReferer() {
		return referer;
	}

	/**
	 * 邀请码
	 * @param referer
	 */
	public void setReferer(String referer) {
		this.referer = referer;
	}

	/**
	 * loginPayTime
	 * @return loginPayTime
	 */
	public int getLoginPayTime() {
		return loginPayTime;
	}

	/**
	 * loginPayTime
	 * @param loginPayTime
	 */
	public void setLoginPayTime(int loginPayTime) {
		this.loginPayTime = loginPayTime;
	}

	/**
	 * 邮编
	 * @return zipCode
	 */
	public String getZipCode() {
		return zipCode;
	}

	/**
	 * 邮编
	 * @param zipCode
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
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
	 * sex
	 * @return sex
	 */
	public Boolean getSex() {
		return sex;
	}

	/**
	 * sex
	 * @param sex
	 */
	public void setSex(Boolean sex) {
		this.sex = sex;
	}

	/**
	 * isMerchant
	 * @return isMerchant
	 */
	public Boolean getIsMerchant() {
		return isMerchant;
	}

	/**
	 * isMerchant
	 * @param isMerchant
	 */
	public void setIsMerchant(Boolean isMerchant) {
		this.isMerchant = isMerchant;
	}

	/**
	 * locationId
	 * @return locationId
	 */
	public long getLocationId() {
		return locationId;
	}

	/**
	 * locationId
	 * @param locationId
	 */
	public void setLocationId(long locationId) {
		this.locationId = locationId;
	}

	/**
	 * levelId
	 * @return levelId
	 */
	public long getLevelId() {
		return levelId;
	}

	/**
	 * levelId
	 * @param levelId
	 */
	public void setLevelId(long levelId) {
		this.levelId = levelId;
	}

	/**
	 * point
	 * @return point
	 */
	public int getPoint() {
		return point;
	}

	/**
	 * point
	 * @param point
	 */
	public void setPoint(int point) {
		this.point = point;
	}

	/**
	 * pUserName
	 * @return pUserName
	 */
	public String getpUserName() {
		return pUserName;
	}

	/**
	 * pUserName
	 * @param pUserName
	 */
	public void setpUserName(String pUserName) {
		this.pUserName = pUserName;
	}

	/**
	 * alipayId
	 * @return alipayId
	 */
	public String getAlipayId() {
		return alipayId;
	}

	/**
	 * alipayId
	 * @param alipayId
	 */
	public void setAlipayId(String alipayId) {
		this.alipayId = alipayId;
	}

	/**
	 * sinaId
	 * @return sinaId
	 */
	public String getSinaId() {
		return sinaId;
	}

	/**
	 * sinaId
	 * @param sinaId
	 */
	public void setSinaId(String sinaId) {
		this.sinaId = sinaId;
	}

	/**
	 * sinaToken
	 * @return sinaToken
	 */
	public String getSinaToken() {
		return sinaToken;
	}

	/**
	 * sinaToken
	 * @param sinaToken
	 */
	public void setSinaToken(String sinaToken) {
		this.sinaToken = sinaToken;
	}

	/**
	 * isSynSina
	 * @return isSynSina
	 */
	public Boolean getIsSynSina() {
		return isSynSina;
	}

	/**
	 * isSynSina
	 * @param isSynSina
	 */
	public void setIsSynSina(Boolean isSynSina) {
		this.isSynSina = isSynSina;
	}

	/**
	 * tencentId
	 * @return tencentId
	 */
	public String getTencentId() {
		return tencentId;
	}

	/**
	 * tencentId
	 * @param tencentId
	 */
	public void setTencentId(String tencentId) {
		this.tencentId = tencentId;
	}

	/**
	 * tAccessToken
	 * @return tAccessToken
	 */
	public String gettAccessToken() {
		return tAccessToken;
	}

	/**
	 * tAccessToken
	 * @param tAccessToken
	 */
	public void settAccessToken(String tAccessToken) {
		this.tAccessToken = tAccessToken;
	}

	/**
	 * tOpenkey
	 * @return tOpenkey
	 */
	public String gettOpenkey() {
		return tOpenkey;
	}

	/**
	 * tOpenkey
	 * @param tOpenkey
	 */
	public void settOpenkey(String tOpenkey) {
		this.tOpenkey = tOpenkey;
	}

	/**
	 * tOpenid
	 * @return tOpenid
	 */
	public String gettOpenid() {
		return tOpenid;
	}

	/**
	 * tOpenid
	 * @param tOpenid
	 */
	public void settOpenid(String tOpenid) {
		this.tOpenid = tOpenid;
	}

	/**
	 * isSynTencent
	 * @return isSynTencent
	 */
	public Boolean getIsSynTencent() {
		return isSynTencent;
	}

	/**
	 * isSynTencent
	 * @param isSynTencent
	 */
	public void setIsSynTencent(Boolean isSynTencent) {
		this.isSynTencent = isSynTencent;
	}

	/**
	 * qqId
	 * @return qqId
	 */
	public String getQqId() {
		return qqId;
	}

	/**
	 * qqId
	 * @param qqId
	 */
	public void setQqId(String qqId) {
		this.qqId = qqId;
	}

	/**
	 * taobaoId
	 * @return taobaoId
	 */
	public String getTaobaoId() {
		return taobaoId;
	}

	/**
	 * taobaoId
	 * @param taobaoId
	 */
	public void setTaobaoId(String taobaoId) {
		this.taobaoId = taobaoId;
	}

	/**
	 * birthday
	 * @return birthday
	 */
	@JsonFormat(pattern="yyyy-MM-dd")
	public Date getBirthday() {
		return birthday;
	}

	/**
	 * birthday
	 * @param birthday
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	/**
	 * profession
	 * @return profession
	 */
	public String getProfession() {
		return profession;
	}

	/**
	 * profession
	 * @param profession
	 */
	public void setProfession(String profession) {
		this.profession = profession;
	}

	/**
	 * height
	 * @return height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * height
	 * @param height
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * weight
	 * @return weight
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * weight
	 * @param weight
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}

	/**
	 * expected
	 * @return expected
	 */
	public Date getExpected() {
		return expected;
	}

	/**
	 * expected
	 * @param expected
	 */
	public void setExpected(Date expected) {
		this.expected = expected;
	}

	/**
	 * babysex
	 * @return babysex
	 */
	public Boolean getBabysex() {
		return babysex;
	}

	/**
	 * babysex
	 * @param babysex
	 */
	public void setBabysex(Boolean babysex) {
		this.babysex = babysex;
	}

	/**
	 * babybirthday
	 * @return babybirthday
	 */
	public Date getBabybirthday() {
		return babybirthday;
	}

	/**
	 * babybirthday
	 * @param babybirthday
	 */
	public void setBabybirthday(Date babybirthday) {
		this.babybirthday = babybirthday;
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
	 * pwdFix
	 * @return pwdFix
	 */
	public int getPwdFix() {
		return pwdFix;
	}

	/**
	 * pwdFix
	 * @param pwdFix
	 */
	public void setPwdFix(int pwdFix) {
		this.pwdFix = pwdFix;
	}

	/**
	 * 第三方登录类型
	 * @return authType
	 */
	public String getAuthType() {
		return authType;
	}

	/**
	 * 第三方登录类型
	 * @param authType
	 */
	public void setAuthType(String authType) {
		this.authType = authType;
	}

	/**
	 * 第三方登录openid
	 * @return 第三方登录openid
	 */
	public String getOpenid() {
		return openid;
	}

	/**
	 * 第三方登录openid
	 * @param 第三方登录openid
	 */
	public void setOpenid(String openid) {
		this.openid = openid;
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
	 * 渠道来源
	 * @return utmMedium
	 */
	public String getUtmMedium() {
		return utmMedium;
	}

	/**
	 * 渠道来源
	 * @param utmMedium
	 */
	public void setUtmMedium(String utmMedium) {
		this.utmMedium = utmMedium;
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
	 * myIntro
	 * @return myIntro
	 */
	public String getMyIntro() {
		return myIntro;
	}

	/**
	 * myIntro
	 * @param myIntro
	 */
	public void setMyIntro(String myIntro) {
		this.myIntro = myIntro;
	}
    
    

}