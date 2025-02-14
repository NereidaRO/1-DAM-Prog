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
    ArrayList<Producto> catalogo = new ArrayList<>(); //¡¡¡¡¡ESTUDIAR ESTO MUCHO!!!!!
    
    //Constructores --> NetBeans solo deja hacer el vacío; tiene sentido, ya que el único atributo es un arrayList
    public Gestion(){}
    
    //Getters y Setters --> no tiene mucho sentido, debería ser algo para mostrar el array completo
    //mostrarArrayList --> esto no lo pide el ejercicio pero lo necesitaré para comprobaciones
    public void mostrarArrayList(){
        for(int i = 0; i<this.catalogo.size(); i++){
            System.out.println("Objeto " + i + ": " + this.catalogo.get(i).toString());
        }
    }

    //otros métodos
    public void introducirProducto(){
        int opcion = 0;
        //atributos para los constructores
        String director = "";
        String genero = "";
        int idProducto = -1;
        String nombre = "";
        double precioUni = -1;
        int cantStock = 0;
        
        //pedir tipo de producto
        System.out.println("¿Qué tipo de producto quieres añadir? \n"
                + "1 - Cine \n"
                + "2 - Música \n"
                + "Salir - cualquier otro número");
        opcion = sc.nextInt();
        sc.nextLine(); //los next de Scanner dejan un \n en el buffer; con esta línea se limpia
        //pedir datos (condicional) --> generar y rellenar el constructor
        if (opcion == 1){
            System.out.println("Va a introducir un producto de cine");
            System.out.println("Director: ");
            director = sc.nextLine();
            System.out.println("ID: ");
            idProducto = sc.nextInt();
            sc.nextLine();
            System.out.println("Nombre: ");
            nombre = sc.nextLine();
            System.out.println("Precio unitario: ");
            precioUni = sc.nextDouble();
            sc.nextLine();
            System.out.println("Stock: ");
            cantStock = sc.nextInt();
            sc.nextLine();
            Cine prodCine = new Cine(director, idProducto, nombre, precioUni, cantStock);
            this.catalogo.add(prodCine); 
        }else if(opcion == 2){
            System.out.println("Va a introducir un producto de música");
            System.out.println("Género: ");
            genero = sc.nextLine();
            System.out.println("ID: ");
            idProducto = sc.nextInt();
            sc.nextLine();
            System.out.println("Nombre: ");
            nombre = sc.nextLine();
            System.out.println("Precio unitario: ");
            precioUni = sc.nextDouble();
            sc.nextLine();
            System.out.println("Stock: ");
            cantStock = sc.nextInt();
            sc.nextLine();
            Musica prodMusica = new Musica(genero, idProducto, nombre, precioUni, cantStock);
            this.catalogo.add(prodMusica);
        }else{
            System.out.println("No va a introducir ningún producto");
            //Tiene que volver al menú principal
        }
    }
    public void mostrarProducto(){
        //función de mostrar TODO el catálogo
        System.out.println("----Estos son los productos que hay registrados:----");
        if(this.catalogo.isEmpty()){
        System.out.println("Aun no tienes productos en el catálogo");
        }else{
            for(int i = 0; i<this.catalogo.size(); i++){
                this.catalogo.get(i).toString();
            }
        }
    }
    public void venderProducto(){
        int idBuscado = -1;
        int udsVenta = 0;
        int nuevoStock = -1;
        Producto prodRecogedor;
        if(this.catalogo.isEmpty()){
            System.out.println("Aun no tienes productos en el catálogo");
        }else{
            //Pedir ID y cantidad a vender
            System.out.println("¿Qué producto quieres vender? Introduce su ID: ");
            idBuscado = sc.nextInt();
            sc.nextLine();
            System.out.println("¿Cuántas unidades quieres vender? ");
            udsVenta = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i<catalogo.size(); i++){
                prodRecogedor = catalogo.get(i);
                if(prodRecogedor.getIdProducto() == idBuscado){
                    //comprobar que la cantidad a vender sea menor o igual que la cantidad en stock
                    if(prodRecogedor.getCantStock() == 0){
                        System.out.println("No queda stock de este producto");
                    }else if(prodRecogedor.getCantStock()<udsVenta){
                        System.out.println("Solo quedan: " + prodRecogedor.getCantStock() + " unidad(es)");
                    }else{
                         //restar cantidad vendida del stock
                         System.out.println("Se procede a hacer la transacción");
                         nuevoStock = prodRecogedor.getCantStock() - udsVenta;
                         prodRecogedor.setCantStock(nuevoStock);
                         System.out.println("Ahora el stock del product es: " + prodRecogedor.getCantStock() + " unidad(es)");
                    }

                }else{
                    System.out.println("No tenemos ese ID");
                }
            }
        }
    }
    public void mostrarCaja(){
        Producto prodRecogedor;
        double precioTotal = 0;
        if(this.catalogo.isEmpty()){
            System.out.println("Aun no tienes productos en el catálogo");
        }else{
            //recorrer array mostrando id - nombre - stock - precio
            for (int i = 0; i<this.catalogo.size(); i++){
                prodRecogedor = this.catalogo.get(i);
                System.out.println("ID:" + prodRecogedor.getIdProducto() + " - Nombre: " + prodRecogedor.getNombre() + " - Stock: " + prodRecogedor.getCantStock() + " - Precio unitario: " + prodRecogedor.getPrecioUni());
                //sacar el sumatorio total de todos los precios
                precioTotal = prodRecogedor.getCantStock() * prodRecogedor.getPrecioUni() + precioTotal;
            }
            //mostrar el sumatorio
            System.out.println("En total, tienes un valor de: " + precioTotal + "€ en productos");
        }
    }
}
