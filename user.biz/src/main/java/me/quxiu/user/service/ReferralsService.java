package me.quxiu.user.service;

import me.quxiu.share.query.ReferralsQuery;
import me.quxiu.share.result.ResultDO;
import me.quxiu.share.result.ResultEntity;
import me.quxiu.user.base.BaseService;
import me.quxiu.user.model.Referrals;

/**
 * @author wenan.chen@quxiu.me
 * @version 2015年8月3日 下午3:58:59
 * 
 */

public interface ReferralsService extends BaseService<Referrals>{

	/**
	 * 分页取返利数据
	 * @param queryDto
	 * @return
	 */
	public ResultEntity<Referrals> getReferralsPageList(ReferralsQuery queryDto);
	
	/**
	 * 物理删除返利记录
	 * @param ids
	 * @return
	 */
	public ResultEntity<Referrals> deleteReferrals(Integer[] ids);
	
	/**
	 * 手动发放返利
	 * @param referralsId
	 * @return
	 */
	public ResultEntity<Referrals> payReferrals(long referralsId);
}
