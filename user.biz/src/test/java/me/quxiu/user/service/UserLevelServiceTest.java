package me.quxiu.user.service;

import me.quxiu.share.query.UserLevelQuery;
import me.quxiu.share.result.ResultEntity;
import me.quxiu.user.model.UserLevel;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author wenan.chen@quxiu.me
 * @version 2015年7月28日 下午4:11:20
 * 
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring/spring-context.xml")
public class UserLevelServiceTest {
	@Autowired
	UserLevelService userLevelService;

	
	public void getUserLevelPageList(){
		UserLevelQuery queryDto = new UserLevelQuery();
		ResultEntity<UserLevel> result = userLevelService.getSimpleUserLevelList(queryDto);
		TestUtils.printObject(result);
	}
	
	@Test
	public void updateUserLevel(){
		UserLevel entity = new UserLevel();
		entity.setId(17);
		entity.setName("会员等级-单元测试-更新");
		entity.setPoint(12588);
		TestUtils.printObject(entity);
		ResultEntity<UserLevel> result = userLevelService.updateUserLevel(entity);
		TestUtils.printObject(result);
	}
	
	
	public void addUserLevel(){
		UserLevel entity = new UserLevel();
		entity.setName("会员等级-单元测试-新增");
		entity.setPoint(18888);
		TestUtils.printObject(entity);
		ResultEntity<UserLevel> result = userLevelService.addUserLevel(entity);
		TestUtils.printObject(result);
	}
	
	
	public void deleteUserLevel(){
		Integer[] ids = new Integer[]{24};
		ResultEntity<UserLevel> result = userLevelService.deleteUserLevel(ids);
		TestUtils.printObject(result);
	}
}
