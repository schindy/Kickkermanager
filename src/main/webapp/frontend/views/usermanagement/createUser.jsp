<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<div>
	<h2>Create User</h2>
	<form:form method="POST" modelAttribute="user" enctype="multipart/form-data">
		<fieldset>
			<div class="form-group">
					<form:label path="loginname">Login Name</form:label>
					<form:input path="loginname" cssClass="form-control" />
					<form:errors path="loginname" cssClass="text-danger"/>
			</div>
			<div class="form-group">
					<form:label path="password">Password</form:label>
					<form:password path="password" cssClass="form-control" />
					<form:errors path="password" cssClass="text-danger"/>
			</div>
			<div class="form-group">
					<form:label path="firstname">Vorname</form:label>
					<form:input path="firstname" cssClass="form-control" />
			</div>
			<div class="form-group">
					<form:label path="lastname">Nachname</form:label>
					<form:input path="lastname" cssClass="form-control" />
			</div>
			<div class="form-group">
					<form:label path="email">Email</form:label>
					<form:input path="email" cssClass="form-control" />
					<form:errors path="email" cssClass="text-danger"/>
			</div>
			<div class="form-group">
					<label>Image</label>
					<input name="image" type="file" />
			</div>
			<button type="submit" class="btn btn-default">Create User</button>
		</fieldset>
		</form:form>
</div>