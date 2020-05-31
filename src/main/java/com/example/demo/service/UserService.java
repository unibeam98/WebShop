package com.example.demo.service;


import com.example.demo.control.param.UserReq;
import com.example.demo.dao.entity.DealEntity;
import com.example.demo.domain.DealWithCommodity;
import com.example.demo.domain.User;

import java.util.List;
import java.util.Set;

public interface UserService {
    public User findUserByUsernameAndPassword(String username, String password);
    public User createOne(UserReq userReq);
    public boolean isUserAlreadyReg(UserReq userReq);
    public Set<DealWithCommodity> reMold(Set<DealEntity> dealEntities);
}

