<!DOCTYPE HTML>
<%@ page isELIgnored="false"%><!--解决部署到tomcat中页面无法获取EL表达式的问题  -->
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<html>
<% String contextPath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath(); %>

<head>
	<meta charset="utf-8"> 
	<title>首页</title>
	<link href="<%=contextPath%>/static/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
	
	<script src="<%=contextPath%>/static/js/jquery.min.js"></script>
	<script src="<%=contextPath%>/static/js/bootstrap.min.js"></script>
</head>
<body style="text-align:center;">
<div style="width:600px;margin-left:auto;margin-right:auto;">
${error}
</div>
</body>
</html>