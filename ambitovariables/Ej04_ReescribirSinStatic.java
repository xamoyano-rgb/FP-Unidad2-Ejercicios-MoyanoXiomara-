
package com.mycompany.ambitovariables;

/*
 * Sesión: S11 - Ámbito de las variables
 * Ejercicio: 04 - Reescribir sin static
 * Enunciado: Mostrar una versión original comentada y reescribirla usando parámetros y return.
 * Autor: Xiomara Alexandra Moyano Fajardo
 * NRC: 37712
 * Carrera: TICS
 * Fecha: 20/11/2026
 */

public class Ej04_ReescribirSinStatic {

    /*
     * VERSION ORIGINAL:
     *
     * static int numero = 5;
     *
     * static void duplicar() {
     *     numero = numero * 2;
     * }
     *
     * Esta version utiliza una variable static compartida.
     */

    // Nueva version: recibe un valor y devuelve el resultado.
    static int duplicar(int numero) {
        return numero * 2;
    }

    static int sumar(int numero, int cantidad) {
        return numero + cantidad;
    }

    public static void main(String[] args) {
        int valor = 5;

        int resultadoDoble = duplicar(valor);
        int resultadoSuma = sumar(valor, 10);

        System.out.println("Valor original: " + valor);
        System.out.println("Valor duplicado: " + resultadoDoble);
        System.out.println("Resultado de la suma: " + resultadoSuma);
    }
}