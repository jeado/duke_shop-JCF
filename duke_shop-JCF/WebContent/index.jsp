<%@page import="sumin.summer.dao.ShopDao"%>
<%@page import="fw.DaoFactory"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.*, java.io.*,sumin.summer.*"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Shampooboy Homepage</title>
</head>
<link rel="stylesheet" type="text/css" href="css/style.css">
<body class="mainbody">

<c:if test="${empty pp }">
<%
	ShopDao dao = new DaoFactory().shopDao();
	session.setAttribute ("pp", dao.getAllProduct());
%>
</c:if>

<div class="bodybox">

<%---------------------------------- 제일 위의 로고& 로그인/ 로그아웃 페이지 -----------------------------%>
	<div class="topmenu">
		<div class="logo">
			<h1>Shampooboy</h1>
		</div>
		<div class="member"><%@include file="login.jsp"%></div>
	</div>

<%-------------------------------------------------- 상단 메뉴-----------------------------------------%>
	<div class="menubar">
		 <table  class="menutable" height=25 cellpadding =0 cellspacing =0>
			<tr>
				<td class="menu">
					<ul class="mainmenu">
						<li class="menuname1" onMouseOver ="this.className='menuname2';" onMouseOut="this.className='menuname1';">
							<a href="p_menuPhoto.jsp?category=scenery">메뉴1</a>
						</li> |
						<li class="menuname1" onMouseOver ="this.className='menuname2';" onMouseOut="this.className='menuname1';">
							<a href="p_menuPhoto.jsp?category=animal">메뉴2</a>
						</li>  |
						<li class="menuname1" onMouseOver ="this.className='menuname2';" onMouseOut="this.className='menuname1';">
							<a href="p_menuPhoto.jsp?category=people">메뉴3</a>
						</li>  |
						<li class="menuname1" onMouseOver ="this.className='menuname2';" onMouseOut="this.className='menuname1';">
							<a href="p_menuPhoto.jsp?category=object">메뉴4</a>
						</li>  |
						<li class="menuname1" onMouseOver ="this.className='menuname2';" onMouseOut="this.className='menuname1';">
							<a href="p_menuPhoto.jsp?category=others">메뉴5</a>
						</li>  |
					</ul>
				</td>
			</tr>
		</table>
	</div>

<%---------------------------------------가장 잘 팔리는 물품 목록-----------------------------------------%>
	<div class="bestproduct" align=center>

		<c:forEach var ="p" items="${pp}">
			<img src="${p.photo }" width="100" height="100"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		</c:forEach>


	</div>

<%----------------------------------------------- 일반 제품 목록----------------------------------------%>
	<div class="product" align=center>
		<%@include file="product_list.jsp"%>
	</div>

<%-------------------------------------------------- 바닥글-------------------------------------------%>

	<div class="bottomline">
		<table class="bottomtable" border=0>
	 	<tr class="bottomtr">
		  	<td class="bottomtd1">
			  	<ul class="bottommenu">
					<li class="bmenuname1"> About us </li> |
					<li class="bmenuname1">Term Condition</li>  |
					<li class="bmenuname1">Copy Right</li>  |
				</ul>
			</td>
			<td>
				<a href="mailto:andycloudy@msn.com"><b>andycloudy@msn.com</b></a>
			</td>
			<td class="bottomtd3">
				Copyright. Shampooboy All rights reserved.
			</td>
		</tr>
		</table>
	</div>
</div>
</body>
</html>