<%@ page import="java.util.Random" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://cdn.bootcss.com/popper.js/1.12.5/umd/popper.min.js"></script>
    <script src="https://cdn.bootcss.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
    <title>login</title>
    <jsp:include page="navi.jsp"></jsp:include>
</head>
<body>
<div class="modal fade" id="myModal2">
    <div class="modal-dialog">
        <div class="modal-content">
            <!-- 模态框头部 -->
            <div class="container">


                <form action="${pageContext.request.contextPath}/authority/login" method="post">
                    <div class="modal-header">
                        <div class="modal-title">登录</div>
                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                    </div>
                    <!-- 模态框主体 -->
                    在线人数：<%= new Random().nextInt(1040)%>
                    <div class="modal-body">
                        <div class="form-check form-check-inline">
                            <label class="form-check-label">
                                <input class="form-radio-input" type="radio" name="who" value="tec"/> 教工
                            </label></div>
                        <div class="form-check form-check-inline">

                            <label class="form-check-label">
                                <input class="form-radio-input" type="radio" name="who" value="stu" checked="checked"/>
                                学生
                            </label>
                        </div>
                        <div class="form-group">
                            id：<input class="form-control" name="id" value="1997" type="text" placeholder="学号"/>
                        </div>
                        <div class="form-group">
                            密码：<input class="form-control" name="pwd" value="1234" type="password" placeholder="1234"/>
                        </div>
                    </div>
                    <div class="form-check form-check-inline">
                        <label class="form-check-label">
                            <input class="form-check-input" type="checkbox"/>
                            记住下次自动登录（有效期一周）<br>
                            <span style="color: red">公共场所慎用！</span>
                        </label>
                    </div>
                    <!-- 模态框底部 -->
                    <div class="modal-footer">
                        <input type="submit" class="btn btn-secondary" value="确定"/>
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">关闭</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
<div id="myModal">
    <div>
        <div>
            <!-- 模态框头部 -->
            <div class="container">
                <form action="${pageContext.request.contextPath}/authority/login" method="post">
                    <div class="modal-header">
                        <div class="modal-title">登录</div>
                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                    </div>
                    <!-- 模态框主体 -->
                    在线人数：<%= new Random().nextInt(1040)%>
                    <div class="modal-body">
                        <div class="form-check form-check-inline">
                            <label class="form-check-label">
                                <input class="form-radio-input" type="radio" name="who" value="tec"/> 教工
                            </label></div>
                        <div class="form-check form-check-inline">
                            <label class="form-check-label">
                                <input class="form-radio-input" type="radio" name="who" value="stu" checked="checked"/> 学生
                            </label>
                        </div>
                        <div class="form-group">
                            学号：<input class="form-control" name="id" value="1997" type="text" placeholder="学号"/>
                        </div>
                        <div class="form-group">
                            密码：<input class="form-control" name="pwd" value="1234" type="password" placeholder="1234"/>
                        </div>

                    </div>
                    <div class="form-check form-check-inline">
                        <%--<label class="form-check-label">--%>
                            <%--<input class="form-check-input" type="checkbox"/>--%>
                            <%--记住下次自动登录（有效期一周）<br>--%>
                            <%--<span style="color: red">公共场所慎用！</span>--%>
                        <%--</label>--%>
                    </div>
                    <!-- 模态框底部 -->
                    <div class="modal-footer">
                        <input type="submit" class="btn btn-secondary" data-dismiss="modal" value="确定"/>
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">关闭</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>

<button type="button" class="btn btn-primary edu-panel-tool-left" data-toggle="modal"
        data-target="#myModal2">登录
</button>
</form>
</body>
</html>