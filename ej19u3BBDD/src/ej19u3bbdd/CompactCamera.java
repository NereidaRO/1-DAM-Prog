/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej19u3bbdd;

import java.util.Objects;

/**
 * @author Nereida Rodríguez Orenes 1DAM
 * @since 13/12/2024
 */
public class CompactCamera extends Camera{
    private String optics;
    //nota: en las clases extendidas vamos a poner un "tipo" (compacto o reflex), solo con get, en una clase numerada; sirve como control 
    //(imagínate que el objeto se llama "samsung7", trescientas lineas después no nos vamos a acordar)
    private TypeCamera typeCamera;
    
    //getters y setters
    public String getOptics() {
        return optics;
    }

    public void setOptics(String optics) {
        this.optics = optics;
    }
    
    public TypeCamera getTypeCamera() {
        return typeCamera;
    }

    //Constructores
    public CompactCamera(String optics, String idCamera, int weight, int megapixels, int width, int height, int depth) {
        super(idCamera, weight, megapixels, width, height, depth);
        this.optics = optics;
        this.typeCamera = TypeCamera.COMPACT;
    }

    public CompactCamera(String idCamera) {
        //Recuerda que, teniendo PK, no puede haber un constructor totalmente vacío
        super(idCamera);
        setWeight(0);
        setMegapixels(0);
        setWidth(0);
        setHeight(0);
        setDepth(0);
        this.optics = "";
        this.typeCamera = TypeCamera.COMPACT;
    }

    //toString
    @Override
    public String toString() {
        return "CompactCamera{" + "optics = " + optics + ", typeCamera = " + typeCamera + " idCamera = " + getIdCamera() + '}';
    }

    //hashCode
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + Objects.hashCode(this.optics);
        hash = 19 * hash + Objects.hashCode(this.typeCamera);
        return hash;
    }

    //equals
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
        final CompactCamera other = (CompactCamera) obj;
        if (!Objects.equals(this.optics, other.optics)) {
            return false;
        }
        return this.typeCamera == other.typeCamera;
    }
    
}
