<%@page language="java" contentType="text/html; UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <title>操作失败</title>
    <link href="https://cdn.bootcss.com/bootstrap/3.0.1/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="alert alert-dismissable alert-danger">
                <button type="button" class="close" data-dismiss="alert" aria-hidden="true">×</button>
                <h4>
                    失败!
                </h4> <strong>${msg}</strong> <a href="${url}" class="alert-link">3S后返回原来的页面</a>
            </div>
        </div>
    </div>
</div>
<script type="text/javascript">
    setTimeout("location.href='${url}'",3000);
</script>
</body>
</html>
