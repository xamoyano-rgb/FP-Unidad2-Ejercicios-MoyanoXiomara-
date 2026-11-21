
package com.mycompany.ambitovariables;

/*
 * Sesión: S11 - Ámbito de las variables
 * Ejercicio: 03 - Traza del contador static
 * Enunciado: Realizar un programa con contador static y agregar una tabla de línea, variables vivas y valor.
 * Autor: Xiomara Alexandra Moyano Fajardo
 * NRC: 37712
 * Carrera: TICS
 * Fecha: 20/11/2026
 */

public class Ej03_TrazaContadorStatic {

    static int contador = 0; // atributo static

    static void contar() {
        contador++;
    }

    public static void main(String[] args) {
        int i; // variable local de main

        for (i = 1; i <= 3; i++) {
            contar();
            System.out.println("Vuelta " + i + ": contador = " + contador);
        }

        System.out.println("Total de llamadas: " + contador);

        /*
         * TRAZA:
         * Linea                  | Variables vivas       | Valor
         * contador = 0           | contador               | 0
         * i = 1                  | contador, i            | 0, 1
         * contar() primera vez   | contador, i            | 1, 1
         * contar() segunda vez   | contador, i            | 2, 2
         * contar() tercera vez   | contador, i            | 3, 3
         * fin del for            | contador, i            | 3, 4
         *
         * La variable contador es static y se comparte.
         * La variable i es local de main y controla el ciclo.
         */
    }
}