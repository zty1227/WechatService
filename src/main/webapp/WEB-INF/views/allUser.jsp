<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html lang="en" class="app">

<head>
    <meta charset="utf-8"/>
    <title>微信后台管理</title>
    <meta name="description"
          content="app, web app, responsive, admin dashboard, admin, flat, flat ui, ui kit, off screen nav"/>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1"/>
    <link rel="stylesheet" href="css/app.v2.css" type="text/css"/>
    <link rel="stylesheet" href="js\calendar/bootstrap_calendar.css" type="text/css" cache="false"/>
    <script src="js/ie/html5shiv.js" cache="false"></script>
    <script src="js/ie/respond.min.js" cache="false"></script>
    <script src="js/ie/excanvas.js" cache="false"></script>
    <![endif]-->
</head>

<body>
<section class="vbox">
    <!--顶部导航栏内容-->
    <header class="bg-dark dk header navbar navbar-fixed-top-xs">
        <div class="navbar-header aside-md">
            <a class="btn btn-link visible-xs" data-toggle="class:nav-off-screen" data-target="#nav"> <i
                    class="fa fa-bars"></i> </a>
            <a href="#" class="navbar-brand" data-toggle="fullscreen"><img src="images/logo.png" class="m-r-sm">WechatService</a>
            <a class="btn btn-link visible-xs" data-toggle="dropdown" data-target=".nav-user"> <i class="fa fa-cog"></i>
            </a>
        </div>
        <ul class="nav navbar-nav navbar-right hidden-xs nav-user">
            <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown"> <span
                        class="thumb-sm avatar pull-left"> <img src="images/avatar.jpg"> </span>admin<b
                        class="caret"></b> </a>
                <ul class="dropdown-menu animated fadeInRight">
                    <span class="arrow top"></span>
                    <li>
                        <a href="#">Settings</a>
                    </li>
                    <li>
                        <a href="profile.html">Profile</a>
                    </li>
                    <li>
                        <a href="#"> <span class="badge bg-danger pull-right">3</span> Notifications </a>
                    </li>
                    <li>
                        <a href="docs.html">Help</a>
                    </li>
                    <li class="divider"></li>
                    <li>
                        <a href="modal.lockme.html" data-toggle="ajaxModal">Logout</a>
                    </li>
                </ul>
            </li>
        </ul>
    </header>
    <!--下方内容-->
    <section>
        <section class="hbox stretch">
            <!-- .左侧 -->
            <aside class="bg-dark lter aside-md hidden-print" id="nav">
                <section class="vbox">
                    <section class="w-f scrollable">
                        <div class="slim-scroll" data-height="auto" data-disable-fade-out="true" data-distance="0"
                             data-size="5px" data-color="#333333">
                            <!-- nav -->
                            <!-- nav -->
                            <nav class="nav-primary hidden-xs">
                                <ul class="nav">
                                    <li>
                                        <a href="index.jsp" class="active"> <i class="fa fa-dashboard icon"> <b
                                                class="bg-danger"></b> </i> <span>微信后台</span> </a>
                                    </li>
                                    <li class="active">
                                        <a href="#layout"> <i class="fa fa-columns icon"> <b class="bg-warning"></b>
                                        </i> <span class="pull-right"> <i class="fa fa-angle-down text"></i> <i
                                                class="fa fa-angle-up text-active"></i> </span> <span>用户管理</span> </a>
                                        <ul class="nav lt">
                                            <li class="active">
                                                <a href="allUser"> <i class="fa fa-angle-right"></i> <span>所有用户</span>
                                                </a>
                                            </li>
                                            <li>
                                                <a href="notZone"> <i class="fa fa-angle-right"></i> <span>未分区用户</span>
                                                </a>
                                            </li>
                                            <li>
                                                <a href="aleadyZone"> <i class="fa fa-angle-right"></i>
                                                    <span>已分区用户</span> </a>
                                            </li>
                                        </ul>
                                    </li>
                                    <li>
                                        <a href="warning.jsp"> <i class="fa fa-flask icon"> <b class="bg-success"></b>
                                        </i> <span class="pull-right"> <i class="fa fa-angle-down text"></i> <i
                                                class="fa fa-angle-up text-active"></i> </span> <span>旅游-预警</span> </a>
                                        <ul class="nav lt">
                                            <li>
                                                <a href="spider"> <i class="fa fa-angle-right"></i> <span>微博爬虫</span>
                                                </a>
                                            </li>
                                            <li>
                                                <a href="weibo"> <i class="fa fa-angle-right"></i> <span>微博信息</span>
                                                </a>
                                            </li>

                                        </ul>
                                    </li>
                                    <li>
                                        <a href="#pages"> <i class="fa fa-file-text icon"> <b class="bg-primary"></b>
                                        </i> <span class="pull-right"> <i class="fa fa-angle-down text"></i> <i
                                                class="fa fa-angle-up text-active"></i> </span> <span>模板消息</span> </a>
                                        <ul class="nav lt">
                                            <li>
                                                <a href="weiboTemp"> <i class="fa fa-angle-right"></i>
                                                    <span>模板审核</span> </a>
                                            </li>

                                        </ul>
                                    </li>
                                </ul>
                            </nav>
                            <!-- / nav -->
                        </div>
                    </section>
                    <!--左侧底部-->
                    <footer class="footer lt hidden-xs b-t b-dark">
                        <a href="#nav" data-toggle="class:nav-xs" class="pull-right btn btn-sm btn-dark btn-icon"> <i
                                class="fa fa-angle-left text"></i> <i class="fa fa-angle-right text-active"></i> </a>
                    </footer>
                </section>
            </aside>
            <!-- /.右侧 -->
            <!-- 右侧主页面内容 -->
            <section id="content">
                <section class="vbox">
                    <section class="scrollable padder">
                        </session>
                        <ul class="breadcrumb no-border no-radius b-b b-light pull-in">
                            <li>
                                <i class="fa fa-home">用户管理</i>
                            </li>
                            <li class="active">
                                <a href="allUser">所有用户</a>
                            </li>
                        </ul>
                        <div class="m-b-md">
                            <h3 class="m-b-none">关注公共号的所有用户信息</h3>
                            <small>student wechat service</small>
                        </div>
                        <section class="panel panel-default">
                            <div class="row m-l-none m-r-none bg-light lter">
                                <header class="panel-heading">所有用户<i class="fa fa-info-sign text-muted"
                                                                     data-toggle="tooltip" data-placement="bottom"
                                                                     data-title="ajax to load the data."></i></header>
                                <div class="table-responsive">
                                    <table class="table table-striped m-b-none" data-ride="datatables">
                                        <thead>
                                            <tr>
                                                <th width="20%">openId</th>
                                                <th width="15%">微信名</th>
                                                <th width="5%">性别</th>
                                                <th width="10%">语言</th>
                                                <th width="10%">城市</th>
                                                <th width="10%">省份</th>
                                                <th width="10%">国家</th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <s:forEach items="${userInfo}" var="userInfo" >
                                            <tr>
                                                <td>${userInfo.openid}</td>
                                                <td>${userInfo.nickname}</td>
                                                <td>${userInfo.sex}</td>
                                                <td>${userInfo.language}</td>
                                                <td>${userInfo.city}</td>
                                                <td>${userInfo.province}</td>
                                                <td>${userInfo.country}</td>
                                            </tr>
                                        </s:forEach>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </section>
                        <div class="row">
                            <div class="col-md-8">
                                <section class="panel panel-default">

                                </section>
                            </div>
                            <div class="col-md-4">
                                <section class="panel panel-default">

                                </section>
                            </div>
                        </div>

                    </section>
                </section>
                <a href="#" class="hide nav-off-screen-block" data-toggle="class:nav-off-screen" data-target="#nav"></a>
            </section>

            <aside class="bg-light lter b-l aside-md hide" id="notes">
                <div class="wrapper">Notification</div>
            </aside>
        </section>
    </section>
</section>
<script src="js/app.v2.js"></script>
<!-- Bootstrap -->
<!-- App -->
<script src="js/charts/easypiechart/jquery.easy-pie-chart.js" cache="false"></script>
<script src="js/charts/sparkline/jquery.sparkline.min.js" cache="false"></script>
<script src="js/charts/flot/jquery.flot.min.js" cache="false"></script>
<script src="js/charts/flot/jquery.flot.tooltip.min.js" cache="false"></script>
<script src="js/charts/flot/jquery.flot.resize.js" cache="false"></script>
<script src="js/charts/flot/jquery.flot.grow.js" cache="false"></script>
<script src="js/charts/flot/demo.js" cache="false"></script>
<script src="js/calendar/bootstrap_calendar.js" cache="false"></script>
<script src="js/calendar/demo.js" cache="false"></script>
<script src="js/sortable/jquery.sortable.js" cache="false"></script>
</body>

</html>