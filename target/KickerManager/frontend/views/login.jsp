<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>

	<div id="login-box">
 
		<h3>Login with Username and Password</h3>
 
		<c:if test="${not empty error}">
			<p class="text-danger">${error}</p>
		</c:if>
		<c:if test="${not empty msg}">
			<p class="text-success">${msg}</p>
		</c:if>
 
		<form name='loginForm' action="<c:url value='/j_spring_security_check' />" method='POST'>
 		<div class="form-group">
				<label for="login_name">User:</label>
				<input class="form-control" type='text' name='login_name' placeholder="Enter Username">
		</div>
		<div class="form-group">
				<label for="login_password">Password:</label>
				<input class="form-control" type='password' name='login_password' placeholder="Enter Password">
		</div>
		<button type="submit" class="btn btn-default">Login</button>
 
	  <input type="hidden" name="${_csrf.parameterName}"
		value="${_csrf.token}" />
 
		</form>
	</div>
	
