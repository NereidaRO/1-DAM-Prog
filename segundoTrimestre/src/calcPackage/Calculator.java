/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calcPackage;

import java.util.Scanner;

/**
 * @since octubre 2024
 * @author Nereida Rodríguez Orenes 1DAM
 * Copia de la clase Calculator, hecha a principio de curso para empezar a aprender Java
 * El objetivo de esta práctica es utilizar un ejercicio viejo para aprender a manejar excepciones
 */
public class Calculator {
	//PRÁCTICA 2: CALCULADORA CON FUNCIONES SIN BUCLE - PARTE DE LA CLASS
	//1. Funciones de operaciones
		
	public static float sumar(float op1, float op2) {
		float resultado;
		resultado = op1 + op2;
		return resultado;
	}
	
	public static float restar(float op1, float op2) {
		float resultado;
		resultado = op1 - op2;
		return resultado;
	}
	
	public static float multiplicar(float op1, float op2) {
		float resultado;
		resultado = op1 * op2;
		return resultado;
	}
	
	public static float dividir(float op1, float op2) {
			float resultado;
			resultado = op1 * op2;
			return resultado;
	}

	public static void main(String[] args) {
	/*PRÁCTICA 1: CALCULADORA SIN FUNCIONES
		//Variables y objetos scanner --> inicializar
		int operation;
		operation=0;
		Scanner teclado = new Scanner(System.in);
		int numOne;
		numOne=0;
		int numTwo;
		numTwo=0;
		int result;
		result=0;
		
		//Algoritmo principal
		
		//1-Menú
		System.out.println("Elija una operación de la siguiente lista:");
		System.out.println("0 = cerrar");
		System.out.println("1 = sumar");
		System.out.println("2 = restar");
		System.out.println("3 = multiplicar");
		System.out.println("4 = división");
		
		//2-Recoger operación
		operation = teclado.nextInt();
		System.out.println("Ha elegido: "+operation);
		
		if(operation==0) {
			System.out.println("Ha cerrado el programa");
		}else {
			//3-Seleccionar los números a operar
			System.out.println("Elija un número: ");
			numOne = teclado.nextInt();
			System.out.println("El primer número es: "+numOne);
			System.out.println("Elija otro número: ");
			numTwo = teclado.nextInt();
			System.out.println("El segundo número es: "+numTwo);
			//4-Operar
			if(operation==1) {
				result = numOne+numTwo;
				System.out.println("La suma da: "+result);
			}
			else if(operation==2) {
				result = numOne-numTwo;
				System.out.println("La resta da: "+result);
			}
			else if(operation==3) {
				result = numOne*numTwo;
				System.out.println("La multiplicación da: "+result);
			}
			else if(operation==4) {
				result = numOne/numTwo;
				System.out.println("La división da: "+result);
			}
			else {
				System.out.println("No reconozco esa operación");
			}
		}*/
		
		//PRÁCTICA 2: CALCULADORA CON FUNCIONES SIN BUCLE: PARTE DE LA FUNCIÓN MAIN
		//1-Definir variables globales
		int operation;
		operation=0;
		Scanner teclado = new Scanner(System.in);
		float numOne;
	
		float numTwo;
	
		float respuesta;
		respuesta=0;
		
		//2-Menú
		System.out.println("Elija una operación de la siguiente lista:");
		System.out.println("0 = cerrar");
		System.out.println("1 = sumar");
		System.out.println("2 = restar");
		System.out.println("3 = multiplicar");
		System.out.println("4 = división");
		
		//2-Recoger operación
		operation = teclado.nextInt();
		System.out.println("Ha elegido: "+operation);
		
		if(operation==0) {
			System.out.println("Ha cerrado el programa");
		}else {
			//3-Seleccionar los números a operar
			System.out.println("Elija un número: ");
			numOne = Float.parseFloat (teclado.nextLine());//error a arreglar
			System.out.println("El primer número es: "+numOne);
			System.out.println("Elija otro número: ");
			numTwo = Float.parseFloat(teclado.nextLine());//error a arreglar
			System.out.println("El segundo número es: "+numTwo);
			//4-Operar
			if(operation==1) {
				respuesta=sumar(numOne, numTwo);
				System.out.println("El resultado de la suma es: "+respuesta);
			}
			else if(operation==2) {
				respuesta=restar(numOne, numTwo);
				System.out.println("El resultado de la resta es: "+respuesta);
			}
			else if(operation==3) {
				respuesta=multiplicar(numOne, numTwo);
				System.out.println("El resultado de la multiplicación es: "+respuesta);
			}
			else if(operation==4) {
				if(numTwo==0){
					System.out.println("No se puede dividir entre cero");
				}else {
					respuesta=dividir(numOne, numTwo);
					System.out.println("El resultado de la división es: "+respuesta);
				}
			}
			else {
				System.out.println("No reconozco esa operación");
			}
		}
	}
		
}
