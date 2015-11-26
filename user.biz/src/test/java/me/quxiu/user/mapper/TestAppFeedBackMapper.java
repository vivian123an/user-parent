package me.quxiu.user.mapper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import me.quxiu.share.query.AppFeedbackQuery;
import me.quxiu.user.model.AppFeedBack;

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
public class TestAppFeedBackMapper  {


	@Resource
	AppFeedBackMapper appFeekBackMapper;

	@Test
	public void testQueryInfoList() {
		
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("startIndex", 0);
		params.put("pageSize", 10);
		
		AppFeedbackQuery query = new AppFeedbackQuery();
		query.setId((long)33);
		query.setQuestion("1");
		query.setStatus(1);
		query.setContact("380");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			query.setStart_feedback_time(sdf.parse("2014-11-15 00:00:00"));
			query.setEnd_feedback_time(sdf.parse("2014-11-21 00:00:00"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		params.put("query", query);
		
		List<AppFeedBack> list = appFeekBackMapper.queryInfoList(params);
		for(AppFeedBack ms:list){
			System.out.println(ms.getId()+","+ms.getContact()+","+ms.getContent()+","+ms.getStatus()+","+ms.getcTime());
		}
	}
	
	@Test
	public void testQueryAllRows(){
		
		Map<String,Object> params = new HashMap<String,Object>();
		
		AppFeedbackQuery query = new AppFeedbackQuery();
		query.setId((long)33);
		query.setQuestion("1");
		query.setStatus(1);
		query.setContact("380");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			query.setStart_feedback_time(sdf.parse("2014-11-15 00:00:00"));
			query.setEnd_feedback_time(sdf.parse("2014-11-21 00:00:00"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		params.put("query", query);
		
		int result = appFeekBackMapper.queryAllRows(params);
		System.out.println(result);
		
	}
	
	@Test
	public void testDeleteById(){
		
		
		appFeekBackMapper.deleteByIds("9,10");
		
	}
	

	
}
