package com.nwnu.emall;

import com.nwnu.emall.bean.Category;
import com.nwnu.emall.dao.CategoryMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {
    @Autowired
    CategoryMapper categoryMapper;
    @Autowired
    Category       category;
    @Test
    public void contextLoads() {
        System.out.println(categoryMapper);
        System.out.println(category);
    }

}
