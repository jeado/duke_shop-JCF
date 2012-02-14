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
				<td>사진</td>
				<td>이름</td>
				<td>설명</td>
				<td>가격</td>
				<td>재고량</td>
			</tr>
		<c:forEach var="p" items="${pp}">
			<tr>
				<td><a href="product_detail.jsp?pid=${p.pid}">${p.pid}</a></td>
				<td><a href="product_detail.jsp?pid=${p.pid}">
					<img src="${p.photo }" width="100" height="100"/></a></td>
				<td>${p.pname}</td>
				<td>${p.desc}</td>
				<td>${p.price }</td>
				<td>${p.stock }</td>
			</tr>

		</c:forEach>
		</table>


	</form>
</body>
</html>