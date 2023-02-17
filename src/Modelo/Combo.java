package Modelo;

import java.util.ArrayList;

public class Combo {
	private String nombreCombo;
	private int descuento;
	private ArrayList productosCombo;
	
	public Combo(String nombreCombo, int descuento, ArrayList productosCombo) {
		super();
		this.nombreCombo = nombreCombo;
		this.descuento = descuento;
		this.productosCombo = productosCombo;
	}

	public String getNombreCombo() {
		return nombreCombo;
	}

	public void setNombreCombo(String nombreCombo) {
		this.nombreCombo = nombreCombo;
	}

	public int getDescuento() {
		return descuento;
	}

	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}

	public ArrayList getProductosCombo() {
		return productosCombo;
	}

	public void setProductosCombo(ArrayList productosCombo) {
		this.productosCombo = productosCombo;
	}
	
	

}
