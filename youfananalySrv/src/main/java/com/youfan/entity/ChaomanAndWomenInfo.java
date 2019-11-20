package com.youfan.entity;

import lombok.Data;

import java.util.List;

/**
 * Created by li on 2019/1/6.
 */
@Data
public class ChaomanAndWomenInfo {
    private String chaotype;//1,潮男 ；2，潮女
    private String userid;//用户id
    private long count;
    private String groupbyfield;

    private List<ChaomanAndWomenInfo> list;

}
