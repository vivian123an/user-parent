package me.quxiu.user.mapper;

import javax.annotation.Resource;

import me.quxiu.user.model.User;

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
public class TestDealMapper  {


	@Resource
	UserMapper userMapper;

	@Test
	public void test001Save() {
		
		User user = userMapper.get(83);
		System.out.println(user.getEmail());
	}

	
}
