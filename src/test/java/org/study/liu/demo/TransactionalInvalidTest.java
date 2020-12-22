package org.study.liu.demo;
import java.util.Date;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.study.liu.demo.dao.model.FundInfoModel;
import org.study.liu.demo.dao.model.FundSuspendModel;
import org.study.liu.demo.service.FundInfoService;
import org.study.liu.demo.service.FundSuspendService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest(classes = DemoApplication.class)
public class TransactionalInvalidTest {
	@Autowired
	private FundInfoService fundInfoService;
	@Autowired
	private FundSuspendService fundSuspendService;

	private FundInfoModel fundInfoModel;
	private FundSuspendModel fundSuspendModel;
	@Test
	public void test1(){
		//正常
		init01();
		int res = fundInfoService.save(fundInfoModel);
		log.info("finish：{}",res);
	}
	@Test
	public void test2(){
		//不带事务的方法通过this调用该类的带事务的方法
		init01();
		int res = fundInfoService.save01(fundInfoModel);
		log.info("finish：{}",res);
	}

	private FundInfoModel init01(){
		fundInfoModel = new FundInfoModel();
		fundInfoModel.setFundCode("000001");
		fundInfoModel.setFundName("测试基金01");
		fundInfoModel.setFundNameAbbreviation("csjj01");
		fundInfoModel.setFundNamePinyin("csjj01");
		fundInfoModel.setInvestmentTargetType("混合型");
		return fundInfoModel;
	}
	private FundSuspendModel init02(){
		fundSuspendModel = new FundSuspendModel();
		fundSuspendModel.setFundCode("000002");
		fundSuspendModel.setFundName("测试基金02");
		fundSuspendModel.setSuspendDate("2020-12-23");
		fundSuspendModel.setOpenDate("2020-12-23");
		fundSuspendModel.setCreateTime(new Date());
		fundSuspendModel.setUpdateTime(new Date());
		fundSuspendModel.setBatchNum("tx-001");
		fundSuspendModel.setSuspendType(0);
		return fundSuspendModel;
	}
}
