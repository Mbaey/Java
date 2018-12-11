package com.nwnu.dao;

import com.nwnu.mapper.ClassMapper;
import com.nwnu.pojo.Class;
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
public class ClassDaoTest {
    @Autowired
    private ClassMapper classMapper;

    private Random random=new Random();
    @Test
    public void batchInsert(){
            Class s=new Class(1, "16软件（1）班");
            System.out.println(classMapper.insert(s));
            Class s2=new Class(2, "16软件（2）班");
            System.out.println(classMapper.insert(s2));
    }
}