
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>navi</title>
<!-- 引入bootstrap样式 -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
    <!-- 引入bootstrap-table样式 -->
    <link href="https://cdn.bootcss.com/bootstrap-table/1.11.1/bootstrap-table.min.css" rel="stylesheet">

    <!-- jquery -->
    <script src="https://cdn.bootcss.com/jquery/2.2.3/jquery.min.js"></script>
    <script src="https://cdn.bootcss.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

    <!-- bootstrap-table.min.js -->
    <script src="https://cdn.bootcss.com/bootstrap-table/1.11.1/bootstrap-table.min.js"></script>
    <!-- 引入中文语言包 -->
    <script src="https://cdn.bootcss.com/bootstrap-table/1.11.1/locale/bootstrap-table-zh-CN.min.js"></script>
<style type="text/css">
/* body { */
/* 	background-image: url('lty.jpg'); */
/* 	background-size: cover; */
/* 	background-attachment: fixed; */
/* } */

h5 {
	color: white;
}
</style>

<h5>
	欢迎 &nbsp;<b>${userName}</b>&nbsp;的到来,您可以<br>
</h5>
<div class="container">
	<div class="row" >
		<div class="span6">
			<ul class="nav nav-tabs">
				<li class="active" id="login"><a href="login.jsp">登录</a></li>
				<li id="home"><a href="index.jsp">Home</a></li>
				<li id="list"><a href="ProductServlet?op=list1">浏览商品</a></li>
				<li id="cart"><a href="CartServlet?op=show">查看购物车</a></li>
				<li id="save"><a href="CartServlet?op=save">生成订单</a></li>
				<li><a href="#">Contact</a></li>
			</ul>
		</div>
	</div>
</div>

