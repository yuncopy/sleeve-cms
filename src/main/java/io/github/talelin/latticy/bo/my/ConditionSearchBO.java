package io.github.talelin.latticy.bo.my;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Author Guiquan Chen
 * @Date 2021/5/11 10:36
 * @Version 1.0
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ConditionSearchBO {

    /**
     * 收货人
     */
    private String receiver;
    /**
     * 联系方式
     */
    private String phone;
    /**
     * 订单号
     */
    private String orderNo;
    /**
     * 订单状态
     */
    private Integer status;
    /**
     * 起始日期
     */
    private Date startTime;
    /**
     * 结束日期
     */
    private Date endTime;
    /**
     * 不带任何查询条件的标记
     */
    private boolean allFlag;
}
