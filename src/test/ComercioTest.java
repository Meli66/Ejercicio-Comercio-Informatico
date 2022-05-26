package test;

import java.util.Random;

import javax.swing.JOptionPane;

import domain.Comercio;
import domain.Insumo;

public class ComercioTest {

	public static void main(String[] args) {
		
		
		Comercio comercio = new Comercio();
		
		String nombre = JOptionPane.showInputDialog("Ingrese un nombre de insumo: ");
		Double precioDeLista = Double.parseDouble(JOptionPane.showInputDialog("Ingrse un precio de lista"));
		String tipo = JOptionPane.showInputDialog("Ingrese un tipo de insumo: (periférico, hardware o limpieza)");
		Double porcentajeALaGanancia = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un porcentaje a la ganancia"));
		
		String nombreABuscar = JOptionPane.showInputDialog("Ingrese un nombre del insumo que desea buscar: ");
	
		
		
		Comercio.crearInsumo(new Insumo(nombre, precioDeLista, tipo, porcentajeALaGanancia),nombreABuscar);
		
		
		
		
		
	
	}

	
}
