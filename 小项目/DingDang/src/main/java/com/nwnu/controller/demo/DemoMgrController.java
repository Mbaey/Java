package com.nwnu.controller.demo;

import com.nwnu.mapper.StuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by wcm on 2018/6/23.
 */
@Controller
@RequestMapping("/MgrController")
public class DemoMgrController {

    @Autowired
    private StuMapper stuMapper;

    @RequestMapping("/home")
    public ModelAndView home(String mgr, String pwd, ModelAndView modelAndView, HttpServletRequest request)
    {
        if("Li".equals(mgr) && "1234".equals(pwd)){
            modelAndView.setViewName("mgr/layout");
            modelAndView.addObject("msg", "home");
            request.getSession().setAttribute("mgr", mgr );
        }else
            modelAndView.setViewName("redirect:../index");
        return modelAndView;
    }
    @RequestMapping("/user")
    public ModelAndView user(ModelAndView modelAndView)
    {
        modelAndView.setViewName("mgr/layout");
        modelAndView.addObject("msg", "user");
        modelAndView.addObject("list", "userlist");
        return modelAndView;
    }
    @RequestMapping("/book")
    public ModelAndView book(ModelAndView modelAndView)
    {
        modelAndView.setViewName("mgr/layout");
        modelAndView.addObject("msg", "book");
        return modelAndView;
    }
    @RequestMapping("/car")
    public ModelAndView car(ModelAndView modelAndView)
    {
        modelAndView.setViewName("mgr/layout");
        modelAndView.addObject("msg", "car");
//        modelAndView.addObject("list", "carlist");
        return modelAndView;
    }

//    @ResponseBody
//    @RequestMapping("/user/list")
//    //神坑，返回string的话由于没有经过response，不会被filter拦截。。会有乱码的
//    public Object list(@RequestParam(value = "cp",defaultValue = "0")int cp,@RequestParam(value = "ps", defaultValue = "5") int ps,
//                       ModelAndView modelAndView) throws IOException {
//        JSONObject jsonObject = new JSONObject();
//        String resource = "mybatis-config.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resource);
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//        SqlSession session = sqlSessionFactory.openSession();
//        UserMapper mapper = session.getMapper(UserMapper.class);
//
//        UserExample userExample = new UserExample();
//        long l = mapper.countByExample(userExample);
////        System.out.println(l);
//        List<User> users = mapper.selectWithPage(cp*ps, ps);
//
//        jsonObject.put("total", l) ;
//        jsonObject.put("rows", users) ;
//
//        session.commit();
//        session.close();
//        return jsonObject;
//    }
}