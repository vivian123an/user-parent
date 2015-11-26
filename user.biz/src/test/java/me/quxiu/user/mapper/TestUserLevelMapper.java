package me.quxiu.user.mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import me.quxiu.user.base.AbstractBaseTestCase;
import me.quxiu.user.model.UserLevel;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 会员等级 mapper 单元测试
 * 
 * @author wenan.chen@quxiu.me
 * @version 2015年7月28日 下午3:36:32
 * 
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring/spring-context.xml")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestUserLevelMapper extends AbstractBaseTestCase<UserLevel> {

	public static UserLevel baseEntity;

	@Resource
	UserLevelMapper UserLevelMapper;
	
	@Test
	public void test001Save() {
		UserLevel entity = buildEntity();
		super.testSave(UserLevelMapper, entity);
	}

	@Test
	public void test002Get() {
		super.testGet(UserLevelMapper, baseEntity);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void test003Update() {
		long id = 6;
		UserLevel actual = UserLevelMapper.get(id);
		super.testUpdate(UserLevelMapper, buildUpdate(actual));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void test004SaveBatch() {
		List<UserLevel> actuals = new ArrayList<UserLevel>();
		actuals.add(buildEntity1());
		actuals.add(buildEntity2());
		super.testSaveBatch(UserLevelMapper, actuals);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void test006CustomSelect() {
		int id = 3;
		Map<String, Object> resultMap = UserLevelMapper.customSelect("name", "id", id);
		printMap(resultMap);
	}

	public static UserLevel buildUpdate(UserLevel actual) {
		actual.setName("这里是测试数据-会员等级VIP-10");
		actual.setPoint(20005);
		return actual;
	}

	public static UserLevel buildEntity() {
		baseEntity = new UserLevel();
		baseEntity.setName("这里是测试数据-会员等级VIP-0");
		baseEntity.setPoint(20000);
		return baseEntity;
	}
	public static UserLevel buildEntity1() {
		baseEntity = new UserLevel();
		baseEntity.setName("这里是测试数据-会员等级VIP-1");
		baseEntity.setPoint(20001);
		return baseEntity;
	}
	public static UserLevel buildEntity2() {
		baseEntity = new UserLevel();
		baseEntity.setName("这里是测试数据-会员等级VIP-2");
		baseEntity.setPoint(20002);
		return baseEntity;
	}
}
