package domain;

import java.util.Random;

import javax.swing.JOptionPane;

public class ServicioDeReparacion extends Producto implements Cloneable{
	
	
	private Double cantidadDeHorasDeServicio;
	private Integer dificultad;
	
	
	public ServicioDeReparacion(String nombre, Double precioDeLista, Double cantidadDeHorasDeServicio, Integer dificultad) {
		super(nombre, precioDeLista);
		this.cantidadDeHorasDeServicio = cantidadDeHorasDeServicio;
		this.dificultad = dificultad;
		
		
	}
	
	
	
	@Override
	public Double calcularPrecioDeVenta() {
		

	    cantidadDeHorasDeServicio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de horas usadas: "));
	    
		
	    Random aleatorios = new Random();
		
		   dificultad = (aleatorios.nextInt(5) + 1);	   
		
		
		
		if(dificultad > 3) {
			
			
			precioDeLista = precioDeLista * cantidadDeHorasDeServicio * 1.25;
			
			
		}else {
			
			precioDeLista = precioDeLista * cantidadDeHorasDeServicio;
			
			
		}
		
		
		
		return precioDeLista;
		// TODO Auto-generated method stub
		
	}
	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	protected void setNombre(String nombre) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Double getPrecioDeLista() {
		
		return precioDeLista;
	}
	@Override
	protected void setPrecioDeLista(Double precioDeLista) {
		// TODO Auto-generated method stub
		
	}



	public Double getCantidadDeHorasDeServicio() {
		return cantidadDeHorasDeServicio;
	}



	protected void setCantidadDeHorasDeServicio(Double cantidadDeHorasDeServicio) {
		this.cantidadDeHorasDeServicio = cantidadDeHorasDeServicio;
	}



	public Integer getDificultad() {
		return dificultad;
	}



	protected void setDificultad(Integer dificultad) {
		this.dificultad = dificultad;
	}


	public Object clone() throws CloneNotSupportedException {
		
		
		return super.clone();
		
		
		
	}


	
}
