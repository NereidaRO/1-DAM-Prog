/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PCK_Asociation;

/**
 * @since 27/02/2025
 * @author Nereida Rodríguez Orenes 1ºDAM
 * En enunciado.txt están las instrucciones completas pero resumidamente es seguir este vídeo:
 * https://youtu.be/pGhVoYwCji0
 */
public class Empleado {
    //El jefe se va a comunicar con más de un empleado (colección) pero los empleados tienen 1 jefe (objeto único)
    private String nombre;
    private float sueldo;
    private int codigo; //esto es clave primaria
    
    Jefe jefe;

    public Empleado(int codigo, String nombre, float sueldo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.sueldo = sueldo; 
    }

    public Empleado() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
    
    public int getCodigo(){
        return this.codigo;
    }

    public Jefe getJefe() {
        return jefe;
    }

    public void setJefe(Jefe jefe) {
        this.jefe = jefe;
    }
    
}
