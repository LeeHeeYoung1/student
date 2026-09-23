<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" align="center">
		<th colspan="5">점수리스트</th>

		<tr align="center">
			<td>아이디</td>
			<td>이름</td>
			<td>국어</td>
			<td>영어</td>
			<td>수학</td>
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

		<tr>
			<td align="center" colspan="5"><button type="button"
					id="mainPage">메인이동</button></td>
		</tr>

	</table>


	<hr>



	<form action="/student/update" align="center">
		<input type="text" name="id" placeholder="수정당할 아이디"><br>
		<input type="text" name="name" placeholder="수정할 이름"><br>
		<input type="text" name="kor" placeholder="수정할 국어점수"><br>
		<input type="text" name="eng" placeholder="수정할 영어점수"><br>
		<input type="text" name="math" placeholder="수정할 수학점수"><br>
		<button>수정</button>
	</form>

	<form action="/student/delete" align="center">
		<input type="text" name="id" placeholder="삭제할 아이디"><br>
		<button>삭제</button>
	</form>

	<table border="1" align="center">
		
		<th colspan="5">학생 검색</th>
		
		<tr align="center">
			<td>아이디</td>
			<td>이름</td>
			<td>국어</td>
			<td>수학</td>
			<td>영어</td>
		</tr>
		
		
		<c:forEach var="i" items="${searchlist}">
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



	<script>
		document.getElementById("mainPage").onclick = fuction()
		{
			location.href = "/";
		}
	</script>

</body>
</html>