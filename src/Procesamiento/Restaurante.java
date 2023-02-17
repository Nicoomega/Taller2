package Procesamiento;

import java.util.ArrayList;

import Modelo.Combo;
import Modelo.Ingrediente;
import Modelo.Pedido;
import Modelo.ProductoMenu;

public class Restaurante {
	private Combo combo;
	private Ingrediente ingrediente;
	private ProductoMenu productoMenu;
	private ArrayList<Pedido> pedido;
	private ArrayList <Combo> combos;
	private ArrayList <ProductoMenu> productoMenuA;
	
	
	
	public void pedidoEnCurso(int tipo, int eleccion, String nombreCombo, String nombreProducto) {
		productoMenuA = new ArrayList <ProductoMenu>();
		ArrayList proComb = null;
		int costo = 0;
		if (tipo == 1) {
			Combo elCombo = null;
			int cont = 1;
			for(Combo i: combos) {
				if (eleccion == cont) {
					proComb =i.getProductosCombo();
					for (int e=0; e<proComb.size(); e++) {
						for (ProductoMenu o: productoMenuA) {
							if (proComb.equals(o.getProductoMenu())) {
								int costoTemporal = (o.getPrecioMenu()*i.getDescuento())/100;
								costo += costoTemporal;
							}
							
						}
						
					}
					
				}
				
						
			}
			
		}
			
		ProductoMenu nuevo = new ProductoMenu(null,costo);
		productoMenuA.add(nuevo);	
	}
	
	

}
