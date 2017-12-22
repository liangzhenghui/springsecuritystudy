<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<style type="text/css">
	.error {
		color: #ff0000;
		background-color: #ffEEEE;
	}
</style>
</head>
<body>
	<h3>Fitness Custom Login</h3>
	<c:if test="{not empty error}">
		<div class="error">
			Your login was unsuccessful<br/>
			Caused: ${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message }
		</div>
	</c:if>
	<form action="j_spring_security_check" name="f" method="post">
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
		<table>
			<tr>
				<td>Username:</td>
				<td>
					<input type="text" name="j_username" value=""/>
				</td>
			</tr>
			<tr>
				<td>Password</td>
				<td>
					<input type="password" name="j_password"/>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="Login"/>
				</td>
			</tr>
		</table>
	</form>
</body>



</html>