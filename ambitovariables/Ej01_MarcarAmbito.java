
package com.mycompany.ambitovariables;
/*
 * Sesión: S11 - Ámbito de las variables
 * Ejercicio: 01 - Marcar ámbitos
 * Enunciado: Identificar variables locales, de bloque y atributos static.
 * Autor: Xiomara Alexandra Moyano Fajardo
 * NRC: 37712
 * Carrera: TICS
 * Fecha: 20/11/2026
 */

public class Ej01_MarcarAmbito {

    static int llamadas = 0; // atributo static: existe durante toda la ejecucion

    static int cuadrado(int n) { // n: parametro local del metodo
        llamadas++;
        int resultado = n * n; // variable local del metodo
        return resultado;
    }

    public static void main(String[] args) {
        int suma = 0; // variable local de main

        for (int i = 1; i <= 3; i++) { // i: variable de bloque
            int valor = cuadrado(i); // valor: variable de bloque
            suma = suma + valor;
        }

        // System.out.println(i); // ERROR: i solo existe dentro del for
        // System.out.println(resultado); // ERROR: existe dentro de cuadrado

        System.out.println("Suma de cuadrados: " + suma);
        System.out.println("Llamadas al metodo: " + llamadas);
    }
}