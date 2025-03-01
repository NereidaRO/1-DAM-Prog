/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PCK_Asociation;

import javax.swing.JOptionPane;

/**
 * @since 27/02/2025
 * @author Nereida Rodríguez Orenes 1ºDAM
 * En enunciado.txt están las instrucciones completas pero resumidamente es seguir este vídeo:
 * https://youtu.be/pGhVoYwCji0
 */
public class Ninyo {
    private String nombre;
    Impresora impresora;

    public Ninyo(String nombre, Impresora impresora) {
        this.nombre = nombre;
        this.impresora = impresora;
    }

    public Ninyo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void usarImpresora(){
       String texto = JOptionPane.showInputDialog("Ingrese texto para imprimir: ");
       impresora.imprimir(texto);
    }
}
