<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>list.jsp</h3> 
	<br>
	<c:forEach var="dto" items="${list }" >
		id: ${dto.id }<br>
		name: ${dto.name }<br>
		<hr>
	</c:forEach>
	
</body>
</html>