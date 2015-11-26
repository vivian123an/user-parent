package me.quxiu.user.service;

import me.quxiu.share.query.UserQuery;
import me.quxiu.share.result.ResultEntity;
import me.quxiu.user.dto.UserDTO;
import me.quxiu.user.model.User;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author 	vivian.chen
 * @version 2015-07-28
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring/spring-context.xml")
public class UserServiceTest{
	@Autowired
	UserService userService;

	public void deleteUser(){
		Integer[] ids = new Integer[]{6233};
		ResultEntity<User> result = userService.deleteUser(ids);
		TestUtils.printObject(result);
	}
	
	/**
	 * 恢复删除的会员
	 */
	public void resumeUser(){
		Integer[] ids = new Integer[]{6233};
		ResultEntity<User> result = userService.resumeUser(ids);
		TestUtils.printObject(result);
	}
	
	@Test
	public void simpleUserPageList(){
		UserQuery query = new UserQuery();
		query.setUserName("uGmdnJ1raJ5nmGlv");
		TestUtils.printObject(query);
		ResultEntity<User> result = userService.getSimpleUserList(query);
		TestUtils.printObject(result);
	}
	
	
	public void userPageList(){
		UserQuery query = new UserQuery();
		//query.setEmail("knCamZtnapplmmo=");
		query.setId(5975);
		//query.setpName("2p3fzMugnNGVzms=");
		//query.setInviteName("knCdnJ5qbZ1plW0=");
		ResultEntity<UserDTO> result = userService.getUserListPage(query);
		TestUtils.printObject(result);
	}
	
	
	public void  updateMoneyPointScore(){
		UserQuery query = new UserQuery();
		query.setId(6233);
		query.setMoney((double)-200.00);
		query.setScore(-1000);
		query.setPoint(1000);
		TestUtils.printObject(query);
		ResultEntity<User> result = userService.updateMoneyPointScore(query.getId(), query.getMoney(), query.getPoint(), query.getScore());
		TestUtils.printObject(result);
	}
	
	public void updateUser(){
		User userDto = new User();
		userDto.setId(6233);
		userDto.setMoney((double)10000.88);
		userDto.setScore(8000);
		userDto.setPoint(2000);
		userDto.setCity("test-深圳");
		userDto.setMobile("test-1805555");
		userDto.setIdValidated(true);
		userDto.setSex(false);
		userDto.setIdCardNo("test-4305231999");
		userDto.setLevelId(2);
		userDto.setProvince("test-广东省");
		userDto.setGroupId(2);
		TestUtils.printObject(userDto);
		ResultEntity<User> result = userService.updateUser(userDto);
		TestUtils.printObject(result);
	}
}
