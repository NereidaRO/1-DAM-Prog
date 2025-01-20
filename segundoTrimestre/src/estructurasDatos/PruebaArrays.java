/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurasDatos;
import java.util.Random;

/**
 * @since 13/01/2025
 * @author Nereida Rodríguez Orenes
 * El objetivo de esta práctica es repasar y entender los arrays (arreglos).
 */
public class PruebaArrays {
    
    //EJ 8.1 Escribe un método que retorne un array de 100 números enteros aleatorios.
    public static int[] randomArray (){
        int [] arrayRetorno;
        Random randomNumbers = new Random();
        arrayRetorno = new int[100];
        for (int i = 0; i<arrayRetorno.length; i++){
            arrayRetorno[i] = randomNumbers.nextInt(100);
            System.out.println( arrayRetorno[i]);
        }
        return(arrayRetorno);
    }
    /*
    * EJ 8.2 Escribe un método que reciba el array generado en 8.1 y lo recorra en orden decreciente, 
    * calculando el sumatorio de todos los números del array y mostrando finalmente dicho valor por pantalla.
    */

    public static void sumatoryArray(int[] randomArray){
        int accum = 0;
        //acumular valores (sumas)
        for (int i=randomArray.length-1; i>=0; i--){
            accum = accum + randomArray[i];
        };
        //SOP
        System.out.println("El sumatorio es: " + accum);
    }
    /*NOTA: bucle foreach
    * for(tipo elemento: array){code}
    */
    /*8.3 Desarrolla un programa que pida por consola el número de alumnos
    * de una clase y que, a continuación solicite los N nombres para almacenarlos en un array. A continuación, 
    * implementa los métodos necesarios para eliminar a un alumno del array a partir de su nombre, 
    * para añadir un alumno nuevo al array de alumno y para ordenar el listado de alumnos.
    */
    public static void countStudents(){}
    public static void orderStudents(){}
    public static void addStudent(){}
    public static void deleteStudent(){}
    //Todo en la misma, usar scanner
    
    /*8.4 Escribe un programa que sea capaz de contar el numero de palabras diferentes que hay en un texto 
    * que se le pasa por argumentos, sin tener en cuenta si están escritas en mayúscula o minúscula.
    */
    public static void countWords(String text){
        String [] words = text.split(" ");
        System.out.println("El texto tiene " + words.length + " palabras");
    }
}
