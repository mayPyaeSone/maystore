package com.store.maystore.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.packt.maystore.domain.TestEntity;
@SpringBootTest
public class TestControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @PostMapping("/test")
    public TestEntity createTestEntity(@RequestParam String name) {
        TestEntity entity = new TestEntity();
        entity.setName(name);
        return entity;
    }
}
