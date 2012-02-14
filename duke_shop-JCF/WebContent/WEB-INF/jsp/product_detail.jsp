<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.*, java.io.*,sumin.summer.model.*"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
<!--
  function numchk(num){
	  num=new String(num);
	  num=num.replace(/,/gi,"");
	  return numchk1(num);
  }

-->
</script>
</head>
<link rel="stylesheet" type="text/css" href="css/style.css">
<body class="mainbody">


<%-- <% --%>
// 	String pid = request.getParameter("pid");
// 	ArrayList <Product> lists = (ArrayList <Product>)session.getAttribute("pp");
// 	for (Product p: lists){
// 		if(pid.equals(p.getPid())){
// 			session.setAttribute("detail", p);
// 			break;
// 		}
// 	}

<%-- %> --%>


<form action="" method="POST">
		<table class="productdetail" align="center">
			<tr>
				<td rowspan=5>
					<img src="${detail.photo}" width="200" height="300"/>
				 </td>
				<td>제품설명</td><td>${detail.desc }</td>
			</tr>
			<tr>
				<td>가격</td> <td> javascript:numchk${detail.price }</td>
			</tr>
			<tr>
				<td>재고량</td> <td>  ${detail.stock }</td>
			</tr>
			<tr>
				<td>주문량 </td>
				<td>
				    <select name="qty" >
				       <option value="1">1</option>
				       <option value="2">2</option>
				       <option value="3">3</option>
				       <option value="4">4</option>
				       <option value="5">5</option>
				       <option value="6">6</option>
				       <option value="7">7</option>
				       <option value="8">8</option>
				       <option value="9">9</option>
				       <option value="10">10</option>
				    </select>
				</td>
			</tr>

			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="주문">
					<input type="button" value="장바구니">
				</td>
			</tr>
		</table>

	</form>
</body>
</html>