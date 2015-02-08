<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>

<nav class="navbar navbar-default">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#">Knorzel</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li class="active"><a href="<c:url value="/home"/>">Home<span class="sr-only">(current)</span></a></li>
        <sec:authorize access="isAuthenticated()"><li><a href="#">Game</a></li></sec:authorize>
        <sec:authorize access="hasRole('ROLE_ADMIN')">
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Usermanagement<span class="caret"></span></a>
          <ul class="dropdown-menu" role="menu">
            <li><a href="<c:url value="/usermanagement/createUser" />">Create User</a></li>
            <li class="divider"></li>
            <li><a href="<c:url value="/usermanagement/userList"/>">User List</a></li>
          </ul>
        </li>
        </sec:authorize>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li>
  			<sec:authorize access="isAuthenticated()">
	        	<a href="javascript:formSubmit()">
	        		<!-- For login user -->
					<c:url value="/j_spring_security_logout" var="logoutUrl" />
					<c:if test="${pageContext.request.userPrincipal.name != null}">
						Logout ${pageContext.request.userPrincipal.name}
					</c:if>
	        	</a>
	        	<form style="display: none;" action="${logoutUrl}" method="post" id="logoutForm">
						<input type="hidden" name="${_csrf.parameterName}"
							value="${_csrf.token}" />
					</form>
					<script>
						function formSubmit() {
							document.getElementById("logoutForm").submit();
						}
					</script>
             </sec:authorize>
			<sec:authorize access="isAnonymous()">
					<a href="<c:url value="/login"/>">Login</a>
			 </sec:authorize>
        </li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>