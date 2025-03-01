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
public class Impresora {
    //La impresora no se va a comunicar con el niño, así que no tiene sentido que lo conozca: Impresora no tiene un atributo Ninyo
    private String marca;
    private String modelo;

    public Impresora(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Impresora() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void imprimir(String texto){
        JOptionPane.showMessageDialog(null, "La impresora " + this.marca + " " + this.modelo + " he sido activada");
        //Con esta librería se pueden crear documentos de texto de verdad, pero vamos a hacerlo simple
        JOptionPane.showMessageDialog(null, texto);
    }
}
