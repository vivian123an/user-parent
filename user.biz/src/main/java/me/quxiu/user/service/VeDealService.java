package me.quxiu.user.service;

import me.quxiu.share.result.ResultDO;
import me.quxiu.user.base.BaseService;
import me.quxiu.user.dto.VeDealDto;
import me.quxiu.user.model.VeDeal;

/**
 * @author wenan.chen@quxiu.me
 * @version 2015年9月28日 下午12:05:54
 * 
 */

public interface VeDealService extends BaseService<VeDeal>{

	public ResultDO<VeDealDto> copyDeal(VeDealDto dto);
}
