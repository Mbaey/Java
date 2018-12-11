package com.nwnu.dao;

import com.nwnu.mapper.ScoreMapper;
import com.nwnu.pojo.Score;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.util.Random;

/**
 * Created by wcm on 2018/6/27.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:app.xml")
public class ScoreDaoTest {
    @Autowired
    private ScoreMapper scoreMapper;
    private String[] term = {"大一上", "大一下", "大二上", "大二下"};
    private String[] Coursename = {"线性代数", "高数", "java程序设计", "算法设计与分析"};
    private Random random=new Random();
    @Test
    public void batchInsert(){
//        for (int i = 84; i < 164; i++) {
//            for (int j = 1; j <= 4; j++) {
//                Score s=new Score(i, j, new BigDecimal(random.nextFloat()*100));
//                System.out.println(scoreMapper.insert(s));
//            }
//        }
        for (int j = 1; j <= 4; j++) {
            Score s=new Score(1997, j, new BigDecimal(random.nextFloat()*100));
            System.out.println(scoreMapper.insert(s));
        }
    }
}