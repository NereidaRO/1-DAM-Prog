/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testingPackage;

/**
 * @since 09/02/2025
 * @author Nereida Rodríguez Orenes 1ºDAM
 * NOTA: ahora mismo 1$ = 0.97€
 * En esta práctica se pretende hacer una suite de tests con una clase que convierta euros y dólares
 * y otra que convierta números romanos y arábigos
 */
public class dollarEuro {
    float DOLEURO = 0.97f;
    
    public float dollar2euro(float dollar){
        float euro = 0.0f;
        euro = dollar * DOLEURO;
        return euro;
    }
    
    public float euro2dollar(float euro){
        float dollar = 0.0f;
        dollar = euro/DOLEURO;
        return dollar;
    }
}
