/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package compositionvsagreggation;

/**
 * @since 22/12/2024
 * @author Nereida Rodríguez Orenes 1DAM
 * El objetivo de esta práctica es terminar de entender las diferencias entre composición y agregación mediante un ejemplo.
 * Se tiene una clase Ordenador que tiene una relación de composición con la clase Procesador y una relación de
 * agregación con la clase Teclado.
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Crear un par de objetos de cada tipo
        Teclado teclado1 = new Teclado("tec6354");
        Teclado teclado2 = new Teclado ("tec8452", "logitech");
        Procesador procesador1 = new Procesador("pro9999");
        Procesador procesador2 = new Procesador("pro8888", "Intel");
        Ordenador ordenador1 = new Ordenador("ord3456", "pro9234");
        Ordenador ordenador2 = new Ordenador ("orde5555", "HP", "pro7890", "AMD", teclado2);
        /*preguntar qué debo hacer si quiero añadir uno de los procesadores prehechos, 
        ¿añado otro constructor en la clase Ordenador?
        ¿uso un setter?*/
        
        //Pruebas varias
        System.out.println(ordenador1.toString());
        ordenador1.addTeclado(teclado1);
        System.out.println(ordenador2.toString());
        System.out.println("comparación de ordenadores: ");
        ordenador1.equals(ordenador2);
        System.out.println("comparación de teclados: ");
        teclado1.equals(teclado2);
        System.out.println("comparación de procesadores: ");
        procesador1.equals(procesador2);
        System.out.println("Cambio de teclado en ordenador 2: ");
        ordenador2.addTeclado(teclado1);
        System.out.println(ordenador2.toString());
    }
    
}
