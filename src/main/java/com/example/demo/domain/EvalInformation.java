package com.example.demo.domain;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 评论信息包装类
 */
@Data
public class EvalInformation {
    private String e_comment;
    private Integer e_starts;
    private String c_name;
    private Double c_price;
    private String d_location;
    private LocalDateTime d_time;
    private String u_name;

    public String getE_comment() {
        return e_comment;
    }

    public Integer getE_starts() {
        return e_starts;
    }

    public String getC_name() {
        return c_name;
    }

    public Double getC_price() {
        return c_price;
    }

    public String getD_location() {
        return d_location;
    }

    public LocalDateTime getD_time() {
        return d_time;
    }

    public String getU_name() {
        return u_name;
    }

    public void setE_comment(String e_comment) {
        this.e_comment = e_comment;
    }

    public void setE_starts(Integer e_starts) {
        this.e_starts = e_starts;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public void setC_price(Double c_price) {
        this.c_price = c_price;
    }

    public void setD_location(String d_location) {
        this.d_location = d_location;
    }

    public void setD_time(LocalDateTime d_time) {
        this.d_time = d_time;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }
}
