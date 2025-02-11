/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testingPackage;

/**
 * @since 09/02/2025
 * @author Nereida Rodríguez Orenes
 * En esta práctica se pretende hacer dos métodos para pasar de una medida a otra, así como sus tests
 */

public class fahrenheitCelsius {
    float CONVERT = 1.8f;
    float CONVERT2 = 32.0f;
    
    public float FtoC(float F){
        float C = 0.0f;
        C = (F-CONVERT2)/CONVERT;
        return C;
    };
    
    public float CtoF(float C){
        float F = 0.0f;
        F = C*CONVERT+CONVERT2;
        return F;
    }
}
