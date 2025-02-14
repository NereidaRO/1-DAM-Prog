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
        int option;
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        Gestion gestion = new Gestion();
        //Menú
        gestion.menu();
        option = sc.nextInt();
        sc.nextLine(); //los next de Scanner dejan un \n en el buffer; con esta línea se limpia
        
        switch (option){
            case 1:
                gestion.introducirProducto();
                gestion.menu();
            case 2:
                gestion.mostrarProducto();
                gestion.menu();
            case 3:
                gestion.venderProducto();
                gestion.menu();
            case 4:
                gestion.mostrarCaja();
                gestion.menu();
            default:
                System.out.println("Ha salido del programa");
                break;
        }
    }
    
}
