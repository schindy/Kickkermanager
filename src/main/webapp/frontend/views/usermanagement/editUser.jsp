<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<div>
	<h2>Edit User</h2>
	<form:form method="POST" modelAttribute="user">
		<fieldset>
			<div class="form-group">
					<form:label path="loginname">Loginname</form:label>
					<form:input path="loginname" cssClass="form-control" />
					<form:errors path="loginname" cssClass="text-danger"/>
			</div>
			<div class="form-group">
					<form:label path="password">Password</form:label>
					<form:password path="password" cssClass="form-control" />
					<form:errors path="password" cssClass="text-danger"/>
			</div>
			<div class="form-group">
					<form:label path="firstname">Firstname</form:label>
					<form:input path="firstname" cssClass="form-control" />
			</div>
			<div class="form-group">
					<form:label path="lastname">Lastname</form:label>
					<form:input path="lastname" cssClass="form-control" />
			</div>
			<div class="form-group">
					<form:label path="email">Email</form:label>
					<form:input path="email" cssClass="form-control" />
					<form:errors path="email" cssClass="text-danger"/>
			</div>
			<div class="form-group">
					<form:label path="enable">Active</form:label>
					<form:checkbox path="enable" cssClass="form-control" />
			</div>
			<div class="form-group">
					<form:label path="role">Role</form:label>
					<form:select path="role" items="${roles}" cssClass="form-control" />
			</div>
			<button type="submit" class="btn btn-default">Save</button>
		</fieldset>
		</form:form>
</div>