/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compositionvsagreggation;

import java.util.Objects;

/**
 * @since 22/12/2024
 * @author Nereida Rodríguez Orenes 1DAM
 * El objetivo de esta práctica es terminar de entender las diferencias entre composición y agregación mediante un ejemplo.
 * Se tiene una clase Ordenador que tiene una relación de composición con la clase Procesador y una relación de
 * agregación con la clase Teclado.
 */
public class Ordenador {
    //Propiedades
    private String ordenadorID;
    private String ordenadorMarca;
    private Procesador procesador;
    private Teclado teclado;
    
    //Contructores
    public Ordenador(String ordenadorID, String procesadorID){
        this.ordenadorID = ordenadorID;
        this.ordenadorMarca = "";
        this.procesador = new Procesador(procesadorID);
        this.teclado = teclado; //preguntar como añadir una agregación vacía en el constructor correctamente
    }
    
    public Ordenador (String ordenadorID, String ordenadorMarca, String procesadorID, String procesadorMarca, Teclado teclado){
        this.ordenadorID = ordenadorID;
        this.ordenadorMarca = ordenadorMarca;
        this.procesador = new Procesador(procesadorID, procesadorMarca);
        this.teclado = teclado;
    }
    
    //Añadir objetos de agregaciones
    public void addTeclado (Teclado nuevoTeclado){
        //Mi intención es que cada ordenador solo tenga 1 teclado y que esta función añada o sustituya el teclado
        if (teclado != nuevoTeclado){
            teclado = nuevoTeclado;
        }
    }
    
    //getters y setters
    public String getOrdenadorID() {
        return ordenadorID;
    }
    
    public String getOrdenadorMarca() {
        return ordenadorMarca;
    }

    public void setOrdenadorMarca(String ordenadorMarca) {
        this.ordenadorMarca = ordenadorMarca;
    }

    public Procesador getProcesador() {
        return procesador;
    }

    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    } //preguntar si este setter se deja (la relación es composición)

    public Teclado getTeclado() {
        return teclado;
    }

    //equals y hash
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.ordenadorID);
        hash = 71 * hash + Objects.hashCode(this.ordenadorMarca);
        hash = 71 * hash + Objects.hashCode(this.procesador);
        hash = 71 * hash + Objects.hashCode(this.teclado);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ordenador other = (Ordenador) obj;
        if (!Objects.equals(this.ordenadorID, other.ordenadorID)) {
            return false;
        }
        if (!Objects.equals(this.ordenadorMarca, other.ordenadorMarca)) {
            return false;
        }
        if (!Objects.equals(this.procesador, other.procesador)) {
            return false;
        }
        return Objects.equals(this.teclado, other.teclado);
    }
    
    //toString

    @Override
    public String toString() {
        return "Ordenador{" + "ordenadorID=" + ordenadorID + ", ordenadorMarca=" + ordenadorMarca + ", procesador=" + procesador + ", teclado=" + teclado + '}';
    }
    
}
