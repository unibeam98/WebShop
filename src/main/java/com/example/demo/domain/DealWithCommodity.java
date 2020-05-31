package com.example.demo.domain;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * 新封装的信息集合类
 */
@Data
public class DealWithCommodity {

    //交易地点
    private String d_location;
    //时间
    private LocalDateTime d_time;
    //电话
    private String d_tele;
    //金额
    private Double c_prive;
    //商品名称
    private String c_name;
    //商品描述
    private String c_describe;
    //交易对象名称
    private String u_name;
    //商品状态
    private String c_status;
    //商品id
    private Long c_id;
    //订单id
    private Long d_id;
    //评价id
    //private Long e_id;


    public String getD_location() {
        return d_location;
    }

    public LocalDateTime getD_time() {
        return d_time;
    }

    public String getD_tele() {
        return d_tele;
    }

    public Double getC_prive() {
        return c_prive;
    }

    public String getC_name() {
        return c_name;
    }

    public String getC_describe() {
        return c_describe;
    }

    public String getU_name() {
        return u_name;
    }

    public String getC_status() {
        return c_status;
    }

    public Long getC_id() {
        return c_id;
    }

    public Long getD_id() {
        return d_id;
    }

    public void setD_location(String d_location) {
        this.d_location = d_location;
    }

    public void setD_time(LocalDateTime d_time) {
        this.d_time = d_time;
    }

    public void setD_tele(String d_tele) {
        this.d_tele = d_tele;
    }

    public void setC_prive(Double c_prive) {
        this.c_prive = c_prive;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public void setC_describe(String c_describe) {
        this.c_describe = c_describe;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public void setC_status(String c_status) {
        this.c_status = c_status;
    }

    public void setC_id(Long c_id) {
        this.c_id = c_id;
    }

    public void setD_id(Long d_id) {
        this.d_id = d_id;
    }
}

