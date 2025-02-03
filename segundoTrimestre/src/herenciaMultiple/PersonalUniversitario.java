/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciaMultiple;

import java.util.Objects;

/**
 * @since 10/01/2025
 * @author Nereida Rodríguez Orenes 1DAM
 * La intención de esta práctica es utilizar el truco de implementar insterfaces para poder fingir herencia múltiple en Java.
 * Persona tiene dos subclases (Becario y Empleado) y estos son los padres de PersonalUniversitario.
 * El método que se va a ir heredando es "calcularSueldo", que permite calcular el sueldo neto a partir del bruto y el IRPF
 * El IRPF será una constante static y final, para probar estas características.
 */
public class PersonalUniversitario implements Empleado, Becario{
    private String id;
    private String nombre;
    public static final float IRPF = 0.20f;
    
    //Constructores
    public PersonalUniversitario(String id, String nombre){    
        this.id = id;
        this.nombre = nombre;
    }

    public PersonalUniversitario(String id) {
        this.id = id;
    }
    
    //Getters y setters
    public String getId() {    
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {    
        this.nombre = nombre;
    }
    
    //hash y equals
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.id);
        hash = 67 * hash + Objects.hashCode(this.nombre);
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
        final PersonalUniversitario other = (PersonalUniversitario) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }

    //toString
    @Override    
    public String toString() {
        return "PersonalUniversitario{" + "id=" + id + ", nombre=" + nombre + '}';
    }
    
    //otros métodos
    @Override
    public float calcularSueldo(float sueldoBruto) {
        float sueldoNeto;
        sueldoNeto = sueldoBruto - (sueldoBruto*IRPF);
        return (sueldoNeto);
    }
}
