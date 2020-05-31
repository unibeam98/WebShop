package com.example.demo.service;
import com.example.demo.control.param.CommodityReq;
import com.example.demo.control.param.DealReq;
import com.example.demo.control.param.UserReq;
import com.example.demo.dao.entity.DealEntity;

/**
 * 订单服务类
 */
public interface DealService {

    //根据用户商品订单信息创建订单
    public DealEntity makeDealService(Long userID, Long comID, DealReq dealReq);
}
