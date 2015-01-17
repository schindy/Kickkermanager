<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:choose>
      <c:when test="${pageContext.request.userPrincipal.name != null}">
      Hello ${pageContext.request.userPrincipal.name},<br />
      Have fun with Knorzel.
      </c:when>
      <c:otherwise>
      Hello User, <br />
      Please Login.
      </c:otherwise>
</c:choose>
