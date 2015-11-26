package me.quxiu.user.service;

import javax.annotation.Resource;

import me.quxiu.share.query.BaseQuery;
import me.quxiu.share.result.ResultEntity;
import me.quxiu.user.model.MsgBox;

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
public class MsgBoxServiceTest {
	
	@Resource
	MsgBoxService msgBoxService;

	@Test
	public void testQueryList(){
		
		BaseQuery query = new BaseQuery();
		query.setPageIndex(2);
		query.setPageSize(2);
		ResultEntity<MsgBox> result = msgBoxService.queryMsgBoxList(query);
		System.out.println(result);
	}
	
	@Test
	public void testDeleteByIds(){
		
		ResultEntity<MsgBox> result  = msgBoxService.deleteByIds("100,101");
		System.out.println(result);
	}
	
	@Test
	public void testFindById(){
		
		ResultEntity<MsgBox> result  = msgBoxService.findMsgSysById(100L);
		System.out.println(result.getResponseBody().getData());
	}
	
}
