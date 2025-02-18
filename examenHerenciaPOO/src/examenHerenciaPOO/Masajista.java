/**
 * 
 */
package examenHerenciaPOO;

import java.util.Objects;

/**
 * 
 */
public class Masajista extends SeleccionFutbol{
	
	//Propiedades
	private String titulacion;
	private int aniosExperiencia;
	
	//Getters y setters
	public String getTitulacion() {
		return titulacion;
	}
	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}
	public int getAniosExperiencia() {
		return aniosExperiencia;
	}
	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}
	
	//Constructores
	public Masajista(int id_SeleccionFutbol, String nombre, String apellidos, int edad, String titulacion,
			int aniosExperiencia) {
		super(id_SeleccionFutbol, nombre, apellidos, edad);
		this.titulacion = titulacion;
		this.aniosExperiencia = aniosExperiencia;
	}
	
	public Masajista(int id_SeleccionFutbol) {
		super(id_SeleccionFutbol);
		this.titulacion = "";
		this.aniosExperiencia = 1;
	}
	
	//toString autogenerado
	@Override
	public String toString() {
		return "titulacion=" + titulacion  + "\n" + "aniosExperiencia=" + aniosExperiencia  + "\n"
				+ " id_SeleccionFutbol=" + id_SeleccionFutbol  + "\n"  + apellidos  + nombre  + "\n"
				+ "edad=" + edad ;
	}
	
	//hash y equals autogenerados
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(aniosExperiencia, titulacion);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Masajista other = (Masajista) obj;
		return aniosExperiencia == other.aniosExperiencia && Objects.equals(titulacion, other.titulacion);
	}
	
	//Otros métodos
	public void darMasaje() {
		System.out.println("darMasaje() de Masajista");
	}
	
}

