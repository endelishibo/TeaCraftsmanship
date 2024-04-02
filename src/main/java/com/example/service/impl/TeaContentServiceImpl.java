package com.example.service.impl;

import com.example.mapper.TeaContentMapper;
import com.example.mapper.TeaMapper;
import com.example.pojo.TeaContent;
import com.example.service.TeaContentService;
import com.example.service.TeaService;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeaContentServiceImpl implements TeaContentService {

    @Autowired
    private TeaContentMapper teaContentMapper;

    @Override
    public TeaContent getTeaContent(Long id) {
        return teaContentMapper.getContent(id);
    }
}
