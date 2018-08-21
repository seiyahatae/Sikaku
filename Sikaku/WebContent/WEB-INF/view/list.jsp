<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ page import="dto.Students"%>
	<%@ page import="dto.Sikaku"%>
	<%@ page import="java.util.ArrayList"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table border="1">
		<tr>
			<th>名前</th>
			<th>資格名</th>
			<th>受験日</th>
			<th>結果</th>

		</tr>
		<%
			@SuppressWarnings("unchecked")
			ArrayList<Students> all2 = (ArrayList<Students>) request.getAttribute("all2");
			for (int i = 0;i<all2.size();i++) {
		%>
		<tr>
		    <td><%=all2.get(i).getId()%></td>
		    <td><%=all2.get(i).getName()%></td>
		    <td><%=all2.get(i).getSikakuid()%></td>


		</tr>
		<%
			}
		%>
	</table>


</body>
</html>