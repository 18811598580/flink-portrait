package com.youfan.log;

import lombok.Data;
import java.io.Serializable;

/**
 * Created by li on 2019/1/6.商品浏览记录
 */
@Data
public class ScanProductLog implements Serializable{
     private int productid;//商品id
     private int producttypeid;//商品类别id
     private String scantime;//浏览时间
     private String staytime;//停留时间
     private int userid;//用户id
     private int usetype;//终端类型：0、pc端；1、移动端；2、小程序端'
     private String ip;// 用户ip
     private String brand;//品牌
}
