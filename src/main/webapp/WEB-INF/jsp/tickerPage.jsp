<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- for prefix you can use whatever text you want -->
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!-- spring tag library that allows us to use spring tag forms, etc. -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script type="text/javascript" src="jquery-3.3.1.js"></script>

<script type="text/javascript">
	$(document).ready(
		function() {
			$.getJSON('<spring:url value = "shares.json"/>', {
				ajax : 'true'
			}, function(data){
				var html = '<option value="">--Please select one--</option>';
				var len = data.length;
				for (var i = 0; i < len; i++) {
					html += '<option value="' + data[i].shareQty + '">' + data[i].shareQty + '</option>';
				}
				html += '</option>';
				
				$('#transactions').html(html);
			});
			
		});
</script>

</head>
<body>
<h1>Ticker page</h1>

Language: <a href="?lang=en">English</a> | <a href="?lang=de">German</a>

<!-- tickerModel is the backing model -->
<form:form modelAttribute="tickerModel">
	<table>
		<tr>
			<td><spring:message code="ticker-symbol.text"/></td>
			<td><form:input path="tickerChars"/></td>
			<td>
				<form:select id="transactions" path="numShares"></form:select>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="Enter Ticker"/>
			</td>
		</tr>
	</table>
</form:form>

<br><br>
Our benchmark is ${benchmarkAttrib.benchmarkIndex}.
Click <a href="addBenchmark.html">here</a> to change Benchmark.

</body>
</html>