<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type ="text/css">
<!--
	body, table, input {
	font-family: sans-serit;
	color: gray;
	font-size: 9pt;
	}


//-->
</style>
</head>
<body>
	
<c:if test="${! empty loginFailed}">
	<script type="text/javascript">
		alert("로그인 실패");
	</script>	
	<c:remove var="loginFailed"/>
</c:if>	

<c:if test="${! empty login }">
		<form action="logout.do" method="POST">
			<table class="logout" border="0" cellpadding="0" cellspacing="0">
				<tr>
					<td align = "center">
						<font color="green">${login.name}</font>님 환영 합니다.&nbsp;&nbsp;&nbsp;
					</td>
					<td align = "center">
						<input type="submit" name="" value="로그아웃" />
						<input type="button" name="" value="개인정보수정" />
					</td>
				</tr>	
			</table>
		</form>
</c:if>

<c:if test="${empty login }">
	<form action="login.do" method="POST">
		<table class="login" border="0" cellpadding="0" cellspacing="0">
			<tr>
				<td>아이디  : </td>
				<td><input type="text" name="id" value="" /></td>
				<td>비밀번호:</td>
				<td><input type="password" name="passwd" value="" /></td>		
				<td>
					<input type="submit" name="" value="로그인" />
					<input type="button" name="" value="회원가입" onclick="location.href='join_member.jsp'"/>
				</td>
			</tr>	
		</table>
	</form>
</c:if>

</body>
</html>