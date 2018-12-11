package com.nwnu.dao;

import com.nwnu.mapper.StuMapper;
import com.nwnu.pojo.Stu;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Random;

/**
 * Created by wcm on 2018/6/27.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:app.xml")
public class StuDaoTest {
    @Autowired
    private StuMapper stuMapper;

    private String[] names = {"张三", "李四", "王五","王二麻子"};
    private Random random=new Random();
    @Test
    public void batchInsert(){
        for (int i = 0; i < 80; i++) {
            Stu s=new Stu();
            s.setName(names[i%4]+i);
            s.setPwd("1234");

            s.setClassid(random.nextInt(2)+1);
            System.out.println(stuMapper.insert(s));
        }
    }
}