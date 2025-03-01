/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PCK_Asociation;
import java.util.HashSet;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 * @since 27/02/2025
 * @author Nereida Rodríguez Orenes 1ºDAM
 * En enunciado.txt están las instrucciones completas pero resumidamente es seguir este vídeo:
 * https://youtu.be/pGhVoYwCji0
 */
public class Usuario {
    private int clave; //No me queda claro si se va a usar como clave primaria o no
    private String nombre;
    
    //Como la relación es de muchos a muchos, ambas clases tienen una colección de objetos de la otra clase.
    HashSet<Programa> programas = new HashSet<Programa>();

    public Usuario(int clave, String nombre) {
        this.clave = clave;
        this.nombre = nombre;
    }

    public Usuario() {
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Cada clase va a tener su setObjeto; cruzados
    public void instalarPrograma(Programa programa){
        //¿Se ha instalado antes el programa?
        Iterator<Programa> iterador = programas.iterator();
        Programa p = null;
        boolean encontrado = false;
        
        while (iterador.hasNext() && !encontrado){
            p = iterador.next();
            if(p.getNombre().equals(programa.getNombre())){

                encontrado = true;
            }
        }
        
        if(encontrado){
            //Esta librería sirve para mostrar mensajes por pantalla
            JOptionPane.showMessageDialog(null, "Este programa ya ha sido instalado anteriormente");
        }else{
            programas.add(programa);
            programa.setUsuario(this);
            JOptionPane.showMessageDialog(null, "Programa " + programa.getNombre() + " de peso " + programa.getPeso() + " GB instalado correctamente");
        }
    }
}
