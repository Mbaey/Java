<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>

<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript">
	$(function() {
		$("#LoginInBtn").on("click", function() {
			var loginData = $("#LoginInForm").serialize();

			// 			alert(fd);

			$.ajax({
				type : 'post', // 提交方式 get/post
				url : '${pageContext.request.contextPath}/servlet/userServlet', // 需要提交的 url
				data : loginData,
				success : function(d) { // data 保存提交后返回的数据，一般为 json 数据
					// 此处可对 data 作相关处理
					if (d.status == 1) {
						alert(d.data);
					} else {
						console.log(d);
					}
				},
			// $(this).resetForm(); // 提交后重置表单
			});
			return false; // 阻止表单自动提交事件	
		});
	});
</script>
</head>
<body>
	<form id="LoginInForm">
		<input type="text" name="name" id="name"> <br> <input
			type="text" name="pwd" id="pwd"> <br> <input
			type="submit" value="add">
	</form>
	<button id="LoginInBtn">LoginIn</button>
</body>
</html>