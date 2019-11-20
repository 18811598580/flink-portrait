package com.youfan.entity;

import lombok.Data;

/**
 * Created by li on 2019/1/6.
 */

@Data
public class ResultMessage {
    private String status;//状态 fail 、 success
    private String message;//消息内容
}
