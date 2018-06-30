<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- spring tag library that allows us to use spring tag forms, etc. -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Ticker page</h1>

<form:form modelAttribute="tickerModel">
	<table>
		<tr>
			<td>Ticker symbol:</td>
			<td><form:input path="tickerChars"/></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="Enter Ticker"/>
			</td>
		</tr>
	</table>
</form:form>

</body>
</html>