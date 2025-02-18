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
public class ReflexCamera extends Camera{
    //nota: en las clases extendidas vamos a poner un "tipo" (compact o reflex), solo con get, en una clase numerada; sirve como control 
    //(imagínate que el objeto se llama "samsung7", trescientas lineas después no nos vamos a acordar)
    private String bayonet;
    private TypeCamera typeCamera;

    //getters y setters
    public String getBayonet() {
        return bayonet;
    }

    public void setBayonet(String bayonet) {
        this.bayonet = bayonet;
    }

    public TypeCamera getTypeCamera() {
        return typeCamera;
    }
    
    //Constructores
    public ReflexCamera(String bayonet, String idCamera, int weight, int megapixels, int width, int height, int depth) {
        super(idCamera, weight, megapixels, width, height, depth);
        this.bayonet = bayonet;
        this.typeCamera = TypeCamera.REFLEX;
    }

    public ReflexCamera(String idCamera) {
        //Recuerda que, teniendo PK, no puede haber un constructor totalmente vacío
        super(idCamera);
        setWeight(0);
        setMegapixels(0);
        setWidth(0);
        setHeight(0);
        setDepth(0);
        this.bayonet= "";
        this.typeCamera = TypeCamera.REFLEX;
    }

    //toString
    @Override
    public String toString() {
        return "ReflexCamera{" + "bayonet = " + bayonet + ", typeCamera = " + typeCamera + " idCamera = " + getIdCamera() + '}';
    }   

    //hashCode
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.bayonet);
        hash = 47 * hash + Objects.hashCode(this.typeCamera);
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
        final ReflexCamera other = (ReflexCamera) obj;
        if (!Objects.equals(this.bayonet, other.bayonet)) {
            return false;
        }
        return this.typeCamera == other.typeCamera;
    }
    
}
