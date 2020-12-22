package org.study.liu.demo.service;

import org.study.liu.demo.dao.model.FundInfoModel;
import org.study.liu.demo.dao.model.FundSuspendModel;

public interface FundInfoService {
	int save(FundInfoModel fundInfoModel);

	int save01(FundInfoModel fundInfoModel);

	int save02(FundSuspendModel fundSuspendModel);
}
