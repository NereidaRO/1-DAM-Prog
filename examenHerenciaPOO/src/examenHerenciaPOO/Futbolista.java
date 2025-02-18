/**
 * 
 */
package examenHerenciaPOO;
import java.util.Objects;
/**
 * 
 */
public class Futbolista extends SeleccionFutbol{
	//Propiedades
		//Son las propiedades de la clase derivada; el resto de propiedades las consigue mediante su padre
	private int dorsal;
	private String demarcacion;
	
	//Getters y setters
	public int getDorsal() {
		return dorsal;
	}
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	public String getDemarcacion() {
		return demarcacion;
	}
	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}
	
	//Constructores
		//Lo destacable es que se utiliza "super" para conseguir las propiedades del padre
	public Futbolista(int id_SeleccionFutbol, String nombre, String apellidos, int edad, int dorsal,
			String demarcacion) {
		super(id_SeleccionFutbol, nombre, apellidos, edad);
		this.dorsal = dorsal;
		this.demarcacion = demarcacion;
	}
	
	public Futbolista(int id_SeleccionFutbol) {
		super(id_SeleccionFutbol);
		this.dorsal = 1;
		this.demarcacion = "";
	}
	
	//toString 
	@Override
	public String toString() {
		return "dorsal=" + dorsal + "\n" + " demarcacion=" + demarcacion + "\n" + " id_SeleccionFutbol="
				+ id_SeleccionFutbol + "\n"  + apellidos  + nombre + "\n" + " edad=" + edad + "\n";
	}
	
	//hash y equals autogenerado
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(demarcacion, dorsal);
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
		Futbolista other = (Futbolista) obj;
		return Objects.equals(demarcacion, other.demarcacion) && dorsal == other.dorsal;
	}
	
	//Otros métodos
	public void jugarPartido() {
		System.out.println("jugarPartido() de Futbolista");
	}
	public void entrenar() {
		System.out.println("entrenar() de Futbolista");
	}	
	
	//Método de impresión customizado
		/*Mi intención es llamar al método del padre para que imprima todas las propiedades comunes y "terminar" la ficha con las
		 * propiedades únicas de la hija*/
	
}
