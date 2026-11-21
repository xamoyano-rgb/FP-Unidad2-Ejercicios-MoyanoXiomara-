
package com.mycompany.ambitovariables;

/*
 * Sesión: S11 - Ámbito de las variables
 * Ejercicio: 02 - Líneas que no compilan
 * Enunciado: Comentar las líneas con error e indicar el mensaje del compilador y su causa.
 * Autor: Xiomara Alexandra Moyano Fajardo
 * NRC: 37712
 * Carrera: TICS
 * Fecha: 20/11/2026
 */

public class Ej02_LineasNoCompilan {

    public static void main(String[] args) {
        int edad = 18;

        if (edad >= 18) {
            int resultado = edad + 1;
            System.out.println("Resultado: " + resultado);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("i = " + i);
        }

        // System.out.println(resultado);
        // Error esperado: cannot find symbol (resultado).
        // Causa: resultado fue declarada dentro del bloque if.

        // System.out.println(i);
        // Error esperado: cannot find symbol (i).
        // Causa: i fue declarada dentro del bloque for.

        int numero = 10;
        // int numero = 20;
        // Error esperado: variable numero is already defined.
        // Causa: no se puede declarar dos veces una variable con el mismo
        // nombre dentro del mismo bloque.

        System.out.println("Edad: " + edad);
        System.out.println("Numero: " + numero);
    }
}