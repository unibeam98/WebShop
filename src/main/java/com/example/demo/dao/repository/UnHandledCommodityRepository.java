package com.example.demo.dao.repository;

import com.example.demo.dao.entity.UnHandledCommunityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UnHandledCommodityRepository extends JpaRepository<UnHandledCommunityEntity,Long> , JpaSpecificationExecutor<UnHandledCommunityEntity> {
}

