package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the tb_producto database table.
 * 
 */
@Entity
@Table(name="tb_producto")
@NamedQuery(name="TbProducto.findAll", query="SELECT t FROM TbProducto t")
public class TbProducto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idproducto;

	private String codbarras;

	private String descripcion;

	@Temporal(TemporalType.DATE)
	private Date fechavenc;

	private String lote;

	private String nomproducto;

	private double precio;

	//bi-directional many-to-one association to TbTipoproducto
	@ManyToOne
	@JoinColumn(name="idtipoproducto")
	private TbTipoproducto tbTipoproducto;

	public TbProducto() {
	}

	public int getIdproducto() {
		return this.idproducto;
	}

	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}

	public String getCodbarras() {
		return this.codbarras;
	}

	public void setCodbarras(String codbarras) {
		this.codbarras = codbarras;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFechavenc() {
		return this.fechavenc;
	}

	public void setFechavenc(Date fechavenc) {
		this.fechavenc = fechavenc;
	}

	public String getLote() {
		return this.lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	public String getNomproducto() {
		return this.nomproducto;
	}

	public void setNomproducto(String nomproducto) {
		this.nomproducto = nomproducto;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public TbTipoproducto getTbTipoproducto() {
		return this.tbTipoproducto;
	}

	public void setTbTipoproducto(TbTipoproducto tbTipoproducto) {
		this.tbTipoproducto = tbTipoproducto;
	}

}