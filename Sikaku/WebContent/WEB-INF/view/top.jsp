<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="/Sikaku/result1" method="get">
		<input type="submit" value="一覧"><br>
    資格情報登録
	<br>
	<form action="/Sikaku/Insert2" method="get">
	資格ID：<input type="text" name="id"><br>
	資格名：<input type="text" name="name"><br>
	受験日：<input type="text" name="day"><br>
	結　果：<input type="text" name="results"><br>
    <input type="submit" value="登録"><br>
	</form>

	学生情報登録
	<br>
	<form action="/Students/Insert" method="get">
	ID　　　：<input type="text" name="id"><br>
	学生名　：<input type="text" name="name"><br>
	資格ID　：<input type="text" name="sikakuid"><br>
	<input type="submit" value="登録"><br>
	</form>

</body>
</html>