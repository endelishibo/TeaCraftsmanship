package com.example.service.impl;

import com.example.mapper.TeaMapper;
import com.example.pojo.Tea;
import com.example.service.TeaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeaServiceImpl implements TeaService {
    @Autowired
    private TeaMapper teaMapper;
  public Tea getTeaById(Long id) {
        return teaMapper.getTeaById(id);
    }

    @Override
    public List<Tea> getAllTeas() {
        return teaMapper.getAllTeas();
    }


}