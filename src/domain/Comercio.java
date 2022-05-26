package domain;

import java.util.ArrayList;
import java.util.List;


public class Comercio {

	
	final int LIMITE = 1000;
	
	private List<Insumo> insumos = new ArrayList<Insumo>();
	private List<ServicioDeArmado> serviciosDeArmado = new ArrayList<ServicioDeArmado>();
	private List<ServicioDeReparacion> serviciosDeReparacion = new ArrayList<ServicioDeReparacion>();
	
	
	
	
	public Comercio() {
		
	}


	public void crearInsumo(Insumo insumo, String nombre) {
		
		for (Insumo insumoFor : insumos) {

			if (!insumoFor.getNombre().equalsIgnoreCase(nombre)) {

				System.out.println("El Insumo con el nombre: " + nombre +" ya existe");

			}else {
			
				insumos.add(insumo);
			}

		}
			
		
	}
		
	
	public void crearServicioDeArmado(ServicioDeArmado servicioDeArmado, String nombre) {
		
		
		for (ServicioDeArmado servicioDeArmadoFor : serviciosDeArmado) {

			if (servicioDeArmadoFor.getNombre().equalsIgnoreCase(nombre)) {

			     serviciosDeArmado.add(servicioDeArmado);

			}else {
				
				System.out.println("El servicio de armado con el nombre: " + nombre +" ya existe");
				
			}

		}
		
		
	}
	
	
	
	public void crearServicioDeReparacion(ServicioDeReparacion servicioDeReparacion, String nombre) {
		
		for (ServicioDeReparacion servicioDeReparacionFor : serviciosDeReparacion) {

			if (servicioDeReparacionFor.getNombre().equalsIgnoreCase(nombre)) {

			     serviciosDeReparacion.add(servicioDeReparacion);

			}else {
				
				System.out.println("El servicio de reparacion con el nombre: " + nombre +" ya existe");
				
			}

		}
		
		
		
	}
	
	
	
	public Insumo buscarInsumoPorNombre(String nombre) {
		
		for (Insumo insumoFor : insumos) {

			if (insumoFor.getNombre().equalsIgnoreCase(nombre)) {

				return insumoFor;

			}else {
				
				System.out.println("El insumo " + nombre + " no fue encontrado" );
				
			}

		}

		return null;
		
		
		
	}
	
   public ServicioDeArmado buscarServicioDeArmadoPorNombre(String nombre) {
		
	   for (ServicioDeArmado servicioDeArmadoFor : serviciosDeArmado) {

			if (servicioDeArmadoFor.getNombre().equalsIgnoreCase(nombre)) {

				return servicioDeArmadoFor;

			}else {
				
				System.out.println("El servicio de armado " + nombre + " no fue encontrado" );
				
			}

		}

		return null;
		
	}
   
   
   
   public ServicioDeReparacion buscarServicioDeReparacionPorNombre(String nombre) {
		
	   for (ServicioDeReparacion servicioDeReparacionFor : serviciosDeReparacion) {

			if (servicioDeReparacionFor.getNombre().equalsIgnoreCase(nombre)) {

				return servicioDeReparacionFor;

			}else {
				
				System.out.println("El servicio de reparacion " + nombre + " no fue encontrado" );
				
			}

		}

		return null;
		
		
	}
	
   
   

   public void modificarPrecioDeListaInsumos(String nombre, Double precioDeLista) {
	   
	   
		for (Insumo insumoFor : insumos) {

			if (insumoFor.getNombre().equalsIgnoreCase(nombre)) {

				insumoFor.setPrecioDeLista(precioDeLista);
				

			}

		}
	   
	   
	   
	   
   }
   
   public void modificarPrecioDeListaServicioDeArmado(String nombre, Double precioDeLista) {
	   
	   
		for (ServicioDeArmado servicioDeArmadoFor : serviciosDeArmado) {

			if (servicioDeArmadoFor.getNombre().equalsIgnoreCase(nombre)) {

				servicioDeArmadoFor.setPrecioDeLista(precioDeLista);
				

			}

		}
	   
	   
	   
	   
  }
   
   
   public void modificarPrecioDeListaServicioDeReparacion(String nombre, Double precioDeLista) {
	   
	   
		for (ServicioDeReparacion servicioDeReparacionFor : serviciosDeReparacion) {

			if (servicioDeReparacionFor.getNombre().equalsIgnoreCase(nombre)) {

				servicioDeReparacionFor.setPrecioDeLista(precioDeLista);
				

			}

		}
	   
	   
	   
	   
  }
	
	
	
}
