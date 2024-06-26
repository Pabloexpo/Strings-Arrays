/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tema6;

/**
 *
 * @author pablo
 */
public class Tema6 {

    public static void main(String[] args) {
        String c = "1.2"; 
        
        /*double n=3.3; 
        double m; 
        float a =3.3f; 
        String salida= String.format("conversion: %,2f €", n);
        System.out.println(salida);
        
       
        try {
            

            
  
            /*n=Double.valueOf(c).doubleValue();
            m=Double.valueOf(n); 
            System.out.println(n);
            System.out.println(m);
            
            if (n>3){
                System.out.println(n +" no es mayor");
            } else {
                System.out.println("No es mayor");
            }
            
            if (m>3){
                System.out.println(m +" no es mayor");
            } else {
                System.out.println("No es mayor");
            }*/
       /* } catch (Exception e) {
            System.out.println("No se puede");
        } */
       
       
       StringBuilder cadena = new StringBuilder("Hooooola"); 
       cadena.delete(4, 5); 
       cadena.append("!");
       cadena.insert(0, "¡"); 
       System.out.println(cadena);
    }
}
