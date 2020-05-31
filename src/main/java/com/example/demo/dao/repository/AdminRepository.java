package com.example.demo.dao.repository;

import com.example.demo.control.param.UserReq;
import com.example.demo.dao.entity.AdminEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AdminRepository extends JpaRepository<AdminEntity,Long>, JpaSpecificationExecutor<AdminEntity>{

    public AdminEntity findByUsernameAndPassword(String username,String password);

}
