<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<div>
<ul>
<c:forEach var="user" items="${users}">
<s:url value="/usermanagement/userDetailInformation/" var="user_url">
<s:param name="loginname" value="${user.loginname}"/>
</s:url>
<li><a href="${user_url}">${user.loginname}</a></li>
</c:forEach>
</ul>
</div>