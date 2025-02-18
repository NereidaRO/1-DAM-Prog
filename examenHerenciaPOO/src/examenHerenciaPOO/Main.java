/**
 * @author Jose, profesor de Programación 1DAM
 * @since 29/11/2024
 * La intención de este examen es crear las clases que pedirá Main, con getters, setters, constructores, hash, equals y toString
 * personalizados. Se debe respetar la herencia y las características de la aplicación referidas en el enunciado
 */
package examenHerenciaPOO;

/**
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Examen Control POO Herencia");
		
		
		// Creación de objetos
					
		Futbolista futbolista1 = new Futbolista(2200, null);
		Futbolista futbolista2 = new Futbolista(2200, null);
		
		//futbolista1.setId(2024); // esto debería de provocar un error, el método no debe de estar
		futbolista1.setNombre("Roberto");
		futbolista1.setApellidos("Rodriguez Pizarro");
		futbolista1.setEdad(25);		
		futbolista1.setDemarcacion("Deletantero");
		futbolista1.setDorsal(10);
		
		
		
		futbolista2.setId(2025); // esto debería de provocar un error, el método no debe de estar
		futbolista2.setNombre("Alejandro");
		futbolista2.setApellidos("Romero Correcaminos");
		futbolista2.setEdad(25);
				
		futbolista2.setDemarcacion("Lateral");
		futbolista2.setDorsal(15);

		Entrenador entrenador1 = new Entrenador ("2345");
		entrenador1.setNombre("Roberto");
		entrenador1.setApellidos("Pedraza Rodriguez");
		entrenador1.setEdad(40);
		
		Entrenador entrenador2 = new Entrenador ("6055");
		entrenador2.setNombre("Alberto");
		entrenador2.setApellidos("Pedraza Nuñez");
		entrenador2.setEdad(36);
		
		Masajista masajista1 = new Masajista (1234, "Jualián", "Torres Flores", 43, "Fisioterapeuta", 9);
		// (int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia) 
		
		System.out.println ("\nIntegrantes Selección de fútbol:\n________");
		
		System.out.println ("\nJugadores\n________");
		System.out.println(futbolista1.toString());
		System.out.println(futbolista2.toString());
		
		System.out.println ("\nEntrenadores\n___________");
		System.out.println(entrenador1.toString());
		System.out.println(entrenador2.toString());
		
		System.out.println ("\nMasajistas\n___________");
		System.out.println(masajista1.toString());
		
		
		System.out.println ("Los futbolistas 1 y 2, ¿son iguales? " + futbolista1.equals(futbolista2));
	}

}
