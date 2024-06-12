package com.example.mygithubprac;

import com.example.mygithubprac.entity.TestEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/api/test")
    public String testApi(){
        return "testSuccess";
    }

    @GetMapping("/api/entityTest")
    public TestEntity testEntityApi(){
        return new TestEntity("테스트메세지");
    }

}
