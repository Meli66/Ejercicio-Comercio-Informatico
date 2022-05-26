package domain;

public class Insumo extends Producto implements Cloneable{
	
	private String tipo;
	private Double porcentajeALaGanancia = 0.3;
	
	
	public Insumo(String nombre, Double precioDeLista, String tipo, Double porcentajeALaGanancia){
		
	   super(nombre, precioDeLista);
	   this.tipo = tipo;
	   this.porcentajeALaGanancia = porcentajeALaGanancia;
		
		
	}
	
	

	public String getTipo() {
		return tipo;
	}



	protected void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public double getPorcentajeALaGanancia() {
		return porcentajeALaGanancia;
	}



	protected void setPorcentajeALaGanancia(Double porcentajeALaGanancia) {
		this.porcentajeALaGanancia = porcentajeALaGanancia;
	}



	@Override
	public Double calcularPrecioDeVenta() {
		
		Double precioDeVenta = precioDeLista + precioDeLista * porcentajeALaGanancia;
		
		return precioDeVenta;
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}

	@Override
	protected void setNombre(String nombre) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Double getPrecioDeLista() {
		// TODO Auto-generated method stub
		return precioDeLista;
	}

	
	@Override
	protected void setPrecioDeLista(Double precioDeLista) {
		// TODO Auto-generated method stub
		
	}


	public Object clone() throws CloneNotSupportedException {
		
		
		return super.clone();
		
		
		
	}

		
	}
	
	
	
	
	
	


	
	
	


