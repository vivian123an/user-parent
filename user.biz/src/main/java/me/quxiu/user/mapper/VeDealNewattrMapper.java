package me.quxiu.user.mapper;

import java.util.List;

import me.quxiu.user.base.BaseMapper;
import me.quxiu.user.model.VeDealNewattr;

public interface VeDealNewattrMapper extends BaseMapper<VeDealNewattr>{
	
	List<VeDealNewattr> getNewattrByDealId(int dealId);
}