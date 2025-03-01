/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PCK_Asociation;

/**
 * @since 27/02/2025
 * @author Nereida Rodríguez Orenes 1ºDAM
 * En enunciado.txt están las instrucciones completas pero resumidamente es seguir este vídeo:
 * https://youtu.be/pGhVoYwCji0
 */
public class Futbolista {
    private String nombre;
    private int edad;
    
    Pelota pelota; //Cada futbolista tiene una pelota

    public Futbolista(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Futbolista() {
    }
    
    /*Se explica que hay que encadenar su creación de alguna manera, así que al crear una un futbolista, creamos su pelota*/
    
    public void setPelota(Pelota pelota){
        this.pelota = pelota;
    }
    
    public void saludar(){
        System.out.println("Hola, soy " + this.nombre + " y tengo " + this.edad + " años");
        //Para evidenciar la comunicación entre clases:
        pelota.presentarse();
    }
    
    public void pelotear(){
        System.out.println("Yo " + this.nombre + " estoy jugando con " + pelota.getModelo());
    }
    
}
