<%@page language="java" contentType="text/html; UTF-8" pageEncoding="UTF-8"%>

<div class="col-md-12 column">
    <ul class="pagination pull-right">
        <c:if test="${page.pageNum <= 1}">
            <li class="disabled">
            <a href="javascript:return false;">上一页</a>
        </c:if>
        <c:if test="${page.pageNum > 1}">
            <li>
            <a href="${pageContext.request.contextPath}/user/list?page=${page.pageNum-1}&size=${page.pageSize}">上一页</a>
        </c:if>
        </li>
        <c:forEach  var= "temp" begin="1" end= "${page.totalPage}">
            <c:if test="${page.pageNum==temp}">
                <li class="disabled">
            </c:if>
            <c:if test="${page.pageNum!=temp}">
                <li>
            </c:if>
            <a href="${pageContext.request.contextPath}/user/list?page=${temp}&size=${page.pageSize}">${temp}</a>
            </li>
        </c:forEach>
        <c:if test="${page.pageNum >= page.totalPage}">
            <li class="disabled">
            <a href="javascript:return false;">下一页</a>
        </c:if>
        <c:if test="${page.pageNum < page.totalPage}">
            <li>
            <a href="${pageContext.request.contextPath}/user/list?page=${page.pageNum+1}&size=${page.pageSize}">下一页</a>
        </c:if>
        </li>
    </ul>
</div>