package com.example.teacraftsmanship;

import com.example.mapper.TeaMapper;
import com.example.service.TeaService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TeaCraftsmanshipApplicationTests {


    @Autowired
    private TeaMapper teaMapper;

    @Test
    void contextLoads() {
        System.out.println(teaMapper.getTeaById(1L));
    }

}
