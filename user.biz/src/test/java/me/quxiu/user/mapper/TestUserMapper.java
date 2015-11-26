package me.quxiu.user.mapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import me.quxiu.user.base.AbstractBaseTestCase;
import me.quxiu.user.model.User;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 *  会员信息mapper单元测试
 * 
 * @author  wenan.chen@quxiu.me
 * @version 2015年7月22日 下午6:20:54
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring/spring-context.xml")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestUserMapper extends AbstractBaseTestCase<User> {

	public static User baseEntity;

	@Resource
	UserMapper UserMapper;

	@Test
	public void test001Save() {
		User entity = buildEntity();
		super.testSave(UserMapper, entity);
	}

	@Test
	public void test002Get() {
		super.testGet(UserMapper, baseEntity);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void test003Update() {
		long id = 6229;
		User actual = UserMapper.get(id);
		super.testUpdate(UserMapper, buildUpdate(actual));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void test004SaveBatch() {
		List<User> actuals = new ArrayList<User>();
		actuals.add(buildEntity());
		actuals.add(buildEntity());
		super.testSaveBatch(UserMapper, actuals);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void test006CustomSelect() {
		int id = 3;
		Map<String, Object> resultMap = UserMapper.customSelect("user_name", "id", id);
		printMap(resultMap);
	}

	public static User buildUpdate(User actual) {
		
		actual.setUserName("这里是测试数据-201508061030-update");
		actual.setUserPwd("123456");
		actual.setLoginIp("127.0.0.1");
		actual.setGroupId(1);
		actual.setIsDelete(false);
		actual.setIsEffect(true);
		actual.setAddress("np2675e6d22"); 
		actual.setEmail("2ddq7d33d@qq.com");
		actual.setMobile("15162575176");
		actual.setScore(100);
		actual.setMoney(0.0000);
		actual.setVerify("verify");
		actual.setLotteryVerify("登录用的标识码");
		actual.setReferralCount(1);
		actual.setPasswordVerify("123456");
		actual.setIntegrateId(1);
		actual.setLotteryMobile("18655558888");
		actual.setLotteryVerify("18655558888");
		actual.setVerifyCreateTime(1);
		actual.setReferer("邀请码");
		actual.setLoginPayTime(1);
		actual.setProvince("广东省");
		actual.setCity("广州市");
		actual.setPic("http://www.baidu.com");
		actual.setTimeUpdate(new Date());
		actual.setArea("广州市");
		actual.setSex(true);
		actual.setGroupId(1);
		actual.setIsMerchant(true);
		actual.setLevelId(1);
		actual.setLevelId(1);
		actual.setPoint(100);
		actual.setMyIntro("自我简介");
		actual.setpUserName("psuerName");
		actual.setAlipayId("alipayId");
		actual.setSinaId("sinaId");
		actual.setSinaToken("sinaToken");
		actual.setIsSynSina(false);
		actual.setTencentId("tencentId");
		actual.settAccessToken("tAccessToken");
		actual.settOpenid("tOpenid");
		actual.setIsSynTencent(false);
		actual.setQqId("qqId");
		actual.setTaobaoId("taobaoId");
		actual.setBirthday(new Date());
		actual.setBabybirthday(new Date());
		actual.setPic("用户头像地址");
		actual.setAuthType("第三方登录类型");
		actual.setOpenid("第三方登录openid");
		actual.setDivisionId(1);
		actual.setIdValidated(false);
		actual.setInviteId(1);
		
		return actual;
	}

	public static User buildEntity() {
		baseEntity = new User();
		
		baseEntity.setUserName("这里是测试数据-201508061030-save");
		baseEntity.setUserPwd("123456");
		baseEntity.setLoginIp("127.0.0.1");
		baseEntity.setGroupId(1);
		baseEntity.setIsDelete(false);
		baseEntity.setIsEffect(true);
		baseEntity.setAddress("np2675e6d22"); //
		baseEntity.setEmail("2ddq7d33d@qq.com");
		baseEntity.setMobile("15162575176");
		baseEntity.setScore(100);
		baseEntity.setMoney(0.0000);
		baseEntity.setVerify("verify");
		baseEntity.setLotteryVerify("登录用的标识码");
		baseEntity.setReferralCount(1);
		baseEntity.setPasswordVerify("123456");
		baseEntity.setIntegrateId(1);
		baseEntity.setLotteryMobile("18655558888");
		baseEntity.setLotteryVerify("18655558888");
		baseEntity.setVerifyCreateTime(1);
		baseEntity.setReferer("邀请码");
		baseEntity.setLoginPayTime(1);
		baseEntity.setProvince("广东省");
		baseEntity.setCity("广州市");
		baseEntity.setPic("http://www.baidu.com");
		baseEntity.setTimeUpdate(new Date());
		baseEntity.setArea("广州市");
		baseEntity.setSex(true);
		baseEntity.setGroupId(1);
		baseEntity.setIsMerchant(true);
		baseEntity.setLevelId(1);
		baseEntity.setLevelId(1);
		baseEntity.setPoint(100);
		baseEntity.setMyIntro("自我简介");
		baseEntity.setpUserName("psuerName");
		baseEntity.setAlipayId("alipayId");
		baseEntity.setSinaId("sinaId");
		baseEntity.setSinaToken("sinaToken");
		baseEntity.setIsSynSina(false);
		baseEntity.setTencentId("tencentId");
		baseEntity.settAccessToken("tAccessToken");
		baseEntity.settOpenid("tOpenid");
		baseEntity.setIsSynTencent(false);
		baseEntity.setQqId("qqId");
		baseEntity.setTaobaoId("taobaoId");
		baseEntity.setBirthday(new Date());
		baseEntity.setBabybirthday(new Date());
		baseEntity.setPic("用户头像地址");
		baseEntity.setAuthType("第三方登录类型");
		baseEntity.setOpenid("第三方登录openid");
		baseEntity.setDivisionId(1);
		baseEntity.setIdValidated(false);
		baseEntity.setInviteId(1);
		
		return baseEntity;
	}
}
