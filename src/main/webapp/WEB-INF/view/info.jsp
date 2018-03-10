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
<title>欢迎访问个人身份证信息页面</title>
<link href="<%=contextPath%>/static/css/bootstrap.min.css"
	rel="stylesheet" type="text/css" />

<script src="<%=contextPath%>/static/js/jquery.min.js"></script>
<script src="<%=contextPath%>/static/js/bootstrap.min.js"></script>
</head>
<body style="text-align: center;">

<div class="container">
	<div class="jumbotron">
		<h1>欢迎访问个人身份证信息页面！</h1>
		<p> 您的身份证号码为：${idCard.IDCard}</p>
		<p><a class="btn btn-primary btn-lg" role="button" href="<%=contextPath%>/queryAll">
			全国各省市县信息查询请点此处</a>
		</p>
	</div>
</div>
	<table class="table">
		<thead>
			<tr>
				<th>省份</th>
				<th>所属市</th>
				<th>县区</th>
				<th>出生年月</th>
				<th>性别</th>
				<th>年龄</th>
				<th>你来到这个世界的天数</th>
				<th>你来到这个世界的毫秒数</th>
				<th>地址码</th>
				<th>出生日期码</th>
				<th>顺序码</th>
				<th>校验码</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>${idCard.province }</td>
				<td>${idCard.city }</td>
				<td>${idCard.area }</td>
				<td>${idCard.birthday }</td>
				<td>${idCard.sex }</td>
				<td>${idCard.age }</td>
				<td>${idCard.lifeDay }天</td>
				<td>${idCard.millisecond }毫秒</td>
				<td>${idCard.addressCode }</td>
				<td>${idCard.birthCode }</td>
				<td>${idCard.number}</td>
				<td>${idCard.checkCode }</td>

			</tr>
		</tbody>
	</table>

</body>
</html>


