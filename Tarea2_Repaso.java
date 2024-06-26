/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tema6;

/**
 *
 * Crear una matriz “marco” de tamaño 8x6: 
 * todos sus elementos deben ser 0 salvo los de los bordes que deben ser 1. 
 * Mostrarla
 */
public class Tarea2_Repaso {
    public static void main(String[] args) {
        int [][] matriz = new int [8][6];
        
        //Relleno de la matriz con 1 y 0
        
        for (int i=0; i<matriz.length; i++){
            for (int j=0; j<matriz[j].length; j++){
                if (i==0) { //primera fila
                    System.out.print("1 ");
                } else if (i==matriz.length-1){ //ultima fila
                    System.out.print("1 ");
                } else if (j==0){ //primera columna
                    System.out.print("1 ");
                } else if (j==matriz[j].length-1){ //ultima columna
                    System.out.print("1 ");
                } else{
                    System.out.print("0 ");
                }
            }
            System.out.println("");
        }
    }
    
}
