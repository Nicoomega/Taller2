package Modelo;

import java.util.ArrayList;

public class Pedido {
	private ArrayList combos;
	private ArrayList productos;
	private ArrayList productosMenu;
	private ArrayList productosEliminados;
	private Combo combo;
	private ProductoMenu productoMenu;
	private Ingrediente ingrediente;
	private int sumaCosto;
	public Pedido(ArrayList combos, ArrayList productos, ArrayList productosMenu, ArrayList productosEliminados,
			int sumaCosto) {
		super();
		this.combos = combos;
		this.productos = productos;
		this.productosMenu = productosMenu;
		this.productosEliminados = productosEliminados;
		this.sumaCosto = sumaCosto;
	}
	public ArrayList getCombos() {
		return combos;
	}
	public void setCombos(ArrayList combos) {
		this.combos = combos;
	}
	public ArrayList getProductos() {
		return productos;
	}
	public void setProductos(ArrayList productos) {
		this.productos = productos;
	}
	public ArrayList getProductosMenu() {
		return productosMenu;
	}
	public void setProductosMenu(ArrayList productosMenu) {
		this.productosMenu = productosMenu;
	}
	public ArrayList getProductosEliminados() {
		return productosEliminados;
	}
	public void setProductosEliminados(ArrayList productosEliminados) {
		this.productosEliminados = productosEliminados;
	}
	public int getSumaCosto() {
		return sumaCosto;
	}
	public void setSumaCosto(int sumaCosto) {
		this.sumaCosto = sumaCosto;
	}
	
	
	
	
	
	
	
	

}
