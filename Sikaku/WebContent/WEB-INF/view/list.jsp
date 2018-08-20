<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
			<th>ID</th>
			<th>資格名</th>
			<th>受験日</th>
			<th>結果</th>

		</tr>
		<%
			@SuppressWarnings("unchecked")
			ArrayList<Sikaku> al = (ArrayList<Sikaku>) request.getAttribute("al");
			for (Sikaku si : al) {
		%>
		<tr>
			<td><%=si.getId()%></td>
			<td><%=si.getName()%></td>
			<td><%=si.getday()%></td>
			<td><%=si.geteffect()%></td>

		</tr>
		<%
			}
		%>
	</table>


</body>
</html>