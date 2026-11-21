
package com.mycompany.argumentosparametros;

/*
 * Sesión: S10 - Argumentos y parámetros
 * Ejercicio: 03 - Aplicar descuento
 * Enunciado: Crear aplicarDescuento(double[] precios, double pct) que modifique el arreglo e imprimir antes y después.
 * Autor: Xiomara Alexandra Moyano Fajardo
 * NRC: 37712
 * Carrera: TICS
 * Fecha: 20/11/2026
 */

import java.util.Arrays;

public class Ej03_AplicarDescuento {

    static void aplicarDescuento(double[] precios, double pct) {
        for (int i = 0; i < precios.length; i++) {
            precios[i] = precios[i] - precios[i] * pct / 100;
        }
    }

    public static void main(String[] args) {
        double[] precios = {10.00, 25.00, 40.00};
        double descuento = 10;

        System.out.println("Precios antes: " + Arrays.toString(precios));
        aplicarDescuento(precios, descuento);
        System.out.println("Precios despues: " + Arrays.toString(precios));
    }
}