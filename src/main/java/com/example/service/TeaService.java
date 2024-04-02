package com.example.service;

import com.example.pojo.Result;
import com.example.pojo.Tea;

import java.util.List;

public interface TeaService {
    Tea getTeaById(Long id);

    List<Tea> getAllTeas();
}
