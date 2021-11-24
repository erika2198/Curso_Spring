<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<title>${titulo}</title>
</br>
</head>
<body>
<div class="container ">
<div class="col-md-12">
<h1>${titulo}</h1>
	<table class="table table-striped table-dark">
		<thead>
			<tr>
				<th scope="col">Codigo</th>
				<th scope="col">ID</th>
				<th scope="col">Nombre</th>
				<th scope="col">Apellido</th>
				<th scope="col">Repositorio</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${alumnos}" var="alumno">
				<tr>
					<th scope="row">1</th>
					<td><c:out value="${alumno.getCodigo()}" /></td>
					<td><c:out value="${alumno.getNombre()}" /></td>
					<td><c:out value="${alumno.getApellido()}" /></td>
					<td><c:out value="${alumno.getLinkArepositorio()}" /></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	</div>
	</div>
</body>
</html>
