package Consola;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.BufferedReader;

import Modelo.Combo;
import Modelo.Ingrediente;
import Modelo.ProductoMenu;

public class CargaDatos {
	private Combo combo;
	private ArrayList <Combo> combos;
	private ArrayList <Ingrediente> ingredientes;
	private ArrayList <ProductoMenu> productoMenu;
	
	public void mostrarMenu() {
		System.out.println("\nOpciones del menú.\n");
		System.out.println("1. Crear pedido.");
		System.out.println("2. Salir de la aplicación.");
	}
	
	public void mostrarCrearPedido() {
		System.out.println("1. Agregar un combo al pedido.");
		System.out.println("2. Agregar un producto.");
	}
	
	public CargaDatos() {
		combos = new ArrayList <Combo>();
		ingredientes = new ArrayList <Ingrediente>();
		productoMenu = new ArrayList <ProductoMenu>();
		
		try
		{
			leerCombo("data\\combos.txt");
			leerIngrediente("data\\ingredientes.txt");
			leerProductoMenu("data\\menu.txt");
			System.out.println("Bienvenido a Hamburguesas el Corral.");
			mostrarMenu();
			int opcion_seleccionada = Integer.parseInt(input("Por favor seleccione una opción"));
			if (opcion_seleccionada == 1) {
				System.out.println("Que desea pedir.");
				System.out.println("1.Combo.");
				System.out.println("2.producto");
				int opcionCombooPro = Integer.parseInt(input("Por favor seleccione una opción"));
				if (opcion_seleccionada == 1) {
					int cont = 1;
					for(Combo i: combos) {
						System.out.print(cont);
						System.out.println(". " +i.getNombreCombo());
						cont ++;
					}
				}
				if (opcion_seleccionada == 2) {
					int cont3 = 1;
					for (ProductoMenu i: productoMenu) {
						System.out.print(cont3);
						System.out.println(". " + i.getProductoMenu());
						cont3 ++;
					}
				}
			}
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void imprimir() {
		int cont = 1;
		int cont2 = 1;
		int cont3 = 1;
		for(Combo i: combos) {
			System.out.print(cont);
			System.out.println(". " +i.getNombreCombo());
			cont ++;
		}
		for (Ingrediente i: ingredientes) {
			System.out.print(cont2);
			System.out.println(". " +i.getIngrediente());
			cont2 ++;
		}
		for (ProductoMenu i: productoMenu) {
			System.out.print(cont3);
			System.out.println(". " + i.getProductoMenu());
			cont3 ++;
		} 
	}
	
	public void leerCombo(String nombre) throws IOException{
		File archivo = new File(nombre);
		BufferedReader lector = new BufferedReader(new FileReader(archivo));
		String linea = lector.readLine();
		while(linea != null) {
			String[] datos = linea.split(";");
			String nombreCombo = datos[0];
			String descuento = datos[1];
			descuento = descuento.replaceAll("[^\\w+]", "");
			int descuentos = Integer.parseInt(descuento);
			String productosCombo = datos[2];
			
			String[] datosProducto = productosCombo.split(",");
			ArrayList productosComboA = new ArrayList();
			for(int i = 0; i<datosProducto.length; i++) {
				productosComboA.add(datosProducto[i]);	
			}
			Combo nuevo = new Combo(nombreCombo,descuentos, productosComboA);
			combos.add(nuevo);
			
			linea = lector.readLine();	
		}
		lector.close();
	}
	
	private void leerIngrediente(String nombre)throws IOException{
		File archivo = new File(nombre);
		BufferedReader lector = new BufferedReader(new FileReader(archivo));
		String linea = lector.readLine();
		while(linea != null) {
			String[] datos = linea.split(";");
			String ingrediente = datos[0];
			String precioS = datos[1];
			int precioIngrediente = Integer.parseInt(precioS);
			
			Ingrediente nuevo = new Ingrediente(ingrediente, precioIngrediente);
			ingredientes.add(nuevo);
			
			linea = lector.readLine();
		}
		lector.close();
	}
	
	private void leerProductoMenu(String nombre)throws IOException{
		File archivo = new File(nombre);
		BufferedReader lector = new BufferedReader(new FileReader(archivo));
		String linea = lector.readLine();
		while(linea != null) {
			String[] datos = linea.split(";");
			String ingrediente = datos[0];
			String precioS = datos[1];
			int precioIngrediente = Integer.parseInt(precioS);
			
			ProductoMenu nuevo = new ProductoMenu(ingrediente, precioIngrediente);
			productoMenu.add(nuevo);
			
			linea = lector.readLine();
		}
		lector.close();
	}
	
	public String input(String mensaje)
	{
		try
		{
			System.out.print(mensaje + ": ");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			return reader.readLine();
		}
		catch (IOException e)
		{
			System.out.println("Error leyendo de la consola");
			e.printStackTrace();
		}
		return null;
	}
	
	public static void main(String[] args) {
		new CargaDatos();

	}
	
}
