/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PCK_Asociation;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @since 27/02/2025
 * @author Nereida Rodríguez Orenes 1ºDAM
 * En enunciado.txt están las instrucciones completas pero resumidamente es seguir este vídeo:
 * https://youtu.be/pGhVoYwCji0
 */
public class Jefe {
    private String nombre;
    private int DNI; //No es clave primaria en este ejemplo
    //Cada jefe va a tener una colección de empleados, por eso esaremos HashSet
    HashSet<Empleado> empleados = new HashSet<Empleado>();

    public Jefe(String nombre, int DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
    }

    public Jefe() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }
    
    public void contratarEmpleado(Empleado empleado){
        //No se debe aceptar el mismo empleado dos veces
        Iterator<Empleado> iterador = empleados.iterator(); //iterador para recorrer la colección empleados
        Empleado e = null;
        boolean encontrado = false;
        try{
            while(iterador.hasNext() && !encontrado){
                e = iterador.next();
                if(e.getCodigo() == empleado.getCodigo()){
                    encontrado = true;
                }else{}
            }
        
            if(encontrado){
                System.out.println("Este empleado ya ha sido registrado anteriormente");
            }else{
                empleados.add(e);
                empleado.setJefe(this);
                System.out.println("Empleado " + empleado.getNombre() + " ha sido contratado");
            }
        }catch(NullPointerException ex){
            System.out.println("El objeto Empleado e no ha recogido el objeto Empleado que se le ha pasado a la función");
        }
    }
    
}
