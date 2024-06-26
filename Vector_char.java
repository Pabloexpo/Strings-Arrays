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
public class Vector_char {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        //ORDENAMIENTO DE UN VECTOR DE CHAR
        
        char elemento [] = new char [4];
        
        System.out.println("Relleno de vector");
        
        for (int i=0; i<elemento.length;i++){
            elemento [i] = sc.next().charAt(0);
        }
        
        System.out.println("ORDENAMIENTO ALFABÉTICO DEL VECTOR");
        
        char aux; 
        
        for (int i=0; i<elemento.length-1; i++) {
            for (int j=0; j<elemento.length-1; j++){
                if (elemento[j]>elemento[j+1]){
                    aux=elemento[j];
                    elemento[j]=elemento[j+1];
                    elemento[j+1]=aux;
                }
            }
        }
        
        for (int j=0; j<elemento.length; j++){
            System.out.println(elemento[j]);
        }
        
        System.out.println("CODIFICADO DEL CHAR");
        
        for (int i=0; i<elemento.length; i++){
            elemento[i]=(char) (elemento[i]+3);
            System.out.println(elemento[i]);
        }
        
        System.out.println("DESCODIFICADO CESAR");
        
        for (int i=0; i<elemento.length; i++){
            elemento[i]=(char) (elemento[i]-3);
            System.out.println(elemento[i]);
        }
            
    }
    
}
