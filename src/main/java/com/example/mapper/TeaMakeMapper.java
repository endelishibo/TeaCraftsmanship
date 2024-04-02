package com.example.mapper;

import com.example.pojo.TeaMake;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TeaMakeMapper {

    @Select("SELECT * FROM tea_make where id=#{id}")
    TeaMake getTeaMake(Long id);
}
