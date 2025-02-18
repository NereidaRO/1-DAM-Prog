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
public class Company {
    private String idCompany;
    private String name;
    private String address;
    private int year;
    private String headquartersTown;

    //getters y setters
    public String getIdCompany() {
        return idCompany;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getYear() {
        return year;
    }

    public String getHeadquartersTown() {
        return headquartersTown;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setHeadquartersTown(String headquartersTown) {
        this.headquartersTown = headquartersTown;
    }

    //Constructores
    public Company(String idCompany, String name, String address, int year, String headquartersTown) {
        this.idCompany = idCompany;
        this.name = name;
        this.address = address;
        this.year = year;
        this.headquartersTown = headquartersTown;
    }

    public Company(String idCompany) {
        //Recuerda que, teniendo PK, no puede haber un constructor totalmente vacío
        this.idCompany = idCompany;
        this.name = "";
        this.address = "";
        this.year = 0;
        this.headquartersTown = "";
    }

    //toString
    @Override
    public String toString() {
        return "Company{" + "idCompany = " + idCompany + ", name = " + name + ", address = " + address + ", year = " + year + ", headquartersTown = " + headquartersTown + '}';
    }

    //hashCode
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.idCompany);
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + Objects.hashCode(this.address);
        hash = 29 * hash + this.year;
        hash = 29 * hash + Objects.hashCode(this.headquartersTown);
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
        final Company other = (Company) obj;
        if (this.year != other.year) {
            return false;
        }
        if (!Objects.equals(this.idCompany, other.idCompany)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.address, other.address)) {
            return false;
        }
        return Objects.equals(this.headquartersTown, other.headquartersTown);
    }
}
