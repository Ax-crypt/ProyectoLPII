<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css" integrity="sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay" crossorigin="anonymous">
<!--  -->
<title>Login</title>
</head>
 <body style="background: #ECCEF5;">
     <div class="container">
				
       <div class="row justify-content-center">
       <div class="col-10 col-md-10 col-lg-6 col-xl-4">
        <div class="card" style="width: 18rem; background:linear-gradient(blue, pink);">
            <div class="card-body">
                <form method="POST" action="ControladorUsuario">
                <div class="form-outline mb-2" >
                    <div class="form-outline mb-2">                                                    
					     <input type="text" class="form-control" name="usuario" placeholder="usuario" required>                                         
                    </div>
                    <div class="form-outline mb-2">                        
                      <input type="password" class="form-control" id="exampleInputPassword1" name="password" placeholder="Password" required>
                    </div>
                    <a href="index.jsp" class="btn btn-success">Ingresar</a>  
                     </div>                                                              
                </form>
            </div>
        </div>
      </div> 
      </div> 
    </div>
       
        <!-- jQuery -- Bootstrap JS -->
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>       
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>       
        
        <!-- -->
    </body>
</html>