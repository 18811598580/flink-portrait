package com.youfan.entity;

import lombok.Data;

/**
 * Created by li on 2019/1/5.
 */
@Data
public class ConsumptionLevel {
    private String consumptiontype;//消费水平 高水平 中等水平 低水平
    private Long count;//数量
    private String groupfield;//分组字段
    private String userid;//用户id
    private String amounttotaol;//金额
}
