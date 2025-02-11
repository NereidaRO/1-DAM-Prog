/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * @since 10/02/2025
 * @author Nereida Rodríguez Orenes 1ºDAM
 * Simulación de examen de febrero
 */
public class Gestion {
    //Propiedades
    Scanner sc = new Scanner(System.in);
    ArrayList catalogo = new ArrayList<Producto>();
    //Constructores --> NetBeans solo deja hacer el vacío; tiene sentido, ya que el único atributo es un array
    public Gestion(){}
    
    //Getters y Setters --> no tiene mucho sentido, debería ser algo para mostrar el array completo
    //toString --> esto no lo pide el ejercicio pero lo necesitaré para comprobaciones
    public void mostrarCatalogo(){
        for(int i = 0; i<catalogo.size(); i++){
            System.out.println("Objeto " + i + ": " + catalogo.get(i).toString());
        }
    }

    //otros métodos
    public void introducirProducto(){
        int opcion = 0;
        opcion = sc.nextInt();
        //pedir tipo de producto
        System.out.println("¿Qué tipo de producto quieres añadir? \n"
                + "1 - Cine \n"
                + "2 - Música \n"
                + "Salir - cualquier otro número");
        
        //pedir datos (condicional) --> generar y rellenar el constructor
        if (opcion == 1){
            System.out.println("Va a introducir un producto de cine");
            
            //Cine prodCine = new Cine(String director, int idProducto, String nombre, double precioUni, int cantStock);
            
        }else if(opcion == 2){
            System.out.println("Va a introducir un producto de música");
        }else{
            System.out.println("No va a introducir ningún producto");
        }
        
    }
    public void mostrarProducto(){}
    public void venderProducto(){}
    public void mostrarCaja(){}
}
