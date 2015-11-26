package me.quxiu.user.service;

import me.quxiu.share.query.BaseQuery;
import me.quxiu.share.query.UserGroupQuery;
import me.quxiu.share.result.ResultEntity;
import me.quxiu.user.model.UserGroup;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author wenan.chen@quxiu.me
 * @version 2015年7月29日 上午11:57:28
 * 
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring/spring-context.xml")
public class UserGroupServiceTest {
	@Autowired
	UserGroupService userGroupService;

	@Test
	public void getUserGroupPageList(){
		UserGroupQuery queryDto = new UserGroupQuery();
		ResultEntity<UserGroup> result = userGroupService.getSimpleUserGroupList(queryDto);
		TestUtils.printObject(result);
	}
	
	
	public void addUserGroup(){
		UserGroup entity = new UserGroup();
		entity.setName("会员分组-单元测试-新增");
		entity.setScore(1003);
		entity.setDiscount(0.7003);
		TestUtils.printObject(entity);
		ResultEntity<UserGroup> result = userGroupService.addUserGroup(entity);
		TestUtils.printObject(result);
	}
	
	public void updateUserGroup(){
		UserGroup entity = new UserGroup();
		entity.setId(8);
		entity.setName("会员分组-单元测试-更新");
		entity.setScore(9888);
		entity.setDiscount(0.7202);
		ResultEntity<UserGroup> result = userGroupService.updateUserGroup(entity);
		TestUtils.printObject(result);
	}
	
	public void deleteUserGroup(){
		Integer[] ids = new Integer[]{9,10};
		ResultEntity<UserGroup> result = userGroupService.deleteUserGroup(ids);
		TestUtils.printObject(result);
	}
	
	public void createPageParam(){
		BaseQuery query = new BaseQuery();
		query.setPageIndex(1);
		query.setPageSize(10);
		TestUtils.printObject(query);
	}
}
