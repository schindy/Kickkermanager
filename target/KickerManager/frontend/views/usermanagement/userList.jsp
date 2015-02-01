<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<div>
<table class="table">
<tr>
<th>User Name</th>
<th>First Name</th>
<th>Last Name</th>
<th>email</th>
</tr>
<c:forEach var="user" items="${users}">
<tr>
<td>
<s:url value="/usermanagement/userDetailInformation/" var="user_url">
<s:param name="loginname" value="${user.loginname}"/>
</s:url>
<a href="<c:out value="${user_url}"/>"><c:out value="${user.loginname}"/></a>
</td>
<td><c:out value="${user.firstname}"/></td>
<td><c:out value="${user.lastname}"/></td>
<td><c:out value="${user.email}"/></td>
</tr>
</c:forEach>
</table>
</div>