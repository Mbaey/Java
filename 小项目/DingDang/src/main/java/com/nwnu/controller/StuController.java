package com.nwnu.controller;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nwnu.mapper.CourseMapper;
import com.nwnu.mapper.ScoreMapper;
import com.nwnu.mapper.StuMapper;
import com.nwnu.pojo.Score;
import com.nwnu.pojo.Stu;
import com.nwnu.pojo.StuExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by wcm on 2018/6/27.
 */
@Controller
@RequestMapping("/stu")
public class StuController {
    @Autowired
    private StuMapper stuMapper;
    @Autowired
    private CourseMapper courseMapper;
    @Autowired
    private ScoreMapper  scoreMapper;
//    想写个filter，奈何
//    @RequestMapping("/*")
//    public void doFilter(ServletRequest req, ServletResponse res) throws IOException, ServletException {
//        HttpServletRequest request = (HttpServletRequest) req;
//        HttpServletResponse response = (HttpServletResponse) res;
//        Object stu =  request.getSession().getAttribute("stu");
//        if (stu == null) {
//            response.sendRedirect("../index.jsp");
//            return;
//        }
//
//    }

    @RequestMapping("/stuInfo")
    public ModelAndView StuInfo(ModelAndView modelAndView) {
//        System.out.println("jhj");
        modelAndView.addObject("include", "stuInfo");
        modelAndView.setViewName("/stu/index");
        return modelAndView;
    }

    //查看同班同学
    @RequestMapping("/classInfo")
    public ModelAndView ClassInfo(ModelAndView modelAndView) {
        modelAndView.addObject("include", "classInfo");
        modelAndView.setViewName("/stu/index");
        return modelAndView;
    }

    @RequestMapping("/courseInfo")
    public ModelAndView stuCourse(ModelAndView modelAndView) {
        modelAndView.addObject("include", "courseInfo");
        modelAndView.setViewName("/stu/index");
        return modelAndView;
    }
    @RequestMapping("/scoreInfo")
    public ModelAndView stuScore(ModelAndView modelAndView) {
        modelAndView.addObject("include", "scoreInfo");
        modelAndView.setViewName("/stu/index");
        return modelAndView;
    }
    @RequestMapping("/stuEdit")
    public ModelAndView goToStuEdit(ModelAndView modelAndView){
        modelAndView.addObject("include", "stuEdit");
        modelAndView.setViewName("/stu/index");
        return modelAndView;
    }

    @ResponseBody
    @RequestMapping("/listStu")
    public Object listStuInfo(@RequestParam(value = "cp", defaultValue = "1") Integer cp,
                              @RequestParam(value = "ps", defaultValue = "5") Integer ps,
                              HttpSession session, ArrayList<Stu> stus) {
        Stu stu = (Stu) session.getAttribute("stu");
        stus.add(stu);
        JSONObject map = new JSONObject();
        map.put("total", 1);
        map.put("rows", stus);
        return map;
    }

    @ResponseBody
    @RequestMapping("/listClass")
    public Object listClassInfo(@RequestParam(value = "cp", defaultValue = "0") Integer cp,
                                @RequestParam(value = "ps", defaultValue = "5") Integer ps,
                                HttpSession session) {
        PageHelper.offsetPage(cp, ps);
        Stu stu = (Stu) session.getAttribute("stu");
        StuExample stuExample = new StuExample();

        stuExample.or().andClassidEqualTo(stu.getClassid());
//        没有PageHelper之前
//        long count = stuMapper.countByExample(stuExample);
//        List<Stu> Mystus1 = stuMapper.selectByExampleByClassIdWith(stu.getClassid(), cp, ps);


//        有PageHelper之后
        List<Stu> stusPageHelper = stuMapper.selectByExample(stuExample);
        PageInfo pageInfo = new PageInfo<>(stusPageHelper);
//        System.out.println(stusPageHelper.size());
//        System.out.println(count);
        JSONObject map = new JSONObject();
        map.put("total", pageInfo.getTotal());
        map.put("rows", stusPageHelper);
        return map;
    }

    @ResponseBody
    @RequestMapping("/listCourse")
    public Object listCourseInfo(@RequestParam(value = "cp", defaultValue = "0") Integer cp,
                                 @RequestParam(value = "ps", defaultValue = "5") Integer ps,
                                 HttpSession session) {
        Stu stu = (Stu) session.getAttribute("stu");

        PageHelper.offsetPage(cp, ps);
        List<Score> scores = scoreMapper.selectAllDataRightJoinStuAndCourse(stu.getId(), null, null);
        PageInfo pageInfo = new PageInfo<>(scores);
        JSONObject map = new JSONObject();
        map.put("total", pageInfo.getTotal());
        map.put("rows", scores);
        return map;
    }

    @ResponseBody
    @RequestMapping("/listScore")
    public Object listScoreInfo(@RequestParam(value = "cp", defaultValue = "0") Integer cp,
                                 @RequestParam(value = "ps", defaultValue = "5") Integer ps,
                                 HttpSession session) {
        Stu stu = (Stu) session.getAttribute("stu");
        PageHelper.offsetPage(cp, ps);
        List<Score> scores = scoreMapper.selectAllDataJoinStuAndCourse(stu.getId(), null, null);
        PageInfo pageInfo = new PageInfo<>(scores);
        JSONObject map = new JSONObject();
        map.put("total", pageInfo.getTotal());
        map.put("rows", scores);
        return map;
    }
    @RequestMapping("/doStuEdit")
    public String stuEdit(Stu stu, Map<String, Object> map){
        int i = stuMapper.updateByPrimaryKey(stu);
        map.put("url", "index.jsp");
        if(i != 1){
            map.put("msg", "修改失败");
            return "../common/error";
        }
        map.put("msg", "修改成功");
        return "../common/success";
    }

    @RequestMapping("/addCourse")
    public String addCourseInfo(@RequestParam(value = "sid", defaultValue = "1997") Integer sid,
                                @RequestParam(value = "cid", defaultValue = "1997") Integer cid,
                                HttpSession session,
                                Map<String, Object> map,
                                Score score) {

        Stu stu = (Stu) session.getAttribute("stu");
        score.setCid(cid);
        score.setSid(sid);
        System.out.println(score);
        int i = 0;
        try {
            i=scoreMapper.insert(score);
        } catch (Exception e) {
            e.printStackTrace();
        }
        map.put("url", "index.jsp");
        if(i != 1){
            map.put("msg", "修改失败");
            return "../common/error";
        }
        map.put("msg", "修改成功");
        return "../common/success";
    }

}