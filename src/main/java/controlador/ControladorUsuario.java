package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.TbUsuario;
import dao.UsuarioDao;

/**
 * Servlet implementation class ControladorUsuario
 */
@WebServlet("/ControladorUsuario")
public class ControladorUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;     
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());

		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
		 String accion = request.getParameter("accion");
	        if (accion.equalsIgnoreCase("Ingresar")) {
	        	TbUsuario usuario = new TbUsuario();
	        	UsuarioDao crud = new UsuarioDao();
	        	//Recuperamos datos del formulario y almacenamos en las variables
	            String usser = request.getParameter("usuario");
	            String pass = request.getParameter("password");
	            //validamos en la base de datos
	            crud.ValidarUsuario(usser, pass);
	            System.out.print("Datos correctos");
	            if(usuario.getUsuario()!= null){
	                System.out.print("Bienvenido");
	                request.setAttribute("usuario", usuario);
	                request.getRequestDispatcher("RegistrarProducto.jsp").forward(request, response);                    

	            }else{
	                request.getRequestDispatcher("login.jsp").forward(request, response);
	            }
	        }else{
	            request.getRequestDispatcher("login.jsp").forward(request, response);
	        }  //fin del proceso para ingresar
	}

}
