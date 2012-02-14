<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>
<body>
<form action="JoinCustomer.action" method="POST">
	<table border="1" cellpadding="5" cellspacing="0" width="500">
		<tr>
			<td>아이디</td>
			<td><input type="text" name="id" ></td>
		</tr>
		<tr>
			<td>이름 </td>
			<td><input type="text" name="name"></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><input type="password" name="passwd"></td>

		</tr>
		<tr>
			<td>전화번호</td>
			<td><input type="text" name="phone"></td>

		</tr>
		<tr>
			<td>이메일</td>
			<td><input type="text" name="email"></td>

		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="가입">
				<input type="reset" value="취소">
			</td>
		</tr>
	</table>
	</form>
</body>
</html>