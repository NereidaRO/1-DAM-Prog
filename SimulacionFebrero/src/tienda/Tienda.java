/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tienda;

import java.util.Scanner;

/**
 * @since 10/02/2025
 * @author Nereida Rodríguez Orenes 1ºDAM
 * Simulación de examen de febrero
 */
public class Tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Esta clase tiene el menú y llama a los diferentes métodos de Gestion
        //Atributos
        Scanner sc = new Scanner(System.in);
        int option = 0;
        boolean continuar = true;
        Gestion gestion = new Gestion();
        //Menú --> lo paas el profesor (ejemplo de trabajo cooperativo)
        do {
            System.out.println("\n\nIntroduzca la opción que desea realizar:\n" 
              + "1 - Introducir producto\n" 
              + "2 - Mostrar productos\n" 
              + "3 - Vender productos\n" 
              + "4 - Mostrar caja\n" 
              + "SALIR --> Pulse cualquier otro número\n");
            option = sc.nextInt();
            sc.nextLine();
            switch (option) {
              case 1:
                gestion.introducirProducto();
              case 2:
                gestion.mostrarProducto(); //esta función falla, el resto funciona
                break;
              case 3:
                gestion.venderProducto();
                break;
              case 4:
                gestion.mostrarCaja();
                break;
              default:
                //Se sale del programa
                continuar=false;
            }

          } while(continuar);
    }
    
}
