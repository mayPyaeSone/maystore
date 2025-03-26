package com.packt.maystore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.packt.maystore.domain.TestEntity;
import com.packt.maystore.domain.repository.TestRepository;

@Service
public class TestService {

    @Autowired
    private TestRepository testRepository;

    public TestEntity  saveTestEntity(String name) {
        TestEntity entity = new TestEntity();
        entity.setName(name);
        return testRepository.save(entity);
    }
}