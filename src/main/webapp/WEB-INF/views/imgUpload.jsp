<%--
  Created by IntelliJ IDEA.
  User: yanglin
  Date: 2017/1/8
  Time: 12:19
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
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=0">
    <link href="${pageContext.request.contextPath}/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/Flat-UI/dist/css/flat-ui.css" rel="stylesheet">
    <title>上传功能</title>
</head>
<body>
<div class="container">
    <input type="text" id="comment" value="1" hidden="hidden" />
    <h3 class="text-center" >上传图片</h3>
    <div class="row">
        <div class="col-xs-4">
            <img src="img/2.jpg"  id="img1" class="img-responsive img-rounded" />
        </div>
        <div class="col-xs-4">
            <img src="img/2.jpg" id="img2" class="img-responsive img-rounded" />
        </div>
        <div class="col-xs-4">
            <img src="img/2.jpg" id="img3" class="img-responsive img-rounded" />
        </div>
    </div>

    <div class="row">
        <div class="col-xs-6 col-xs-offset-3" style="margin-top: 5px;">
            <button class="btn btn-block btn-lg btn-primary" id="chooseImage">选择图片</button>
            <button class="btn btn-block btn-lg btn-danger" id="uploadImage">上传图片</button>
            <button class="btn btn-block btn-lg btn-success" id="downloadImage">下载图片</button>
        </div>
    </div>
</div>
    <input type="text" id="commentId" value="${commentId}" hidden="hidden" />
    <input type="text" id="openId" value="${param.openid}" hidden="hidden" />
</div>

</body>
<script src="${pageContext.request.contextPath}/js/jquery-3.1.1.js"></script>
<script src="https://res.wx.qq.com/open/js/jweixin-1.0.0.js"></script>
<script src="${pageContext.request.contextPath}/bootstrap/dist/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/js/wechat.js"></script>
</html>
