/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PCK_Principal;
import PCK_Acceso.*;
import PCK_Byte.*;
import PCK_Caracter.*;
import PCK_Ficheros.*;
import PCK_Registro.*;

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
        GestionAcceso gestAcc = new GestionAcceso("C:\\Users\\Asus\\Desktop\\ejemplos\\");
        GestionArbolFicheros gestFich = new GestionArbolFicheros("C:\\Users\\Asus\\Desktop\\ejemplos\\");
        GestionTemporalLog gestLog = new GestionTemporalLog("C:\\Users\\Asus\\Desktop\\ejemplos\\");
        byte[] javaMsg = {74, 65, 86, 65};
        byte[] msg2 = {65, 80, 82, 69, 78, 68, 73, 69, 78, 68, 79, 32};
        String cadena1 = "Aprendiendo ";
        String cadena2 = "JAVA";
        char[] arrayChar = "huevos rotos con jamón".toCharArray();
        
        //Pruebas de gestión de registros
        gestLog.addToList(1, "registro-inicial");
        gestLog.addToList(2, "registro-segundo");
        gestLog.addToList(3, "registro-tercero");
        gestLog.addTxt("registros.txt");
        
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
        //flujoChar.leerString(cadena2);
        
        //Pruebas de acceso
        //gestAcc.accederSecuencial("accesoSecuencial.txt", javaMsg, msg2);
        //gestAcc.sobreescrituraDui("fichOrigen.txt", "fichDestino.txt");
        //gestAcc.accesoDirecto("accDirecto.txt");
        
        //Pruebas de ficheros y directorios
        //gestFich.crearFD("directorio", "archivoNuevo.txt");
        //gestFich.eliminarFD("directorio", "archivoNuevo.txt");
        //gestFich.tipoArchivo("escritura1.bin");
        //System.out.println("----");
        //gestFich.tipoArchivo("carpeta");
        //gestFich.buscarPadre("escritura1.bin");
        //gestFich.gestionarPermiso("r", "escritura1.bin");
        //gestFich.gestionarPermiso("w", "escritura1.bin");
        //gestFich.gestionarPermiso("x", "escritura1.bin");
        
        
    }
}
