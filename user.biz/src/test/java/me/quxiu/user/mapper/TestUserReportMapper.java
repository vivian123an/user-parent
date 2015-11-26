package me.quxiu.user.mapper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import me.quxiu.share.query.AppFeedbackQuery;
import me.quxiu.share.query.UserReportQuery;
import me.quxiu.user.model.AppFeedBack;
import me.quxiu.user.model.UserReport;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * TestOrderItemMapper
 * 
 * @author jim.ye
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring/spring-context.xml")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestUserReportMapper  {


	@Resource
	UserReportMapper userReportMapper;

	@Test
	public void testQueryInfoList() {
		
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("startIndex", 0);
		params.put("pageSize", 10);
		
		UserReportQuery query = new UserReportQuery();
		query.setToRegistTime("2014-11-15 00:00:00");
		query.setEndRegistTime("2014-11-21 00:00:00");
		
		params.put("query", query);
		
		List<UserReport> list = userReportMapper.queryUserReportList(params);
		for(UserReport ms:list){
			System.out.println(ms.getRegistTime());
		}
	}
	
	@Test
	public void testQueryAllRows(){
		
		Map<String,Object> params = new HashMap<String,Object>();
		
		UserReportQuery query = new UserReportQuery();
		query.setToRegistTime("2014-11-15 00:00:00");
		query.setEndRegistTime("2014-11-21 00:00:00");
		
		params.put("query", query);
		
		int result = userReportMapper.queryAllRows(params);
		System.out.println(result);
		
	}
	
	

	
}
