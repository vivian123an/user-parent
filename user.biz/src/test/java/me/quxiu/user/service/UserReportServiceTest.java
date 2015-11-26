package me.quxiu.user.service;

import javax.annotation.Resource;

import me.quxiu.share.query.UserReportQuery;
import me.quxiu.share.result.ResultDO;
import me.quxiu.user.model.UserReport;

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
public class UserReportServiceTest {
	
	@Resource
	UserReportService userReportService;

	@Test
	public void testQueryList(){
		
		UserReportQuery query = new UserReportQuery();
		query.setPageIndex(100);
//		query.setToRegistTime("2014-11-15 00:00:00");
//		query.setEndRegistTime("2014-11-21 00:00:00");
		ResultDO<UserReport> result = userReportService.getUserReportList(query);
		System.out.println(result);
	}
	
}
