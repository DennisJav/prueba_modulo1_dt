package ec.edu.modelo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class Vehiculo {
	String Marca;
	String paisOrigen;
	String Placa;
	String Tipo;
	double Precio;
	double valorMatricula;
	private Propietario datos;
	
	
	public static final Logger LOG = LoggerFactory.getLogger( Vehiculo.class);
	
	
	public Vehiculo(Propietario datos) {
		this.datos = datos;
	}
	
	public String Vehiculo(String nombre, String apellido, String cedula) {
		
		this.datos.setApellido(apellido);
		this.datos.setNombre(nombre);
		this.datos.setCedula(cedula);
		
		LOG.info("DAtos guardados");
		return " ";
		
	}
	
	
	//Metodos setter y getter
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public String getPaisOrigen() {
		return paisOrigen;
	}
	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}
	public String getPlaca() {
		return Placa;
	}
	public void setPlaca(String placa) {
		Placa = placa;
	}
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	public double getPrecio() {
		return Precio;
	}
	public void setPrecio(double precio) {
		Precio = precio;
	}
	public double getValorMatricula() {
		return valorMatricula;
	}
	public void setValorMatricula(double valorMatricula) {
		this.valorMatricula = valorMatricula;
	}

	
	@Override
	public String toString() {
		return "Vehiculo [Marca=" + Marca + ", paisOrigen=" + paisOrigen + ", Placa=" + Placa + ", Tipo=" + Tipo
				+ ", Precio=" + Precio + ", valorMatricula=" + valorMatricula + ", datos=" + datos + "]";
	}




	
}
