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
public class Empresa {
    private String nombre;
    private int ruc;
    
    HashSet<Trabajador> trabajadores = new HashSet<Trabajador>();

    public Empresa(String nombre, int ruc) {
        this.nombre = nombre;
        this.ruc = ruc;
    }

    public Empresa() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRuc() {
        return ruc;
    }

    public void setRuc(int ruc) {
        this.ruc = ruc;
    }
    
    public void contratar(Trabajador trabajador){
        Iterator<Trabajador> iterador = trabajadores.iterator();
        Trabajador t = null;
        boolean encontrado = false;
        
        while (iterador.hasNext() && !encontrado){
            t = iterador.next();
            if(t.getCodigo() == trabajador.getCodigo()){
                encontrado = true;
            }
        }
        
        if (encontrado){
            JOptionPane.showMessageDialog(null, "Este trabajador había sido contratado anteriormente en la empresa " + this.nombre);
        }
        else{
            trabajadores.add(trabajador);
            JOptionPane.showMessageDialog(null, "El trabajador " + trabajador.getNombre() + " ha sido contratado con el código: " + trabajador.getCodigo());
        }
    
    }
    
    public void solicitarInforme(Trabajador trabajador){
        Iterator<Trabajador> iterador = trabajadores.iterator();
        Trabajador t = null;
        boolean encontrado = false;
        
        while (iterador.hasNext() && !encontrado){
            t = iterador.next();
            if(t.getCodigo() == trabajador.getCodigo()){
                encontrado = true;
            }
        }
        
        if (encontrado){
           JOptionPane.showMessageDialog(null, trabajador.entregarInforme());
        }
        else{
            JOptionPane.showMessageDialog(null, "El trabajador no está en la empresa");
        }
    }
}
