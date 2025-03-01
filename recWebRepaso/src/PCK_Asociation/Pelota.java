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
public class Pelota {
    private String marca;
    private String modelo;
    
    Futbolista futbolista; //La pelota tiene un dueño

    public Pelota(String marca, String modelo, Futbolista futbolista) {
        this.marca = marca;
        this.modelo = modelo;
        this.futbolista = futbolista;
        futbolista.setPelota(this);
    }
    
    /*Se explica que hay que encadenar su creación de alguna manera, así que al crear una un futbolista, creamos su pelota*/

    public Pelota() {
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
    
    public void presentarse(){
        System.out.println("Soy la pelota " + this.marca + " de modelo " + this.modelo);
        //Para evidenciar la comunicación entre clases:
        futbolista.pelotear();
    }
    
}
