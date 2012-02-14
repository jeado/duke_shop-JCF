<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="insertProduct.action" enctype="multipart/form-data" method="post">
	<label>아이디 : </label>
	<input type="text" name="pid" />
	<br>
	<label>프로덕트 이름 : </label>
	<input type="text" name="pname" />
	<br>
	<label>사진 : </label>
	<input type="file" name="photo">
	<br>
	<input type="submit" value="파일업로드" />
</form>
</body>
</html>