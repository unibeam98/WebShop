package com.example.demo.control.param;
import lombok.Data;

import javax.persistence.Column;
import java.time.LocalDateTime;

/**
 * 订单参数类，用于接收http请求
 */
@Data
public class DealReq {
    //交易地点
    private String dealLocation;

    //交易时间
    private LocalDateTime dealChangeTime;

    //交易人电话号码
    private String dealBuyerTelephone ;

    public String getDealLocation() {
        return dealLocation;
    }

    public LocalDateTime getDealChangeTime() {
        return dealChangeTime;
    }

    public String getDealBuyerTelephone() {
        return dealBuyerTelephone;
    }

    public void setDealLocation(String dealLocation) {
        this.dealLocation = dealLocation;
    }

    public void setDealChangeTime(LocalDateTime dealChangeTime) {
        this.dealChangeTime = dealChangeTime;
    }

    public void setDealBuyerTelephone(String dealBuyerTelephone) {
        this.dealBuyerTelephone = dealBuyerTelephone;
    }
}
