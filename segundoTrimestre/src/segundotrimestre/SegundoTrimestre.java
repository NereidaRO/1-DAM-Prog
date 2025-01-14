/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package segundotrimestre;

import estructurasDatos.PruebaArrays;
import static estructurasDatos.PruebaArrays.randomArray;
import static estructurasDatos.PruebaArrays.sumatoryArray;

/**
 * @since 07/01/2025
 * @author Nereida Rodríguez Orenes
 */
public class SegundoTrimestre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Prueba arrays (ej 8.1 y 8.2)
        /*Esto son referencias a las clases porque los métodos son estáticos, pero lo que quiere el profesor es que creemos un objeto para guardar
        *y procesar*/
        int [] arraySumar = PruebaArrays.randomArray();
        PruebaArrays.sumatoryArray(arraySumar);
        java.util.Arrays.sort(arraySumar);
        System.out.println(java.util.Arrays.toString(arraySumar));
    }
}
