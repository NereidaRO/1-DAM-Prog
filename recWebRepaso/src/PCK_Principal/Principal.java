/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PCK_Principal;
import PCK_Asociation.*;
import PCK_Aggregation.*;
import PCK_Composition.*;

/**
 * @since 27/02/2025
 * @author Nereida Rodríguez Orenes 1ºDAM
 * En enunciado.txt están las instrucciones completas pero resumidamente es seguir este vídeo:
 * https://youtu.be/pGhVoYwCji0
 */
public class Principal {
    public static void main(String[] args) {
        //---------CREACIÓN DE OBJETOS---------
        Futbolista f1 = new Futbolista("Juan", 18);
        Pelota p1 = new Pelota("Adidas", "Brazuka", f1);
        
        Jefe jefe = new Jefe("Marcos", 12345678);
        Empleado e1 = new Empleado(1, "Julio", 1500.3f);
        Empleado e2 = new Empleado(2, "Marga", 1507.3f);
        Empleado e3 = new Empleado(3, "Carla", 1508.3f);
        Empleado e4 = new Empleado(1, "Tyron", 1600.3f);
        
        Usuario u1 = new Usuario(111, "Pedro");
        Usuario u2 = new Usuario(222, "Angie");
        Programa pr1 = new Programa("Adobe Illustrator", 5.2f);
        Programa pr2 = new Programa("NetBeans", 4.2f);
        Programa pr3 = new Programa("Eclipse", 5.5f);
        Programa pr4 = new Programa("Slack", 1.2f);
        
        Impresora imp1 = new Impresora("HP", "Infinity");
        Ninyo ninyo1 = new Ninyo("Matías", imp1);
        
        Figura fig1 = new Figura("Goku", 111);
        Figura fig2 = new Figura("Gohan", 222);
        Figura fig3 = new Figura("Bulma", 333);
        Figura fig4 = new Figura("Vegeta", 444);
        Persona pers1 = new Persona(12345678, "Axel");
        
        Empresa emp1 = new Empresa("Don Pepito", 1234);
        Empresa emp2 = new Empresa("Don Jose", 5678);
        Trabajador tr1 = new Trabajador("Marco Aurelio", 111);
        Trabajador tr2 = new Trabajador("Cleopatra", 222);
        Trabajador tr3 = new Trabajador("Julio César", 333);
        Trabajador tr4 = new Trabajador("Asterix", 444);
        Trabajador tr5 = new Trabajador("Obelix", 555);
        
        Ordenador ord1 = new Ordenador("Asus", "Rog Strix");
        Ordenador ord2 = new Ordenador ("HP", "ModeloFancy");
        Raton r1 = new Raton("Logitech", 10f);
        Raton r2 = new Raton("Mars Gaming", 8.3f);
        
        Movil mov1 = new Movil("iPhone", "13 Pro", 50000, "Apple");
        
        //---------PRUEBAS---------
        //Futbolista y Pelota (sin problemas)
      //  f1.saludar();
        
        //Jefe y empleados (ver dudas)
      //  jefe.contratarEmpleado(e4);
      //  jefe.contratarEmpleado(e4);
      
        //Usuarios y programas (sin problemas)
      //  u1.instalarPrograma(pr2);
      //  u1.instalarPrograma(pr2); 
      //  u2.instalarPrograma(pr3);
        
        //Niño e impresora (sin problemas)
      //  ninyo1.usarImpresora();
      
        //Persona y figuras (sin problemas)
      //  pers1.pegarFigurita(fig1);
      //  pers1.pegarFigurita(fig1);
      //  pers1.pegarFigurita(fig4);
      
        //Trabajadores y empresas
       // emp1.contratar(tr2);
       // emp1.contratar(tr2);
       // emp2.contratar(tr5);
       // emp2.contratar(tr4);
       // emp2.contratar(tr3);
        
       // emp1.solicitarInforme(tr5);
       // emp1.solicitarInforme(tr2);
       
       //Agregación: ordenador + ratón
       ord1.enchufaRaton(r2);
       ord2.enchufaRaton("Trust", 11.3f);
       
       //Composición: movil + batería --> arriba
    }
    
}
