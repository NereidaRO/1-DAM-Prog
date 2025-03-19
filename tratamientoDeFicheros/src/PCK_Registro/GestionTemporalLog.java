/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PCK_Registro;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @since 18/03/2025
 * @author Nereida Rodríguez Orenes 1ºDAM
 * Los objetos de esta clase manejarán los que se creen en la clase Registro. Usar en este orden:
 * 1 - constructor
 * 2 - addToList();
 * 3 - addTxt();
 */
public class GestionTemporalLog {
    private String ruta;
    private ArrayList<Registro> registros;

    //Constructor
    public GestionTemporalLog(String ruta){
        this.ruta = ruta;
        this.registros = new ArrayList<>();
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
        return "GestionTemporalLog{" + "ruta=" + ruta + ", registros=" + registros + '}';
    }
    
    //gestión de registros
    public void addToList(int id, String nombre){
        //crear registro
        LocalDateTime fecha = LocalDateTime.now();
        Registro reg = new Registro(id, nombre, fecha);
        System.out.println("Registro creado");
        //añadir objeto Registro a registros
        this.registros.add(reg);
        System.out.println("Registro añadido a la lista");
    }
    
    public void addToList(Registro reg){
        this.registros.add(reg);
        System.out.println("Registro añadido a la lista");
    }

    public void addTxt(String nombreArchivo){
        //añadir los registros del array al txt creado antes
        if(registros.isEmpty()){
            System.out.println("No tienes registros");
        }else{
            Iterator it = registros.iterator();
            try{
                //de esta manera crea el archivo.txt
                FileWriter fw = new FileWriter(ruta + nombreArchivo);
                BufferedWriter bw = new BufferedWriter(fw);
                while(it.hasNext()){
                    //pasar a String y meter en buffer
                    String regi = it.next().toString();
                    System.out.println(regi);
                    bw.write(regi);
                    bw.newLine();
                }
                System.out.println("Registros añadidos correctamente al archivo txt");
                bw.close();
                fw.close();
            }catch(IOException ioe){
                System.out.println(ioe);
            }
        }
    }
}
