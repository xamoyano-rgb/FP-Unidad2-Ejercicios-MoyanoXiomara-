package com.mycompany.argumentosparametros;

/*
 * Sesión: S10 - Argumentos y parámetros
 * Ejercicio: 05 - Predicción de salida
 * Enunciado: Realizar tres llamadas a un método, escribir la salida predicha y compararla con la salida real.
 * Autor: Xiomara Alexandra Moyano Fajardo
 * NRC: 37712
 * Carrera: TICS
 * Fecha: 20/11/2026
 */

public class Ej05_PrediccionSalida {

    static int calcular(int numero) {
        numero = numero * 2;
        numero = numero + 5;
        return numero;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int c = 10;

        /*
         * PREDICCION:
         * calcular(3) = 11
         * calcular(5) = 15
         * calcular(10) = 25
         * Los valores originales de a, b y c no cambian.
         */

        System.out.println("Resultado 1: " + calcular(a));
        System.out.println("Resultado 2: " + calcular(b));
        System.out.println("Resultado 3: " + calcular(c));

        System.out.println("Valores originales: " + a + ", " + b + ", " + c);

        /*
         * SALIDA REAL:
         * Resultado 1: 11
         * Resultado 2: 15
         * Resultado 3: 25
         * Valores originales: 3, 5, 10
         */
    }
}