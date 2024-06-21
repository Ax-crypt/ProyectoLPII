package controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProductoDao;
import model.TbProducto;

/**
 * Servlet implementation class ControladorProducto
 */
@WebServlet("/ControladorProducto")
public class ControladorProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorProducto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		//instanciamos
		TbProducto producto = new TbProducto();
		ProductoDao crud = new ProductoDao();
		List<TbProducto> listado = crud.listarProducto();
		request.setAttribute("listado", listado);
		request.getRequestDispatcher("ListadoProductos.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String nombre = request.getParameter("nombre");
		String descripcion = request.getParameter("descripcion");
		String estado = request.getParameter("estado");
		String precioC = request.getParameter("precompra");
		String precioV = request.getParameter("preventa");
		//instanciamos
		TbProducto producto = new TbProducto();
		ProductoDao crud = new ProductoDao();
		
		//ingreso de datos
		producto.setNombre(nombre);
		producto.setDescripcion(descripcion);
		producto.setEstado(estado);
		producto.setPreciocompra(precioC);
		producto.setPrecioventa(precioV);
		//
		crud.RegistrarProducto(producto);
		// listamos los productos
		
		
		List<TbProducto> listado =crud.listarProducto();
		request.setAttribute("listado", listado);
		request.getRequestDispatcher("ListadoProductos").forward(request, response);
		
		
	}

}
