<%--
  Created by IntelliJ IDEA.
  User: zhangtianyu
  Date: 2017/2/20
  Time: 下午8:46
  To change this template use File | Settings | File Templates.
--%>
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
    <base href="<%=basePath%>" id="baseUrl">
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
    <script src="bootstrap/dist/js/bootstrap.min.js"></script>
    <script src="js/jquery-3.1.1.js"></script>

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
                                        <a href="index" class="active"> <i class="fa fa-dashboard icon"> <b
                                                class="bg-danger"></b> </i> <span>微信后台</span> </a>
                                    </li>
                                    <li>
                                        <a href="#layout"> <i class="fa fa-columns icon"> <b class="bg-warning"></b>
                                        </i> <span class="pull-right"> <i class="fa fa-angle-down text"></i> <i
                                                class="fa fa-angle-up text-active"></i> </span> <span>用户管理</span> </a>
                                        <ul class="nav lt">
                                            <li>
                                                <a href="allUser"> <i class="fa fa-angle-right"></i> <span>所有用户</span>
                                                </a>
                                            </li>
                                            <li>
                                                <a href="notZone" class="active"> <i class="fa fa-angle-right"></i>
                                                    <span>未分区用户</span> </a>
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
                                    <li class="active">
                                        <a href="#pages"> <i class="fa fa-file-text icon"> <b class="bg-primary"></b>
                                        </i> <span class="pull-right"> <i class="fa fa-angle-down text"></i> <i
                                                class="fa fa-angle-up text-active"></i> </span> <span>模板消息</span> </a>
                                        <ul class="nav lt">
                                            <li class="alive">
                                                <a href="weiboTemp"> <i class="fa fa-angle-right"></i> <span>模板审核</span>
                                                </a>
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
                        <ul class="breadcrumb no-border no-radius b-b b-light pull-in">
                            <li>
                                <i class="fa fa-home">模板消息</i>
                            </li>
                            <li class="active">
                                <a href="weibo">模板审核</a>
                            </li>
                        </ul>
                        <div class="m-b-md">
                            <h3 class="m-b-none">提交模板信息</h3>
                            <small>student wechat service</small>
                        </div>
                        <section class="panel panel-default">
                            <div class="row m-l-none m-r-none bg-light lter">
                                <header class="panel-heading">微博信息<i class="fa fa-info-sign text-muted"
                                                                     data-toggle="tooltip" data-placement="bottom"
                                                                     data-title="ajax to load the data."></i></header>
                                <div class="row">
                                    <div class="col-sm-5 m-b-xs">
                                        <% String action1 = path + "/selectZone";%>
                                        <form data-validate="parsley" method="post" action="<%=action1%>">
                                            <select name="selectZone" id="selectZone"
                                                    class="input-sm form-control input-s-sm inline">
                                                <option value="all">All</option>
                                                <option value="湖北">湖北</option>
                                                <option value="湖南">湖南</option>
                                                <option value="陕西">陕西</option>
                                                <option value="云南">云南</option>
                                                <option value="浙江">浙江</option>
                                                <option value="江苏">江苏</option>
                                                <option value="山东">山东</option>
                                                <option value="山西">山西</option>
                                                <option value="新疆">新疆</option>
                                                <option value="黑龙江">黑龙江</option>
                                                <option value="河北">河北</option>
                                                <option value="河南">河南</option>
                                                <option value="四川">四川</option>
                                                <option value="云南">云南</option>
                                                <option value="福建">福建</option>
                                                <option value="西藏">西藏</option>
                                                <option value="海南">海南</option>
                                                <option value="广东">广东</option>
                                                <option value="广西">广西</option>
                                                <option value="内蒙古">内蒙古</option>
                                                <option value="宁夏">宁夏</option>
                                                <option value="上海">上海</option>
                                                <option value="吉林">吉林</option>
                                                <option value="安徽">安徽</option>
                                                <option value="江西">江西</option>
                                                <option value="贵州">贵州</option>
                                                <option value="辽宁">辽宁</option>
                                                <option value="青海">青海</option>
                                            </select>
                                            <button id="apply" type="submit" class="btn btn-sm btn-default">Apply
                                            </button>
                                        </form>
                                    </div>
                                    <div class="pull-right col-sm-3">
                                        <div class="input-group">
                                            <input type="text" class="input-sm form-control" placeholder="Search">
                                            <span class="input-group-btn">
                                             <button class="btn btn-sm btn-default" type="button">Go!</button>
                                            </span>
                                        </div>
                                    </div>
                                </div>
                                <div id="userdiv" class="table-responsive">
                                </div>
                            </div>
                            <div style="margin-left:45px;margin-top:5px;font-size:medium; float:left;font-style: italic">
                                一共有${counts}条数据
                            </div>
                            <div style="margin-left:35%">
                                <ul class="pagination pagination-sm m-t-none m-b-none"
                                    id="pagination">
                                    <!--  <li><a href="#"><i class="fa fa-chevron-left"></i></a></li>
                                    <li><a href="#">1</a></li>
                                    <li><a href="#">2</a></li>
                                    <li><a href="#">3</a></li>
                                    <li><a href="#">4</a></li>
                                    <li><a href="#">5</a></li>
                                    <li><a href="#"><i class="fa fa-chevron-right"></i></a></li>-->
                                </ul>
                            </div>
                            <div>
                                <input type="hidden" value="${pageSize}" id="pageSize"/>
                                <input type="hidden" value="${counts}" id="counts"/>
                                <input type="hidden" value="${zone}" id="zone"/>
                            </div>
                        </section>
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
<script src="js/jqPaginator.js" cache="false"></script>
<script>
    <%--<input type="hidden" value="${username}" id="username"/>--%>
    <%--<input type="hidden" value="<%=request.getContextPath()%>" id="contextPath"/>--%>
    //记录总页面和每页数
    var ps = Number(document.getElementById("pageSize").value);
    console.info(ps);
    var tc = Number(document.getElementById("counts").value);
    var datelength;
    console.info(tc);
    //分页
    $('.pagination').jqPaginator({
        totalCounts: tc,
        pageSize: ps,
        visiblePages: 5,
        currentPage: 1,
        first: '<li class="first"><a href="javascript:;">首页</a></li>',
        last: '<li class="last"><a href="javascript:;">尾页</a></li>',
        prev: '<li class="prev"><a href="javascript:;">上一页</a></li>',
        next: '<li class="next"><a href="javascript:;">下一页</a></li>',
        page: '<li class="page"><a href="javascript:;">{{page}}</a></li>',
        onPageChange: function (num, type) {
            if ($("#orderpages_hidden").val() != 0) {
                getPage(num);
            }
            //$('#p3').html('当前第' + num + '页');
        }
    });
    //alert(document.getElementById("musicname").value);
    //alert("${musicname}");
    //获取每页的数据
    function getPage(page, k) {
        var ps = Number(document.getElementById("pageSize").value);
        var tc = Number(document.getElementById("counts").value);
        var zone = $("#zone").val();
        //alert(tc);
        //alert(sn);
        $.ajax({
            type: "POST",
            url: "/wechatService/ajax_operation",
            dataType: "json",
            cache: false,
            data: {
                pageIndex: page,
                pageSize: ps,
                totalPage: tc,
                zone: zone
            },
            async: false,
            error: function () {
                alert("网络异常！");
            },
            success: function (data) {
                var html = "";
                html += "<table id='userTable' class='table table-striped m-b-none' data-ride='datatables'>";
                html += "<thead>";
//                html += "<tr>";
//                html += "<th  hidden='hidden'>信息id</th>";
//                html += "</tr>";
                html += "<tr>";
                html += "<th width='60%'>微博内容</th>";
                html += "<th width='10%'>微博时间</th>";
                html += "<th width='10%'>微博来源</th>";

//                html += "</tr>";
//                html += "<tr>";
                html += "<th width='10'>热度</th>";
//                html += "</tr>";
//                html += "<tr>";
                html += "<th >提审</th>";
                html += "</tr>";
                html += "</thead>";
                html += "<tbody>";
                for (var i = 0; i < data.length; i++) {
                    var redu;
                    redu = data[i].zan + data[i].pinglun * 2 + data[i].zhuanfa * 3;
                    html += "<tr>";
                    html += "<td id='contentid" + i + "' hidden='hidden'>";
                    html += data[i].contentid;
                    html += "</td>";
                    html += "<td>";
                    html += data[i].content;
                    html += "</td>";
                    html += "<td>";
                    html += data[i].time;
                    html += "</td>";
                    html += "<td>";
                    html += data[i].weiboname;
                    html += "</td>";
                    html += "<td width='10%'>";
                    html += redu;
                    html += "</td>";
                    html += "<td>";
                    if (!data[i].ischeck) {
                        html += "<div id='" + data[i].contentid + "'<button onclick=check('" + data[i].contentid + "') type='button' class='pull-right btn btn-sm btn-default' >提交审核</button></div>";
                    } else {
                        html += "<div id='" + data[i].contentid + "'<button disabled='true' type='button' class='pull-right btn btn-sm btn-default' >已经审核</button></div>";
                    }
                    html += "</td>";
                    html += "</tr>";
                }
                html += ' </tbody>';
                html += '</table>';
                $('#userdiv').html(html);
            }
        });
    }
    ;
    $('#selectZone').val("${selectZone == null?'all': selectZone}");
</script>
<script type="text/javascript">
    function check(contentid) {
//        alert(contentid);
        var data = JSON.stringify({
            contentid: contentid
        });
        $.ajax({
            url: '/wechatService/refer',
            type: 'POST',
            contentType: 'application/json;charset=utf-8',
            data: data,
            dataType: 'text',
            success: function (data) {
                var b = document.getElementById(contentid);
                var bt = $(b);
                document.getElementById(contentid).innerHTML = "已经审核";
                bt.attr("disabled", true);
            },
            error: function (data) {
                console.log(data);
            }

        });
    }
</script>
</body>
</html>