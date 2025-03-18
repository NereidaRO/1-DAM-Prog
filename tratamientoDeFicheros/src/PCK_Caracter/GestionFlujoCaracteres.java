/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PCK_Caracter;

/**
 * @since 18/03/2025
 * @author Nereida Rodríguez Orenes 1ºDAM
 */
public class GestionFlujoCaracteres {
    private String ruta;
    
    //Constructores
    public GestionFlujoCaracteres(String ruta) {
        this.ruta = ruta;
    }   
    //getters y setters
    public String getRuta() {
        return ruta;
    }
    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    //toString
    @Override
    public String toString() {
        return "GestionFlujoCaracteres{" + "ruta=" + ruta + '}';
    }
    
    //Métodos de ejemplo
    public void escribirCar(String nombreFichero){}
    public void escribirCarBuffer(String nombreFichero){}
    public void escribirCarArray(String nombreFichero){}
    public void escribirCadena(){}
    public void imprimirCar(){}
    public void leerCar(String nombreFichero){}
    public void leerCarBuffer(String nombreFichero){}
    public void leerArrayCar(char[] array){}
    public void leerLinea(String nombreFichero){}
    public void leerString(String cadena){}
}
