/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tema6;

/**
 *
 *  * Valida si una cadena es un numero entero
 * @param texto String que contiene el valor a validar
 * @return True = es un numero entero
 */
import java.lang.*;
public class Expresiones_Regulares {
    public static void main(String[] args) {
        String ejemplo= "123"; 
        
        boolean esNumeroEntero = validaNumEntero(ejemplo); 
        
        if (esNumeroEntero==true) {
            System.out.println("El número es entero.");
        } else {
            System.out.println("El número no es entero.");
        }
    }
    
    public static boolean validaNumEntero (String texto) {
    return texto.matches ("^-?[0-9]+$");
}
}


