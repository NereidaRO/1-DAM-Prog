/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PCK_Principal;
import PCK_Asociation.*;

/**
 * @since 27/02/2025
 * @author Nereida Rodríguez Orenes 1ºDAM
 * En enunciado.txt están las instrucciones completas pero resumidamente es seguir este vídeo:
 * https://youtu.be/pGhVoYwCji0
 */
public class Principal {
    public static void main(String[] args) {
        //CREACIÓN DE OBJETOS
        Futbolista f1 = new Futbolista("Juan", 18);
        Pelota p1 = new Pelota("Adidas", "Brazuka", f1);
        Jefe jefe = new Jefe("Marcos", 12345678);
        Empleado e1 = new Empleado(1, "Julio", 1500.3f);
        Empleado e2 = new Empleado(2, "Marga", 1507.3f);
        Empleado e3 = new Empleado(3, "Carla", 1508.3f);
        Empleado e4 = new Empleado(1, "Tyron", 1600.3f);
        
        //PRUEBAS
        //Futbolista y Pelota
      //  f1.saludar();
        
        //Jefe y empleados
        jefe.contratarEmpleado(e4);
        jefe.contratarEmpleado(e4);
    }
    
}
