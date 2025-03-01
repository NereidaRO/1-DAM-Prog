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
 * El de ordenador-ratón es reciclado de diciembre (lo he cogido de referencia para hacer una versión simple)
 */
public class Raton {
    private String modelo;
    private float longitud;
    
     //Existen los ratones sin ordenador y los ordenadores sin ratón, así que hay una función específica para añadir el ratón en Ordenador.

    public Raton(String modelo, float longitud) {
        this.modelo = modelo;
        this.longitud = longitud;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getLongitud() {
        return longitud;
    }

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }
}
