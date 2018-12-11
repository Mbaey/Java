package com.nwnu.controller;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nwnu.mapper.ClassMapper;
import com.nwnu.mapper.CourseMapper;
import com.nwnu.mapper.ScoreMapper;
import com.nwnu.mapper.StuMapper;
import com.nwnu.pojo.Class;
import com.nwnu.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * Created by wcm on 2018/6/27.
 */
@Controller
@RequestMapping("/tec")
public class TecController {
    @Autowired
    private StuMapper    stuMapper;
    @Autowired
    private CourseMapper courseMapper;
    @Autowired
    private ScoreMapper  scoreMapper;
    @Autowired
    private ClassMapper  classMapper;

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
    /*所有信息跳转！！！
    用了Layout设计。其实更复杂了？*/
    //查看所有学生
    @RequestMapping("/stuInfo")
    public ModelAndView StuInfo(ModelAndView modelAndView) {
//        System.out.println("jhj");
        modelAndView.addObject("include", "stuInfo");
        modelAndView.setViewName("/tec/index");
        return modelAndView;
    }

    //查看所有班级
    @RequestMapping("/classInfo")
    public ModelAndView ClassInfo(ModelAndView modelAndView) {
        modelAndView.addObject("include", "classInfo");
        modelAndView.setViewName("/tec/index");
        return modelAndView;
    }

    //这里包含了课程
    @RequestMapping("/courseInfo")
    public ModelAndView stuCourse(ModelAndView modelAndView) {
        modelAndView.addObject("include", "courseInfo");
        modelAndView.setViewName("/tec/index");
        return modelAndView;
    }

    //查看所有学生的分数，修改
    @RequestMapping("/scoreInfo")
    public ModelAndView stuScore(ModelAndView modelAndView) {
        modelAndView.addObject("include", "scoreInfo");
        modelAndView.setViewName("/tec/index");
        return modelAndView;
    }

    /**************各个信息展示！*************************/
    @ResponseBody
    @RequestMapping("/listClass")
    public Object listClassInfo(@RequestParam(value = "cp", defaultValue = "0") Integer cp,
                                @RequestParam(value = "ps", defaultValue = "5") Integer ps,
                                HttpSession session) {
        PageHelper.offsetPage(cp, ps);
        List<com.nwnu.pojo.Class> classes = classMapper.selectByExample(new ClassExample());

//        stuExample.or().andClassidEqualTo(stu.getClassid());
//        没有PageHelper之前
//        long count = stuMapper.countByExample(stuExample);
//        List<Stu> Mystus1 = stuMapper.selectByExampleByClassIdWith(stu.getClassid(), cp, ps);

//        有PageHelper之后

        PageInfo pageInfo = new PageInfo<>(classes);
//        System.out.println(stusPageHelper.size());
//        System.out.println(count);
        JSONObject map = new JSONObject();
        map.put("total", pageInfo.getTotal());
        map.put("rows", classes);
        return map;
    }

    @ResponseBody
    @RequestMapping("/listStu")
    public Object listStuInfo(@RequestParam(value = "cp", defaultValue = "1") Integer cp,
                              @RequestParam(value = "ps", defaultValue = "5") Integer ps
    ) {
        JSONObject jsonObj = new JSONObject();
        PageHelper.offsetPage(cp, ps);
        List<Stu> stus = stuMapper.selectByExample(new StuExample());
        PageInfo pageInfo = new PageInfo<>(stus);
        System.out.println(pageInfo.getTotal());

        jsonObj.put("total", pageInfo.getTotal());
        jsonObj.put("rows", stus);
        return jsonObj;
    }

    @ResponseBody
    @RequestMapping("/listCourse")
    public Object listCourseInfo(@RequestParam(value = "cp", defaultValue = "0") Integer cp,
                                 @RequestParam(value = "ps", defaultValue = "5") Integer ps,
                                 HttpSession session) {

        PageHelper.offsetPage(cp, ps);
        List<Course> courses = courseMapper.selectByExample(new CourseExample());
        PageInfo pageInfo = new PageInfo<>(courses);
        JSONObject map = new JSONObject();
        map.put("total", pageInfo.getTotal());
        map.put("rows", courses);
        return map;
    }

    @ResponseBody
    @RequestMapping("/listScore")
    public Object listScoreInfo(@RequestParam(value = "cp", defaultValue = "0") Integer cp,
                                @RequestParam(value = "ps", defaultValue = "5") Integer ps,
                                HttpSession session) {
        PageHelper.offsetPage(cp, ps);
        List<Score> scores = scoreMapper.selectAllDataJoinStuAndCourse(null, null, null);
        scores.stream().forEach(System.out::println);
        PageInfo pageInfo = new PageInfo<>(scores);
        JSONObject map = new JSONObject();
        map.put("total", pageInfo.getTotal());
        map.put("rows", scores);
        return map;
    }

    /********************学生管理********************************************************/
    @RequestMapping("/doStuEdit")
    public String stuEdit(Stu stu, Map<String, Object> map) {
        System.out.println(stu);
        int i = stuMapper.updateByPrimaryKey(stu);
        map.put("url", "index.jsp");
        if (i != 1) {
            map.put("msg", "修改失败");
            return "../common/error";
        }
        map.put("msg", "修改成功");
        return "../common/success";
    }

    @RequestMapping("/doStuAdd")
    public String stuAdd(Stu stu, Map<String, Object> map) {
        int i = stuMapper.insert(stu);
        map.put("url", "index.jsp");
        if (i != 1) {
            map.put("msg", "插入失败");
            return "../common/error";
        }
        map.put("msg", "插入成功");
        return "../common/success";
    }

    @RequestMapping("/delStu")
    public String stuDel(Integer id, Map<String, Object> map) {
        int i = stuMapper.deleteByPrimaryKey(id);
        map.put("url", "../tec/index.jsp");
        if (i != 1) {
            map.put("msg", "修改失败");
            return "../common/error";
        }
        map.put("msg", "修改成功");
        return "../common/success";
    }

    @RequestMapping("/editStu")
    public ModelAndView goToStuEdit(Integer id, ModelAndView modelAndView) {
        StuExample stuExample = new StuExample();
        stuExample.or().andIdEqualTo(id);
        List<Stu> stus = stuMapper.selectByExample(stuExample);
        modelAndView.addObject("stu", stus.get(0));
        modelAndView.addObject("include", "stuEdit");
        modelAndView.setViewName("/tec/index");
        return modelAndView;
    }

    @RequestMapping("/addStu")
    public ModelAndView goToStuAdd(ModelAndView modelAndView) {
        modelAndView.addObject("include", "stuEdit");
        modelAndView.setViewName("/tec/index");
        return modelAndView;
    }

    /***********************班级管理****************************************************/
    @RequestMapping("/doClassEdit")
    public String classssEdit(Class classss, Map<String, Object> map) {
        System.out.println(classss);
        int i = classMapper.updateByPrimaryKey(classss);
        map.put("url", "index.jsp");
        if (i != 1) {
            map.put("msg", "修改失败");
            return "../common/error";
        }
        map.put("msg", "修改成功");
        return "../common/success";
    }

    @RequestMapping("/doClassAdd")
    public String classssAdd(Class classss, Map<String, Object> map) {
        int i = classMapper.insert(classss);
        map.put("url", "index.jsp");
        if (i != 1) {
            map.put("msg", "插入失败");
            return "../common/error";
        }
        map.put("msg", "插入成功");
        return "../common/success";
    }

    @RequestMapping("/delClass")
    public String classssDel(Integer id, Map<String, Object> map) {
        int i = classMapper.deleteByPrimaryKey(id);
        map.put("url", "../tec/index.jsp");
        if (i != 1) {
            map.put("msg", "修改失败");
            return "../common/error";
        }
        map.put("msg", "修改成功");
        return "../common/success";
    }

    @RequestMapping("/editClass")
    public ModelAndView goToClassEdit(Integer id, ModelAndView modelAndView) {
        ClassExample classssExample = new ClassExample();
        classssExample.or().andIdEqualTo(id);

        List<Class> classsss = classMapper.selectByExample(classssExample);
        modelAndView.addObject("classss", classsss.get(0));
        modelAndView.addObject("include", "classEdit");
        modelAndView.setViewName("/tec/index");
        return modelAndView;
    }

    @RequestMapping("/addClass")
    public ModelAndView goToClassAdd(ModelAndView modelAndView) {
        modelAndView.addObject("include", "classEdit");
        modelAndView.setViewName("/tec/index");
        return modelAndView;
    }

    /***********************课程管理***************************************/
    @RequestMapping("/doCourseEdit")
    public String courseEdit(Course course, Map<String, Object> map) {
        System.out.println(course);
        int i = courseMapper.updateByPrimaryKey(course);
        map.put("url", "index.jsp");
        if (i != 1) {
            map.put("msg", "修改失败");
            return "../common/error";
        }
        map.put("msg", "修改成功");
        return "../common/success";
    }

    @RequestMapping("/doCourseAdd")
    public String courseAdd(Course course, Map<String, Object> map) {
        int i = courseMapper.insert(course);
        map.put("url", "index.jsp");
        if (i != 1) {
            map.put("msg", "插入失败");
            return "../common/error";
        }
        map.put("msg", "插入成功");
        return "../common/success";
    }

    @RequestMapping("/delCourse")
    public String courseDel(Integer id, Map<String, Object> map) {
        int i = courseMapper.deleteByPrimaryKey(id);
        map.put("url", "../tec/index.jsp");
        if (i != 1) {
            map.put("msg", "修改失败");
            return "../common/error";
        }
        map.put("msg", "修改成功");
        return "../common/success";
    }

    @RequestMapping("/editCourse")
    public ModelAndView goToCourseEdit(Integer id, ModelAndView modelAndView) {
        CourseExample courseExample = new CourseExample();
        courseExample.or().andIdEqualTo(id);
        List<Course> courses = courseMapper.selectByExample(courseExample);
        modelAndView.addObject("course", courses.get(0));
        modelAndView.addObject("include", "courseEdit");
        modelAndView.setViewName("/tec/index");
        return modelAndView;
    }

    @RequestMapping("/addCourse")
    public ModelAndView goToCourseAdd(ModelAndView modelAndView) {
        modelAndView.addObject("include", "courseEdit");
        modelAndView.setViewName("/tec/index");
        return modelAndView;
    }
    /***************************************成绩管理*****************************************************/
    @RequestMapping("/doScoreEdit")
    public String scoreEdit(Integer sid, Integer cid , BigDecimal score, Map<String, Object> map) {
        System.out.println(" doStuEdit");
        Score score1 = new Score(sid, cid, score);
        System.out.println(score1);
        int i = scoreMapper.updateByPrimaryKey(score1);
        map.put("url", "index.jsp");
        if (i != 1) {
            map.put("msg", "修改失败");
            return "../common/error";
        }
        map.put("msg", "修改成功");
        return "../common/success";
    }

    @RequestMapping("/doScoreAdd")
    public String scoreAdd(Integer sid, Integer cid , BigDecimal score, Map<String, Object> map) {

        int i = scoreMapper.insert(new Score(sid, cid, score));
        map.put("url", "index.jsp");
        if (i != 1) {
            map.put("msg", "插入失败");
            return "../common/error";
        }
        map.put("msg", "插入成功");
        return "../common/success";
    }

    @RequestMapping("/delScore")
    public String scoreDel(ScoreKey scoreKey, Map<String, Object> map) {
        int i = scoreMapper.deleteByPrimaryKey(scoreKey);
        map.put("url", "../tec/index.jsp");
        if (i != 1) {
            map.put("msg", "修改失败");
            return "../common/error";
        }
        map.put("msg", "修改成功");
        return "../common/success";
    }

    @RequestMapping("/editScore")
    public ModelAndView goToScoreEdit(ScoreKey scoreKey, ModelAndView modelAndView) {
        ScoreExample scoreExample = new ScoreExample();
        Integer cid = scoreKey.getCid();
        Integer sid = scoreKey.getSid();
        scoreExample.or().andCidEqualTo(cid).andSidEqualTo(sid);
        List<Score> scores = scoreMapper.selectByExample(scoreExample);

        StuExample stuExample = new StuExample();
        stuExample.or().andIdEqualTo(sid);
        List<Stu> stus = stuMapper.selectByExample(stuExample);

        CourseExample courseExample = new CourseExample();
        courseExample.or().andIdEqualTo(cid);
        List<Course> classes = courseMapper.selectByExample(courseExample);

        modelAndView.addObject("stu", stus.get(0));
        modelAndView.addObject("classss", classes.get(0));
        modelAndView.addObject("score", scores.get(0));
        modelAndView.addObject("include", "scoreEdit");
        modelAndView.setViewName("/tec/index");
        return modelAndView;
    }

    @RequestMapping("/addScore")
    public ModelAndView goToScoreAdd(ModelAndView modelAndView) {
        modelAndView.addObject("include", "scoreEdit");
        modelAndView.setViewName("/tec/index");
        return modelAndView;
    }
}