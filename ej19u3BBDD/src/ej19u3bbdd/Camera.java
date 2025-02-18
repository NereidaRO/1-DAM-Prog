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
public class Camera {
   //por votación se trabajará con enteros: milímetros y MPs sin decimales
   private String idCamera;
   private int weight;
   private int megapixels;
   private int width;
   private int height;
   private int depth;
   
   //getters y setters
    public String getIdCamera() {
        return idCamera;
    }
   
    public int getWeight() {
        return weight;
    }

    public int getMegapixels() {
        return megapixels;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getDepth() {
        return depth;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setMegapixels(int megapixels) {
        this.megapixels = megapixels;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }
    
    //Constructores
    public Camera(String idCamera, int weight, int megapixels, int width, int height, int depth) {
        this.idCamera = idCamera;
        this.weight = weight;
        this.megapixels = megapixels;
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    
    public Camera(String idCamera) {
        //Recuerda que, teniendo PK, no puede haber un constructor totalmente vacío
        this.idCamera = idCamera;
        this.weight = 0;
        this.megapixels = 0;
        this.width = 0;
        this.height = 0;
        this.depth = 0;
    }

    //toString
    @Override
    public String toString() {
        return "Camera{" + "idCamera = " + idCamera + ", weight = " + weight + ", megapixels = " + megapixels + ", width = " + width + ", height = " + height + ", depth = " + depth + '}';
    }

    //hashCode
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.idCamera);
        hash = 29 * hash + this.weight;
        hash = 29 * hash + this.megapixels;
        hash = 29 * hash + this.width;
        hash = 29 * hash + this.height;
        hash = 29 * hash + this.depth;
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
        final Camera other = (Camera) obj;
        if (this.weight != other.weight) {
            return false;
        }
        if (this.megapixels != other.megapixels) {
            return false;
        }
        if (this.width != other.width) {
            return false;
        }
        if (this.height != other.height) {
            return false;
        }
        if (this.depth != other.depth) {
            return false;
        }
        return Objects.equals(this.idCamera, other.idCamera);
    }
    
}
