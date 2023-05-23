<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title> TITULO AQUI </title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>

<h1> <c:out value="${libro.title }"></c:out></h1>
<p> Descripcion:  <c:out value="${libro.description }"></c:out></p>
<p> Number of Pages: <c:out value="${libro.numberOfPages }"></c:out></p>
<p> Language:  <c:out value="${libro.language }"></c:out></p>

<a href="/books"> Volver atras</a>
	<a href="/books/edit/${libro.id }"> Editar Libro </a>
	<a href="/books/delete/${libro.id}"> Borrar Libro </a>


</body>
</html>