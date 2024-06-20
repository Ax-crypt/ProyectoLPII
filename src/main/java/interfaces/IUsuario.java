package interfaces;

import java.util.List;

import model.TbUsuario;

public interface IUsuario {
	public void RegistrarUsuario (TbUsuario Usuario);
	public void ActualizarUsuario (TbUsuario Usuario);
	public void EliminarUsuario (TbUsuario Usuario);
	public TbUsuario BuscarUsuario(TbUsuario Usuario);
	public List<TbUsuario> listarUsuario();


}
