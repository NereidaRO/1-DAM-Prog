/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testingPackage;

/**
 * @since 09/02/2025
 * @author Nereida Rodríguez Orenes 1ºDAM
 * NOTA: esto es una librería, por eso no hay main()
 * El objetivo de esta práctica guiada es crear un primer test con JUnit 3
 */
public class classToTest {
    public int multiplica(int a, int b){
        return a*b;
    }
    
    public int factorial(int numero){
        int factorial = numero;
        for (int i = (numero-1); i>1; i--){
            factorial = factorial * i;
        }
        return factorial;
    }
}
