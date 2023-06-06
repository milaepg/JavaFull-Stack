<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Estudiantes</h2>
<table border="1">
    <tr>
        <th>Nombre</th>
        <th>Apellido</th>
        <th>Edad</th>
        <th>Dirección</th>
        <th>Ciudad</th>
        <th>Estado</th>
    </tr>
    <c:forEach var="student" items="${students}">
        <tr>
            <td><c:out value="${student.nombre}"/></td>
            <td><c:out value="${student.apellido}"/></td>
            <td><c:out value="${student.edad}"/></td>
            <td><c:out value="${student.direccion.direccion}"/></td>
            <td><c:out value="${student.direccion.ciudad}"/></td>
            <td><c:out value="${student.direccion.estado}"/></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>