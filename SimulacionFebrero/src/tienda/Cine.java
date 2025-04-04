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
public class Cine extends Producto{
    //Propiedades
    String director;
    //Constructores
    public Cine(String director, int idProducto, String nombre, double precioUni, int cantStock) {
        super(idProducto, nombre, precioUni, cantStock);
        this.director = director;
    }
    public Cine(int idProducto) {
        super(idProducto);
    }
    //Getters y Setters
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

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
        System.out.println("ARTÍCULO DE CINE:\n"
                + super.toString()
                + "Director: " + this.director);
        return "ARTÍCULO DE CINE:\n"
                + super.toString()
                + "Director: " + this.director;
    }
}
