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
 * Agregación: se crean los objetos independientemente y luego se juntan.
 */
public class Teclado {
    //Propiedades
    private String tecladoID;
    private String tecladoMarca;
    
    //getters y setters
    public String getTecladoID() {
        return tecladoID;
    }

    public String getTecladoMarca() {
        return tecladoMarca;
    }

    public void setTecladoMarca(String tecladoMarca) {
        this.tecladoMarca = tecladoMarca;
    }
    
    //constructores
    public Teclado (String tecladoID){
        this.tecladoID = tecladoID;
        this.tecladoMarca = "";
    }
    
    public Teclado (String tecladoID, String tecladoMarca){
        this.tecladoID = tecladoID;
        this.tecladoMarca = tecladoMarca;
    }
    
    //equals y hash
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.tecladoID);
        hash = 29 * hash + Objects.hashCode(this.tecladoMarca);
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
        final Teclado other = (Teclado) obj;
        if (!Objects.equals(this.tecladoID, other.tecladoID)) {
            return false;
        }
        return Objects.equals(this.tecladoMarca, other.tecladoMarca);
    }
    //toString
    @Override
    public String toString() {
        return "Teclado{" + "tecladoID=" + tecladoID + ", tecladoMarca=" + tecladoMarca + '}';
    }
}
