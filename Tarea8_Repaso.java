/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tema6;

/**
 *
 *  Buscar la presencia de al menos un dígito numérico en una cadena y 
 * mostrar su posición.
 */
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Tarea8_Repaso {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        //System.out.println("Introduce un texto:");
        
        String texto = sc.nextLine();
        
        String texto2 = "Tengo 5 casas y 4 coches";
        
        Pattern p = Pattern.compile("[0-9]+");
        
        Matcher m = p.matcher(texto);
        
        
        while (m.find()){
            System.out.println("Se encuentra el valor " + m.group() + 
                    " en la posición " + m.start() + " y la posición "+ 
                    m.end());
            
             
        }
    }
    

}
