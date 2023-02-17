package Modelo;

public class Ingrediente {
	private String ingrediente;
	private int precioIngrediente;
	
	
	public Ingrediente(String ingrediente, int precioIngrediente) {
		super();
		this.ingrediente = ingrediente;
		this.precioIngrediente = precioIngrediente;
	}


	public String getIngrediente() {
		return ingrediente;
	}


	public void setIngrediente(String ingrediente) {
		this.ingrediente = ingrediente;
	}


	public int getPrecioIngrediente() {
		return precioIngrediente;
	}


	public void setPrecioIngrediente(int precioIngrediente) {
		this.precioIngrediente = precioIngrediente;
	}
	
	
	

}
