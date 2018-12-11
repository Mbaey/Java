package com.nwnu.Spring;

import com.nwnu.mapper.AopDemo;
import com.nwnu.mapper.ClassMapper;
import com.nwnu.pojo.Class;
import com.nwnu.pojo.ClassExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by lcy on 2018/6/30.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:app.xml")
public class AopTest {
    @Autowired
    private AopDemo aopDemo;
    @Autowired
    private ClassMapper classMapper;

    @Test
//    @Transactional
    public void testAOP() throws SQLException, ClassNotFoundException {
//        aopDemo.doSth();
        int insert2 = classMapper.insertSelective(new Class(101, "宇宙超级无敌软件一班"));
        int insert = classMapper.insertSelective(new Class(null, "宇宙超级无敌软件一班"));
//        System.out.println(insert);

        List<Class> classes = classMapper.selectByExample(new ClassExample());
        classes.stream().forEach(System.out::println);
//        stuMapper.countByExample(new StuExample());
    }
}