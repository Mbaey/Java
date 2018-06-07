<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:include page="navi.jsp"></jsp:include>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Input</title>
</head>
</script>
<style type="text/css">
label {
	color: red;
}
</style>
<body>
	<div class="container">
		<form action="ShowMess?op=add" method="post" class="">
			<div class="form-group">
				<label for="email">输入您的名字：</label> <input type="text" name="name"
					class="form-control" value="李同学">
			</div>
			<div class="form-group">
				<label for="email">输入您的留言标题：</label> <input type="text" name="title"
					class="form-control" value="中午吃什么？">
			</div>
			<div class="form-group">
				<label for="email">输入您的留言：</label> <textarea name="message"
				style=" resize: none;"	class="form-control" value="2018-05-21"> </textarea>
			</div>


			<input type="submit" value="提交" class="btn btn-primary">
		</form>
		<a href="showMess.jsp">访问showMess.jsp</a>
	</div>

</body>
</html>