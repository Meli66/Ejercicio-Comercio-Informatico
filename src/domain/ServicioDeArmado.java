package domain;

import javax.swing.JOptionPane;

public class ServicioDeArmado extends Producto implements Cloneable{
	
	private int cantidadDeHorasDeServicio;

	




	public ServicioDeArmado(String nombre, Double precioDeLista, int cantidadDeHorasDeServicio) {
		
		
		super(nombre, precioDeLista);
		this.cantidadDeHorasDeServicio = cantidadDeHorasDeServicio;
		
		
	}
	
	
	
	
	@Override
	public Double calcularPrecioDeVenta() {
	
   
    cantidadDeHorasDeServicio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de horas usadas: "));
    
    precioDeLista = precioDeLista * cantidadDeHorasDeServicio;
    
    	
	return precioDeLista;	
		
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
	
	public int getCantidadDeHorasDeServicio() {
		return cantidadDeHorasDeServicio;
	}




	protected void setCantidadDeHorasDeServicio(int cantidadDeHorasDeServicio) {
		this.cantidadDeHorasDeServicio = cantidadDeHorasDeServicio;
	}




	public Object clone() throws CloneNotSupportedException {
		
		
		return super.clone();
		
		
		
	}


	
	
}
