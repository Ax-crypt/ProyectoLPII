package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UsuarioDao;
import model.TbUsuario;

@WebServlet(name = "Validar", urlPatterns = {"/Validar"})
public class Validar extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	TbUsuario usuario = new TbUsuario();
    UsuarioDao usuarioDAO = new UsuarioDao();
    boolean usuarioNuevo = false;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
        
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Validar</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Validar at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {     
        String accion = request.getParameter("accion");
        if (accion.equalsIgnoreCase("Ingresar")) {
        	TbUsuario usuario = new TbUsuario();
        	//Recuperamos datos del formulario y almacenamos en las variables
            String us = request.getParameter("txtusuario");
            String pass = request.getParameter("txtpassword");
            //validamos en la base de datos
            
            System.out.print("Datos correctos");
            if(usuario.getUsuario()!= null){
                System.out.print("Bienvenido");
                request.setAttribute("exito", "ok");
                request.setAttribute("usuario", usuario);
                request.getRequestDispatcher("index.jsp").forward(request, response);                    

            }else{
            	request.setAttribute("exito", "fail");
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }
        }else{
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }  //fin del proceso para ingresar
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
