package controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClienteDao;
import model.TbCliente;

/**
 * Servlet implementation class ControladorCliente
 */
@WebServlet("/ControladorCliente")
public class ControladorCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorCliente() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		TbCliente cliente = new TbCliente();
		ClienteDao crud = new ClienteDao();
		List<TbCliente> listadoClientes = crud.listarCliente();
		//asignamos el listado de clientes rescuperados de la bd
		request.setAttribute("listadoClientes", listadoClientes);
		//redireccionamos
		request.getRequestDispatcher("ListadoClientes.jsp").forward(request, response);	
		
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		//doGet(request, response);
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String dni = request.getParameter("dni");
		String email = request.getParameter("email");
		String telefono = request.getParameter("telefono");
		String sexo = request.getParameter("sexo");
		String nacionalidad = request.getParameter("nacionalidad");
		
		//instanciamos las entidades
		TbCliente cliente = new TbCliente();
		ClienteDao crud = new ClienteDao();
		
		//asignamos datos
		cliente.setNombre(nombre);
		cliente.setApellido(apellido);
		cliente.setDni(dni);
		cliente.setEmail(email);
		cliente.setTelefono(telefono);
		cliente.setSexo(sexo);
		cliente.setNacionalidad(nacionalidad);
		// invocar el metodo registrar
		crud.RegistrarCliente(cliente); 
		
		//Redireccionamos al listado de clientes
		request.getRequestDispatcher("ListadoClientes.jsp").forward(request, response);	
	}

}
