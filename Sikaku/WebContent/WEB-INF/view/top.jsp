<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ page import="dto.Sikaku"%>
	<%@ page import="dto.Students"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

資格情報一覧
<%@include file="../view/sikakulist.jsp" %>

学生情報一覧
<%@include file="../view/studentslist.jsp" %>

受験結果一覧
<%@include file="../view/list.jsp" %>
<br>

資格情報登録
	<br>
	<form action="/Sikaku/Insert1" method="get">
	資格ID：<input type="text" name="siid"><br>
	資格名：<input type="text" name="siname"><br>
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
	ID：<input type="text" name="siid"><br>
	<input type="submit" value="削除"><br>
    </form>

</body>
</html>