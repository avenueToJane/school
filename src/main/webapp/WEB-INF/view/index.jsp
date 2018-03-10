<!DOCTYPE HTML>
<%@ page isELIgnored="false"%><!--解决部署到tomcat中页面无法获取EL表达式的问题  -->
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<html>
<%
	String contextPath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ request.getContextPath();
%>

<head>
<meta charset="utf-8">
<title>全国公民身份证号码查询服务中心</title>
<link href="<%=contextPath%>/static/css/bootstrap.min.css"
	rel="stylesheet" type="text/css" />
<link href="<%=contextPath%>/static/css/bootstrap.min.css"
	rel="stylesheet" type="text/css" />

<script src="<%=contextPath%>/static/js/jquery.min.js"></script>
<script src="<%=contextPath%>/static/js/bootstrap.min.js"></script>
<script src="<%=contextPath%>/static/js/jquery.min.js"></script>
<script src="<%=contextPath%>/static/js/bootstrap.min.js"></script>
</head>
<script>
$(function(){
	var mess="${error}"
	if(mess!=""){
		alert(mess);
	}
	
	   $('#clear').click(function() {
           $("#name").val("").focus(); // 清空并获得焦点
   });
});
</script>
<body style="text-align: center;">
	<div class="container">
		<div class="jumbotron">
			<h1 >欢迎访问</h1>
			
			<p>
				<a class="btn btn-primary btn-lg" role="button"
					href="<%=contextPath%>/queryAll"> 全国公民身份证号码查询服务中心</a>
			</p>
		</div>
	</div>
	<div style="width: 600px; margin-left: auto; margin-right: auto;">
		<form role="form" action="/query" method="post">
			<div class="form-group">
			   <h2>请输入身份证号码</h2>
				<input type="text"
					class="form-control" id="name" name="IDCard" placeholder="请输入身份证号码" value="${idCard}">
			</div>

			<button type="submit" class="btn btn-primary btn-lg" onclick="login();">查询</button>
			<a class="btn btn-primary btn-lg" role="button"
					href="javascript:void(0)" id="clear"> 清空</a>
			<img src="<%=contextPath%>/static/image/idCard.jpg"/>
		</form>
	</div>
</body>
</html>