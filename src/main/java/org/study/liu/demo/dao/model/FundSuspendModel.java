package org.study.liu.demo.dao.model;

import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class FundSuspendModel {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String fundCode;

    private String fundName;

    private String suspendDate;

    private String openDate;

    private Date createTime;

    private Date updateTime;

    private String batchNum;

    private Integer suspendType;
}
