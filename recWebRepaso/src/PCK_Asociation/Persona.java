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
public class Persona {
    
    private int DNI;
    private String nombre;
    
    //Una persona puede tener varias figuras, en un álbum o algo similar
    HashSet<Figura> figuras = new HashSet<Figura>();

    public Persona(int DNI, String nombre) {
        this.DNI = DNI;
        this.nombre = nombre;
    }

    public Persona() {
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    } //En los ejemplos de este vídeo no hay claves primarias per se, pero este tipo de campos podrían serlo

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void pegarFigurita(Figura figura){
        Iterator<Figura> iterador = figuras.iterator();
        Figura fig = null;
        boolean encontrado = false;
        
        while (iterador.hasNext() && !encontrado){
            fig = iterador.next();
            if(fig.getCodigo() == figura.getCodigo()){
                encontrado = true;
            }
        }
        
        if (encontrado){
            JOptionPane.showMessageDialog(null, "Esta figura ya había sido añadida anteriormente");
        }
        else{
            figuras.add(figura);
            figura.mostrarse();
        }
    }
}
