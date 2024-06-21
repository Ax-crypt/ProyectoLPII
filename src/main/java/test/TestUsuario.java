package test;

import java.util.List;

import dao.UsuarioDao;
import model.TbUsuario;

public class TestUsuario {

	public static void main(String[] args) {
		TbUsuario usuario = new TbUsuario();
		UsuarioDao crud = new UsuarioDao();
	/*	
		usuario.setPassword("1234");
		usuario.setUsuario("Axel");
		crud.RegistrarUsuario(usuario);*/
		
		
		//Metodo que lista los usuarios
		List<TbUsuario> listar = crud.listarUsuario();
		for(TbUsuario list:listar){
			System.out.println(
					" Codigo: "+list.getIdusuario()+","+
			        " Nombre: "+list.getUsuario()+","+
				    " Contraseña: "+list.getPassword()
					);			
		} 

	}

}
