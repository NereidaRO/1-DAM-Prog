/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calcPackage;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @since octubre 2024
 * @author Nereida Rodríguez Orenes 1DAM
 * Copia de la clase Calculator, hecha a principio de curso para empezar a aprender Java
 * El objetivo de esta práctica es utilizar un ejercicio viejo para aprender a manejar excepciones
 */
public class Calculator {

    public Calculator() {}
    
    //PRÁCTICA 2: CALCULADORA CON FUNCIONES SIN BUCLE - PARTE DE LA CLASS
    //1. Funciones de operaciones

    public static float sumar(float op1, float op2) {
            float resultado = 0.0f;
            resultado = op1 + op2;
            return resultado;
    }

    public static float restar(float op1, float op2) {
            float resultado = 0.0f;
            resultado = op1 - op2;
            return resultado;
    }

    public static float multiplicar(float op1, float op2) {
            float resultado = 0.0f;
            resultado = op1 * op2;
            return resultado;
    }

    public static float dividir(float op1, float op2) {
                    float resultado = 0.0f;
                    try{
                        resultado = op1 / op2;
                    }
                    catch(ArithmeticException exc1){
                        System.out.println("No se puede dividir entre cero, tu error es: " + exc1.getMessage());
                    }
                    catch(InputMismatchException exc2){
                        System.out.println("Tienes que escecificar dos números, tu error es: " + exc2.getMessage());
                    }
                    
                    if (op2 == 0){
                        throw new ArithmeticException ("No se puede dividir entre cero");
                    }

                    return resultado;
    }
}