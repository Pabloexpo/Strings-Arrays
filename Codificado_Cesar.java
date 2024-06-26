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
public class Codificado_Cesar {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Introduzca la contraseña");
        
        String entrada = sc.nextLine();
        
        int limEntrada = entrada.length();
        
        char [] passwd = new char [limEntrada];
        
        System.out.println("RELLENO DEL VECTOR:");
        
        for (int i=0; i<limEntrada; i++){
            passwd[i]=entrada.charAt(i);
        }
        
        System.out.println("CODIFICADO DEL ARRAY DE LA PASSWD");
        
        for (int i=0; i<limEntrada; i++){
            if (Character.isSpaceChar(passwd[i])||Character.isUpperCase(passwd[i])){
                System.out.print(passwd[i]); 
            } else if (i!=0 || Character.isLetter(passwd[i])){
                passwd [i]= entrada.charAt(i);
                passwd[i]=(char) (passwd[i]+3);
                System.out.print(passwd[i]); 
            }
            
        }
        System.out.println("");
        
        System.out.println("DESCCODIFICADO DE LA PASSWD");
        
        for (int i=0; i<limEntrada; i++){
            if (passwd[i]==' '|| Character.isUpperCase(passwd[i])){
                passwd [i]= entrada.charAt(i);
                System.out.print(passwd[i]); 
            } else if (passwd[i]!=' '||Character.isLetter(passwd[i])) {
                passwd[i]=(char) (passwd[i]-3);
                System.out.print(passwd[i]); 
            }
        }
    }
    
}
