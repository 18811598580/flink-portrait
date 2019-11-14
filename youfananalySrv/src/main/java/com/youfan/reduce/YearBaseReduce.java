package com.youfan.reduce;

import com.youfan.entity.YearBase;
import org.apache.flink.api.common.functions.ReduceFunction;

/**
 * Created by li on 2019/1/5.
 */
public class YearBaseReduce implements ReduceFunction<YearBase>{
    @Override
    public YearBase reduce(YearBase t1, YearBase t2) throws Exception {
        String yeartype = t2.getYeartype();
        YearBase reduceyearBase = new YearBase();
        reduceyearBase.setYeartype(yeartype);
        reduceyearBase.setCount(t1.getCount()+t2.getCount());
        return reduceyearBase;
    }
}
