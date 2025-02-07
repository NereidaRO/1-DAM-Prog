/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datosDinamicos;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @ since 03/02/2025
 * @author Nereida Rodríguez Orenes 1ºDAM
 * La intención de esta práctica es crear un método que pase un array fijo a uno dinámico y otro que pase de uno dinámico a uno fijo.
 */
public class FijoDinamico {
    //Suponiendo que desde main o donde toque nos pasan los arrays... (vamos a trabajar con arrays de enteros)
    public ArrayList<Integer> fijoADinamico(int[] arrayFijo){
        //Recojo por parámetros el array fijo
        System.out.println("De array fijo a array dinámico");
        System.out.println("El array fijo es: " + Arrays.toString(arrayFijo));
        //Creo un array dinámico del mismo tamaño
        ArrayList<Integer> arrayDinamico = new ArrayList<>();
        //Paso uno a uno los valores (el for es solo menor que, por el outOfBound)
        for(int i = 0; i<arrayFijo.length; i++){
           arrayDinamico.add(arrayFijo[i]);
        }
        //Devuelvo el array dinámico
        System.out.println("El array dinámico es: " + arrayDinamico.toString());
        return(arrayDinamico);
    }
    public int[] dinamicoAFijo(ArrayList<Integer> arrayDinamico){
        //Recojo por parámetros el array dinámico
        System.out.println("De array dinámico a array fijo");
        System.out.println("El array dinámico es: " + arrayDinamico.toString());
        //Creo un array fijo del mismo tamaño
        int [] arrayFijo = new int[arrayDinamico.size()];
        //Paso uno a uno los valores
        for (int i = 0; i<arrayDinamico.size(); i++){
            arrayFijo[i] = arrayDinamico.get(i);
        }
        //Devuelvo el array fijo
        System.out.println("El array fijo es: " + Arrays.toString(arrayFijo));
        return (arrayFijo);
    }

    public FijoDinamico() {
    }
    
    
}
