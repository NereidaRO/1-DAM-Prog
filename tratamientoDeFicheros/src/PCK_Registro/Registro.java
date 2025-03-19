/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PCK_Registro;

import java.time.*;

/**
 * @since 18/03/2025
 * @author Nereida Rodríguez Orenes 1ºDAM
 * Los objetos de esta clase representarán registros sencillos con fecha, para trabajar con fechas.
 * Como java.util.Date está obsoleta para la mayoría de casos, usaré java.time.*
 */
public class Registro {
    private int id;
    private String nombre;
    private LocalDateTime fechaHora;

    //En este caso, todos los campos son obligatorios, puesto que no tiene sentido un registro sin ellos
    public Registro(int id, String nombre, LocalDateTime fechaHora) {
        this.id = id;
        this.nombre = nombre;
        this.fechaHora = fechaHora;
    }

    //Getters y setters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    //Esto es importante: hay que meter estos strings a un documento.txt de registros
    @Override
    public String toString() {
        return "Registro{" + "id=" + id + ", nombre=" + nombre + ", fechaHora=" + fechaHora + '}';
    }
}
