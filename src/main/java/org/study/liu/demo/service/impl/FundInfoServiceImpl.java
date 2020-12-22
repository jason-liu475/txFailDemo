package org.study.liu.demo.service.impl;

import javax.annotation.Resource;

import lombok.extern.slf4j.Slf4j;
import org.study.liu.demo.dao.mapper.FundInfoMapper;
import org.study.liu.demo.dao.model.FundInfoModel;
import org.study.liu.demo.dao.model.FundSuspendModel;
import org.study.liu.demo.service.FundInfoService;
import org.study.liu.demo.service.FundSuspendService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
@Slf4j
@Service
public class FundInfoServiceImpl implements FundInfoService {
	@Resource
	private FundInfoMapper fundInfoMapper;

	@Autowired
	private FundSuspendService fundSuspendService;

	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW,rollbackFor = Exception.class)
	public int save(FundInfoModel fundInfoModel) {
		int res = fundInfoMapper.insert(fundInfoModel);
		res = res / 0;
		return res;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
	public int save01(FundInfoModel fundInfoModel) {
		int res = 0;
		try {
			res = this.save(fundInfoModel);
		}catch (Exception e){
			log.error("Exception:{}",e.getMessage());
			throw e;
		}
		return res;
	}

	@Override
	public int save02(FundSuspendModel fundSuspendModel) {
		return fundSuspendService.save(fundSuspendModel);
	}
}
