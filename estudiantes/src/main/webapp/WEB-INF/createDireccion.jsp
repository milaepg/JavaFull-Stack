<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Crear Dirección</h2>
	<form action="contacts/create" method="post">
		ID del Estudiante: <input type="number" name="student"><br>
		Dirección: <input type="text" name="address"><br> Ciudad:
		<input type="text" name="city"><br> Estado: <input
			type="text" name="state"><br> <input type="submit"
			value="Crear">
	</form>

</body>
</html>