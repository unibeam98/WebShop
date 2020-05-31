package com.example.demo.onlyoneproperties;

import lombok.Data;

@Data
public class OnlyComID {
    private Long comID;

    public Long getComID() {
        return comID;
    }

    public void setComID(Long comID) {
        this.comID = comID;
    }
}
