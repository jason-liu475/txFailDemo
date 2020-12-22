package org.study.liu.demo.dao.mapper;

import org.study.liu.demo.dao.model.FundSuspendModel;

import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 */
@Repository
public interface FundSuspendMapper {

	int insert(FundSuspendModel fundSuspendModel);
}
