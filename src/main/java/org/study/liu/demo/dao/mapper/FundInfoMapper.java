package org.study.liu.demo.dao.mapper;


import org.study.liu.demo.dao.model.FundInfoModel;

import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 */
@Repository
public interface FundInfoMapper {
	int insert(FundInfoModel fundInfoModel);
}
