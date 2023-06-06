<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Crear Estudiante</h2>
	<form action="students/create" method="post">
		Nombre: <input type="text" name="firstName"><br>
		Apellido: <input type="text" name="lastName"><br> Edad: <input
			type="number" name="age"><br> <input type="submit"
			value="Crear">
	</form>
</body>
</html>