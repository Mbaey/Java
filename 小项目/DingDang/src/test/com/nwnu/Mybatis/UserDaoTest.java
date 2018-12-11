package com.nwnu.Mybatis;

import com.nwnu.mapper.StuMapper;
import com.nwnu.pojo.Stu;
import com.nwnu.pojo.StuExample;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by wcm on 2018/6/22.
 */
public class UserDaoTest {
    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();

        StuMapper mapper = session.getMapper(StuMapper.class);
        List<Stu> stus = mapper.selectByExample(new StuExample());
        stus.stream().forEach(System.out::println);
//        add(mapper);
//        delete(mapper);
//        get(mapper);
//        update(mapper);
//        listAll(mapper);

        session.commit();
        session.close();

    }
//    private static void listAll(UserMapper mapper) {
//
////        https://blog.csdn.net/biandous/article/details/65630783
//        UserExample userExample = new UserExample();
////        UserExample.Criteria criteria = userExample.createCriteria();
////        BookExample.Criteria criteria1 = new BookExample().createCriteria();
////        criteria1.and书名Like("我了个去");
//
//        userExample.setOrderByClause("name asc"); //asc升序,desc降序排列
//        userExample.setDistinct(false); //去除重复,true是选择不重复记录,false反之
//
////        List<User> cs = mapper.selectByPrimaryKey(1);
////        for (User c : cs) {
////            System.out.println(c);
////        }
//        User cs = mapper.selectByPrimaryKey(1);
//        System.out.println(cs);
//    }
}