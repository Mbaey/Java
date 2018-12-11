package com.nwnu.emall.dao;

import com.nwnu.emall.bean.Paymethod;
import com.nwnu.emall.bean.PaymethodExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaymethodMapper {
    long countByExample(PaymethodExample example);

    int deleteByExample(PaymethodExample example);

    int deleteByPrimaryKey(Byte id);

    int insert(Paymethod record);

    int insertSelective(Paymethod record);

    List<Paymethod> selectByExample(PaymethodExample example);

    Paymethod selectByPrimaryKey(Byte id);

    int updateByExampleSelective(@Param("record") Paymethod record, @Param("example") PaymethodExample example);

    int updateByExample(@Param("record") Paymethod record, @Param("example") PaymethodExample example);

    int updateByPrimaryKeySelective(Paymethod record);

    int updateByPrimaryKey(Paymethod record);
}