package com.youfan.entity;

import lombok.Data;

import java.util.List;

/**
 * Created by li on 2019/1/19.
 */
@Data
public class ViewResultAnaly {
    private List<String> infolist;//分组list，x轴的值
    private List<Long> countlist;//数量list
    private String result;
    private String typename;//标签类型名称
    private String lablevalue;//标签类型对应的值
    private  List<ViewResultAnaly> list;//所有标签信息
}
