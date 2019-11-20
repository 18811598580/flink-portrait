package com.youfan.entity;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * Created by li on 2019/1/20.
 */
@Data
public class KeyWordEntity {
    private String userid;
    private Map<String,Long> datamap;
    private Map<String,Double> tfmap;
    private Long totaldocumet;
    private List<String> finalkeyword;
    private List<String> originalwords;

}
