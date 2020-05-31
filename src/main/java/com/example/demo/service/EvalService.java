package com.example.demo.service;

import com.example.demo.dao.entity.Evaluate;
import com.example.demo.domain.EvalInformation;

import java.util.Set;

public interface EvalService {
    public Set<EvalInformation> reMold(Set<Evaluate> evaluates);
}
