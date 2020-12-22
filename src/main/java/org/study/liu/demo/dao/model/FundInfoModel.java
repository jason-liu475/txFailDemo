package org.study.liu.demo.dao.model;

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
public class FundInfoModel {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String fundCode;

    private String fundName;

    private String fundNameAbbreviation;

    private String fundNamePinyin;

    private String investmentTargetType;
}
