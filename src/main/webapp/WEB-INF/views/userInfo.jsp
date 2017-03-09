<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">
    <link href="${pageContext.request.contextPath}/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/bootstrap/dist/css/flat-ui.css" rel="stylesheet">
    <title>用户信息</title>
</head>

<body>
<div class="container">
    <div class="row">
        <h3 class="text-center"> 用户信息显示</h3>
    </div>
    <c:if test="${userInfo!=null}">
        <div class="row">
            <div class="col-xs-10 col-xs-offset-1">
                <div class="form-group">
                    <span>头像</span>
                    <img src="${userInfo.headImgUrl}"class="img-circle col-xs-offset-6" style="height: 50px;"/><br />
                    <span>OpenID</span>
                    <input type="text" class="form-control" value="${userInfo.openId}"/>
                    <span>昵称</span>
                    <input type="text" class="form-control" value="${userInfo.nickname}"/>
                    <span>性别</span>
                    <input type="text" class="form-control" value="${userInfo.sex}"/>
                    <span>省份 </span>
                    <input type="text" class="form-control" value="${userInfo.province}"/>
                    <span>城市 </span>
                    <input type="text" class="form-control" value="${userInfo.city}"/>
                    <span>国家 </span>
                    <input type="text" class="form-control" value="${userInfo.country}"/>
                </div>
            </div>
        </div>
    </c:if>
    <c:if test="${userInfo==null}">
        <div class="row">
        </div>
            <h3 class="text-center"> 用户没有进行授权</h3>
    </c:if>

</div>
</body>
<script src="${pageContext.request.contextPath}/js/jquery-3.1.1.js"></script>
<script src="${pageContext.request.contextPath}/bootstrap/dist/js/bootstrap.min.js"></script>
</html>
