/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PCK_Caracter;

import java.io.*;
import java.io.IOException;

/**
 * @since 18/03/2025
 * @author Nereida Rodríguez Orenes 1ºDAM
 * Esta clase contiene los métodos necesarios para los ejemplos de lectura y escritura de archivos de texto (flujo de caracteres).
 * El atributo es la ruta de la carpeta donde crear el archivo; el nombre del archivo que se debe crear se especifica
 * en los propios métodos.
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
    public void escribirCar(String nombreFichero){
        try{
        FileWriter fw = new FileWriter(ruta + nombreFichero);
        fw.write("Ejemplo de flujo de \r\n");
        fw.write("caracteres");
        fw.close();
        }catch(IOException ioe){
            System.out.println(ioe);
        }
    }
    public void escribirCarBuffer(String nombreFichero){
        try{
        FileWriter fw = new FileWriter(ruta + nombreFichero);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Otro ejemplo de flujo de");
        bw.newLine();
        bw.write("caracteres");
        bw.close();
        fw.close();
        }catch(IOException ioe){
            System.out.println(ioe);
        }
    }
    public void escribirCarArray(String nombreFichero){
        try{
        FileWriter fw = new FileWriter(ruta + nombreFichero);
        CharArrayWriter caw = new CharArrayWriter();
        caw.write("JAVA");
        caw.writeTo(fw);
        System.out.println("Éxito");
        caw.close();
        fw.close();
        }catch(IOException ioe){
            System.out.println(ioe);
        }
    }
    public void imprimirCar(String nombreFichero){
        try{
        PrintWriter pw;
        FileWriter fw = new FileWriter(ruta + nombreFichero);
        //En fichero
        pw = new PrintWriter(fw);
        pw.println("Escribiendo en fichero txt...");
        pw.printf("Escribiendo en fichero por %dª vez...\n", 2);
        pw.flush();
        fw.close();
        //En consola
        pw = new PrintWriter(System.out);
        pw.println("Escribiendo en consola con PrintWriter...");
        pw.printf("Escribiendo en consola por %dª vez...\n", 2);
        pw.flush();
        pw.close();
        }catch(IOException ioe){
            System.out.println(ioe);
        }
    }
    public void escribirCadena(String cadena1, String cadena2){
        StringWriter sw = new StringWriter();
        sw.write(cadena1);
        sw.write(cadena2);
        System.out.println("Convirtiendo a String: " + sw.toString());
        System.out.println("En el buffer: " + sw.getBuffer());
    }
    public void leerCar(String nombreFichero){
        try{
        FileReader fr = new FileReader(ruta + nombreFichero);
        int i;
        while((i=fr.read()) != -1){
            System.out.print((char)i);
        }
        System.out.println("\n");
        fr.close();
        }catch(IOException ioe){
            System.out.println(ioe);
        }
    }
    public void leerCarBuffer(String nombreFichero){
        try{
        FileReader fr = new FileReader(ruta + nombreFichero);
        BufferedReader br = new BufferedReader(fr);
        System.out.println("Línea desde buffer: ");
        System.out.println(br.readLine());
        System.out.println("Lectura por bucle: ");
        int i;
        while((i=br.read()) != -1){
            System.out.print((char)i);
        }
        System.out.println("\n");
        br.close();
        fr.close();
        }catch(IOException ioe){
            System.out.println(ioe);
        }
    }
    public void leerLinea(String nombreFichero){
        try{
            FileReader fr = new FileReader(ruta + nombreFichero);
            LineNumberReader lnr = new LineNumberReader(fr);
            System.out.println(lnr.getLineNumber() + " - " + lnr.readLine());
            lnr.setLineNumber(8);
            System.out.println(lnr.getLineNumber() + " - " + lnr.readLine());
            lnr.close();
            fr.close();
        }catch(IOException ioe){
            System.out.println(ioe);
        }
    }
    public void leerArrayCar(char[] array){
        try{
            CharArrayReader car = new CharArrayReader(array);
            car.skip(17);
            int k = 0;
            while((k=car.read()) != -1){
                System.out.print((char)k);
            }
            System.out.print("\n");
        }catch(IOException ioe){
            System.out.println(ioe);
        }
    }
    public void leerString(String cadena){
        try{
            StringReader sr = new StringReader(cadena);
            int c = 0;
            while((c=sr.read()) != -1){
                System.out.print((char)c);
            }
            System.out.print("\n");
        }catch(IOException ioe){
            System.out.println(ioe);
        }
    }
}
