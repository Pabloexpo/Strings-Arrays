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
public class Validacion_Numero_Entero_Positivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String texto = sc.next();
        validacionNumeroEnteroPositivo(texto);
        
    }
    
    
    public static boolean validacionNumeroEnteroPositivo (String texto) {
        
        return texto.matches("^[0-9]+$");
        /*
        La diferencia entre este (solo positivos) y el de todos los numeros enteros
        radica en que en este método no tenemos la expresion -? que da pie a 
        la inclusión de números negativos
        */
    }
}
