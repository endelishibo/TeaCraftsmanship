package com.example.mapper;

import com.example.pojo.Result;
import com.example.pojo.Tea;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
public interface TeaMapper {
    @Select("select * from tea where id =#{id}")
    Tea getTeaById(Long id);
    @Select("SELECT * FROM tea")
    List<Tea> getAllTeas();
}