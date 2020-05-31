package com.example.demo.service;

import com.example.demo.control.param.CommodityReq;
import com.example.demo.control.param.UserReq;
import com.example.demo.dao.entity.CommodityEntity;
import com.example.demo.domain.Commodity;

import java.util.List;

public interface CommodityService {

    public Commodity createOne(CommodityReq commodityReq);

    public List<Commodity> getAll();

    public  List<CommodityEntity> getStatus();

    public Commodity addCommodityFromOneUser(CommodityReq commodityReq, UserReq userReq);

}
