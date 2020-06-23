<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>식당 삭제</title>
</head>
<body>
	<h1>식당 삭제</h1>
	${emp.employeeId}식당 ${emp.firstName} ${emp.lastName}의 정보를 삭제합니다.
	<p>삭제후 데이터는 복구될 수 없습니다.
	<p>${emp.employeeId}식당 이름을 입력하세요.
	<form action="./delete" method="post">
		식당 이름 : <input type="text" name="email"> <input type="hidden"
			name="empid" value="${emp.employeeId}"> <input type="submit"
			value="삭제">
	</form>
</body>
</html>