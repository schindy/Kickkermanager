<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<link rel="stylesheet" type="text/css" href="<c:url value="/frontend/css/bootstrap.css"/>"></link>
	<script type="text/javascript" src="<c:url value="/frontend/js/jquery-1.11.2.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/frontend/js/bootstrap.js"/>"></script>
	

	<title><tiles:insertAttribute name="title" /></title>
</head>
<body>
	<div class="container">
		<!-- Header -->
		<tiles:insertAttribute name="header" />
		<!-- Menu Page -->
		<div>
			<tiles:insertAttribute name="menu" />
		</div>
		<!-- Body Page -->
		<div>
			<tiles:insertAttribute name="body" />
		</div>
		<!-- Footer Page -->
		<tiles:insertAttribute name="footer" />
	</div>
</body>
</html>