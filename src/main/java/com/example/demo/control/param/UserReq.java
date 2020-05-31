package com.example.demo.control.param;

import lombok.Data;

@Data
public class UserReq {

    private String username;

    private String password;

    private String telephonenum;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getTelephonenum() {
        return telephonenum;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setTelephonenum(String telephonenum) {
        this.telephonenum = telephonenum;
    }
}