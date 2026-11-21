
package com.mycompany.argumentosparametros;

/*
 * Sesión: S10 - Argumentos y parámetros
 * Ejercicio: 02 - Intercambiar posiciones de un arreglo
 * Enunciado: Crear intercambiar(int[] v, int i, int j) para intercambiar dos posiciones.
 * Autor: Xiomara Alexandra Moyano Fajardo
 * NRC: 37712
 * Carrera: TICS
 * Fecha: 20/11/2026
 */

import java.util.Arrays;

public class Ej02_IntercambiarArreglo {

    static void intercambiar(int[] v, int i, int j) {
        int temporal = v[i];
        v[i] = v[j];
        v[j] = temporal;
    }

    public static void main(String[] args) {
        int[] datos = {10, 20, 30, 40};

        System.out.println("Arreglo antes: " + Arrays.toString(datos));
        intercambiar(datos, 0, 2);
        System.out.println("Arreglo despues: " + Arrays.toString(datos));

        /*
         * ANALISIS:
         * Si funciona porque el metodo recibe una copia de la referencia
         * al mismo arreglo. Por eso puede modificar sus elementos y
         * los cambios se observan desde main.
         */
    }
}