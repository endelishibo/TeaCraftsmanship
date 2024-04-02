package com.example.service;

import com.example.pojo.TeaContent;
import com.example.pojo.TeaMake;

public interface TeaContentService {

    TeaContent getTeaContent(Long id);
    TeaMake getTeaMake(Long id);
}
