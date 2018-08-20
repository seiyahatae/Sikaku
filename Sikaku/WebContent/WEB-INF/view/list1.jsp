<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ page import="dto.Students"%>
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
			<th>名前</th>
			<th>資格ID</th>


		</tr>
		<%
			@SuppressWarnings("unchecked")
			ArrayList<Students> al1 = (ArrayList<Students>) request.getAttribute("all");
			for (Students st : al1) {
		%>
		<tr>
			<td><%=st.getId()%></td>
			<td><%=st.getName()%></td>
			<td><%=st.getsikakuId()%></td>


		</tr>
		<%
			}
		%>
	</table>


</body>
</html>