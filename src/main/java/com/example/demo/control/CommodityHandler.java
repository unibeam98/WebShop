package com.example.demo.control;

import com.example.demo.control.param.CommodityReq;
import com.example.demo.control.param.UserReq;
import com.example.demo.dao.entity.CommodityEntity;
import com.example.demo.dao.entity.DealEntity;
import com.example.demo.dao.repository.CommodityRepository;
import com.example.demo.domain.Commodity;
import com.example.demo.service.CommodityService;
import com.example.demo.utils.JsonXMLUtils;
import com.example.demo.onlyoneproperties.OnlyComID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * 商品controller
 */
@RestController
@RequestMapping("/commodity")
public class CommodityHandler {

    @Autowired
    CommodityService commodityService;

    @Autowired
    CommodityRepository commodityRepository;

    /**
     * 找到状态为released的商品
     * @return
     */
    @GetMapping("/findallcommodity")
    public List<CommodityEntity> findAll(){
        return commodityService.getStatus();
    }

    /**
     * 根据传入的id找到商品对应的订单信息
     * @param onlyComID
     * @return
     */
    @PostMapping("/finddeal")
    public DealEntity findDeal(@RequestBody OnlyComID onlyComID){
        System.out.println(onlyComID.getComID());

        return commodityRepository.findByComID(onlyComID.getComID()).getDeal();
    }

    /**
     * 添加商品方法
     * @param models
     * @return
     * @throws Exception
     */
    @PostMapping("/addcommodity")
    public Commodity addCommodity(@RequestBody Map<String, String> models) throws Exception {

        System.out.println(models);

        CommodityReq commodityReq = JsonXMLUtils.json2obj( models.get("com"), CommodityReq.class);
//        UserReq userReq = JsonXMLUtils.map2obj((Map<String, Object>) models.get("user"), UserReq.class);
        UserReq userReq = JsonXMLUtils.json2obj(models.get("user"), UserReq.class);


        Commodity commodity = commodityService.addCommodityFromOneUser(commodityReq, userReq);

        return commodity;
    }

}
