package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import interfaces.IUsuario;
import model.TbUsuario;

public class UsuarioDao implements IUsuario{

	@Override
	public void RegistrarUsuario(TbUsuario usuario) {
		//Establecer conexion		
		EntityManagerFactory em = Persistence.createEntityManagerFactory("ProyectoLPII");
		
		//gestionar las entidades
		EntityManager manager = em.createEntityManager();
		//iniciamos la transaccion
		manager.getTransaction().begin();
		//registro en la base de datos
		manager.persist(usuario);
		
		//mostrar mensaje
		System.out.println("Usuario registrado con exito!");
		//confirmamos la transaccion
		manager.getTransaction().commit();
		//cerramos
		manager.close();
		
	}

	@Override
	public void ActualizarUsuario(TbUsuario Usuario) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public List<TbUsuario> listarUsuario() {
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
		
		List<TbUsuario> listaUsuarios = manager.createQuery("SELECT t FROM TbUsuario t", TbUsuario.class).getResultList();
	
		//mostrar mensaje
		System.out.println("Mostrando lista de usuarios");
		//confirmamos la transaccion
		manager.getTransaction().commit();
		//cerramos
		manager.close();
		//retorna el listado
		return listaUsuarios;
	}

	@Override
	public TbUsuario ValidarUsuario(String usuario, String password) {
		//Establecer conexion		
		EntityManagerFactory em = Persistence.createEntityManagerFactory("ProyectoLPII");
		//gestionar las entidades
				EntityManager manager = em.createEntityManager();
				//iniciamos la transaccion
				manager.getTransaction().begin();
				//Recuperamos codigo a buscar
				TbUsuario validarUsuario = (TbUsuario) manager.createQuery("SELECT t FROM TbUsuario t");
				
				//mostrar mensaje
				System.out.println("Credenciales correctas");
				//confirmamos la transaccion
				manager.getTransaction().commit();
				//cerramos
				manager.close();
				
				return validarUsuario;

		
	}

	

}
