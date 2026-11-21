
package com.mycompany.argumentosparametros;


/*
 * Sesión: S10 - Argumentos y parámetros
 * Ejercicio: 04 - Sobrecarga de perímetro
 * Enunciado: Crear perimetro(double lado) para cuadrado y perimetro(double a, double b) para rectángulo.
 * Autor: Xiomara Alexandra Moyano Fajardo
 * NRC: 37712
 * Carrera: TICS
 * Fecha: 20/11/2026
 */

import java.util.Locale;

public class Ej04_SobrecargaPerimetro {

    static double perimetro(double lado) {
        return 4 * lado;
    }

    static double perimetro(double a, double b) {
        return 2 * (a + b);
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        System.out.printf("Perimetro del cuadrado: %.2f%n", perimetro(5));
        System.out.printf("Perimetro del rectangulo: %.2f%n", perimetro(4, 6));
    }
}