package com.nwnu.emall.controller;

import com.nwnu.emall.bean.Category;
import com.nwnu.emall.bean.CategoryExample;
import com.nwnu.emall.dao.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class HelloSpringboot {
    @Autowired
    private CategoryMapper categoryMapper;

    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "Hello worlsasd";
    }

    @RequestMapping("/category")
    @ResponseBody
    public Object listCategory() {
        List<Category> categories = categoryMapper.selectByExample(new CategoryExample());
        return categories;
    }

    @RequestMapping("/helloJSP")
    public String helloJSP(Model m) {
        m.addAttribute("now", DateFormat.getDateTimeInstance().format(new Date()));
        return "helloJSP";
    }

    /**
     * ！把#spring-mvc注释掉才行
     * 好麻烦，静态文件放resources/static
     * html放resources/templates
     * 还是用老方法吧
     *
     * @param m
     * @return
     */
    @RequestMapping("/helloThymeleaf")
    public String helloThymeleaf(Model m) {
        m.addAttribute("now", DateFormat.getDateTimeInstance().format(new Date()));
        m.addAttribute("name", "thymeleaf");
        return "hello";
    }
}