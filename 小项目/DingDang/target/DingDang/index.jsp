<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.Random" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<!-- saved from url=(0021)http://210.26.111.34/ -->
<html class="panel-fit">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="renderer" content="webkit">
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath }/easyui1545/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/easyui1545/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/easyui1545/demo/demo.css">
    <%--<script type="text/javascript" src="${pageContext.request.contextPath }/easyui1545/jquery.min.js"></script>--%>
    <%--<script type="text/javascript" src="${pageContext.request.contextPath }/easyui1545/jquery.easyui.min.js"></script>--%>
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1">
    <link href="./1_files/easyui.css" rel="stylesheet" type="text/css">
    <link href="./1_files/icon.css" rel="stylesheet" type="text/css">
    <link href="./1_files/home.css" rel="stylesheet" type="text/css">
    <link href="imgs/edu.png" rel="shortcut icon">
    <%--<script src="./1_files/jquery.min.js" type="text/javascript"></script>--%>
    <style>html, * {
        -webkit-user-select: text !important;
        -moz-user-select: text !important;
    }</style>
    <%--<script src="./1_files/jquery.easyui.min.js" type="text/javascript"></script>--%>
    <%--<script src="./1_files/easyui-lang-zh_CN.js" type="text/javascript"></script>--%>
    <%--<script src="./1_files/store.min.js" type="text/javascript"></script>--%>
    <%--<script src="./1_files/edu.min.js" type="text/javascript"></script>--%>
    <%--<script src="./1_files/ajaxupload.js" type="text/javascript"></script>--%>
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.1.0/css/bootstrap.min.css">
    <script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://cdn.bootcss.com/popper.js/1.12.5/umd/popper.min.js"></script>
    <script src="https://cdn.bootcss.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
    <style type="text/css">
        .messager-body {
            font-size: 14px;
        }
    </style>


    <title>西北吃饭大学教务管理系统</title>
</head>
<div class="modal fade" id="myModal">
    <div class="modal-dialog">
        <div class="modal-content">
            <!-- 模态框头部 -->
            <div class="container">
                <form action="${pageContext.request.contextPath}/authority/login" method="post">
                    <div class="modal-header">
                        <div class="modal-title">登录</div>
                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                    </div>
                    <!-- 模态框主体 -->
                    在线人数：<%= new Random().nextInt(1040)%>
                    <div class="modal-body">
                        <div class="form-check form-check-inline">
                            <label class="form-check-label">
                                <input class="form-radio-input" type="radio" name="who" value="tec" checked="checked"/> 教工
                            </label></div>
                        <div class="form-check form-check-inline">

                            <label class="form-check-label">
                                <input class="form-radio-input" type="radio" name="who" value="stu" />
                                学生
                            </label>
                        </div>
                        <div class="form-group">
                            id：<input class="form-control" name="id" value="1997" type="text" placeholder="学号"/>
                        </div>
                        <div class="form-group">
                            密码：<input class="form-control" name="pwd" value="1234" type="password" placeholder="1234"/>
                        </div>
                    </div>
                    <div class="form-check form-check-inline">
                        <label class="form-check-label">
                            <input class="form-check-input" type="checkbox"/>
                            记住下次自动登录（有效期一周）<br>
                            <span style="color: red">公共场所慎用！</span>
                        </label>
                    </div>
                    <!-- 模态框底部 -->
                    <div class="modal-footer">
                        <input type="submit" class="btn btn-secondary" value="确定"/>
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">关闭</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>

<body id="layout" class="easyui-layout layout panel-noscroll" data-options="fit:true" style="overflow:hidden"
      onselectstart="return false">
<div class="panel layout-panel layout-panel-north" style="width: 1536px; left: 0px; top: 0px;">
    <div data-options="region:&#39;north&#39;,split:false,collapsible:false,border:false"
         style="line-height: 52px; vertical-align: middle; padding: 2px; overflow: hidden; width: 1532px; height: 52px;"
         title="" class="panel-body panel-body-noheader panel-body-noborder layout-body">
        <span style="font-size:26px;color:#9eb9c8;margin-left:10px;font-family:STHupo,SimHei;"
              ondblclick="javascript:RefteshSysInfo()">西北吃饭大学教务管理系统</span>

        <div style="position: absolute; top: 0px; right: 10px;">
            <c:if test="${stu == null && tec== null}">
                <button type="button" class="btn btn-primary edu-panel-tool-left" data-toggle="modal"
                        data-target="#myModal">登录
                </button>
            </c:if>
            <a class="btn btn-primary edu-panel-tool-left" href="authority/logout">
                注销
            </a>


        </div>
        <div id="mFunc" style="position: absolute; top: 0px; right: 32%;width:260px;overflow:hidden;"></div>
    </div>
</div>
<div class="panel layout-panel layout-panel-center" style="width: 1536px; left: 0px; top: 56px;">
    <div data-options="region:&#39;center&#39;,border:false" title=""
         class="panel-body panel-body-noheader panel-body-noborder layout-body panel-noscroll"
         style="width: 1536px; height: 672px;">
        <div class="easyui-layout layout easyui-fluid" data-options="fit:true" style="width: 1536px; height: 672px;">
            <div class="panel layout-panel layout-panel-north" style="width: 1536px; left: 0px; top: 0px;">
                <div data-options="region:&#39;north&#39;,split:false,border:false"
                     style="line-height: 22px; vertical-align: middle; background: rgb(57, 164, 220); padding-left: 2px; width: 1534px; height: 24px;"
                     title="" class="panel-body panel-body-noheader panel-body-noborder layout-body">
                    <span id="subject" style="font-size:16px;color:#FFFFFF;margin-left:10px;">首页</span>
                    <c:if test="${stu == null && tec== null}">
                        <span id="currUser"
                              style="font-size:16px;float:right;margin-right:12px;color:#FFFFFF">未登录</span>
                    </c:if>
                    <c:if test="${stu!= null }">
                        <span id="currUser"
                              style="font-size:16px;float:right;margin-right:12px;color:#FFFFFF"> <a href="stu/index.jsp"  style="font-size:16px;float:right;margin-right:12px;color:#FFFFFF">${stu.name} </a></span>
                    </c:if>
                    <c:if test="${tec!= null}">
                        <span id="currUser"
                              style="font-size:16px;float:right;margin-right:12px;color:#FFFFFF"><a href="tec/index.jsp" style="font-size:16px;float:right;margin-right:12px;color:#FFFFFF" > ${tec} </a></span>
                    </c:if>
                </div>
            </div>
            <div class="panel layout-panel layout-panel-center" style="width: 1536px; left: 0px; top: 24px;">
                <div id="maincontent"
                     data-options="region:&#39;center&#39;,border:false,href:&#39;home.do&#39;,loadingMessage:&#39;页面加载中,请稍候......&#39;"
                     style="padding: 10px; overflow: hidden; width: 1516px; height: 628px;" title=""
                     class="panel-body panel-body-noheader panel-body-noborder layout-body">

                    <h2 style="text-align:center"><a href="./1_files/student.pdf">关于印发《西北吃饭大学本科生考场纪律及违纪认定的若干规定》的通知</a>
                    </h2>
                    <h2 style="text-align:center"><a href="./1_files/teacher.pdf">关于印发《西北吃饭大学教学事故认定及处理办法（试行）》的通知</a>
                    </h2>
                    <h2 style="text-align:center"><a href="./1_files/teacher1.pdf">关于印发《西北吃饭大学教师教学奖惩办法（试行）》等的通知</a></h2>
                    <h2 style="text-align:center"><a href="./1_files/teacher2.pdf">关于进一步突出教学工作重心的实施意见</a></h2>
                    <div style="padding-left:5px;margin:0 auto;width:540px;height:220px;border:1px solid #F00;text-align:center">
                        <img src="./1_files/weixin.png" alt="西北师大教务处官方微信">
                        <p>西北师大教务处官方微信</p>
                        <p><b>使用注意事项：</b>教师成绩录入时，应在30分钟内提交，否则会话过期，录入的成绩丢失</p>
                    </div>
                </div>
            </div>
            <div class="layout-split-proxy-h"></div>
            <div class="layout-split-proxy-v"></div>
        </div>
    </div>
</div>
<div class="panel layout-panel layout-panel-south" style="width: 1536px; left: 0px; top: 727px;">
    <div data-options="region:&#39;south&#39;,split:false"
         style="line-height: 30px; text-align: center; vertical-align: middle; color: rgb(45, 45, 45); border-left: none; border-right: none; border-bottom: none; width: 1536px; height: 31px;"
         title="" class="panel-body panel-body-noheader layout-body">
        <span>联系电话：7971621 7970712 7971434</span>
    </div>
</div>


<div class="layout-split-proxy-h"></div>
<div class="layout-split-proxy-v"></div>
<div class="panel window easyui-fluid" style="display: none; width: 1524px; left: 0px; top: 0px;">
    <div class="panel-header panel-header-noborder window-header" style="width: 1524px;">
        <div class="panel-title panel-with-icon">打印预览</div>
        <div class="panel-icon icon-save"></div>
        <div class="panel-tool"><a href="javascript:void(0)" class="panel-tool-close"></a></div>
    </div>
    <div id="winpdf" class="easyui-window panel-body panel-body-noborder window-body" title=""
         data-options="modal:true,collapsible:false,minimizable:false,maximizable:false,fit:true,closed:true,iconCls:&#39;icon-save&#39;"
         style="width: 1522px; height: 724px;">
        <iframe id="rptFrame" allowtransparency="yes" border="0" frameborder="no" height="99%" marginheight="0"
                marginwidth="0" scrolling="no" width="100%" src="./1_files/saved_resource.html"></iframe>
    </div>
</div>
<div class="window-shadow" style="display: none; left: 0px; top: 0px;"></div>
<div class="window-mask" style="width: 1536px; height: 759px; display: none;"></div>
<div class="panel window" style="display: none; width: 288px; left: 618px; top: 251px;">
    <div class="panel-header panel-header-noborder window-header" style="width: 288px;">
        <div class="panel-title panel-with-icon">登录</div>
        <div class="panel-icon icon-login"></div>
        <div class="panel-tool"></div>
    </div>
    <div id="dlgLogin" class="easyui-dialog panel-body panel-body-noborder window-body" title=""
         style="padding: 10px 30px 5px; width: 226px;"
         data-options="iconCls:&#39;icon-login&#39;,modal:true,closable:false,closed:true,resizable:false,openAnimation:&#39;slide&#39;,onBeforeOpen:GetOnline,
                buttons:[{text:&#39;确定&#39;,iconCls:&#39;icon-ok&#39;,handler:MLogin},{text:&#39;取消&#39;,iconCls:&#39;icon-cancel&#39;,handler:LoginDlgClose}]">
        <div style="margin-bottom:8px;vertical-align:middle"><span id="uMsg" style="color:red">&nbsp;</span>
        </div>
        <div id="uType" style="margin-bottom:10px;vertical-align:middle">
            <span style="padding-left:20px"><input type="radio" name="usertype" value="E">教工</span>
            <span style="padding-left:20px"><input type="radio" name="usertype" value="S" checked="">学生</span>
        </div>
        <div style="margin-bottom:8px">
            <input id="uCode" class="easyui-textbox textbox-f"
                   style="width: 100%; height: 32px; padding: 12px; display: none;"
                   data-options="prompt:&#39;学号&#39;,iconCls:&#39;icon-man&#39;,iconWidth:38,required:true,missingMessage:&#39;必填！！！&#39;,tipPosition:&#39;left&#39;"><span
                class="textbox easyui-fluid textbox-invalid" style="width: 224px; height: 30px;"><span
                class="textbox-addon textbox-addon-right" style="right: 0px;"><a href="javascript:void(0)"
                                                                                 class="textbox-icon icon-man textbox-icon-disabled"
                                                                                 icon-index="0" tabindex="-1"
                                                                                 style="width: 38px; height: 30px;"></a></span><input
                type="text" class="textbox-text validatebox-text textbox-prompt validatebox-invalid" autocomplete="off"
                placeholder="学号" style="padding: 8px 12px; margin-left: 0px; margin-right: 38px; width: 162px;"><input
                type="hidden" class="textbox-value" value=""></span>
        </div>
        <div style="margin-bottom:8px">
            <input id="uPassword" class="easyui-textbox textbox-f" type="password"
                   style="width: 100%; height: 32px; padding: 12px; display: none;"
                   data-options="prompt:&#39;密码&#39;,iconCls:&#39;icon-lock&#39;,iconWidth:38,required:true,missingMessage:&#39;必填！！！&#39;,tipPosition:&#39;left&#39;"><span
                class="textbox easyui-fluid textbox-invalid" style="width: 224px; height: 30px;"><span
                class="textbox-addon textbox-addon-right" style="right: 0px;"><a href="javascript:void(0)"
                                                                                 class="textbox-icon icon-lock textbox-icon-disabled"
                                                                                 icon-index="0" tabindex="-1"
                                                                                 style="width: 38px; height: 30px;"></a></span><input
                type="password" class="textbox-text validatebox-text textbox-prompt validatebox-invalid"
                autocomplete="off" placeholder="密码"
                style="padding: 8px 12px; margin-left: 0px; margin-right: 38px; width: 162px;"><input type="hidden"
                                                                                                      class="textbox-value"
                                                                                                      value=""></span>
        </div>
        <div style="margin-bottom:8px">
            <span><input id="uValidcode" class="easyui-textbox textbox-f"
                         style="width: 120px; height: 32px; padding: 12px; display: none;"
                         data-options="prompt:&#39;验证码&#39;,required:true,missingMessage:&#39;必填！！！&#39;,tipPosition:&#39;left&#39;"
                         validtype="equals_valid[&#39;#uCheckcode&#39;]"><span class="textbox textbox-invalid"
                                                                               style="width: 118px; height: 30px;"><input
                    type="text" class="textbox-text validatebox-text textbox-prompt validatebox-invalid"
                    autocomplete="off" placeholder="验证码"
                    style="padding: 8px 12px; margin-left: 0px; margin-right: 0px; width: 94px;"><input type="hidden"
                                                                                                        class="textbox-value"
                                                                                                        value=""></span></span>
            <span style="float:right;"><input id="uCheckcode" class="easyui-textbox textbox-f"
                                              style="width: 90px; height: 32px; padding: 6px; display: none;"
                                              data-options="editable:false,buttonIcon:&#39;icon-refresh&#39;,onClickButton:CreateCode"><span
                    class="textbox" style="width: 88px; height: 30px;"><a href="javascript:void(0)"
                                                                          class="textbox-button textbox-button-right l-btn l-btn-small"
                                                                          group="" id=""
                                                                          style="height: 30px; right: 0px;"><span
                    class="l-btn-left l-btn-icon-left" style="margin-top: 3px;"><span class="l-btn-text l-btn-empty">&nbsp;</span><span
                    class="l-btn-icon icon-refresh">&nbsp;</span></span></a><input type="text"
                                                                                   class="textbox-text validatebox-text textbox-prompt"
                                                                                   autocomplete="off"
                                                                                   readonly="readonly" placeholder=""
                                                                                   style="padding: 8px 6px; margin-left: 0px; margin-right: 26px; width: 50px;"><input
                    type="hidden" class="textbox-value" value=""></span></span>
        </div>
        <div>
            <span style="padding-left:20px"><input id="uRember" type="checkbox">记住下次自动登录（有效期一周）<br>
            <span style="color:red;padding-left:80px">公共场所慎用！</span>
        </span></div>
    </div>
    <div class="dialog-button" style="position: relative; top: -1px; width: 276px;"><a href="javascript:void(0)"
                                                                                       class="l-btn l-btn-small"
                                                                                       group="" id=""><span
            class="l-btn-left l-btn-icon-left"><span class="l-btn-text">确定</span><span
            class="l-btn-icon icon-ok">&nbsp;</span></span></a><a href="javascript:void(0)" class="l-btn l-btn-small"
                                                                  group="" id=""><span
            class="l-btn-left l-btn-icon-left"><span class="l-btn-text">取消</span><span class="l-btn-icon icon-cancel">&nbsp;</span></span></a>
    </div>
</div>
<div class="window-shadow" style="display: none; left: 618px; top: 251px; width: 300px; height: 295px;"></div>
<div class="window-mask" style="width: 1536px; height: 759px; display: none;"></div>
<div class="panel window" style="display: none; width: 288px; left: 618px; top: 283px;">
    <div class="panel-header panel-header-noborder window-header" style="width: 288px;">
        <div class="panel-title panel-with-icon">更改密码</div>
        <div class="panel-icon icon-lock"></div>
        <div class="panel-tool"></div>
    </div>
    <div id="dlgChgPwd" class="easyui-dialog panel-body panel-body-noborder window-body" title=""
         style="padding: 10px 20px 5px; width: 246px;"
         data-options="iconCls:&#39;icon-lock&#39;,modal:true,closable:false,closed:true,resizable:false,openAnimation:&#39;fade&#39;,
                buttons:[{text:&#39;确定&#39;,iconCls:&#39;icon-ok&#39;,handler:ChangePwd},{text:&#39;取消&#39;,iconCls:&#39;icon-cancel&#39;,handler:PwdDlgClose}]">
        <div style="margin-bottom:8px;vertical-align:middle"><span id="pMsg" style="color:red">&nbsp;</span></div>
        <div style="width:250px;margin-bottom:8px">
            旧的密码：<input id="oldpwd" class="easyui-textbox textbox-f" type="password"
                        style="width: 190px; height: 32px; padding: 12px; display: none;"
                        data-options="required:true,missingMessage:&#39;必填！！！&#39;"><span
                class="textbox textbox-invalid" style="width: 188px; height: 30px;"><input type="password"
                                                                                           class="textbox-text validatebox-text textbox-prompt validatebox-invalid"
                                                                                           autocomplete="off"
                                                                                           placeholder=""
                                                                                           style="padding: 8px 12px; margin-left: 0px; margin-right: 0px; width: 164px;"><input
                type="hidden" class="textbox-value" value=""></span>
        </div>
        <div style="width:250px;margin-bottom:8px">
            新的密码：<input id="newpwd" class="easyui-textbox textbox-f" type="password"
                        style="width: 190px; height: 32px; padding: 12px; display: none;"
                        data-options="required:true,missingMessage:&#39;必填！！！&#39;"><span
                class="textbox textbox-invalid" style="width: 188px; height: 30px;"><input type="password"
                                                                                           class="textbox-text validatebox-text textbox-prompt validatebox-invalid"
                                                                                           autocomplete="off"
                                                                                           placeholder=""
                                                                                           style="padding: 8px 12px; margin-left: 0px; margin-right: 0px; width: 164px;"><input
                type="hidden" class="textbox-value" value=""></span>
        </div>
        <div style="width:250px;margin-bottom:8px">
            确认密码：<input id="repwd" class="easyui-textbox textbox-f" type="password"
                        style="width: 190px; height: 32px; padding: 12px; display: none;"
                        data-options="required:true,missingMessage:&#39;必填！！！&#39;"><span
                class="textbox textbox-invalid" style="width: 188px; height: 30px;"><input type="password"
                                                                                           class="textbox-text validatebox-text textbox-prompt validatebox-invalid"
                                                                                           autocomplete="off"
                                                                                           placeholder=""
                                                                                           style="padding: 8px 12px; margin-left: 0px; margin-right: 0px; width: 164px;"><input
                type="hidden" class="textbox-value" value=""></span>
        </div>
    </div>
    <div class="dialog-button" style="position: relative; top: -1px; width: 276px;"><a href="javascript:void(0)"
                                                                                       class="l-btn l-btn-small"
                                                                                       group="" id=""><span
            class="l-btn-left l-btn-icon-left"><span class="l-btn-text">确定</span><span
            class="l-btn-icon icon-ok">&nbsp;</span></span></a><a href="javascript:void(0)" class="l-btn l-btn-small"
                                                                  group="" id=""><span
            class="l-btn-left l-btn-icon-left"><span class="l-btn-text">取消</span><span class="l-btn-icon icon-cancel">&nbsp;</span></span></a>
    </div>
</div>
<div class="window-shadow" style="display: none; left: 618px; top: 283px; width: 300px; height: 231px;"></div>
<div class="window-mask" style="width: 1536px; height: 759px; display: none;"></div>
</body>
</html>