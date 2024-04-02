package com.example.controller;

import com.example.pojo.Result;
import com.example.pojo.TeaContent;
import com.example.pojo.TeaMake;
import com.example.service.TeaContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

@RequestMapping("/tea/content")
@RestController
public class TeaContentController {

    @Autowired
    private TeaContentService teaContentService;

    @GetMapping("/{id}")
    public Result<TeaContent> getContent(@PathVariable Long id){
        TeaContent teaContent = teaContentService.getTeaContent(id);
        return Result.success(teaContent);
    }

    @GetMapping("/make/{id}")
    public Result<List<String>> getMake(@PathVariable Long id) throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        TeaMake teaMake = teaContentService.getTeaMake(id);
        List<String> stepList = teaMake.getStepAll();
        return Result.success(stepList);
    }
}
