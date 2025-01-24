/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurasDatos;
import static java.util.Arrays.binarySearch;
import static java.util.Arrays.copyOfRange;
import java.util.Random;
import java.util.Scanner;


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
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    
    /* EJ 8.2 Escribe un método que reciba el array generado en 8.1 y lo recorra en orden decreciente, 
    * calculando el sumatorio de todos los números del array y mostrando finalmente dicho valor por pantalla.*/
    public static void sumatoryArray(int[] randomArray){
        int accum = 0;
        //acumular valores (sumas)
        for (int i=randomArray.length-1; i>=0; i--){
            accum = accum + randomArray[i];
        };
        //SOP
        System.out.println("El sumatorio es: " + accum);
    }
    //NOTA: bucle foreach --> for(tipo elemento: array){code}
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    
    /* EJ 8.3 Desarrolla un programa que pida por consola el número de alumnos de una clase y que, a continuación solicite los N nombres para
    * almacenarlos en un array. A continuación, implementa los métodos necesarios para eliminar
    * a un alumno del array a partir de su nombre, para añadir un alumno nuevo al array de alumno y para ordenar el listado de alumnos.*/
    public static String[] numberStudents (){
        //Funciona bien
        String [] studentList;
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuántos alumnos tiene la clase?");
        int numStud = sc.nextInt();
        studentList = new String[numStud];
        for (int i = 0; i<studentList.length; i++){
            System.out.println("Introduce un nombre: ");
            studentList[i] = sc.next();
        }
        return(studentList);
    }
    
    public static String[] addStudent(String [] studentList, String newStudent){
        String [] newStudentList;
        newStudentList = new String [studentList.length+1];
        newStudentList[newStudentList.length-1] = newStudent;
        System.out.println("Lista nueva: " + java.util.Arrays.toString(newStudentList));
        return(newStudentList);
    }
    
    public static String[] removeStudent(String [] studentList, String rmStudent){
        //binary search
        int indexRm = binarySearch(studentList, rmStudent);
        String [] array1 = copyOfRange(studentList, 0, indexRm);
        String [] array2 = copyOfRange(studentList, indexRm, studentList.length -1);
        String [] newStudentList = new String [array1.length + array2.length];
        System.arraycopy(studentList, 0, newStudentList, 0, indexRm);
        System.arraycopy(studentList, indexRm+1, newStudentList, indexRm, newStudentList.length-indexRm);
        return(newStudentList);
    }
    public static void orderStudent(String [] studentList){
        java.util.Arrays.sort(studentList);
        System.out.println("Lista ordenada: " + java.util.Arrays.toString(studentList));
        //Hey: ¿no habría que usar toString?
    }
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    
    /* 8.4 Escribe un programa que sea capaz de contar el número de palabras diferentes que hay en un texto 
    * que se le pasa por argumento, sin tener en cuenta si están escritas en mayúsculas o minúsculas*/
    public static String [] wordMatrix(String texto){
        //Split no tiene en cuenta las mayúsculas ni minúsculas
        String [] words = texto.split(" ");
        return(words);
    }
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    
    /*8.5 (SupPrac 6.1) Sobre el método del 8.1 (vector de 100 números al azar
    Hay que imprimir siempre por pantalla la respuesta*/
    /*a) Conseguir el mayor*/
    public static int randomMax(int[] randomArray){
        int maxValue = -1;
        for (int i=1; i<randomArray.length; i++){
           if (randomArray[i]>randomArray[i-1]){
               maxValue = randomArray[i];
           } else {
               maxValue = randomArray[0];
           }
        }
        System.out.println("El valor máximo es: " + maxValue);
        return(maxValue);
    }
    
    /*b) Conseguir el menor*/
    public static int randomMin(int[] randomArray){
        int minValue = -1;
        for (int i=1; i<randomArray.length; i++){
            if (randomArray[i]<randomArray[i-1]){
               minValue = randomArray[i];
           } else {
              minValue = randomArray[0];
           }
        }
        System.out.println("El valor mínimo es: " + minValue);
        return(minValue);
    }
    
    /*c) Reemplazar un valor por otro (introducidos ambos por parámetros), la primera vez. Devolver 0 (no existe el
    valor a cambiar) o 1 (éxito)*/
    public static int randomChange(int[] randomArray, int oldValue, int newValue){
        System.out.println("Quiere cambiar el número: " + oldValue + " por " + newValue);
        int positionToChange = java.util.Arrays.binarySearch(randomArray, oldValue);
        System.out.println("Binary search devuelve: " + positionToChange);
        //NO ENTRA EN IF --> ver de nuevo binarySearch, devuelve posiciones negativas
        if (positionToChange<randomArray.length && positionToChange>=0){
            randomArray[positionToChange] = newValue;
            System.out.println("Cambio completado");
            return(1);
        }else{
            System.out.println(oldValue + " no existe");
            return(0);
        }
    }
    
    /*d) Hacer lo mismo que en c, llamándolo, para que sustituya todas las veces (mientras no devuelva 0)*/
    public static void randomMultiChange(int[] randomArray, int oldValue, int newValue){
        int changeResult = randomChange(randomArray, oldValue, newValue);
        while(changeResult != 0){
            changeResult = randomChange(randomArray, oldValue, newValue);
        }
        System.out.println ("Cambios terminados");
    }
}
