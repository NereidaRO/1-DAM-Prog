/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PCK_Byte;

/**
 * @since 18/03/2025
 * @author Nereida Rodríguez Orenes 1ºDAM
 */
public class GestionFlujoBytes {
    //Constantes
    byte CR = 13;
    byte LF = 10;
    //Atributos
    private String ruta;
    //Constructores
    public GestionFlujoBytes(String ruta) {
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
        return "GestionFlujoBytes{" + "CR=" + CR + ", LF=" + LF + ", ruta=" + ruta + '}';
    }
    //Métodos de ejemplo
    public void escribirBinario(String nombreFichero){}
    public void escribirBinarioBuffer(String nombreFichero){}
    public void escribirPrimitivo(String nombreFichero, int num){}
    public void escribirPrimitivo(String nombreFichero, String text){}
    public void escribirArray(String nombreFichero){}
    public void imprimirByte(String nombreFichero){}
    public void leerBinario(String nombreFichero){}
    public void leerBinarioBuffer(String nombreFichero){}
    public void leerPrimitivo(String nombreFichero){}
    public void leerArrayByte(byte[] array){}
    public void leerByteMultiple (){}
}
