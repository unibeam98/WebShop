package com.example.demo.dao.entity;

import lombok.Data;

@Data
public class ChangeIDWithStatus {
    Long comID;

    public Long getComID() {
        return comID;
    }

    public void setComID(Long comID) {
        this.comID = comID;
    }
}