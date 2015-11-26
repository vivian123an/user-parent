package me.quxiu.user.service;

import javax.annotation.Resource;

import me.quxiu.share.query.AppFeedbackQuery;
import me.quxiu.share.result.ResultDO;
import me.quxiu.share.result.ResultEntity;
import me.quxiu.user.model.AppFeedBack;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author wenan.chen@quxiu.me
 * @version 2015年7月28日 下午4:11:20
 * 
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring/spring-context.xml")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AppFeekBackServiceTest {
	
	@Resource
	AppFeedBackService appFeedBackService;

	@Test
	public void testQueryList(){
		
		AppFeedbackQuery query = new AppFeedbackQuery();
		query.setPageIndex(5);
		ResultEntity<AppFeedBack> result = appFeedBackService.queryAppFeedBackList(query);
		System.out.println(result);
	}
	
	@Test
	public void testDeleteByIds(){
		
		ResultEntity<AppFeedBack> result  = appFeedBackService.deleteByIds("8,9");
		System.out.println(result);
		
	}
	
}
