<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>
<body>

<h2>Submitted User Information</h2>
   <table>
    <tr>
        <td>Login</td>
        <td>${loginname}</td>
    </tr>
    <tr>
        <td>firstname</td>
        <td>${firstname}</td>
    </tr>
    <tr>
        <td>ID</td>
        <td>${id}</td>
    </tr>
</table>  
</body>
</html>