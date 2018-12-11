package com.nwnu.emall.dao;

import com.nwnu.emall.bean.PropValue;
import com.nwnu.emall.bean.PropValueExample;
import com.nwnu.emall.bean.PropValueKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PropValueMapper {
    long countByExample(PropValueExample example);

    int deleteByExample(PropValueExample example);

    int deleteByPrimaryKey(PropValueKey key);

    int insert(PropValue record);

    int insertSelective(PropValue record);

    List<PropValue> selectByExample(PropValueExample example);

    PropValue selectByPrimaryKey(PropValueKey key);

    int updateByExampleSelective(@Param("record") PropValue record, @Param("example") PropValueExample example);

    int updateByExample(@Param("record") PropValue record, @Param("example") PropValueExample example);

    int updateByPrimaryKeySelective(PropValue record);

    int updateByPrimaryKey(PropValue record);
}