package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tb_tipoproducto database table.
 * 
 */
@Entity
@Table(name="tb_tipoproducto")
@NamedQuery(name="TbTipoproducto.findAll", query="SELECT t FROM TbTipoproducto t")
public class TbTipoproducto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idtipoproducto;

	private String descripcion;

	//bi-directional many-to-one association to TbProducto
	@OneToMany(mappedBy="tbTipoproducto")
	private List<TbProducto> tbProductos;

	public TbTipoproducto() {
	}

	public int getIdtipoproducto() {
		return this.idtipoproducto;
	}

	public void setIdtipoproducto(int idtipoproducto) {
		this.idtipoproducto = idtipoproducto;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<TbProducto> getTbProductos() {
		return this.tbProductos;
	}

	public void setTbProductos(List<TbProducto> tbProductos) {
		this.tbProductos = tbProductos;
	}

	public TbProducto addTbProducto(TbProducto tbProducto) {
		getTbProductos().add(tbProducto);
		tbProducto.setTbTipoproducto(this);

		return tbProducto;
	}

	public TbProducto removeTbProducto(TbProducto tbProducto) {
		getTbProductos().remove(tbProducto);
		tbProducto.setTbTipoproducto(null);

		return tbProducto;
	}

}