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
    
    /*
    * EJ 8.3 Desarrolla un programa que pida por consola el número de alumnos de una clase y que, a continuación solicite los N nombres para
    * almacenarlos en un array. A continuación, implementa los métodos necesarios para eliminar
    * a un alumno del array a partir de su nombre, para añadir un alumno nuevo al array de alumno y para ordenar el listado de alumnos.
    */
    public static void numberStudents (){
        int numStud = 0;
        String [] studentList;
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuántos alumnos tiene la clase?");
        numStud = sc.nextInt();
        studentList = new String[numStud];
        for (int i = 0; i<studentList.length - 1; i++){
            System.out.println("Introduce un nombre: ");
            studentList[i] = sc.nextLine();
        }
        System.out.println("Tu clase es: " + studentList);
    }
    
    public static String[] addStudent(String [] studentList, String newStudent){
        String [] newStudentList;
        newStudentList = new String [studentList.length+1];
        newStudentList[newStudentList.length-1] = newStudent;
        System.out.println("Lista nueva: " + newStudentList);
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
        System.out.println("Lista ordenada: " + studentList);
    }
    
    public static void wordMatrix(){
        //para el martes
    }
}
