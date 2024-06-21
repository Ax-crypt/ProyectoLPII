<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List" %>
<%@page import="model.TbProducto" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>listado de clientes</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
</head>
<body>

<h2 align="center"> 
 <a href="RegistrarProducto.jsp" class="btn btn-dark"><strong><em>Registrar Nuevo</em></strong></a> 
</h2> 

<div class="row p-3 mb-2 bg-light text-dark">

				<table class="table">
						<tr>
							<th>Id</th>
							<th>Nombre</th>
							<th>Descripcion</th>	
							<th>Estado</th>						
							<th>Precio de Compra</th>						
							<th>Precio de venta</th>
							
						</tr>
<%
	
	List<TbProducto> lista = (List<TbProducto>)request.getAttribute("listado");
if(lista != null){
for(TbProducto lis: lista){	
	%>
							<tr>
							<th> <%= lis.getIdproducto() %> </th>
							<th><%= lis.getNombre() %></th>
							<th><%= lis.getDescripcion() %></th>							
							<th><%= lis.getEstado() %></th>
							<th><%= lis.getPreciocompra() %></th>
							<th><%= lis.getPrecioventa() %></th>
						</tr>
	<%  
  }
}
	%>
				</table>
			</div>




</body>
</html>