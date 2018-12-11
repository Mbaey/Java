package com.nwnu.emall;

import com.nwnu.emall.bean.Province;
import com.nwnu.emall.dao.ProvinceMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {
    @Autowired
    ProvinceMapper provinceMapper;
    @Autowired
    Province      province;
    @Test
    public void contextLoads() {
        System.out.println(provinceMapper);
        System.out.println(province);
    }

}
