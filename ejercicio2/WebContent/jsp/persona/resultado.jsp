<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<%@ include file="../comun/cabecera.jsp" %>

${mensaje}

Nombre: ${persona.getNombre()}<br>
Apellido: ${persona.apellido}<br>
Edad: ${persona.edad}<br>
			
<%@ include file="../comun/pie.jsp" %>
