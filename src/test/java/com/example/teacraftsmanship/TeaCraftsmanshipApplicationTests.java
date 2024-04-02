package com.example.teacraftsmanship;

import com.example.mapper.TeaMapper;
import com.example.pojo.TeaMake;
import com.example.service.TeaContentService;
import com.example.service.TeaService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.InvocationTargetException;

@SpringBootTest
class TeaCraftsmanshipApplicationTests {


    @Autowired
    private TeaMapper teaMapper;


    @Autowired
    private TeaContentService teaContentService;
    @Test
    void contextLoads() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
//        System.out.println(teaMapper.getTeaById(1L));
        TeaMake teaMake = new TeaMake();
        teaMake.setStep3("3");
        teaMake.setStep2("2");
        teaMake.setStep9("9");
        teaMake.setStep1("1");
        System.out.println(teaMake.getStepAll());
    }

}
