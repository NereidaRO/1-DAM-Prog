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
 * Composición: se crea el objeto dependiente a la vez que se crea el objeto que lo contiene
 */
public class Procesador {
    //Propiedades
    private String procesadorID;
    private String procesadorMarca;
    
    //getters y setters
    public String getProcesadorID() {
        return procesadorID;
    }

    public String getProcesadorMarca() {
        return procesadorMarca;
    }

    public void setProcesadorMarca(String procesadorMarca) {
        this.procesadorMarca = procesadorMarca;
    }
    
    //constructores
    public Procesador(String procesadorID){
        this.procesadorID = procesadorID;
        this.procesadorMarca = "";
    }
    
    public Procesador (String procesadorID, String procesadorMarca){
        this.procesadorID = procesadorID;
        this.procesadorMarca = procesadorMarca;
    }
    
    //equals y hash
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.procesadorID);
        hash = 97 * hash + Objects.hashCode(this.procesadorMarca);
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
        final Procesador other = (Procesador) obj;
        if (!Objects.equals(this.procesadorID, other.procesadorID)) {
            return false;
        }
        return Objects.equals(this.procesadorMarca, other.procesadorMarca);
    }
    
    //toString
    @Override
    public String toString() {
        return "Procesador{" + "procesadorID=" + procesadorID + ", procesadorMarca=" + procesadorMarca + '}';
    }
}
