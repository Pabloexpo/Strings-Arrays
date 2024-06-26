/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tema6;

/**
 *
 * @author pablo
 */
import java.util.*;
public class ArrayList {
    public static void main(String[] args) {
        List<Persona> lista = new java.util.ArrayList<Persona>();
        
        lista.add(new Persona(1, 20, "Pablo"));
        lista.add(new Persona(4, 20, "Juan"));
        lista.add(new Persona(9, 20, "Jude"));
        lista.add(new Persona(0, 20, "Miguel"));
        lista.add(new Persona(2, 20, "Pepe"));
        lista.add(new Persona(6, 20, "Pistiño"));
        
        //recorrido por indice
        System.out.println("RECORRIDO FOR POR INDICE");
        for (int i=0; i<lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        
        //recorrido por for each
        System.out.println("RECORRIDO FOR EACH");
        for (Persona pero: lista) {
            System.out.println(pero);
        }
        

        
    }
    
}
