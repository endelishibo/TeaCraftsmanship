package com.example.mapper;

import com.example.pojo.TeaContent;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TeaContentMapper {
    @Select("SELECT * FROM tea_content where id=#{id}")
    TeaContent getContent(Long id);
}
