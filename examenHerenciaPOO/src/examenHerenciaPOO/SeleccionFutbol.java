/**
 * 
 */
package examenHerenciaPOO;

import java.util.Objects;

/**
 * 
 */
public class SeleccionFutbol {
	
	//Propiedades (a las propiedades protegidas solo pueden acceder directamente la propia clase y sus derivadas)
	protected int id_SeleccionFutbol;
	protected String nombre;
	protected String apellidos;
	protected int edad;
	
	//Getters y setters
		//Los getters sirven para conseguir el valor de las propiedades en clases donde no se pueden llamar directamente
		//Los setters sirven para modificar o añadir el valor de esas propiedades en las clases donde no se pueden llamar directamente
		//Los he hecho automáticamente en la pestaña Source y he añadido la linea que pedían las especificaciones
	public int getId_SeleccionFutbol() {
		System.out.println("Método getId_SeleccionFutbol de SeleccionFutbol");
		return id_SeleccionFutbol;
	}
	
	public String getNombre() {
		System.out.println("Método getNombre de SeleccionFutbol");
		return nombre;
	}
	public void setNombre(String nombre) {
		System.out.println("Método setNombre de SeleccionFutbol");
		this.nombre = nombre;
	}
	public String getApellidos() {
		System.out.println("Método getApellidos de SeleccionFutbol");
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		System.out.println("Método setApellidos de SeleccionFutbol");
		this.apellidos = apellidos;
	}
	public int getEdad() {
		System.out.println("Método getEdad de SeleccionFutbol");
		return edad;
	}
	public void setEdad(int edad) {
		System.out.println("Método setEdad de SeleccionFutbol");
		this.edad = edad;
	}
	
	//Constructores
		//Sirven para instanciar objetos en otras clases, por eso son públicos
		//Este tiene todos los campos; para crear un objeto con él hay que añadir los valores para las propiedades
		//También he usado la pestaña Source
	public SeleccionFutbol(int id_SeleccionFutbol, String nombre, String apellidos, int edad) {
		System.out.println("Constructor con parámetros de SeleccionFutbol");
		this.id_SeleccionFutbol = id_SeleccionFutbol;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	
		/*Este constructor es sin parámetros, salvo el id. La intención es poder generar un objeto vacío 
		 * al que luego se le añadirán los datos con los setters; pero el id es obligatorio, al ser la clave primaria no se puede dejar
		 * en blanco*/
		//Pongo un valor inicial para que no esté todo en null o valores raros
	public SeleccionFutbol(int id_SeleccionFutbol) {
		System.out.println("Constructor sin parámetros de SeleccionFutbol");
		this.id_SeleccionFutbol = id_SeleccionFutbol;
		this.nombre = "";
		this.apellidos = "";
		this.edad = 1;
	}
	
	//toString
		/*Este es el método automático que sirve para imprimir los valores por pantalla; no es el método customizado, pero sirve
		 * para echar un vistazo rápido a los datos de las propiedades de un objeto*/
	//Está hecho a través de Source y retocado por mí
	@Override
	public String toString() {
		System.out.println("toString autogenerado de SeleccionFutbol");
		return "Id=" + id_SeleccionFutbol +"\n" + nombre +"\n" 
				+ apellidos +"\n" + " edad=" + edad ;
		
	}
	
	//Hash y equals
		//Hash es un método autogenerado para codificar los datos de un objeto y mejorar la seguridad
	//Hecho a través de Source
	@Override
	public int hashCode() {
		System.out.println("hashCode autogenerado de SeleccionFutbol");
		return Objects.hash(apellidos, edad, id_SeleccionFutbol, nombre);
	}
		//Equals sirve para comparar dos objetos instanciados de la misma clase y comprobar si son iguales
		//Hecho a través de Source
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals autogenerado de SeleccionFutbol");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SeleccionFutbol other = (SeleccionFutbol) obj;
		return Objects.equals(apellidos, other.apellidos) && edad == other.edad
				&& id_SeleccionFutbol == other.id_SeleccionFutbol && Objects.equals(nombre, other.nombre);
	}
	
	//Otros métodos
	public void concentrarse() {
		System.out.println("concentrarse() de SeleccionFutbol");
	}
	public void viajar() {
		System.out.println("viajar() de SeleccionFutbol");
	}
	
	//Método de impresión customizado
		//Para pasar por pantalla las fichas del personal de la manera que se dice en las especificaciones
	
}
