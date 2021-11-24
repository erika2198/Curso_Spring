<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Juego de Piedra, Papel, Tijera</title>
</head>
<body>
	<h1>${nombre}</h1>
	<form action="resolverJuego" modelAttribute="opciones">
		<select name="selOpcion">
			<c:forEach items="${opciones}" var="opcion">
				<option value=<c:out value="${opcion.getNumero()}"></c:out>><c:out value="${opcion.getNombre()}"></c:out>				
			</c:forEach>
		</select>		
		<input type="submit" value="Jugar"></input>		
	</form>
</body>
</html>