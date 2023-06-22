<%--
  Created by IntelliJ IDEA.
  User: dorde
  Date: 22-06-2023
  Time: 9:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="estilos.css"></head>
    <title>Agregar Inmueble</title>
</head>
<body>
<header>
    <h1 class="encabezado">Agrega un nuevo inmueble</h1>
</header>
<nav class="barra">
    <a href="agregarInmueble.jsp">Agregar Inmueble</a>
    <a href="agregarVendedor.jsp">Agregar Vendedor</a>
    <a href="buscarInmueble.jsp">Buscar Inmueble</a>
</nav>
<br>
<h3 class="">${textoRespuesta}</h3>
<form action="agregarInmueble" method="post">
    <div class="formulario">
        <input type="text" name="tipoConstruccion" placeholder="Ingrese el tipo de construccion">
        <input type="text" name="ubicacion" placeholder="Ingrese la ubicación geografica" maxlength="12">
        <input type="number" name="precio" placeholder="Ingrese el precio">
        <button type="submit">Agregar Inmueble</button>
    </div>
</form>
</body>
</html>
