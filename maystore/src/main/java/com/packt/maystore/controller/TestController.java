package com.packt.maystore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.packt.maystore.domain.TestEntity;
import com.packt.maystore.service.TestService;

@RestController
public class TestController {
	@Autowired
    private TestService testService;
	
    @PostMapping("/test")
    public ResponseEntity<TestEntity> createTestEntity(@RequestParam String name) {
        TestEntity savedEntity = testService.saveTestEntity(name);
        return ResponseEntity.ok(savedEntity);
    }
}
