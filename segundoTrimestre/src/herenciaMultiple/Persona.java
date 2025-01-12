/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciaMultiple;

/**
 * @since 10/01/2025
 * @author Nereida Rodríguez Orenes 1DAM
 * La intención de esta práctica es utilizar el truco de implementar insterfaces para poder fingir herencia múltiple en Java.
 * Persona tiene dos subclases (Becario y Empleado) y estos son los padres de PersonalUniversitario.
 * El método que se va a ir heredando es "calcularSueldo", que permite calcular el sueldo neto a partir del bruto y el IRPF
 * El IRPF será una constante static y final, para probar estas características.
 */
public interface Persona {
    public abstract float calcularSueldo(float sueldoBruto);
}
