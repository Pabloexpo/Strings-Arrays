/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tema6;

/**
 *
 * @author pablo
 */
public class String_Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        
        sb.append("hola");
        sb.append(" ");
        sb.append("Mundo");
        
        System.out.println(sb.toString()); //imrpimir el sb Hola Mundo
        
        
        System.out.println(sb.insert(5, ",")); //imrpimir Hola, Mundo
        
        sb.setCharAt(0,'M'); //cambiar la h por una m
        
        System.out.println(sb.toString());
        
        System.out.println(sb.reverse());
        
        //conversion de un String en Strbld
        
        String escrito = "Eres tontisimo"; 
        StringBuilder sb1 = new StringBuilder(escrito);
        
        System.out.println(sb1.reverse());
        
        //codificacion 
        char [] vectorCode = new char [sb1.length()];
        
        for (int i=0; i<sb.length(); i++){
            vectorCode [i] = (char) (sb.charAt(i)+3);
            System.out.print(vectorCode [i]);
        }
        
        
        
        
    }
    
}
