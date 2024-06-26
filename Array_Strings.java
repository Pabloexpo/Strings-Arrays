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
public class Array_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String [] cadena;
        
        String linea = sc.next();

        cadena = linea.split(",");
        
        for (int i =0; i<cadena.length; i++) {
            System.out.println(cadena [i]);
        }
        
        //vamos a ordenarlo
        
        String aux; 
        int rdo = 0; 
        
        for (int j=0; j<cadena.length; j++) {
            for (int i=0; i<cadena.length-1; i++) {
                if (cadena[i].length()>cadena [i+1].length()){
                
                    aux= cadena [i+1];
                
                    cadena [i+1]= cadena [i];
                
                    cadena [i]= aux;
                }
            }
            
        }
        
         for (int i =0; i<cadena.length; i++) {
            System.out.println(cadena [i]);
        }
        
        
    }
    
}
