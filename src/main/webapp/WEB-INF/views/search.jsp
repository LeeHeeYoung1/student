<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table border="1" align="center">
		
		<th colspan="5">학생 검색</th>
		
		<tr align="center">
			<td>아이디</td>
			<td>이름</td>
			<td>국어</td>
			<td>수학</td>
			<td>영어</td>
		</tr>
		
		
		<c:forEach var="i" items="${list}">
			<tr>
				<td>${i.id}</td>
				<td>${i.name}</td>
				<td>${i.kor}</td>
				<td>${i.eng}</td>
				<td>${i.math}</td>
			</tr>
		</c:forEach>
		
		<form action="/student/search">
			<tr>
				<td colspan="5"><input type="text" name="name" placeholder="검색할 이름입력"><button>검색</button></td>
			</tr>
		</form>
		
		
	</table>

</body>
</html>