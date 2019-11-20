package com.youfan.log;

import lombok.Data;

/**
 * Created by li on 2019/1/6.商品收藏
 */
@Data
public class CollectProductLog {
    private int productid;//商品id
    private int producttypeid;//商品类别id
    private String opertortime;//操作时间
    private int opertortype;//操作类型，0、收藏，1、取消
    private int userid;//用户id
    private int usetype;//终端类型：0、pc端；1、移动端；2、小程序端'
    private String ip;// 用户ip
    private String brand;//品牌
}
