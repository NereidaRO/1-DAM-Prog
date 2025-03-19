/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PCK_Ficheros;

import java.io.*;

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
    public void crearFD(String nombreDir, String nombreArchivo){
        try{
            File dir = new File(ruta + nombreDir);
            dir.mkdir();
            System.out.println("Directorio creado");
            File file = new File(ruta + nombreDir + "\\" + nombreArchivo);
            file.createNewFile();
            System.out.println("Archivo creado");
        }catch(IOException ioe){
            System.out.println(ioe);
        }
    }
    public void eliminarFD(String nombreDir, String nombreArchivo){
        //NetBeans avisa de que no se lanzan excepciones -> no try-catch
        File dir = new File(ruta + nombreDir);
        File file = new File(ruta + nombreDir + "\\" + nombreArchivo);
        file.delete();
        System.out.println("Archivo eliminado");
        dir.delete();
        System.out.println("Directorio eliminado");
        
    }
    public void tipoArchivo(String nombreArchivo){
        File prueba = new File(ruta + nombreArchivo);
        if(prueba.isFile()){
            System.out.println("Es un fichero");
        }else if (prueba.isDirectory()){
            System.out.println("Es un directorio");
        }else{
            System.out.println("Es otra cosa");
        }
    }
    public void buscarPadre(String nombreArchivo){
        File prueba = new File(ruta + nombreArchivo);
        String parent = prueba.getParent();
        System.out.println("El padre es: " + parent);
    }
    public void gestionarPermiso(String opt, String nombreArchivo){
        File gestionable = new File(ruta + nombreArchivo);
        if(opt == "r"){
            gestionable.setReadable(true);
            System.out.println("Se puede leer");
        }else if(opt == "w"){
            gestionable.setWritable(true);
            System.out.println("Se puede escribir");
        }else if(opt == "x"){
            gestionable.setExecutable(true);
            System.out.println("Se puede ejecutar");
        }
    }
}
