<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>goods list</title>
<jsp:include page="navi.jsp"></jsp:include>
<script>
	$(document).ready(function() {
		$("li#login").removeClass();
		$("li#list").addClass("active");
	})
</script>
</head>

<body>
	<table style="width: 40%" class="table"
		cellspacing='0'>
		<thead>
			<tr>
				<th>id</th>
				<th>名称</th>
				<th>价格</th>
				<th>购买</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${products}" var="product" varStatus="st">
				<tr>
					<td>${product.id}</td>
					<td>${product.name}</td>
					<td>${product.price}</td>
					<td>

						<form action="CartServlet" method="post">
							<input type="hidden" value="add" name="op"> 数量<input
								type="text" value="1" name="num"> <input type="hidden"
								name="pid" value="${product.id}"> <input type="submit"
								value="购买">
						</form>
					</td>

				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>