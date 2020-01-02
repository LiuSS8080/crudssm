<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/_20200102/dept" method="post">
		<input type="hidden" name="_method" value="put" />
		<input type="hidden" name="deptno" value="${dept.deptno }"/><br/>
		<input name="dname" value="${dept.dname }" /><br/>
		<input name="loc" value="${dept.loc }" /><br/>
		<button>submit</button>
	</form>
</body>
</html>