package com.nwnu.mapper;

import com.nwnu.pojo.Stu;
import com.nwnu.pojo.StuExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StuMapper {
    long countByExample(StuExample example);

    int deleteByExample(StuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Stu record);

    int insertSelective(Stu record);

    List<Stu> selectByExample(StuExample example);

    Stu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Stu record, @Param("example") StuExample example);

    int updateByExample(@Param("record") Stu record, @Param("example") StuExample example);

    int updateByPrimaryKeySelective(Stu record);

    @Select(" select * from stus where classid=#{0} limit #{1}, #{2}")
    List<Stu> selectByExampleByClassIdWith(Integer ClassId, Integer start, Integer page);

    int updateByPrimaryKey(Stu record);
}