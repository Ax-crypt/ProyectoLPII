package test;

import dao.ClienteDao;
import model.TbCliente;

import java.util.*;

public class TestCliente {
	public static void main(String[] args) {
		//Instanciar la entidad tbCliente
		TbCliente cliente = new TbCliente();
		ClienteDao crud = new ClienteDao();
		
	/*	//asignamos datos
		cliente.setNombre("Estefany");
		cliente.setApellido("Rodas");
		cliente.setDni("005522");
		cliente.setEmail("Fer@gmail.com");
		cliente.setTelefono("994424666");
		cliente.setSexo("F");
		cliente.setNacionalidad("Peruana");
		// invocar el metodo registrar
		crud.RegistrarCliente(cliente); 
		
		
		cliente.setIdcliente(11);
		crud.EliminarCliente(cliente); */
		
		//Metodo que lista los usuarios
		List<TbCliente> listar = crud.listarCliente();
		for(TbCliente list:listar){
			System.out.println(
					" Codigo: "+list.getIdcliente()+","+
			        " Nombre: "+list.getNombre()+","+
				    " Apellido: "+list.getApellido()+","+
				    " Email: "+list.getEmail()+","+
				    " Telefono: "+list.getTelefono()+","+
				    " sexo: "+list.getSexo()+","+
				    " Nacionalidad: "+list.getNacionalidad()
					);			
		} 

	}

}
