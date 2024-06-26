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
public class Método_Matriz {
    public void leerMatriz (){ //MÉTODO VACIO
        Scanner sc = new Scanner (System.in);
        int a=0;
        int b=0; //PONED AQUÍ LOS VALORES QUE SE PIDAN 
        int [][] matriz = new int [a][b];
        for (int i=0; i<matriz.length; i++){
            for (int j=0; j<matriz[j].length; j++){
                matriz [i][j]=sc.nextInt();
            }
        }
    }
    
    public static void mostrarMatriz (int [][] matriz) {
        
        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz.length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        
    }
}
