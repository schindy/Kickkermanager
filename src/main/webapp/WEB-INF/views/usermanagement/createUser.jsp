<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<div>
	<h2>Create User</h2>
	<form:form method="POST" modelAttribute="user">
		<fieldset>
			<table>
				<tr>
					<td><form:label path="loginname">Login Name</form:label></td>
					<td><form:input path="loginname" /></td>
				</tr>
				<tr>
					<td><form:label path="password">Password</form:label></td>
					<td><form:password path="password" /></td>
				</tr>
				<tr>
					<td><form:label path="firstname">Vorname</form:label></td>
					<td><form:input path="firstname" /></td>
				</tr>
				<tr>
					<td><form:label path="lastname">Nachname</form:label></td>
					<td><form:input path="lastname" /></td>
				</tr>
				<tr>
					<td><form:label path="email">Email</form:label></td>
					<td><form:input path="email" /></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="Submit" /></td>
				</tr>
			</table>
		</fieldset>
		</form:form>
</div>