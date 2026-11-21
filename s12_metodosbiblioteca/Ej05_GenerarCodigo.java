
package com.mycompany.s12_metodosbiblioteca;

/*
 * Sesión: S12 - Métodos de biblioteca
 * Ejercicio: 05 - Generar código de 6 caracteres
 * Enunciado: Generar un código con 3 letras aleatorias y 3 dígitos aleatorios.
 * Autor: Xiomara Alexandra Moyano Fajardo
 * NRC: 37712
 * Carrera: TICS
 * Fecha: 20/11/2026
 */

import java.util.Random;

public class Ej05_GenerarCodigo {

    public static void main(String[] args) {
        Random azar = new Random();

        String letras = "";
        String digitos = "";

        for (int i = 1; i <= 3; i++) {
            char letra = (char) (azar.nextInt(26) + 'A');
            letras = letras + letra;
        }

        for (int i = 1; i <= 3; i++) {
            int numero = azar.nextInt(10);
            digitos = digitos + numero;
        }

        String codigo = letras + digitos;

        System.out.println("Codigo generado: " + codigo);
    }
}