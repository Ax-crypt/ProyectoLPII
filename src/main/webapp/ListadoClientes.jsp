<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@page import="java.util.List" %>
<%@page import="model.TbCliente" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>listado de clientes</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
</head>
<body>

<h2 align="center"> 
 <a href="RegistrarCliente.jsp" class="text-body"><strong><em>Registrar Cliente</em></strong></a> 
</h2> 

<div class="row p-3 mb-2 bg-light text-dark">

				<table class="table">
						<tr>
							<th>Id</th>
							<th>Nombre</th>
							<th>Apellidos</th>							
							<th>Documento</th>
							<th>Correo</th>
							<th>Telefono</th>
							<th>Sexo</th>
							<th>Nacionalidad</th>
						</tr>
<%
	
	List<TbCliente> lista = (List<TbCliente>)request.getAttribute("listadoClientes");
if(lista != null){
for(TbCliente item: lista){	
	%>
							<tr>
							<th> <%= item.getIdcliente() %> </th>
							<th><%= item.getNombre() %></th>
							<th><%= item.getApellido() %></th>							
							<th><%= item.getDni() %></th>
							<th><%= item.getEmail() %></th>
							<th><%= item.getTelefono() %></th>
							<th><%= item.getSexo() %></th>
							<th><%= item.getNacionalidad() %></th>
						</tr>
	<%  
  }
}
	%>
				</table>
			</div>




</body>
</html>