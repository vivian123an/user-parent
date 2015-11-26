package me.quxiu.user.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import me.quxiu.user.model.MsgBox;

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
public class TestMsgBoxMapper  {


	@Resource
	MsgBoxMapper msgBoxMapper;

	@Test
	public void testgetMsgSystemList() {
		
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("startIndex", 5);
		params.put("pageSize", 3);
		List<MsgBox> list = msgBoxMapper.getMsgBoxList(params);
		for(MsgBox ms:list){
			System.out.println(ms.getId()+","+ms.getTitle()+","+ms.getContent());
		}
	}
	
	@Test
	public void testQueryAllRows(){
		
		System.out.println(msgBoxMapper.queryAllRows());
	}
	
	@Test
	public void testDeleteByIds(){
		
		
		msgBoxMapper.deleteByIds("2,3");
		
	}
	
	@Test
	public void testGet(){
		
		MsgBox msgBox = msgBoxMapper.get(88);
		System.out.println(msgBox.getId()+","+msgBox.getTitle()+","+msgBox.getContent());
	}

	
}
