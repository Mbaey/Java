package com.nwnu.emall.service;

import com.nwnu.emall.bean.GoodsItem;
import com.nwnu.emall.bean.GoodsItemExample;
import com.nwnu.emall.dao.GoodsItemMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceTest {
    @Autowired
    private ProductService productService;
    @Autowired
    private GoodsItemMapper goodsItemMapper;
    @Test
    public void search() {
//        goodsItemMapper.selectByExample(new GoodsItemExample()).forEach(System.out::println);
        List<GoodsItem> search = productService.search("衣服");
        search.forEach(System.out::println);
        System.out.println(search.size());
    }
}