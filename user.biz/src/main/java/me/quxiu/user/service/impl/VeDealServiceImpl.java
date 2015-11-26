package me.quxiu.user.service.impl;

import java.util.ArrayList;
import java.util.List;

import me.quxiu.share.result.ResultDO;
import me.quxiu.share.result.ResultSupport;
import me.quxiu.user.base.impl.BaseServiceImpl;
import me.quxiu.user.dto.VeDealDto;
import me.quxiu.user.mapper.VeDealMapper;
import me.quxiu.user.mapper.VeDealNewattrMapper;
import me.quxiu.user.model.VeDeal;
import me.quxiu.user.model.VeDealNewattr;
import me.quxiu.user.service.VeDealService;

import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 * 临时解决方案
 * 
 * <p>拷贝ve_deal表以及关联的ve_deal_newattr表</p>
 * 
 * <p>生成一条新的ve_deal记录</p>
 * 
 * @author wenan.chen@quxiu.me
 * @version 2015年9月28日 下午12:06:41
 * 
 */

@Service("veDealService")
@Transactional(readOnly = true, propagation = Propagation.REQUIRED, rollbackFor = { Exception.class })
public class VeDealServiceImpl extends BaseServiceImpl<VeDeal> implements VeDealService{

protected final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	VeDealMapper veDealMapper;
	@Autowired
	VeDealNewattrMapper veDealNewattrMapper;
	
	@Override
	protected void initMapper() {
		mapper = veDealMapper;
	}

	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED , isolation= Isolation.READ_COMMITTED ,rollbackFor = { Exception.class })
	public ResultDO<VeDealDto> copyDeal(VeDealDto dto) {
		ResultDO<VeDealDto> result = new ResultSupport<VeDealDto>();
		try {
			VeDeal dealEntity = veDealMapper.get(dto.getVeDealId());
			if(dto.getVeDealId()==null || dealEntity==null){
				result.setSuccess(false);
				result.setMessage("被复制的数据空,veDealId:"+dto.getVeDealId());
				return result;
			}
			
			VeDeal newDeal = new VeDeal();
			copyVeDealProperty(dealEntity, newDeal);
			veDealMapper.save(newDeal);
			dto.setNewDealId(newDeal.getId());
			
			List<VeDealNewattr> newAttrs = new ArrayList<VeDealNewattr>();
			List<VeDealNewattr> attrs = veDealNewattrMapper.getNewattrByDealId(dto.getVeDealId());
			if(CollectionUtils.isNotEmpty(attrs)){
				for(VeDealNewattr attr: attrs){
					VeDealNewattr newDealNewattr = new VeDealNewattr();
					BeanUtils.copyProperties(attr, newDealNewattr);
					newDealNewattr.setDealId(newDeal.getId());
					newAttrs.add(newDealNewattr);
				}
				veDealNewattrMapper.saveBatch(newAttrs);
			}
			
			result.setModel(dto);
		} catch (Exception e) {
			result.setSuccess(false);
			result.setMessage("商品拷贝出错,veDealId:"+dto.getVeDealId()+e.getMessage());
		}

		return result;
	}
	
	private void copyVeDealProperty(VeDeal entity, VeDeal newDeal){
		
		BeanUtils.copyProperties(entity, newDeal);
		
		newDeal.setId(null);
		newDeal.setSubmitStatus(null);
		newDeal.setSubmitTime(null);
		newDeal.setStatus(0);
		newDeal.setAuditStatus(null);
		newDeal.setAuditMsg(null);
		newDeal.setAuditTimeBak(null);
		newDeal.setAuditTime(null);
		newDeal.setAuditAdminId(null);
		newDeal.setSkuAuditAdminId(null);
		newDeal.setSkuAuditStatus(null);
		newDeal.setSkuAuditTime(null);
		newDeal.setSkuAuditMsg(null);
	}
	
	
}
