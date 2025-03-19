/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PCK_Byte;

import java.io.*;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @since 18/03/2025
 * @author Nereida Rodríguez Orenes 1ºDAM
 * Esta clase contiene los métodos necesarios para los ejemplos de lectura y escritura de archivos binarios.
 * Tiene dos constantes para saltar de línea (CR) y volver al inicio de la línea (LF), para facilitar la escritura.
 * El atributo es la ruta de la carpeta donde crear el archivo; el nombre del archivo que se debe crear se especifica
 * en los propios métodos.
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
    public void escribirBinario(String nombreFichero){
        try{
            FileOutputStream fos = new FileOutputStream(ruta + nombreFichero);
            fos.write((byte)'a');
            fos.write((byte)'e');    
            fos.write((byte)'i');
            fos.write(CR);
            fos.write(LF);
            fos.write((byte)'o');
            fos.write((byte)'u');
            fos.write(CR);
            fos.write(LF);    
            fos.close();
            System.out.println("Escritura binaria con éxito");
            }catch(IOException ioe){
                System.out.println(ioe);
            };
    
    }
    public void escribirBinarioBuffer(String nombreFichero){
        try{
            FileOutputStream fos = new FileOutputStream(ruta + nombreFichero);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            bos.write((byte)'A');
            bos.write((byte)'E');    
            bos.write((byte)'I');
            bos.write(CR);
            bos.write(LF);
            bos.write((byte)'O');
            bos.write((byte)'U');
            bos.write(CR);
            bos.write(LF);
            bos.close();
            fos.close();
            System.out.println("Escritura binaria buffer con éxito");
            }catch(IOException ioe){
                System.out.println(ioe);
            };
    }
    public void escribirPrimitivo(String nombreFichero, int num){
        try{
            FileOutputStream fos = new FileOutputStream(ruta + nombreFichero);
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeInt(num);
            dos.close();
            fos.close();
            System.out.println("Escritura de primitivo int con éxito");
            }catch(IOException ioe){
                System.out.println(ioe);
            };
    }
    public void escribirPrimitivo(String nombreFichero, String text){
        try{
            FileOutputStream fos = new FileOutputStream(ruta + nombreFichero);
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeUTF(text);
            dos.close();
            fos.close();
            System.out.println("Escritura de primitivo string con éxito");
            }catch(IOException ioe){
                System.out.println(ioe);
            };
    }
    public void escribirArray(String nombreFichero){
        try{
        FileOutputStream fos = new FileOutputStream(ruta + nombreFichero);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        bos.write(74);
        bos.write((byte)'A');
        bos.write(86);
        bos.write(65);
        bos.writeTo(fos);
        bos.flush();
        System.out.println("Escritura de array de binarios correcta");
        bos.close();
        fos.close();
        }catch(IOException ioe){
            System.out.println(ioe);
        };
    }
    public void imprimirByte(String nombreFichero){
        try{
        PrintStream ps;
        FileOutputStream fos = new FileOutputStream(ruta + nombreFichero);
        //escritura en fichero
        ps = new PrintStream(fos);
        ps.println("Escribiendo en fichero...");
        ps.printf("Escribiendo en fichero por %dª vez", 2);
        ps.close();
        fos.close();
        //escritura en consola
        ps = new PrintStream(System.out);
        ps.println("Escribiendo en consola...");
        ps.printf("Escribiendo en consola por %dª vez", 2);
        ps.close();
        }catch(IOException ioe){
            System.out.println(ioe);
        };
    }
    public void leerBinario(String nombreFichero){
        try{
            FileInputStream fis = new FileInputStream(ruta + nombreFichero);
            int i;
            while ((i=fis.read()) != -1){
                System.out.print((char)i);
            }
            fis.close();
        }catch(IOException ioe){
            System.out.println(ioe);
        };
    }
    public void leerBinarioBuffer(String nombreFichero){
        try{
            FileInputStream fis = new FileInputStream(ruta + nombreFichero);
            BufferedInputStream bis = new BufferedInputStream(fis);
            int i;
            while ((i=bis.read()) != -1){
                System.out.print((char)i);
            }
            bis.close();
            fis.close();
        }catch(IOException ioe){
            System.out.println(ioe);
        };
    }
    public void leerPrimitivo(String nombreFichero, String opt){
        try{
         FileInputStream fis = new FileInputStream(ruta + nombreFichero);
         DataInputStream dis = new DataInputStream(fis);
         if (opt == "text"){
             System.out.println(dis.readUTF());
         }else if(opt=="int"){
             System.out.println(dis.readInt());
         }
         dis.close();
         fis.close();
        }catch(IOException ioe){
            System.out.println(ioe);
        };
    }
    public void leerArrayByte(byte[] array){
        //Esto no produce IOException (aviso de NetBeans) -> no necesario try-catch
        ByteArrayInputStream readArray = new ByteArrayInputStream(array);
        int b = 0;
        while((b=readArray.read()) != -1){
            System.out.println("El carácter ASCII " + b + " es: " + (char)b);
        }
    }
    public void leerByteMultiple (String nombreFichero, byte[] array){
        try{
            ByteArrayInputStream io1 = new ByteArrayInputStream(array);
            FileInputStream io2 = new FileInputStream(ruta + nombreFichero);
            //array + fichero
            SequenceInputStream inst = new SequenceInputStream(io1, io2);
            int j;
            while((j=inst.read()) != -1){
                System.out.print((char)j);
            }
            System.out.print(":)");
            inst.close();
            io1.close();
            io2.close();
        }catch(IOException ioe){
            System.out.println(ioe);
        };
    }
}
