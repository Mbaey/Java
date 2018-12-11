<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:if test="${course != null}">
    <form action="${pageContext.request.contextPath}/tec/doCourseEdit" method="post">
    <div class="col-md-12 column">
        <div class="modal-header">
            <div class="modal-title">修改课程</div>
        </div>
        <!-- 模态框主体 -->
        <div class="modal-body">
            <div class="form-group">
                课程
            </div>

            <div class="form-group">
                id：<input class="form-control" name="id" value="${course.id}" type="text" placeholder="id"
                          readonly="readonly"/>
            </div>
            <div class="form-group">
                课程名称：<input class="form-control" name="name" value="${course.name}" type="text" placeholder="课程名称"
            />
            </div>
            <div class="form-group">
                学期：<input class="form-control" name="term" value="${course.term}" type="text" placeholder="学期"/>
            </div>
        </div>
        <!-- 模态框底部 -->
        <div class="modal-footer">
            <input type="submit" class="btn btn-secondary" value="确定"/>
        </div>
    </div>
</form>
</c:if>
<c:if test="${course == null}">
    <form action="${pageContext.request.contextPath}/tec/doCourseAdd" method="post">

        <div class="col-md-12 column">

            <div class="modal-header">
                <div class="modal-title">增加课程</div>
            </div>
            <!-- 模态框主体 -->
            <div class="modal-body">
                <div class="form-group">
                    课程
                </div>

                <div class="form-group">
                    id：<input class="form-control" name="id" value="${course.id}" type="text" placeholder="id" >
                </div>
                <div class="form-group">
                    课程名称：<input class="form-control" name="name" value="${course.name}" type="text" placeholder="课程名称"
                />
                </div>
                <div class="form-group">
                    学期：<input class="form-control" name="term" value="${course.term}" type="text" placeholder="学期"/>
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
