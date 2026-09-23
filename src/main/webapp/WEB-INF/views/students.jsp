<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 등록</title>
</head>
<body>

	<table border="1" align="center">
		<form action="/student/insert">
		<th>학생 등록</th>
		<tr>
			<td>이름 입력<input type="text" name="name" placeholder="홍길동"><br></td>
		</tr>

		<tr>
			<td>국어 점수<input type="text" name="kor" placeholder="0~100"><br></td>
		</tr>

		<tr>
			<td>영어 점수<input type="text" name="eng" placeholder="0~100"><br></td>
		</tr>

		<tr>
			<td>수학 점수<input type="text" name="math" placeholder="0~100"><br></td>
		</tr>

		<tr>
			<td align="center"><button>등록하기</button>
				<button type="button" id="cancel">취소하기</button></td>
		</tr>
		</form>
	</table>

	<script>
		document.getElementById("cancel").onclick = fuction()
		{
			location.href = "/";
		}
	</script>

</body>
</html>