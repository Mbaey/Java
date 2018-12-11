package com.nwnu.dao;

import com.nwnu.mapper.CourseMapper;
import com.nwnu.pojo.Course;
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
public class CourseDaoTest {
    @Autowired
    private CourseMapper courseMapper;
    private String[] term = {"大一上", "大一下", "大二上", "大二下"};
    private String[] Coursename = {"线性代数", "高数", "java程序设计", "算法设计与分析"};
    private Random random=new Random();
    @Test
    public void batchInsert(){
        for (int i = 0; i < 4; i++) {
            Course s=new Course(i+1, Coursename[i], term[i]);
            System.out.println(courseMapper.insert(s));
        }
    }
}