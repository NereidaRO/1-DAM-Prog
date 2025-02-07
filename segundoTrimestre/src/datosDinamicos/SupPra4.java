/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datosDinamicos;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * @since 06/02/2025
 * @author Asus
 * Construye un programa, o clase con un método, que pida al usuario una cadena de texto. Acto seguido, solicita
 * la posición de un carácter de la cadena de texto e imprímelo. Controla las posibles excepciones producidas
 * al acceder a posiciones inválidas de la cadena. Si nos encontramos que un valor es “negativo”, 
 * vamos a provocar nosotros mismos una excepción.
 */
public class SupPra4 {
    //Atributos
    Scanner keyboard = new Scanner(System.in);
    //Constructor
    public SupPra4() {}
    //Método de la práctica
    public char charPosition(String cadenaUser){
        System.out.println("Dime qué posición necesitas comprobar: ");
        int positionUser = 0;
        char charUser = ' ';
    
        try{positionUser = keyboard.nextInt(); 
            if (positionUser<0){
                throw new IllegalArgumentException("Las posiciones negativas no existen");
            }
            charUser = cadenaUser.charAt(positionUser);}
        catch(StringIndexOutOfBoundsException exc1){
            System.err.println("La posición que indicas no está en la cadena, tu error es: " + exc1.toString());
        }catch(InputMismatchException exc2){
            System.err.println("Debes introducir 0 o un número positivo, tu error es: " + exc2.toString());
        }catch(IllegalArgumentException exc3){
            System.out.println(exc3.getMessage());
        }
        //Esto mejor en el main u otra llamada de método:
        //System.out.println("El caracter en la posición " + positionUser + " es " + charUser);
        
        return (charUser);
    }
}
