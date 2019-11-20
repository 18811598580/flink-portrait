package com.youfan.log;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by li on 2019/1/6.购物车
 */
@Data
public class BuyCartProductLog implements Serializable{
     private int productid;//商品id
     private int producttypeid;//商品类别id
     private String operatortime;//操作时间
     private int operatortype;//操作类型 0、加入，1、删除
     private int userid;//用户id
     private int usetype;//终端类型：0、pc端；1、移动端；2、小程序端'
     private String ip;// 用户ip
     private String brand;//品牌
}
