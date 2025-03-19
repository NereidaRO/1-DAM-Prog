/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PCK_Acceso;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

/**
 * @since 18/03/2025
 * @author Nereida Rodríguez Orenes 1ºDAM
 * Aquí se tratan los ejemplos de acceso secuencial y directo
 */
public class GestionAcceso {
     private String ruta;

    //Constructor
    public GestionAcceso(String ruta) {
        this.ruta = ruta;
    }

    //Getters y setter
    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    //toString
    @Override
    public String toString() {
        return "GestionAcceso{" + "ruta=" + ruta + '}';
    }

    //Métodos de gestión de acceso
    public void accederSecuencial(String nombreFichero, byte[] array1, byte[] array2 ){
        try{
            //Escritura
            Path fichero = Paths.get(ruta + nombreFichero);
            Files.write(fichero, array1);
            Files.write(fichero, array2, StandardOpenOption.APPEND);
            //Lectura en array de bytes
            System.out.println("Lectura en array de bytes: ");
            byte[] lectura = Files.readAllBytes(fichero);
            for(int i=0; i<lectura.length; i++){
                System.out.print((char)lectura[i]);
            }
            System.out.print("\n");
            //Lectura en colección
            System.out.println("Lectura en colección: ");
            List<String> lineas = Files.readAllLines(fichero);
            System.out.print(lineas.toString());
            System.out.print("\n");
        }catch(IOException ioe){
            System.out.println(ioe);
        }
    }
    public void sobreescrituraDui(String origen, String destino){
        //En este caso el fichero origen ya existe y es un Lorem
        try{
            Path input = Paths.get(ruta + origen);
            Path output = Paths.get(ruta + destino);
            BufferedReader br = Files.newBufferedReader(input, Charset.defaultCharset());
            BufferedWriter bw = Files.newBufferedWriter(output, Charset.defaultCharset(), StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
            String linea;
            while((linea=br.readLine()) != null){
                if(linea.contains("dui")){
                    linea = linea.replaceAll("dui", "***");
                }
                bw.write(linea, 0, linea.length());
                bw.newLine();
            }
            System.out.println("Sobrescrito con éxito");
            br.close();
            bw.close();
        }catch(IOException ioe){
            System.out.println(ioe);
        }
    }
    
    public void accesoDirecto(String nombreArchivo){
        try{
            File f = new File(ruta + nombreArchivo);
            f.delete();
            RandomAccessFile raf = new RandomAccessFile(ruta + nombreArchivo, "rw");
            String s = "0123456789";
            raf.writeChars(s);
            //Sin transformar
            raf.seek(0);
            for(int i=0; i<raf.length()/2; i++){
                System.out.print(""+raf.readChar());
            }
            System.out.print("\n");
            raf.seek(8);
            raf.writeChars("*");
            raf.writeChars("*");
            //Sobreescrito
            raf.seek(0);
            for(int i=0; i<raf.length()/2; i++){
                System.out.print(""+raf.readChar());
            }
            System.out.print("\n");
        }catch(IOException ioe){
            System.out.println(ioe);
        }
    }
}
