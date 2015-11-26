package me.quxiu.user.service;

import me.quxiu.share.query.ReferralsQuery;
import me.quxiu.share.result.ResultDO;
import me.quxiu.share.result.ResultEntity;
import me.quxiu.user.model.Referrals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 
 * 邀请返利记录service测试
 * 
 * @author wenan.chen@quxiu.me
 * @version 2015年8月3日 下午4:48:58
 * 
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring/spring-context.xml")
public class ReferralsServiceTest {
	@Autowired
	ReferralsService referralsService;
	
	public void getReferralsPageList(){
		ReferralsQuery queryDto = new ReferralsQuery();
		ResultEntity<Referrals> result = referralsService.getReferralsPageList(queryDto);
		TestUtils.printObject(result);
	}
	
	@Test
	public void deleteReferrals(){
		Integer[] ids = new Integer[]{22,23};
		ResultEntity<Referrals> result = referralsService.deleteReferrals(ids);
		TestUtils.printObject(result);
	}
	
	
	public void payReferrals(){
		ResultEntity<Referrals> result = referralsService.payReferrals(3);
		TestUtils.printObject(result);
	}
	
	class PrimaryKey{
		Integer[] ids;

		public Integer[] getIds() {
			return ids;
		}

		public void setIds(Integer[] ids) {
			this.ids = ids;
		}
	}
}
