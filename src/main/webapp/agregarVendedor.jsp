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
    <link rel="stylesheet" href="styles.css">
    <title>Agregar Vendedor</title>
</head>
<body>
<header>
    <nav class="barra">
        <ul>
            <li><a href="agregarInmueble.jsp">Agregar Inmueble</a></li>
            <li><a href="agregarVendedor.jsp">Agregar Vendedor</a></li>
            <li><a href="buscarInmueble.jsp">Buscar Inmueble</a></li>
        </ul>
    </nav>
</header>
<form action="agregarVendedor" method="post">
    <div class="">
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
