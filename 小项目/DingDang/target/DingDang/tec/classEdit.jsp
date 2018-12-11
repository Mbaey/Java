<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.Random" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:if test="${classss != null}">
    <form action="${pageContext.request.contextPath}/tec/doClassEdit" method="post">
        <div class="col-md-12 column">
            <div class="modal-header">
                <div class="modal-title">修改班级信息</div>
            </div>
            <!-- 模态框主体 -->
            <div class="modal-body">
                <div class="form-group">
                    班级
                </div>

                <div class="form-group">
                    id：<input class="form-control" name="id" value="${classss.id}" type="text" placeholder="id"
                              readonly="readonly"/>
                </div>
                <div class="form-group">
                    班级名称：<input class="form-control" name="name" value="${classss.name}" type="text" placeholder="班级名称："
                />
                </div>
<%new Random();%>
            </div>
            <!-- 模态框底部 -->
            <div class="modal-footer">
                <input type="submit" class="btn btn-secondary" value="确定"/>
            </div>
        </div>
    </form>
</c:if>
<c:if test="${classss == null}">
    <form action="${pageContext.request.contextPath}/tec/doClassAdd" method="post">
        <div class="col-md-12 column">
            <div class="modal-header">
                <div class="modal-title">增加班级信息</div>
            </div>
            <!-- 模态框主体 -->
            <div class="modal-body">
                <div class="form-group">
                    班级
                </div>

                <div class="form-group">
                    id：<input class="form-control" name="id" type="text" placeholder="id"
                              />
                </div>
                <div class="form-group">
                    班级名称：<input class="form-control" name="name" type="text" placeholder="班级名称"
                />
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
