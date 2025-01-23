/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package segundotrimestre;

import datosDinamicos.Hashes;
import estructurasDatos.PruebaArrays;
import static estructurasDatos.PruebaArrays.randomArray;
import static estructurasDatos.PruebaArrays.sumatoryArray;
import estructurasDatos.PruebaArrays.*;
import herenciaMultiple.*;
import java.util.Iterator;
/**
 * @since 07/01/2025
 * @author Nereida Rodríguez Orenes
 */
public class SegundoTrimestre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ///////////////////////////////HERENCIA MÚLTIPLE/////////////////////////////////////////////
        PersonalUniversitario manolito = new PersonalUniversitario("001", "Manuel");
        System.out.println("El sueldo neto es: " + manolito.calcularSueldo(1200.67f));
        
        ///////////////////////////////ARRAYS ESTÁTICOS/////////////////////////////////////////////
        
        //Prueba arrays (ej 8.1 y 8.2)
        /*Esto son referencias a las clases porque los métodos son estáticos, pero lo que quiere el profesor es que creemos un objeto para guardar
        *y procesar*/
        int [] arrayPrueba = PruebaArrays.randomArray();
        PruebaArrays.sumatoryArray(arrayPrueba);
        java.util.Arrays.sort(arrayPrueba);
        System.out.println(java.util.Arrays.toString(arrayPrueba));
        
        //Prueba 8.3
        /*String [] listaAlumnos;
        listaAlumnos = numberStudents();*/
        
        //Prueba 8.4
        /*String frase = "Cacao, avellana y azúcar";
        String [] palabras = PruebaArrays.wordMatrix(frase);
        for (String element: palabras){
            System.out.println(element);
        }*/
        
        //Prueba 8.5
        PruebaArrays.randomMax(arrayPrueba);
        PruebaArrays.randomMin(arrayPrueba);
        
        //HashSet
        Hashes hashes = new Hashes();
        Iterator<String> itr = hashes.setNombres.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println(hashes.setNombres);
    }
}
