package interfaces;

import java.util.List;

import model.TbTipoproducto;

public interface ITipoProducto {
	public void RegistrarTipoProducto (TbTipoproducto tipoProducto);
	public void ActualizarTipoProducto (TbTipoproducto tipoProducto);
	public void EliminarTipoProducto (TbTipoproducto tipoProducto);
	public TbTipoproducto BuscarTipoProducto(TbTipoproducto tipoProducto);
	public List<TbTipoproducto> listarTipoProducto();

}
