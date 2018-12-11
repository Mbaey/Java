<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<c:if test="${stu != null}">
    <form action="${pageContext.request.contextPath}/tec/doScoreEdit" method="post">
        <div class="col-md-12 column">
            <div class="modal-header">
                <div class="modal-title">修改密码</div>
            </div>
            <!-- 模态框主体 -->
            <div class="modal-body">
                <div class="form-group">
                    成绩修改
                </div>

                <div class="form-group">
                    学生id：<input class="form-control" name="sid" value="${stu.id}" type="text" placeholder="学号"
                                readonly="readonly"/>
                </div>
                <div class="form-group">
                    姓名：<input class="form-control" value="${stu.name}" type="text" placeholder="学号" readonly="readonly"
                />
                </div>

                <div class="form-group">
                    班级：<input class="form-control" value="${stu.classid}" type="text"/>
                </div>
                <div class="form-group">
                    课程id：<input class="form-control" name="cid" value="${classss.id}" type="text"/>
                </div>

                <div class="form-group">
                    课程：<input class="form-control" value="${classss.name}" type="text"/>
                </div>
                <div class="form-group">
                    学期：<input class="form-control" value="${classss.term}" type="text"/>
                </div>
                <div class="form-group">
                    分数：<input class="form-control" name="score" value="${score.score}" type="number"/>
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
    <form action="${pageContext.request.contextPath}/tec/doScoreAdd" method="post">

        <div class="col-md-12 column">

            <div class="modal-header">
                <div class="modal-title">增加学生</div>
            </div>
            <!-- 模态框主体 -->
            <div class="modal-body">
                <div class="form-group">
                    成绩修改
                </div>

                <div class="form-group">
                    学生id：<input class="form-control" name="sid" value="${stu.id}" type="text" placeholder="学生id"
                                />
                </div>
                <div class="form-group">
                    课程id：<input class="form-control"  name="cid" value="${classss.id}" type="text" placeholder="课程id"
                                />
                </div>
                <div class="form-group">
                    分数：<input class="form-control" name="score" value="${score.score}" type="number"/>
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
