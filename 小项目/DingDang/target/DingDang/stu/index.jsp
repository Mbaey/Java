<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>
        木铎金声—学生信息管理系统
    </title>
    <!-- 引入bootstrap样式 -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
    <!-- 引入bootstrap-table样式 -->
    <link href="https://cdn.bootcss.com/bootstrap-table/1.11.1/bootstrap-table.min.css" rel="stylesheet">

    <!-- jquery -->
    <script src="https://cdn.bootcss.com/jquery/2.2.3/jquery.min.js"></script>
    <script src="https://cdn.bootcss.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

    <!-- bootstrap-table.min.js -->
    <script src="https://cdn.bootcss.com/bootstrap-table/1.11.1/bootstrap-table.min.js"></script>
    <!-- 引入中文语言包 -->
    <script src="https://cdn.bootcss.com/bootstrap-table/1.11.1/locale/bootstrap-table-zh-CN.min.js"></script>
    <!-- 引入bootstrap-table样式 -->
    <link href="https://cdn.bootcss.com/bootstrap-table/1.11.1/bootstrap-table.min.css" rel="stylesheet">

    <link href="Style/StudentStyle.css" rel="stylesheet" type="text/css"/>
    <link href="Script/jBox/Skins/Blue/jbox.css" rel="stylesheet" type="text/css"/>
    <link href="Style/ks.css" rel="stylesheet" type="text/css"/>
    <script src="Script/jBox/jquery-1.4.2.min.js" type="text/javascript"></script>
    <script src="Script/jBox/jquery.jBox-2.3.min.js" type="text/javascript"></script>
    <script src="Script/jBox/i18n/jquery.jBox-zh-CN.js" type="text/javascript"></script>
    <script src="Script/Common.js" type="text/javascript"></script>
    <script src="Script/Data.js" type="text/javascript"></script>
    <script src="Script/changeOption.js" type="text/javascript"></script>
    <script src="Script/rl.js" type="text/javascript"></script>
    <link href="../imgs/favicon.ico" rel="shortcut icon">
</head>
<body>
<div class="banner">
    <div class="bgh">
        <div class="page">
            <div id="logo">
                <a href="index.jsp">
                    <img src="../imgs/NwnuLog.PNG" alt="" width="165" height="48"/>
                </a>
            </div>
            <div class="topxx">
                <select onchange="changeCateory($(this))" style="font-size: 11px; background: #4991cf;
                        color: #fff;">

                    <option
                            value="4">
                        远程
                    </option>

                    <option selected='selected'
                            value="1">
                        自考
                    </option>

                </select>
                学号：${stu.id}. 学员：${stu.name}，欢迎您！ <a href="${pageContext.request.contextPath}/stu/stuInfo">我的信息</a> <a
                    href="#">
                通知</a> <a href="${pageContext.request.contextPath}/stu/stuEdit">密码修改</a> <a
                    href="${pageContext.request.contextPath}/authority/logout">安全退出</a>
            </div>
            <div class="blog_nav">
                <ul>
                    <li><a href="index.jsp">我的信息</a></li>
                    <li><a href="#">教务中心</a></li>
                    <li><a href="#">我的学费</a></li>
                    <li><a href="#">资料中心</a></li>
                </ul>
            </div>
        </div>
    </div>
</div>
<div class="page">
    <div class="box mtop">
        <div class="leftbox">
            <div class="l_nav2">
                <div class="ta1">
                    <strong>个人中心</strong>
                    <div class="leftbgbt">
                    </div>
                </div>
                <div class="cdlist">
                    <div>
                        <a href="${pageContext.request.contextPath}/stu/stuInfo">我的信息</a></div>
                    <div>
                        <a href="${pageContext.request.contextPath}/stu/classInfo">班级信息 </a>
                    </div>
                    <div>
                        <a href="#">紧急信息</a></div>
                    <div>
                        <a href="#">学院通知</a></div>
                </div>
                <div class="ta1">
                    <strong>教务中心</strong>
                    <div class="leftbgbt2">
                    </div>
                </div>
                <div class="cdlist">
                    <div>
                        <a href="${pageContext.request.contextPath}/stu/courseInfo">我的选课</a></div>
                <div>
                    <a href="${pageContext.request.contextPath}/stu/scoreInfo">我的成绩</a></div>
                </div>
            <div class="ta1">
                <strong>学习中心</strong>
                <div class="leftbgbt2">
                </div>
            </div>
            <div class="cdlist">
                <div>
                    <a href="#">资料下载</a></div>
            </div>

            <div class="ta1">
                <strong>财务中心</strong>
                <div class="leftbgbt2">
                </div>
            </div>
            <div class="cdlist">
                <div>
                    <a href="#">我的财务</a></div>
            </div>
            <div class="ta1">
                <a href="#" target="_blank"><strong>教学系统</strong></a>
                <div class="leftbgbt2">
                </div>
            </div>
        </div>
    </div>
    <div class="rightbox">

        <h2 class="mbx">
            我的学习中心&nbsp;&nbsp;&nbsp;&nbsp;</h2>
        <c:if test="${include==null}">
            <jsp:include page="default.jsp"/>
        </c:if>
        <c:if test="${include!=null}">
            <jsp:include page="${include}.jsp"/>
        </c:if>
        <div class="xxlc">
            <strong class="lcbt">学历历程</strong>
        </div>
        <div class="lcbiao">
            <div class="lctime">
                2018-05-01
            </div>
            <div class="lctime">
                2018-05-02
            </div>
            <div class="lctime">
                2018-05-03
            </div>
            <div class="lctime2">
                2018-05-04
            </div>
            <div class="lctime">
                2018-05-05
            </div>
            <div class="lctime">
                2018-05-06
            </div>
            <div class="lctime">
                2018-05-07
            </div>
        </div>
    </div>
</div>
<div class="footer">
    <p>
        @copy;copyright <%=new SimpleDateFormat("yyyy").format(new Date())%> 吃饭教育 github.com/mbaey 版权所有 </p>
</div>
</div>
<div style="text-align:center;">
</div>
</body>
</html>
