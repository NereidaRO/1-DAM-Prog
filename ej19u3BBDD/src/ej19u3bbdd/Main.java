/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej19u3bbdd;

/**
 * @author Nereida Rodríguez Orenes 1DAM
 * @since 13/12/2024
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Camera samsung70 = new Camera("56PP", 100, 5, 30, 20, 10);
        Company fotosAtocha = new Company ("94TY", "Fotos Atocha", "Calle Alfonso X 12", 2004, "Madrid");
        CameraRelCompany relation4 = new CameraRelCompany (fotosAtocha, samsung70);
        ReflexCamera nikon666 = new ReflexCamera("BeelZebul", "ID77", 100, 5, 30, 20, 10 );
        CompactCamera compy56 = new CompactCamera ("opt34", "CU98", 100, 5, 30, 20, 10);
        
        CameraRelCompany relation6 = new CameraRelCompany (fotosAtocha, nikon666);
        CameraRelCompany relation8 = new CameraRelCompany (fotosAtocha, compy56);
        
        //Pruebas de visualización
        System.out.println("Objeto samsung70: \n" + samsung70);
        System.out.println("Objeto fotosAtocha: \n" + fotosAtocha);
        System.out.println("Objeto relation4: \n" + relation4);
        System.out.println("Objeto relation6: \n" + relation6);
        System.out.println("Objeto relation8: \n" + relation8);
    }
    
}
