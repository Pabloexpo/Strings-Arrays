/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tema6;

/**
 *
 * Realizar un programa que defina un vector llamado “vector_numeros” 
 * de 10 enteros, a continuación lo inicialice con valores aleatorios 
 * (del 1 al 10) y posteriormente muestre en pantalla cada elemento 
 * del vector junto con su cuadrado y su cubo.
 */
public class Repaso1 {
    public static void main(String[] args) {
        int [] vector = new int [10];
        for (int i=0; i<vector.length;i++) {
            vector [i]= (int) (Math.random()*100);
        }
        System.out.println("VECTOR:");
        for (int i=0; i<vector.length; i++) {
            System.out.println(vector [i]);
        }
        System.out.println("CUADRADO DEL VECTOR");
        int [] vectorCuadrado = new int[10];
        
        for (int i=0; i<vector.length; i++) {
             
            vectorCuadrado[i]= vector[i]*vector[i];
            System.out.println("vector ^2 " + i + " = " + vectorCuadrado[i]);
            
        }
        
    }
    
}
