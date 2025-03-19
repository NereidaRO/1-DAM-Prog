/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PCK_Ficheros;

/**
 * @since 18/03/2025
 * @author Nereida Rodríguez Orenes 1ºDAM
 * En esta clase se tratan los ejemplos sobre creación y eliminación de ficheros, así como la utilización del sistema de archivos.
 */
public class GestionArbolFicheros {
    private String ruta;

    //Constructor
    public GestionArbolFicheros(String ruta) {
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
        return "GestionArbolFicheros{" + "ruta=" + ruta + '}';
    }
    
    //Métodos para gestión de ficheros
    public void crearFD(){}
    public void eliminarFD(){}
    public void tipoArchivo(){}
    public void buscarPadre(){}
    public void gestionarPermiso(String opt){}
}
