package com.nwnu.controller.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller@RequestMapping("/hw")
public class HelloWrodController{

//    @Autowired
//    private DeptService deptService;

//    @ResponseBody
//    @RequestMapping("/hw11")
//    public Dept fun11(){
//        System.out.println("fun1");
//        return  new Dept("a","aa","aaaaaaaaa");
//    }
    @ResponseBody
    @RequestMapping("/hw")
    public Object fun12(){
        return  "你好,SpringMVC";
    }
//
//    @ResponseBody
//    @RequestMapping("/listAllDepts")
//    public List<Dept> listAllDepts() throws SQLException {
//        return deptService.getAllDepts();
//    }
//
//    @ResponseBody
//    @RequestMapping("/addDept")
//    public int addDept() throws SQLException {
//        Dept dept = new Dept("c", "cc", "cccc");
//        return deptService.addDept(dept);
//    }
}