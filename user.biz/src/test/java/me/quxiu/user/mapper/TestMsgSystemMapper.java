package me.quxiu.user.mapper;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import me.quxiu.user.model.MsgSystem;

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
public class TestMsgSystemMapper  {


	@Resource
	MsgSystemMapper msgSystemMapper;

	@Test
	public void testgetMsgSystemList() {
		
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("startIndex", 5);
		params.put("pageSize", 3);
		List<MsgSystem> list = msgSystemMapper.getMsgSystemList(params);
		for(MsgSystem ms:list){
			System.out.println(ms.getId()+","+ms.getUserIds()+","+ms.getUserNames()+","+ms.getEndTime());
		}
	}
	
	@Test
	public void testQueryAllRows(){
		
		System.out.println(msgSystemMapper.queryAllRows());
	}
	
	@Test
	public void testDeleteByIds(){
		
		
		msgSystemMapper.deleteByIds("2,3");
	}
	
	@Test
	public void testUpdateMsgSystem(){
		
		MsgSystem t = new MsgSystem();
		t.setId(2);
		t.setTitle("testsfdadf");
		t.setUserIds("21342143,234234");
		t.setEndTime(new Date());
		msgSystemMapper.update(t);
	}

	
}
