<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Hola mundo!</title>
</head>
<body>
	Hola mundo JSP<br>
	Nombre (request - NO!): <%= request.getAttribute("nombre") %><br>
	Nombre (Expression Language - EL): ${nombre}<br>
	Nombre (Taglib): <c:out value="${nombre}"/>
	
</body>
</html>