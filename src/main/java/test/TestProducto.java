package test;

import java.util.List;

import dao.ProductoDao;
import model.TbProducto;

public class TestProducto {

	public static void main(String[] args) {
		TbProducto producto = new TbProducto();
		ProductoDao crud = new ProductoDao();
		
		/*	producto.setNombre("Tv");
		producto.setDescripcion("65 UHD");
		producto.setEstado("Disponible");
		producto.setPreciocompra("1800");
		producto.setPrecioventa("2000");
		crud.RegistrarProducto(producto); */
		
		
		//Metodo que lista los usuarios
		List<TbProducto> listar = crud.listarProducto();
		for(TbProducto list:listar){
			System.out.println(
					" Codigo: "+list.getIdproducto()+","+
			        " Nombre: "+list.getNombre()+","+
				    " Descripcion: "+list.getDescripcion()+","+
				    " Estado: "+list.getEstado()+","+
				    " Precio de venta: "+list.getPrecioventa()+","+
				    " Precio de compra: "+list.getPreciocompra()
					);			
		} 

	}

}
