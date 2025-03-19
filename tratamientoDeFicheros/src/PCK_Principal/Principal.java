/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PCK_Principal;
import PCK_Byte.*;
import PCK_Caracter.*;

/**
 * @since 18/03/2025
 * @author Nereida Rodríguez Orenes 1ºDAM
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creación de objetos
        GestionFlujoBytes flujoByte = new GestionFlujoBytes("C:\\Users\\Asus\\Desktop\\ejemplos\\");
        GestionFlujoCaracteres flujoChar = new GestionFlujoCaracteres("C:\\Users\\Asus\\Desktop\\ejemplos\\");
        byte[] javaMsg = {74, 65, 86, 65};
        byte[] msg2 = {65, 80, 82, 69, 78, 68, 73, 69, 78, 68, 79, 32};
        String cadena1 = "Aprendiendo ";
        String cadena2 = "JAVA";
        char[] arrayChar = "huevos rotos con jamón".toCharArray();
        
        //Pruebas con bytes (escritura)
        //flujoByte.escribirBinario("escritura1.bin");
        //flujoByte.escribirBinarioBuffer("escrituraBuffer1.bin");
        //flujoByte.escribirPrimitivo("primitivoString.bin", "cadena prueba");
        //flujoByte.escribirPrimitivo("primitivoInt.bin", 22);
        //flujoByte.escribirArray("arrayBinarios.bin");
        //flujoByte.imprimirByte("printByte.bin");
        
        //Pruebas con bytes (lectura)
        //flujoByte.leerBinario("escritura1.bin");
        //flujoByte.leerBinarioBuffer("escrituraBuffer1.bin");
        //flujoByte.leerPrimitivo("primitivoString.bin", "text");
        //flujoByte.leerPrimitivo("primitivoInt.bin", "int"); 
        //flujoByte.leerArrayByte(javaMsg);
        //flujoByte.leerByteMultiple("arrayBinarios.bin", msg2);
        
        //Pruebas con caracteres (escritura)
        //flujoChar.escribirCar("escrituraCar1.txt");
        //flujoChar.escribirCarBuffer("escrituraCarBuffer.txt");
        //flujoChar.escribirCarArray("carArray.txt");
        //flujoChar.imprimirCar("imprimirCar.txt");
        //flujoChar.escribirCadena(cadena1, cadena2);
        
        //Pruebas con caracteres (lectura)
        //flujoChar.leerCar("escrituraCar1.txt");
        //flujoChar.leerCarBuffer("escrituraCarBuffer.txt");
        //flujoChar.leerLinea("escrituraCar1.txt");
        //flujoChar.leerArrayCar(arrayChar);
        flujoChar.leerString(cadena2);
    }
}
