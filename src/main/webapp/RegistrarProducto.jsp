<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registrar productos</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous"> 
</head>

<body style="background-color: black">
<!--   --> 		                                          
<section class="vh-100 bg-image"
  style="background-image: url('https://mdbcdn.b-cdn.net/img/Photos/new-templates/search-box/img4.webp');">
  <div class="mask d-flex align-items-center h-100 gradient-custom-3" >
    <div class="container h-100">
      <div class="row d-flex justify-content-center align-items-center h-100">
        <div class="col-10 col-md-7 col-lg-5 col-xl-4">
          <div class="card" style="border-radius: 15px; background: linear-gradient(90deg, red, #7B68EE, rgb(204, 204, 255));">
            <div class="card-body p-3">
              <h2 class="text-uppercase text-center mb-4">registrar Productos</h2>
           <form action="ControladorProducto" method="post">
                <div class="form-outline mb-4" >
                  <input type="text" class="form-control" name="nombre" placeholder="Nombre">                                  
                </div>
                <div class="form-outline mb-2">
                  <input type="text" class="form-control" name="descripcion" placeholder="Descripcion">
                </div>
                <div class="form-outline mb-2">
                  <input type="text" class="form-control" name="estado" placeholder="Estado" >
                </div>
                <div class="form-outline mb-2">
                   <input type="text" class="form-control" name="precompra" placeholder="Precio de compra" >
                </div>
                <div class="form-outline mb-2">
                  <input type="text" class="form-control" name="preventa" placeholder="Precio de venta" />
                </div>
              <div class="d-flex justify-content-center">
                <input type="submit" class="btn btn-success btn-block btn-lg gradient-custom-4 text-body" name="accion" value="Registrar" >                               
              </div>            
          </form>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>
                                
            <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
            <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>                 

</body>
</html>