/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda;

/**
 * @since 10/02/2025
 * @author Nereida Rodríguez Orenes 1ºDAM
 * Simulación de examen de febrero
 */
public class Producto {
    //Propiedades
    int idProducto;
    String nombre;
    double precioUni;
    int cantStock;
    boolean disponible;
    
    //Constructores
    public Producto(int idProducto, String nombre, double precioUni, int cantStock) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precioUni = precioUni;
        this.cantStock = cantStock;
        //El booleano "disponible" no se pone porque su valor depende de cantStock
    }
    
    public Producto(int idProducto) {
        this.idProducto = idProducto;
        //Una clave primaria nunca puede estar vacía
    }
    
    //Getters y Setters
    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioUni() {
        return precioUni;
    }

    public void setPrecioUni(double precioUni) {
        this.precioUni = precioUni;
    }

    public int getCantStock() {
        return cantStock;
    }

    public void setCantStock(int cantStock) {
        this.cantStock = cantStock;
    }
    
    //tratamiento del booleano
    public boolean isDisponible() {
        disponible = false;
        if (cantStock>0){
            disponible = true;
        }
        return disponible;
    }

    //toString
    //Tengo que devolver un String para poder hacer el Override, pero el ejercicio
    //quiere un mensaje por pantalla, así que he usado un print.
    @Override
    public String toString() {
        System.out.println(
        "PRODUCTO:\n"
                + "ID: " + this.idProducto + "\n"
                + "Nombre: " + this.nombre + "\n"
                + "Precio unidad: " + this.precioUni + "€ \n"
                + "En stock: " + this.cantStock + "\n"
        );
        return "PRODUCTO:\n"
                + "ID: " + this.idProducto + "\n"
                + "Nombre: " + this.nombre + "\n"
                + "Precio unidad: " + this.precioUni + "€ \n"
                + "En stock: " + this.cantStock + "\n";
    }
}
