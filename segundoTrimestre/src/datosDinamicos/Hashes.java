/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datosDinamicos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @since 23/01/2025
 * @author Nereida Rodríguez Orenes
 */
public class Hashes {
    public HashSet<String> setNombres = new HashSet<>();
    {
    setNombres.add("Juan");
    setNombres.add(null);
    setNombres.add("Micaela");
    }
    
    //Según chatgpt, esto va a petar... yo no sé qué he copiado --> buscar tutorial
    ArrayList<ArrayList<ArrayList>> array3D = new ArrayList<>();
    {
    array3D.add(new ArrayList<>());
    array3D.add(new ArrayList<>());
    array3D.get(0).add(new ArrayList<>());
    array3D.get(0).add(new ArrayList<>());
    array3D.get(1).add(new ArrayList<>());
    array3D.get(1).add(new ArrayList<>());
    array3D.get(1).add(new ArrayList<>());
    array3D.get(0).get(0).add("Cadena1");
    array3D.get(0).get(1).add(true);
    array3D.get(1).get(0).add("Cadena2");
    array3D.get(1).get(1).add(123);
    array3D.get(1).get(2).add("ç");
    }
}
