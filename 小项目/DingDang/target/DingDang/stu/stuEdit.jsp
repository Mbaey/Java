<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<form action="${pageContext.request.contextPath}/stu/doStuEdit" method="post">
    <div class="<%=request.getContextPath()%>">


        <div class="modal-header">
            <div class="modal-title">修改密码</div>
        </div>
        <!-- 模态框主体 -->
        <div class="modal-body">
            <div class="form-group">
                学生
            </div>
            <div class="form-group">
                id：<input class="form-control" name="id" value="${stu.id}" type="text" placeholder="学号"
                          readonly="readonly"/>
            </div>
            <div class="form-group">
                姓名：<input class="form-control" name="name" value="${stu.name}" type="text" placeholder="学号"
                          />
            </div>
            <div class="form-group">
                密码：<input class="form-control" name="pwd" value="${stu.pwd}" type="password" placeholder="${stu.pwd}"/>
            </div>
            <div class="form-group">
                班级：<input class="form-control" name="classid" value="${stu.classid}" type="text" readonly="readonly"/>
            </div>
            <div class="form-group">
                学院：<input class="form-control" name="adademy" value="${stu.academy}" type="text" readonly="readonly"/>
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
        </div>
</form>
</div>