<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>购物车</title>
<jsp:include page="navi.jsp"></jsp:include>
<script>
     $(document).ready(function () {
         $("li#login").removeClass();
         $("li#cart").addClass("active");
     })
 </script>
</head>

<body>
 
<table style="background-color: white"  border='1' cellspacing='0'  class="table">
	<thead>
	    <tr>
	        <th>商品名称</th>
	        <th>单价</th>
	        <th>数量</th>
	        <th>小计</th>
	    </tr>
    </thead>
		<tbody>
			<c:forEach items="${cis}" var="ci" varStatus="st">
				<tr>
					<td>${ci.product.name}</td>
					<td>${ci.product.price}</td>
					<td>${ci.num}</td>
					<td>${ci.product.price*ci.num}</td>
				</tr>
			</c:forEach>
		</tbody>

		<c:if test="${!empty cis}">
        <tr>
            <td colspan="4" align="right">
                <a href="CartServlet?op=save">生成订单</a>
            </td>
        </tr>
    </c:if>
</body>
</html>