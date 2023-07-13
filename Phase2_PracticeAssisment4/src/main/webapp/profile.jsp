<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import="java.util.ArrayList"%>
<%@ page import="beans.ProductClass"%>
<%@ page import="java.util.Iterator"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
		<table border="1">
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Color</th>
				<th>Price</th>
			</tr>
			<%
			ArrayList<ProductClass> productList = (ArrayList<ProductClass>) request.getAttribute("data");
			if (productList != null) {
				Iterator<ProductClass> iterator = productList.iterator();
				while (iterator.hasNext()) {
					ProductClass pc = iterator.next();
			%>
			<tr>
				<td><%=pc.getId()%></td>
				<td><%=pc.getName()%></td>
				<td><%=pc.getColor()%></td>
				<td><%=pc.getPrice()%></td>
			</tr>
			<%
			}
			}
			%>
		</table>
		<a href="index.jsp">Add</a>
	</div>

</body>
</html>