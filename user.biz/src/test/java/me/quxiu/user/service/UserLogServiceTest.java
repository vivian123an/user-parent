package me.quxiu.user.service;

import me.quxiu.share.query.UserLogQuery;
import me.quxiu.share.result.ResultEntity;
import me.quxiu.user.model.UserLog;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author wenan.chen@quxiu.me
 * @version 2015年7月29日 下午5:25:28
 * 
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring/spring-context.xml")
public class UserLogServiceTest {

	@Autowired
	UserLogService userLogService;
	
	@Test
	public void getUserLogPageList(){
		UserLogQuery queryDto = new UserLogQuery();
		queryDto.setUserId(10);
		TestUtils.printObject(queryDto);
		ResultEntity<UserLog> result = userLogService.getUserLogList(queryDto);
		TestUtils.printObject(result);
	}
	
	
	public void deleteUserLog(){
		Integer[] ids = new Integer[]{};
		ResultEntity<UserLog> result = userLogService.delete(ids);
		TestUtils.printObject(result);
	}
}
