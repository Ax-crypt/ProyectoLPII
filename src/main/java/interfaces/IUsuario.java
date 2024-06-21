package interfaces;

import java.util.List;

import model.TbUsuario;

public interface IUsuario {
	public void RegistrarUsuario (TbUsuario Usuario);
	public void ActualizarUsuario (TbUsuario Usuario);
	public TbUsuario ValidarUsuario (String usuario, String password);
	public List<TbUsuario> listarUsuario();


}
