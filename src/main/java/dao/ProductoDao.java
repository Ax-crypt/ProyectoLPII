package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import interfaces.IProducto;
import model.TbProducto;

public class ProductoDao implements IProducto{

	@Override
	public void RegistrarProducto(TbProducto producto) {
		//Establecer conexion		
		EntityManagerFactory em = Persistence.createEntityManagerFactory("ProyectoLPII");
		
		//gestionar las entidades
		EntityManager manager = em.createEntityManager();
		//iniciamos la transaccion
		manager.getTransaction().begin();
		//registro en la base de datos
		manager.persist(producto);
		
		//mostrar mensaje
		System.out.println("Producto registrado con exito!");
		//confirmamos la transaccion
		manager.getTransaction().commit();
		//cerramos
		manager.close();
		
		
	}

	@Override
	public void ActualizarProducto(TbProducto producto) {
		
		
	}

	@Override
	public void EliminarProducto(TbProducto producto) {
		
		
	}

	@Override
	public TbProducto BuscarProducto(TbProducto producto) {
		
		return null;
	}

	@Override
	public List<TbProducto> listarProducto() {
		//Establecer conexion		
		EntityManagerFactory em = Persistence.createEntityManagerFactory("ProyectoLPII");
		
		//gestionar las entidades
		EntityManager manager = em.createEntityManager();
		//iniciamos la transaccion
		manager.getTransaction().begin();
		
		/* Utilizando el JPQL
		 * El metodo createQuery de entityManager se usa 
		 * para creacion de consultas dinamicas
		 */
		
		List<TbProducto> listaProductos = manager.createQuery("SELECT t FROM TbProducto t", TbProducto.class).getResultList();
	
		//mostrar mensaje
		System.out.println("Mostrando lista de productos");
		//confirmamos la transaccion
		manager.getTransaction().commit();
		//cerramos
		manager.close();
		//retorna el listado
		return listaProductos;
	}

	

}
