
package com.mycompany.s12_metodosbiblioteca;

/*
 * Sesión: S12 - Métodos de biblioteca
 * Ejercicio: 04 - Contar vocales
 * Enunciado: Contar vocales mayúsculas y minúsculas usando String y Character.
 * Autor: Xiomara Alexandra Moyano Fajardo
 * NRC: 37712
 * Carrera: TICS
 * Fecha: 20/11/2026
 */

import java.util.Scanner;

public class Ej04_ContarVocales {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase = entrada.nextLine();

        int vocales = 0;

        for (int i = 0; i < frase.length(); i++) {
            char letra = Character.toLowerCase(frase.charAt(i));

            if (letra == 'a' || letra == 'e' || letra == 'i'
                    || letra == 'o' || letra == 'u') {
                vocales++;
            }
        }

        System.out.println("Cantidad de vocales: " + vocales);

        entrada.close();
    }
}