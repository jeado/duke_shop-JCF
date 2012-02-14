<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.*, java.io.*,sumin.summer.*"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<link rel="stylesheet" type="text/css" href="css/style.css">
<body>
	<form action="" method="POST">
		<table class ="producttable"  align="center">
			<tr>
				<td>ID</td>
				<td>이름</td>
				<td>이메일</td>
				<td>전화번호</td>
			</tr>
		<c:forEach var="p" items="${pp}">
			<tr>
				<td>${p.cid} </td>
				<td>${p.name}</td>
				<td>${p.email}</td>
				<td>${p.phone}</td>
			</tr>       

		</c:forEach>
		</table>


	</form>
</body>
</html>