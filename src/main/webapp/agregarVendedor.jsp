<%--
  Created by IntelliJ IDEA.
  User: dorde
  Date: 22-06-2023
  Time: 8:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="estilos.css"></head>
    <title>Agregar Vendedor</title>
</head>
<body>
<header>
    <h1 class="encabezado">Agrega un nuevo vendedor</h1>
</header>
<nav class="barra">
    <a href="agregarInmueble.jsp">Agregar Inmueble</a>
    <a href="agregarVendedor.jsp">Agregar Vendedor</a>
    <a href="buscarInmueble.jsp">Buscar Inmueble</a>
</nav>
<form action="agregarVendedor" method="post">
    <div class="formulario">
        <input type="text" name="nombre" placeholder="Ingrese el nombre">
        <input type="text" name="rut" placeholder="Ingrese el RUT" maxlength="12">
        <input type="text" name="direccion" placeholder="Ingrese la dirección">
        <input type="text" name="tituloProfesional" placeholder="Ingrese el titulo profesional">
        <input type="text" name="estadoCivil" placeholder="Ingrese el estado civil">
        <button type="submit">Agregar Vendedor</button>
    </div>
</form>
</body>
</html>
