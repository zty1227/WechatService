<%--
  Created by IntelliJ IDEA.
  User: zhangtianyu
  Date: 2017/2/16
  Time: 下午7:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <base href="<%=basePath%>" id="baseUrl">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=0">
    <link href="${pageContext.request.contextPath}/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/Flat-UI/dist/css/flat-ui.css" rel="stylesheet">
    <title>分享功能测试</title>
</head>
<body>
<div class="container">
    <h3 class="text-center">我的女神</h3>
    <div class="row">
        <div class="col-xs-10 col-xs-offset-1" style="border:dotted">
            <p class="text-center"><small>新桓结衣</small></p>
            <img src="img/1.jpg" class="img-responsive"><br/>
        </div>
    </div>
    <hr />
    <div class="row">
        <div class="col-xs-10 col-xs-offset-1"style="border:dotted">
            <p class="text-center"><small>gakki</small></p>
            <img src="img/2.jpg" class="img-responsive"/><br/>
        </div>
    </div>
    <hr/>
    <div class="row">
        <div class="col-xs-10 col-xs-offset-1"style="border:dotted">
            <p class="text-center"><small>大爱新桓结衣</small></p>
            <img src="img/3.jpg" class="img-responsive"/><br/>
        </div>
    </div>
    <hr/>
    <div class="row">
        <div class="col-xs-10 col-xs-offset-1"style="border:dotted">
            <p class="text-center"><small>大爱gakki</small></p>
            <img src="img/4.jpg" class="img-responsive"/><br/>
        </div>
    </div>
    <br/>

    <div class="row">
        <div class="col-xs-10 col-xs-offset-1">
            <p class="text-center">如果你也像我一样爱她</p>
            <p class="text-center">请点击右上角分享</p>
        </div>
    </div>
    <input type="text" id="contentId" value="1" hidden="hidden" />
    <input type="text" id="openId" value="${param.openid}" hidden="hidden" />
</div>
</body>
<script src="${pageContext.request.contextPath}/js/jquery-3.1.1.js"></script>
<script src="https://res.wx.qq.com/open/js/jweixin-1.0.0.js"></script>
<script src="${pageContext.request.contextPath}/bootstrap/dist/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/js/wechat.js"></script>
</html>
