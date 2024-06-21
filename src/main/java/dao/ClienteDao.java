package dao;

import java.util.List;

import interfaces.ICliente;
import model.TbCliente;
import javax.persistence.*;

public class ClienteDao implements ICliente{

	@Override
	public void RegistrarCliente(TbCliente cliente) {
		//Establecer conexion		
				EntityManagerFactory em = Persistence.createEntityManagerFactory("ProyectoLPII");
				
				//gestionar las entidades
				EntityManager manager = em.createEntityManager();
				//iniciamos la transaccion
				manager.getTransaction().begin();
				//registro en la base de datos
				manager.persist(cliente);
				
				//mostrar mensaje
				System.out.println("Cliente registrado con exito!");
				//confirmamos la transaccion
				manager.getTransaction().commit();
				//cerramos
				manager.close();

		
	}

	@Override
	public void ActualizarCliente(TbCliente cliente) {
		//Establecer conexion		
		EntityManagerFactory em = Persistence.createEntityManagerFactory("ProyectoLPII");
		
		//gestionar las entidades
		EntityManager manager = em.createEntityManager();
		//iniciamos la transaccion
		manager.getTransaction().begin();
		//Actualizar en la base de datos
		manager.merge(cliente);
		
		//mostrar mensaje
		System.out.println("Cliente actualizado correctamente!");
		//confirmamos la transaccion
		manager.getTransaction().commit();
		//cerramos
		manager.close();

		
	}

	@Override
	public void EliminarCliente(TbCliente cliente) {
		//Establecer conexion		
		EntityManagerFactory em = Persistence.createEntityManagerFactory("ProyectoLPII");
		
		//gestionar las entidades
		EntityManager manager = em.createEntityManager();
		//iniciamos la transaccion
		manager.getTransaction().begin();
		//recuperar codigo a eliminar
		TbCliente elim = manager.merge(cliente);
		//eliminar registro
		manager.remove(elim);
		
		//mostrar mensaje
		System.out.println("Se ha eliminado correctamente!");
		//confirmamos la transaccion
		manager.getTransaction().commit();
		//cerramos
		manager.close();	
		
	}

	@Override
	public TbCliente BuscarCliente(TbCliente cliente) {
		//Establecer conexion		
		EntityManagerFactory em = Persistence.createEntityManagerFactory("ProyectoLPII");
		
		//gestionar las entidades
		EntityManager manager = em.createEntityManager();
		//iniciamos la transaccion
		manager.getTransaction().begin();
		//Recuperamos codigo a buscar
		TbCliente buscarCliente = manager.find(TbCliente.class,cliente.getIdcliente());
		
		//mostrar mensaje
		System.out.println("Cliente encontrado");
		//confirmamos la transaccion
		manager.getTransaction().commit();
		//cerramos
		manager.close();
		return buscarCliente;

		
	}

	@Override
	public List<TbCliente> listarCliente() {
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
		
		List<TbCliente> listaClientes = manager.createQuery("select c from TbCliente c", TbCliente.class).getResultList();
	
		//mostrar mensaje
		System.out.println("Mostrando lista de clientes");
		//confirmamos la transaccion
		manager.getTransaction().commit();
		//cerramos
		manager.close();
		//retorna el listado
		return listaClientes;

		
	}
	

}
