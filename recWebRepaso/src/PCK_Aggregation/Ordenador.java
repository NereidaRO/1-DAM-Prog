/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PCK_Aggregation;

/**
 * @since 01/03/2025
 * @author Nereida Rodríguez Orenes
 * Como en el vídeo no hay ejemplos de composición ni de agregación, voy a buscar otros
 * El de móvil-batería es hecho desde cero (hay un ejercicio similar de hace tiempo, pero lo perdí por no usar Git)
 * El de ordenador-raton es reciclado de diciembre (lo he cogido de referencia para hacer una versión simple)
 */
public class Ordenador {
    private String marca;
    private String modelo;
    
    //Existen los ratones sin ordenador y los ordenadores sin ratón, así que hay una función específica para añadir el ratón.
    
    Raton raton;

    public Ordenador(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
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
    
    public void enchufaRaton(Raton raton){
        this.raton = raton;
    }
    
    public void enchufaRaton(String modelo, float longitud){
        Raton raton = new Raton(modelo, longitud);
        this.raton = raton;
    }
}
