package domain;


public abstract class Producto implements Cloneable{
	
	protected String nombre;
	protected Double precioDeLista;

	
	
	public Producto(String nombre, Double precioDeLista){
		
	this.nombre = nombre;
	this.precioDeLista = precioDeLista;
			
	}


	public abstract Double calcularPrecioDeVenta();
	

	public abstract String getNombre();


	protected abstract void setNombre(String nombre);


	public abstract Double getPrecioDeLista();


	protected abstract void setPrecioDeLista(Double precioDeLista);
	
	

	
}
