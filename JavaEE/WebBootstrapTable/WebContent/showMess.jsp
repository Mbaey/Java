<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Shwo</title>
<jsp:include page="navi.jsp"></jsp:include>
<script type="text/javascript">
	$(function() {

		var t = $("#table_server")
				.bootstrapTable(
						{
							url : 'http://localhost:8080/Demo1/ShowMess?op=show',
							//                 url: 'page_data.json',
							method : 'get',
							dataType : "json",
							striped : true,//设置为 true 会有隔行变色效果
							undefinedText : "空",//当数据为 undefined 时显示的字符
							pagination : true, //分页
							// paginationLoop:true,//设置为 true 启用分页条无限循环的功能。
							showToggle : "true",//是否显示 切换试图（table/card）按钮
							showColumns : "true",//是否显示 内容列下拉框
							pageNumber : 1,//如果设置了分页，首页页码
							// showPaginationSwitch:true,//是否显示 数据条数选择框
							pageSize : 5,//如果设置了分页，页面数据条数
							pageList : [ 5, 10, 20, 40 ], //如果设置了分页，设置可供选择的页面数据条数。设置为All 则显示所有记录。
							paginationPreText : '‹',//指定分页条中上一页按钮的图标或文字,这里是<
                paginationNextText: '›',//指定分页条中下一页按钮的图标或文字,这里是>
							// singleSelect: false,//设置True 将禁止多选
							search : false, //显示搜索框
							data_local : "zh-US",//表格汉化
							sidePagination : "server", //服务端处理分页
							queryParams : function(params) {//自定义参数，这里的参数是传给后台的，我这是是分页用的
								return {//这里的params是table提供的
									cp : params.offset,//从数据库第几条记录开始
									ps : params.limit
								//找多少条
								};
							},
							idField : "id",//指定主键列
							columns : [
									{
										title : '留言者姓名',//表的列名
										field : 'name',//json数据中rows数组中的属性名
										align : 'center'//水平居中
									},
									{
										//EMAIL
										title : '留言标题',
										field : 'title',
										align : 'center'
									},
									{
										//部门名字
										title : '留言内容',
										field : 'message',
										align : 'center'
									},
									{
										//部门名字
										title : '留言时间',
										field : 'timestampDate',
										align : 'center'
									},
									{
										title : 'delete',
										field : 'userId',
										align : 'center',
										formatter : function(value, row, index) {//自定义显示可以写标签哦~
											return '<a href="#" mce_href="#" onclick="edit(\''
													+ row.userId
													+ '\')">操作</a> ';
										}
									}

							]
						});

		t.on('load-success.bs.table', function(data) {//table加载成功后的监听函数
			console.log("load success");
			$(".pull-right").css("display", "block");
		});

	});
</script>
</head>
<body>
	<div class="container">
		<div class="panel panel-default">
			<div class="panel-body">
				<table id="table_server"></table>
			</div>
		</div>
	<a href="inputMess.jsp">访问inputMess.jsp</a>
	</div>
</body>
</html>