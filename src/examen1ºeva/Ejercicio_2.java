package examen1ºeva;

import java.util.Scanner;

/**
 *
 * @author Diego-Eloy DAM 1
 */
public class Ejercicio_2 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        String palabraMaestra;
        String palabraSecundaria;
        String palabraInversa = "";

        String palabra = "";

        System.out.println("INTRODUCE LA PALABRA MAESTRA:");
        palabraMaestra = teclado.next();
        int longitud = palabraMaestra.length();

        for (int i = 0; i <= longitud - 1; i++) {
            palabra += palabraMaestra.charAt(i);
        }

        do {
            System.out.println("INTRODUCE LA PALABRA SECUNDARIA:");
            palabraSecundaria = teclado.next();

        } while (!palabra.contains(palabraSecundaria));

        if (palabraSecundaria.equals(palabraMaestra)) {
            for (int i = longitud - 1; i >= 0; i--) {
                palabraInversa += palabraMaestra.charAt(i);
            }
            System.out.println("");
            System.out.println(palabraInversa);
        } else if (palabra.contains(palabraSecundaria)) {
            System.out.println("");
            System.out.println(longitud);

        }
    }
}
