<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>${title }</title>
</head>

<style>
.error {
	color: #ff0000;
	font-style: italic;
	font-weight: bold;
}
</style>

<body>

	<form:form modelAttribute="actor" action="" method="POST">
			<table>
				<tr>
					<td>Actor id: </td>
					<td><form:input path="actorId"/></td>
					<td><form:errors path="actorId" cssClass="error"></form:errors></td>
				</tr>
				<tr>
					<td>Actor id: </td>
					<td><form:input path="firstName"/></td>
					<td><form:errors path="firstName" cssClass="error"></form:errors></td>
				</tr>
				<tr>
					<td>Actor id: </td>
					<td><form:input path="lastName"/></td>
					<td><form:errors path="lastName" cssClass="error"></form:errors></td>
				</tr>
			</table>
	</form:form>
</body>
</html>