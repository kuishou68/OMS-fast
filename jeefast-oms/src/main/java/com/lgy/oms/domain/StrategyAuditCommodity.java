package com.lgy.oms.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.lgy.common.annotation.Excel;
import com.lgy.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 审单策略指定商品拦截表 oms_strategy_audit_commodity
 *
 * @author lgy
 * @date 2019-12-31
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("oms_strategy_audit_commodity")
public class StrategyAuditCommodity extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 策略编码 */
    @Excel(name = "策略编码")
    private String gco;

    /** 商品类型 */
    @Excel(name = "商品类型")
    private Integer type;

    /** 信息值 */
    @Excel(name = "信息值")
    private String value;

    /** 状态（0启用 1停用） */
    @Excel(name = "状态", readConverterExp = "0=启用,1=停用")
    private String status;

}
