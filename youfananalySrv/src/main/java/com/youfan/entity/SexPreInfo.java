package com.youfan.entity;

import lombok.Data;

/**
 * Created by li on 2019/1/6.
 */
@Data
public class SexPreInfo {
    /**
     * 用户id 订单次数 订单频次 浏览男装
     * 浏览小孩 浏览老人 浏览女士 订单平均金额 浏览商品频次 标签
     */
    private int userid;
    private long ordernum;//订单的总数
    private long orderfre;//隔多少天下单
    private int manclothes;//浏览男装次数
    private int womenclothes;//浏览女装的次数
    private int childclothes;//浏览小孩衣服的次数
    private int oldmanclothes;//浏览老人的衣服的次数
    private double avramount;//订单平均金额
    private int producttimes;//每天浏览商品数
    private int label;//男，女

    private String groupfield;//分组
}
