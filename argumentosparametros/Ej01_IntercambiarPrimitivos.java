package com.mycompany.argumentosparametros;


/*
 * Sesión: S10 - Argumentos y parámetros
 * Ejercicio: 01 - Intercambiar primitivos
 * Enunciado: Crear intercambiar(int a, int b) e intentar intercambiar dos variables de main. Explicar si funciona.
 * Autor: Xiomara Alexandra Moyano Fajardo
 * NRC: 37712
 * Carrera: TICS
 * Fecha: 20/11/2026
 */

public class Ej01_IntercambiarPrimitivos {

    static void intercambiar(int a, int b) {
        int temporal = a;
        a = b;
        b = temporal;

        System.out.println("Dentro del metodo:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 20;

        System.out.println("Antes: " + numero1 + " - " + numero2);
        intercambiar(numero1, numero2);
        System.out.println("Despues: " + numero1 + " - " + numero2);

        /*
         * ANALISIS:
          No funciona para cambiar las variables originales, Java pasa los valores primitivos por valor, por eso a y b
         * reciben copias. El cambio se realiza solamente dentro
         * del metodo y numero1 y numero2 conservan sus valores.
         */
    }
}