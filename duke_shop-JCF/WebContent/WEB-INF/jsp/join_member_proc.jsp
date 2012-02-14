<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	request.setCharacterEncoding("UTF-8");%>

아이디: ${member.id}  <br/>
이름: ${member.name} <br/>
전화번호: ${member.phone} <br/>
</body>

<a href='<%= request.getContextPath() %>/'> 첫화면으로 </a>
<a href='<%= request.getContextPath() %>/EditMember.do'>수정하기</a>
<a href='<%= request.getContextPath() %>/DelMember.jsp'>삭제하기</a>

</html>