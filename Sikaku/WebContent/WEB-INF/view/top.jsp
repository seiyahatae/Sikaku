<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

    一覧
    <br>
    <form action="/Sikaku/result2" method="get">
    <input type="submit" value="表示"><br>
	</form>

    資格情報登録
	<br>
	<form action="/Sikaku/Insert1" method="get">
	資格ID：<input type="text" name="id"><br>
	資格名：<input type="text" name="name"><br>
	受験日：<input type="text" name="day"><br>
	結　果：<input type="text" name="results"><br>
    <input type="submit" value="登録"><br>
	</form>

	学生情報登録
	<br>
	<form action="/Sikaku/Insert2" method="get">
	ID　　　：<input type="text" name="id"><br>
	学生名　：<input type="text" name="name"><br>
	資格ID　：<input type="text" name="sikakuid"><br>
	<input type="submit" value="登録"><br>
	</form>

    学生削除
	<br>
	<form action="/Sikaku/Delete2" method="get">
	ID：<input type="text" name="id"><br>
	<input type="submit" value="削除"><br>
    </form>

    資格削除
	<br>
	<form action="/Sikaku/Delete1" method="get">
	ID：<input type="text" name="id"><br>
	<input type="submit" value="削除"><br>
    </form>
</body>
</html>