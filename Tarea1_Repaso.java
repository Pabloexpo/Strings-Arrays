/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tema6;

/**
 *
 * @author Leer dos series de 10 enteros, que estarán ordenados crecientemente. 
 * Copiar (fusionar) las dos tablas en una tercera, de forma que sigan ordenados.
 */
import java.util.*;
public class Tarea1_Repaso {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
    
        int [] vector = new int [10]; 
    
        int [] vector2 = new int [10]; 
    
        int [] vector3 = new int [20]; 
        System.out.println("PRIMER VECTOR:");
    
        for (int i=0; i<vector.length; i++){
            vector[i]= (int) (Math.random()*100);
            System.out.println(vector[i]);
            
        }
        
        System.out.println("");  
        System.out.println("SEGUNDO VECTOR");
        for (int i=0; i<vector2.length; i++){
            vector2[i]= (int) (Math.random()*100);
            System.out.println(vector2[i]);
            
        }
        System.out.println("");
        System.out.println("SUMA DE VECTORES");
        
        for (int i=0; i<vector2.length; i++){
            vector3[i]=vector[i];
        }
        
        for (int j=0; j<10; j++){
                vector3[j+10]=vector2[j];
        }
        
        for (int i = 0; i<vector3.length; i++){
            System.out.println(vector3[i]);
        }
        int aux; 
        
        //ORDEN POR BURBUJA
        
        for (int i=0; i<vector3.length-1; i++){
            for (int j=0; j<vector3.length-1; j++){
                if (vector3[j+1]<vector3[j]){
                    aux = vector3[j];
                    vector3[j]=vector3[j+1];
                    vector3[j+1]=aux;
                }
            }
        }
        System.out.println("");
        System.out.println("ARRAY ORDENADO.");
        System.out.println("");
        for (int i=0; i<vector3.length;i++){
            System.out.println(vector3[i]);
        }
        
 
    
}
    
}
