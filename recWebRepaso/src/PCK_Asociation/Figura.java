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
public class Figura {
    private String personaje;
    private int codigo;

    public Figura(String personaje, int codigo) {
        this.personaje = personaje;
        this.codigo = codigo;
    }

    public Figura() {
    }

    public String getPersonaje() {
        return personaje;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    } //En los ejemplos de este vídeo no hay claves primarias per se, pero este tipo de campos podrían serlo
    
    public void mostrarse(){
        String datos = "Personaje: " + this.personaje + "\n"
                        + "Código: " + this.codigo;
                        
        JOptionPane.showMessageDialog(null, datos);
    }
}
