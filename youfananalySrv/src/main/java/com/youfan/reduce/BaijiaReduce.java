package com.youfan.reduce;

import com.youfan.entity.BaiJiaInfo;
import com.youfan.entity.CarrierInfo;
import org.apache.flink.api.common.functions.GroupReduceFunction;
import org.apache.flink.api.common.functions.ReduceFunction;
import org.apache.flink.util.Collector;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by li on 2019/1/5.
 */
public class BaijiaReduce implements ReduceFunction<BaiJiaInfo>{


    @Override
    public BaiJiaInfo reduce(BaiJiaInfo b1, BaiJiaInfo b2) throws Exception {
        String userid = b1.getUserid();
        List<BaiJiaInfo> blist1 = b1.getList();
        List<BaiJiaInfo> blist2 = b2.getList();
        List<BaiJiaInfo> finallist = new ArrayList<BaiJiaInfo>();
        finallist.addAll(blist1);
        finallist.addAll(blist2);

        BaiJiaInfo baiJiaInfofinal = new BaiJiaInfo();
        baiJiaInfofinal.setUserid(userid);
        baiJiaInfofinal.setList(finallist);
        return baiJiaInfofinal;
    }
}
