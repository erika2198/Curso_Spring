<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado del juego</title>
</head>
<body>
	<h1>Resultado del juego</h1>
	<div id=encabezado>
		<h2>El jugador eligio: ${jugador.getNombre()}</h2>
		<h2>La computadora eligio: ${computadora.getNombre()}</h2>
	</div>
	<div id="resultado"></div>
	<h1>El ganador es :</h1>
	<h2>${resultado}</h2>
</body>
</html>