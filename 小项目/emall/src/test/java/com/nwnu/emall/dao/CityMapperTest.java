package com.nwnu.emall.dao;

import com.nwnu.emall.bean.CityExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CityMapperTest {
    @Autowired
    CityMapper cityMapper;
    @Autowired
    GoodsItemMapper goodsItemMapper;

    @Test
    public void testListALl() {
        System.out.println(goodsItemMapper);
         cityMapper.selectByExample(new CityExample()).forEach(System.out::println);
    }

}