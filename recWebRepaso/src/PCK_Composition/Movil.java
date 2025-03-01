/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PCK_Composition;

/**
 * @since 01/03/2025
 * @author Nereida Rodríguez Orenes
 * Como en el vídeo no hay ejemplos de composición ni de agregación, voy a buscar otros
 * El de móvil-batería es hecho desde cero (hay un ejercicio similar de hace tiempo, pero lo perdí por no usar Git)
 * El de ordenador-ratón es reciclado de diciembre (lo he cogido de referencia para hacer una versión simple)
 */
public class Movil {
    private String marca;
    private String modelo;
    
    //El móvil no funciona si no tiene batería, así que esto es una composición --> cuando cree el móvil debo crear la batería
    
    Bateria bateria;

    public Movil(String marca, String modelo, int capacidad, String fabricante) {
        this.marca = marca;
        this.modelo = modelo;
        //Crear batería
        this.bateria = new Bateria(capacidad, fabricante);
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
    
    
    
}
