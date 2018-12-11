package com.nwnu.emall.dao;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nwnu.emall.bean.Category;
import com.nwnu.emall.bean.CategoryExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryMapperTest {
    @Autowired
    CategoryMapper categoryMapper;
    @Test
    public void countByExample() {
        long res = categoryMapper.countByExample(new CategoryExample());
        System.out.println(res);
    }

    @Test
    public void deleteByExample() {
    }

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
    }

    @Test
    public void insertSelective() {
    }

    @Test
    public void selectByExample() {

//        PageHelper.offsetPage(1, 5);
        PageHelper.startPage(1, 5);
        CategoryExample categoryExample = new CategoryExample();
        List<Category> categories = categoryMapper.selectByExample(categoryExample);
        categories.forEach(System.out::println);
        PageInfo pageInfo = new PageInfo<>(categories);
        System.out.println(pageInfo.getTotal());
    }

    @Test
    public void selectByPrimaryKey() {
    }

    @Test
    public void updateByExampleSelective() {
    }

    @Test
    public void updateByExample() {
    }

    @Test
    public void updateByPrimaryKeySelective() {
    }

    @Test
    public void updateByPrimaryKey() {
    }
}