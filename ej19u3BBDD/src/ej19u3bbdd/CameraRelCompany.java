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
public class CameraRelCompany {
    //1,n y 1,n entre Camera y Company
    //la tabla de BADA tiene las dos PKs como FKs y ambas son parte de la PK de esta tabla
    //Esto es asociación obligatoria entre esta clase con Camera y esta clase con Company
    private Company company;
    private Camera camera;
    
    //En el constructor, se llama a los dos objetos
    //Constructor (parámetros = objetos creados con anterioridad, vacíos o no)
    public CameraRelCompany(Company company, Camera camera) {
        this.company = company;
        this.camera = camera;
    }
    
    //toString debe llamar a los toString de las otras clases
    @Override
    public String toString(){
        return("Camera = " + camera.toString() + "\n" + "Company = " + company.toString());
    }

    //hashCode
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + Objects.hashCode(this.company);
        hash = 31 * hash + Objects.hashCode(this.camera);
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
        final CameraRelCompany other = (CameraRelCompany) obj;
        if (!Objects.equals(this.company, other.company)) {
            return false;
        }
        return Objects.equals(this.camera, other.camera);
    }
}
