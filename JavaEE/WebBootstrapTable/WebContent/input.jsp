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
	color: white;
}
</style>
<body>
	<div class="container">
		<form action="ShowCars?op=add2" method="post" class="">
			<div class="form-group">
				<label for="email">汽车牌号：</label> <input type="text" name="number"
					class="form-control" value="甘F5A321">
			</div>
			<div class="form-group">
				<label for="email"> 汽车名称：</label> <input type="text" name="name"
					class="form-control" value="BWM">
			</div>
			<div class="form-group">
				<label for="email">汽车生产日期：</label> <input type="text" name="date"
					class="form-control" value="2018-05-21"><br>
			</div>


			<input type="submit" value="提交" class="btn btn-primary">
		</form>
		<a href="show.jsp">访问show.jsp</a>
	</div>

</body>
</html>