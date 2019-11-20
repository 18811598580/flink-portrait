package com.youfan.entity;


import lombok.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by li on 2019/1/5.
 */
@Data
public class UserGroupInfo {
    private String userid;
    private String createtime;
    private String amount ;
    private String paytype ;
    private String paytime;
    private String paystatus;//0、未支付 1、已支付 2、已退款
    private String couponamount;
    private String totalamount;
    private String refundamount;
    private Long count;//数量
    private String producttypeid;//消费类目
    private String groupfield;//分组
    private List<UserGroupInfo> list;//一个用户所有的消费信息

    private double avramout;//平均消费金额
    private double maxamout;//消费最大金额
    private int days;//消费频次
    private Long buytype1;//消费类目1数量
    private Long buytype2;//消费类目2数量
    private Long buytype3;//消费类目3数量
    private Long buytime1;//消费时间点1数量
    private Long buytime2;//消费时间点2数量
    private Long buytime3;//消费时间点3数量
    private Long buytime4;//消费时间点4数量
}
