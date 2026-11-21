
package com.mycompany.s12_metodosbiblioteca;

/*
 * Sesión: S12 - Métodos de biblioteca
 * Ejercicio: 03 - Validar contraseña
 * Enunciado: Comprobar que tenga mínimo 8 caracteres, una mayúscula y un dígito usando Character.
 * Autor: Xiomara Alexandra Moyano Fajardo
 * NRC: 37712
 * Carrera: TICS
 * Fecha: 20/11/2026
 */

import java.util.Scanner;

public class Ej03_ValidarContrasena {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese una contrasena: ");
        String contrasena = entrada.nextLine();

        boolean tieneMayuscula = false;
        boolean tieneDigito = false;

        for (int i = 0; i < contrasena.length(); i++) {
            char caracter = contrasena.charAt(i);

            if (Character.isUpperCase(caracter)) {
                tieneMayuscula = true;
            }

            if (Character.isDigit(caracter)) {
                tieneDigito = true;
            }
        }

        if (contrasena.length() >= 8 && tieneMayuscula && tieneDigito) {
            System.out.println("Contrasena valida.");
        } else {
            System.out.println("Contrasena no valida.");
            System.out.println("Debe tener 8 caracteres, una mayuscula y un digito.");
        }

        entrada.close();
    }
}