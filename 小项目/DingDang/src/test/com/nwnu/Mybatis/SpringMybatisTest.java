package com.nwnu.Mybatis;

import com.nwnu.mapper.StuMapper;
import com.nwnu.pojo.Stu;
import com.nwnu.pojo.StuExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by wcm on 2018/6/23.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:app.xml")
public class SpringMybatisTest {
    @Autowired
    private StuMapper stuMapper;

    @Test
    public void testAdd() {
        Stu stu = new Stu();
        stu.setName("new StuMapper");
        stuMapper.insert(stu);
    }

    @Test
    public void testList() {
        System.out.println(stuMapper);
        List<Stu> cs=stuMapper.selectByExample(new StuExample());
        for (Stu c : cs) {
            System.out.println(c);
        }
    }

}