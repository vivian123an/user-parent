package me.quxiu.user.service;

import javax.annotation.Resource;

import me.quxiu.share.query.BaseQuery;
import me.quxiu.share.result.ResultEntity;
import me.quxiu.user.model.MsgSystem;

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
public class MsgSystemServiceTest {
	
	@Resource
	MsgSystemService msgSytemService;

	@Test
	public void testQueryList(){
		
		BaseQuery query = new BaseQuery();
		query.setPageIndex(5);
		query.setPageSize(2);
		ResultEntity<MsgSystem> result = msgSytemService.queryMsgSysList(query);
		System.out.println(result);
	}
	
	@Test
	public void testDeleteByIds(){
		
		ResultEntity<MsgSystem> result  = msgSytemService.deleteByIds("8,9");
		System.out.println(result);
		
	}
	
}
