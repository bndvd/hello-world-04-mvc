<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<style type="text/css">
.error {
	color: #ff0000;
}
.errorblock {
	color: #000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding: 8px;
	margin: 16px;
}
</style>

</head>
<body>

<form:form modelAttribute="benchmarkAttrib">
	<form:errors path="*" cssClass="errorblock" element="div" />
	<table>
		<tr>
			<td>Enter Benchmark Index:</td>
			<td><form:input path="benchmarkIndex" cssErrorClass="error" /></td>
			<td><form:errors path="benchmarkIndex" cssClass="error" /></td>
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