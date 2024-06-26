/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tema6;

/**
 *
 * Crear y cargar una tabla de tamaño 3x3, trasponerla y mostrarla. 
 * Intercambiar las filas por las columnas.
 */
public class Traspuesta {
    public static void main(String[] args) {
        int [][] matriz = new int [3][3];
        int [][] matrizT = new int [3][3];
        
        for (int i = 0 ; i < matriz.length; i++) {
            for (int j = 0 ; j < matriz.length; j++){
                matriz [i][j] = (int) (Math.random()*100); 
            }
        }
        
        for (int i = 0 ; i < matriz.length; i++) {
            for (int j = 0 ; j < matriz.length; j++){
                System.out.print(matriz [i][j]+ " "); 
            }
            System.out.println("");
        }
        
        // vector que haga de fila auxiliar
        
        System.out.println("TRASPUESTA");
        
                
        for (int i=0; i<matriz.length; i++){
            for (int j=0; j<matriz.length; j++){
                matrizT [j][i]= matriz [i][j];
            }
        }
        
        
        
        for (int i = 0 ; i < matriz.length; i++) {
            for (int j = 0 ; j < matriz.length; j++){
                System.out.print(matrizT [i][j] + " "); 
            }
            System.out.println("");
        }
        
        System.out.println("INTERCAMBIO DE FILAS ");
        
        int [] aux = matrizT [2];
        matrizT [2] = matrizT[0];
        matrizT[0]= aux;
        
                        
        for (int i=0; i<matriz.length; i++){
            for (int j=0; j<matriz.length; j++){
                System.out.print(matrizT [j][i] +  " ");
            }
            System.out.println();
        }
    }
    
}
