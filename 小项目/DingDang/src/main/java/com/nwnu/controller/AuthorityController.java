package com.nwnu.controller;

import com.nwnu.mapper.StuMapper;
import com.nwnu.pojo.Stu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by wcm on 2018/6/26.
 */
@Controller
@RequestMapping("/authority")
public class AuthorityController {
    @Autowired
    private StuMapper stuMapper;

//    https://www.yiibai.com/spring_mvc/springmvc_radiobutton.html
    @RequestMapping("/login")
    public ModelAndView login(ModelAndView modelAndView, HttpSession session , HttpServletRequest request) {
        Integer id=Integer.parseInt(request.getParameter("id"));
        String pwd=request.getParameter("pwd");
        String who = request.getParameter("who");
        System.out.printf("%s, %d, %s\n", who, id, pwd);
        System.out.println("in AuthorityController");
        if ("stu".equals(who)) {
            Stu stu = stuMapper.selectByPrimaryKey(id);
            if (stu!= null && stu.getPwd()!=null &&stu.getPwd().equals(pwd)){
//                modelAndView.addObject();只是保存到request当前请求中，只在当前请求中访问到，其他请求中无法访问
                session.setAttribute("stu", stu);
                modelAndView.addObject("msg", "登录成功，欢迎"+stu.getName());
                modelAndView.addObject("url", "../stu/index.jsp");
                modelAndView.setViewName("/common/success");
            }else {
                modelAndView.addObject("msg", "用户名密码错误！");
                modelAndView.addObject("url", "../index.jsp");
                modelAndView.setViewName("/common/error");
            }
        } else {
            if (id == 1997 && "1234".equals(pwd)){
                session.setAttribute("tec", "李老师");
                modelAndView.addObject("msg", "登录成功，欢迎李老师");
                modelAndView.addObject("url", "../tec/index.jsp");
                modelAndView.setViewName("/common/success");
            }else {
                modelAndView.addObject("msg", "用户名密码错误！");
                modelAndView.addObject("url", "../index.jsp");
                modelAndView.setViewName("/common/error");
            }
        }
        return modelAndView;
    }
    @RequestMapping("logout")
    public ModelAndView Logout(HttpSession session, ModelAndView modelAndView){
//        System.out.println("logout");
        session.removeAttribute("tec");
        session.removeAttribute("stu");
        modelAndView.setViewName("redirect:../index.jsp");
        return modelAndView;
    }
}