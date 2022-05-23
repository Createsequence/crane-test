package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.xiajibagao.crane.core.container.KeyValueContainer;
import top.xiajibagao.crane.core.helper.OperateTemplate;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    KeyValueContainer keyValueContainer;
    @Autowired
    OperateTemplate operateTemplate;

    @BeforeEach
    void initDate() {
        // 配置字典项sex
        Map<String, Object> gender = new HashMap<>();
        gender.put("0", "女");
        gender.put("1", "男");
        keyValueContainer.register("sex", gender);
    }

    @Test
    void testProcess() {
        Person person = new Person().setSex(0);
        System.out.println("after: " + person); // 处理前
        operateTemplate.process(person);
        System.out.println("before: " + person); // 处理后
    }

}
