
package com.mycompany.s12_metodosbiblioteca;

/*
 * Sesión: S12 - Métodos de biblioteca
 * Ejercicio: 02 - Dados que suman 7
 * Enunciado: Realizar 1000 lanzamientos con Random y mostrar conteo y porcentaje de sumas iguales a 7.
 * Autor: Xiomara Alexandra Moyano Fajardo
 * NRC: 37712
 * Carrera: TICS
 * Fecha: 20/11/2026
 */

import java.util.Random;
import java.util.Locale;

public class Ej02_DadosSuma7 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Random azar = new Random();

        int exitos = 0;
        int dado1;
        int dado2;

        for (int i = 1; i <= 1000; i++) {
            dado1 = azar.nextInt(6) + 1;
            dado2 = azar.nextInt(6) + 1;

            if (dado1 + dado2 == 7) {
                exitos++;
            }
        }

        double porcentaje = exitos * 100.0 / 1000;

        System.out.println("Lanzamientos realizados: 1000");
        System.out.println("Veces que sumaron 7: " + exitos);
        System.out.printf("Porcentaje: %.2f%%%n", porcentaje);
    }
}