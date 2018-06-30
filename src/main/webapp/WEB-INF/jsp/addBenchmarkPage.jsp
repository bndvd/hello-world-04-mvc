<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form:form modelAttribute="benchmarkAttrib">
	<table>
		<tr>
			<td>Enter Benchmark Index:</td>
			<td><form:input path="benchmarkIndex"/></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="Enter Benchmark"/>
			</td>
		</tr>
	</table>
</form:form>

</body>
</html>