package test;

import dao.ClienteDao;
import model.TbCliente;

public class TestCliente {
	public static void main(String[] args) {
		//Instanciar la entidad tbCliente
		TbCliente cliente = new TbCliente();
		ClienteDao crud = new ClienteDao();
		
		//asignamos datos
		cliente.setNombre("Melina");
		cliente.setApellido("Rodas");
		cliente.setDni("005522");
		cliente.setEmail("Fer@gmail.com");
		cliente.setTelefono("994424666");
		cliente.setSexo("F");
		cliente.setNacionalidad("Peruana");
		// invocar el metodo registrar
		crud.RegistrarCliente(cliente); 
	}

}
