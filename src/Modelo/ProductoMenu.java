package Modelo;

public class ProductoMenu {
	private String productoMenu;
	private int precioMenu;
	
	
	public ProductoMenu(String productoMenu, int precioMenu) {
		super();
		this.productoMenu = productoMenu;
		this.precioMenu = precioMenu;
	}


	public String getProductoMenu() {
		return productoMenu;
	}


	public void setProductoMenu(String productoMenu) {
		this.productoMenu = productoMenu;
	}


	public int getPrecioMenu() {
		return precioMenu;
	}


	public void setPrecioMenu(int precioMenu) {
		this.precioMenu = precioMenu;
	}
	
	

}
