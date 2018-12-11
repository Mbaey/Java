<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8"/>
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

<%--https://www.cnblogs.com/wuhuacong/p/7284420.html--%>
<script type="text/javascript">
    $(function () {

        var t = $("#table_server").bootstrapTable({
            url: '<%=request.getContextPath()%>/stu/listClass',
//                 url: 'page_data.json',
            method: 'get',
            dataType: "json",
            striped: true,//设置为 true 会有隔行变色效果
            undefinedText: "空",//当数据为 undefined 时显示的字符
            pagination: true, //分页
            // paginationLoop:true,//设置为 true 启用分页条无限循环的功能。
            showToggle: "true",//是否显示 切换试图（table/card）按钮
            showColumns: "true",//是否显示 内容列下拉框
            pageNumber: 1,//如果设置了分页，首页页码
             showPaginationSwitch:true,//是否显示 数据条数选择框
            pageSize: 5,//如果设置了分页，页面数据条数
            pageList: [5, 10, 20, 40],	//如果设置了分页，设置可供选择的页面数据条数。设置为All 则显示所有记录。
            paginationPreText: '‹',//指定分页条中上一页按钮的图标或文字,这里是<
            paginationNextText: '›',//指定分页条中下一页按钮的图标或文字,这里是>
            // singleSelect: false,//设置True 将禁止多选
            search: true, //显示搜索框
            data_local: "zh-US",//表格汉化
            sidePagination: "server", //服务端处理分页
            queryParams: function (params) {//自定义参数，这里的参数是传给后台的，我这是是分页用的
                return {//这里的params是table提供的
                    cp: params.offset,//从数据库第几条记录开始
                    ps: params.limit//找多少条
                };
            },
            idField: "id",//指定主键列
            columns: [
                {
                    title: 'id',//表的列名
                    field: 'id',//json数据中rows数组中的属性名
                    align: 'center'//水平居中
                },
                {
                    //EMAIL
                    title: '用户名称',
                    field: 'name',
                    align: 'center'
                },
                {
                    //部门名字
                    title: '学院',
                    field: 'academy',
                    align: 'center'
                },
                {
                    title: '操作',
                    field: 'id',
                    align: 'center',
                    formatter: function (value, row, index) {//自定义显示可以写标签哦~
                        var id = row.id;
                        var result = "";
                        ' + row.userId + '
//                        result += "<a href='<%=request.getContextPath()%>/MgrController/view?id="+id+"' class='btn btn-xs green'  title='查看'><span class='glyphicon glyphicon-search'></span></a>";
//                        result += "<a href='<%=request.getContextPath()%>/MgrController/edit?id="+id+"'class='btn btn-xs blue' title='编辑'><span class='glyphicon glyphicon-pencil'></span></a>";
//                        result += "<a href='<%=request.getContextPath()%>/MgrController/del?id="+String(id)+"' class='btn btn-xs red' title='删除'><span class='glyphicon glyphicon-remove'></span></a>";
                        result += "<span class='glyphicon glyphicon-search'></span>"
                        return result;
                    }
                }

            ]
        });


        t.on('load-success.bs.table', function (data) {//table加载成功后的监听函数
            console.log("load success");
            $(".pull-right").css("display", "block");
        });

    });
</script>
<div class="col-md-12 column">
<div class="panel panel-default">
        <div class="panel-body">
            <table id="table_server"></table>
        </div>
    </div>
</div>