<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:if test="${stu != null}">
    <form action="${pageContext.request.contextPath}/tec/doStuEdit" method="post">
        <div class="col-md-12 column">
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
                    密码：<input class="form-control" name="pwd" value="${stu.pwd}" type="text" placeholder="${stu.pwd}"/>
                </div>
                <div class="form-group">
                    班级：<input class="form-control" name="classid" value="${stu.classid}" type="text"/>
                </div>
                <div class="form-group">
                    学院：<input class="form-control" name="academy" value="${stu.academy}" type="text"/>
                </div>
            </div>
            <!-- 模态框底部 -->
            <div class="modal-footer">
                <input type="submit" class="btn btn-secondary" value="确定"/>
            </div>
        </div>
    </form>
</c:if>
<c:if test="${stu == null}">
    <form action="${pageContext.request.contextPath}/tec/doStuAdd" method="post">

        <div class="col-md-12 column">

            <div class="modal-header">
                <div class="modal-title">修改密码</div>
            </div>
            <!-- 模态框主体 -->
            <div class="modal-body">
                <div class="form-group">
                    学生
                </div>

                <div class="form-group">
                    id：<input class="form-control" name="id" type="text" placeholder="学号"
                              readonly="readonly"/>
                </div>
                <div class="form-group">
                    姓名：<input class="form-control" name="name" type="text" placeholder="学号"
                />
                </div>
                <div class="form-group">
                    密码：<input class="form-control" name="pwd"  type="text" placeholder="${stu.pwd}"/>
                </div>
                <div class="form-group">
                    班级：<input class="form-control" name="classid" type="text" />
                </div>
                <div class="form-group">
                    学院：<input class="form-control" name="academy" type="text"/>
                </div>
            </div>
            <!-- 模态框底部 -->
            <div class="modal-footer">
                <input type="submit" class="btn btn-secondary" value="确定"/>
            </div>
        </div>
    </form>
</c:if>

</div>
