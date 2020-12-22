package org.study.liu.demo.service;


import org.study.liu.demo.dao.model.FundSuspendModel;

import org.springframework.stereotype.Service;


@Service
public interface FundSuspendService {
	int save(FundSuspendModel fundSuspendModel);
}
