package com.nwnu.Mybatis;

import com.github.pagehelper.PageHelper;
import com.nwnu.mapper.ScoreMapper;
import com.nwnu.mapper.StuMapper;
import com.nwnu.pojo.Score;
import com.nwnu.pojo.Stu;
import com.nwnu.pojo.StuExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by lcy on 2018/6/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:app.xml")
public class pageHelperTest {
    @Autowired
    private StuMapper   stuMapper;
    @Autowired
    private ScoreMapper scoreMapper;
    @Test
    public void testList() {
        PageHelper.startPage(0, 5);
        System.out.println(stuMapper);
        List<Stu> cs=stuMapper.selectByExample(new StuExample());
        for (Stu c : cs) {
            System.out.println(c);
        }
        System.out.println(cs.size());
    }
    @Test
    public void testMany2ManyDynamicSQL() {
        List<Score> scores = scoreMapper.selectAllDataRightJoinStuAndCourse(1997, null, null);
        for (Score s : scores) {
            System.out.println(s.getSid() + "  "+s);
        }
        System.out.println(scores.size());
    }
    @Test
    public void testAnnotation(){
        List<Score> scores = scoreMapper.selectAllDataJoinStuAndCourse(null, null, null);
        for (Score s : scores) {
            System.out.println(s);
        }
        System.out.println(scores.size());
    }

}