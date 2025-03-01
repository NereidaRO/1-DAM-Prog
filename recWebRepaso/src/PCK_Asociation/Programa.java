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
public class Programa {
    private String nombre;
    private float peso;
    
    //Como la relación es de muchos a muchos, ambas clases tienen una colección de objetos de la otra clase.
    HashSet<Usuario> usuarios = new HashSet<Usuario>();

    public Programa(String nombre, float peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public Programa() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    public void setUsuario(Usuario usuario){
        Iterator<Usuario> iterador = usuarios.iterator();
        Usuario u = null;
        boolean encontrado = false;
        
        while (iterador.hasNext() && !encontrado){
            u = iterador.next();
            if(u.getClave() == usuario.getClave()){
                encontrado = true;
            }
        }
        
        if (encontrado){
             //Esta librería sirve para mostrar mensajes por pantalla
            JOptionPane.showMessageDialog(null, "Este usuario ya ha sido registrado anteriormente");
        }
        else{
            usuarios.add(usuario);
            //No hay un setPrograma porque primero instalas el programa y es éste el que se presenta a usuario (esto no lo he entendido muy bien)
            JOptionPane.showMessageDialog(null, "Usuario " + usuario.getNombre() + " bienvenido al programa " + this.nombre);
        }
        
    }
}
