package me.quxiu.user.mapper;

import java.util.List;
import java.util.Map;

import me.quxiu.user.base.BaseMapper;
import me.quxiu.user.model.Referrals;

public interface ReferralsMapper extends BaseMapper<Referrals>{
	
	public List<Referrals> getReferralsListPage(Map<String, Object> params);
	
	public int delete(long id);
}