/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PCK_Asociation;
import java.util.HashSet;

/**
 * @since 27/02/2025
 * @author Nereida Rodríguez Orenes 1ºDAM
 * En enunciado.txt están las instrucciones completas pero resumidamente es seguir este vídeo:
 * https://youtu.be/pGhVoYwCji0
 */
public class Trabajador {
    private String nombre;
    private int Codigo;
    
    //Es directa, así que, aunque el trabajador puede estar contratado por muchas empresas, no puede mandarles datos; no tiene colección de empresas.

    public Trabajador(String nombre, int Codigo) {
        this.nombre = nombre;
        this.Codigo = Codigo;
    }

    public Trabajador() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }
    
    public String entregarInforme(){
        String informe = "Yo " + this.nombre + " entrego el informe";
        
        return informe;
    }
}
