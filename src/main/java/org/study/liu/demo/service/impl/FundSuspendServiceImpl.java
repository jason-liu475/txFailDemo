package org.study.liu.demo.service.impl;

import javax.annotation.Resource;

import org.study.liu.demo.dao.mapper.FundSuspendMapper;
import org.study.liu.demo.dao.model.FundSuspendModel;
import org.study.liu.demo.service.FundSuspendService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FundSuspendServiceImpl implements FundSuspendService {
	@Resource
	private FundSuspendMapper fundSuspendMapper;


	@Override
	@Transactional
	public int save(FundSuspendModel fundSuspendModel) {
		return fundSuspendMapper.insert(fundSuspendModel);
	}
}
