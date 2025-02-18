/**
 * 
 */
package examenHerenciaPOO;

import java.util.Objects;

/**
 * 
 */
public class Entrenador extends SeleccionFutbol{
	//Propiedades
	private String id_Federacion;
	
	//Setter
	public String getId_Federacion() {
		return id_Federacion;
	}
	
	//Constructores
	public Entrenador(int id_SeleccionFutbol, String nombre, String apellidos, int edad, String id_Federacion) {
		super(id_SeleccionFutbol, nombre, apellidos, edad);
		this.id_Federacion = id_Federacion;
	}
	
	public Entrenador(int id_SeleccionFutbol, String id_Federacion) {
		super(id_SeleccionFutbol);
		this.id_Federacion = id_Federacion;
	}
	
	//toString autogenerado
	@Override
	public String toString() {
		return "Federacion=" + id_Federacion + "\n" + " id_SeleccionFutbol=" + id_SeleccionFutbol + "\n" + "apellidos=" + apellidos + ", nombre=" + nombre  + "\n" + " edad=" + edad ;
	}
	
	//hash y equals autogenerados

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(id_Federacion);
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
		Entrenador other = (Entrenador) obj;
		return Objects.equals(id_Federacion, other.id_Federacion);
	}
	
	//Otros métodos
	public void dirigirPartido() {
		System.out.println("dirigirPartido() de Entrenador");
	}	
	
	public void dirigirEntrenamiento() {
		System.out.println("dirigirEntrenamiento() de Entrenador");
	}
	
	//Método de impresión customizado
		/*Mi intención es llamar al método del padre para que imprima todas las propiedades comunes y "terminar" la ficha con las
		 * propiedades únicas de la hija*/

}
