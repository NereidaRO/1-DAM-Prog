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
public class Bateria {
    private int capacidad;
    private String fabricante;

    public Bateria(int capacidad, String fabricante) {
        this.capacidad = capacidad;
        this.fabricante = fabricante;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    
    
}
