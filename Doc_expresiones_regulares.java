/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tema6;

/**
 *
 * @author pablo
 */
public class Doc_expresiones_regulares {
    /*
    Validación de Correo Electrónico:

Copiar
String regexEmail = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
Validación de Números Enteros:

Copiar
String regexInteger = "^-?\\d+$";
Validación de Números Decimales:

Copiar
String regexDecimal = "^-?\\d*\\.\\d+$";
Validación de Números de Teléfono (Formato internacional):

Copiar
String regexPhone = "^\\+(?:[0-9] ?){6,14}[0-9]$";
Validación de Código Postal:

Copiar
String regexPostalCode = "^\\d{5}(?:-\\d{4})?$";
Validación de URLs:

Copiar
String regexURL = "^(https?|ftp)://[^\\s/$.?#].[^\\s]*$";
Validación de Palabras sin Espacios:

Copiar
String regexNoSpaces = "^\\S+$";
Validación de Fechas en Formato YYYY-MM-DD:

Copiar
String regexDate = "^\\d{4}-\\d{2}-\\d{2}$";
Validación de Cadenas que Contienen Solo Letras:

Copiar
String regexLettersOnly = "^[a-zA-Z]+$";
Validación de Cadenas que Contienen Solo Números:

Copiar
String regexNumbersOnly = "^\\d+$";
    */
    
    /*
    
Ejemplos de expresiones regulares:
1. Validar correo electrónico:

Expresión regular: ^[a-zA-Z0-9.!#$%&'*+/=?^_{1,64}@[a-zA-Z0-9-]+(?:.[a-zA-Z0-9-]+)*$`
Ejemplo: correo@ejemplo.com
Explicación:

La expresión regular coincide con:
Una cadena de caracteres alfanuméricos, puntos, signos de exclamación, almohadillas, dólares, porcentajes, asteriscos, barras diagonales, signos de interrogación, igual, guiones bajos y guiones bajos de 1 a 64 caracteres.
Un arroba (@).
Una cadena de caracteres alfanuméricos, guiones y puntos.
Cero o más puntos seguidos de una cadena de caracteres alfanuméricos de 2 a 5 caracteres.
2. Validar número de teléfono:

Expresión regular: ^\d{10}$ (para números de 10 dígitos)
Ejemplo: 9876543210
Explicación:

La expresión regular coincide con:
^ indica el inicio de la cadena.
\d indica un dígito decimal (del 0 al 9).
{10} indica que deben haber 10 dígitos consecutivos.
$ indica el final de la cadena.
3. Validar URL:

Expresión regular: ^(http|https)://([a-zA-Z0-9_\-.]+)(\.[a-zA-Z]{2,5})(:[0-9]+)?(/.*)?$
Ejemplo: https://www.google.com
Explicación:

La expresión regular coincide con:
^ indica el inicio de la cadena.
(http|https) indica que el protocolo puede ser http o https.
:// indica dos barras diagonales después del protocolo.
([a-zA-Z0-9_-.]+) indica un nombre de dominio que puede contener letras, números, guiones bajos, puntos y guiones.
(.[a-zA-Z]{2,5}) indica un sufijo de dominio de 2 a 5 letras.
(:[0-9]+)? indica un puerto opcional (entre paréntesis) que puede contener uno o más dígitos.
(/.∗)? indica una ruta de archivo opcional (entre paréntesis) que puede contener cualquier caracter.
$ indica el final de la cadena.
4. Extraer números de una cadena:

Expresión regular: \d+
Ejemplo: "La casa 123 tiene 4 habitaciones" -> 123 4
Explicación:

La expresión regular coincide con:
\d indica un dígito decimal (del 0 al 9).
indica que debe haber uno o más dígitos consecutivos.
5. Buscar palabras que empiezan con una letra específica:

Expresión regular: ^\b[A-Za-z]\w+\b$
Ejemplo: "Hola Mundo" -> Hola Mundo
Explicación:

La expresión regular coincide con:
^ indica el inicio de la cadena.
\b indica un límite de palabra (espacio, tabulación, etc.).
[A-Za-z] indica la primera letra de la palabra (mayúscula o minúscula).
\w+ indica una o más letras, números o guiones bajos.
\b indica un límite de palabra (espacio, tabulación, etc.).
$ indica el final de la cadena.
6. Validar fecha (formato dd/mm/aaaa):

Expresión regular: ^(0?[1-9]|[12]\d{1}|3[01])/(0?[1-9]|1[012])/[12]\d{3}$
Ejemplo: 01/01/2024
Explicación:

La expresión regular coincide con:
^ indica el inicio de la cadena.
(0?[1-9]|[12]\d{1}|3[01]) indica el día del mes:
0? indica un cero opcional.
[1-9] indica un dígito del 1 al 9
    */
}
