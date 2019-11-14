package examen1ºeva;

import java.util.Scanner;

/**
 *
 * @author Diego_Eloy DAM 1
 */
public class Ejercicio_1 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        final double REFRESCO = 1.20;
        final double CAFE = 1;
        final double BOCADILLO = 3.20;
        final double MENU = 9.50;
        int opcion;

        int numeroCafes = 0;
        int numeroRefrescos = 0;
        int numeroBocadillos = 0;
        int numeroMenus = 0;

        double eurosCafe;
        double eurosRefrescos;
        double eurosBocadillos;
        double eurosMenus;

        double cuenta = 0;

        do {

            System.out.println("1- Pedir cafe");
            System.out.println("2-Pedir refresco");
            System.out.println("3-Pedir bocadillo");
            System.out.println("4-Pedir menu");
            System.out.println("5-Sacar la cuenta");
            System.out.println("");

            System.out.println("Dime la opcion a elegir: ");
            opcion = teclado.nextInt();

            if (opcion < 0) {
                System.out.println("");
                System.out.println("DATO ERRONEO");
                System.out.println("----------------------------");
            }

            switch (opcion) {

                case 1:

                    System.out.println("Cuantos CAFES quieres: ");
                    numeroCafes = teclado.nextInt();
                    if (numeroCafes < 0) {
                        System.out.println("");
                        System.out.println("DATO ERRONEO");
                        System.out.println("----------------------------");
                    } else {
                        eurosCafe = numeroCafes * CAFE;
                        cuenta += eurosCafe;
                    }
                    break;

                case 2:
                    System.out.println("Cuantos REFRESCOS quieres: ");
                    numeroRefrescos = teclado.nextInt();
                    if (numeroRefrescos < 0) {
                        System.out.println("");
                        System.out.println("DATO ERRONEO");
                        System.out.println("----------------------------");
                    } else {
                        eurosRefrescos = numeroRefrescos * REFRESCO;
                        cuenta += eurosRefrescos;
                    }
                    break;

                case 3:
                    System.out.println("Cuantos BOCADILLOS quieres: ");
                    numeroBocadillos = teclado.nextInt();
                    if (numeroBocadillos < 0) {
                        System.out.println("");
                        System.out.println("DATO ERRONEO");
                        System.out.println("----------------------------");
                    } else {
                        eurosBocadillos = numeroBocadillos * BOCADILLO;
                        cuenta += eurosBocadillos;
                    }
                    break;

                case 4:
                    System.out.println("Cuantos MENUS quieres: ");
                    numeroMenus = teclado.nextInt();
                    if (numeroMenus < 0) {
                        System.out.println("");
                        System.out.println("DATO ERRONEO");
                        System.out.println("----------------------------");
                    } else {
                        eurosMenus = numeroMenus * MENU;
                        cuenta += eurosMenus;
                    }
                    break;

                case 5:
                    System.out.printf("El numero de BOCADILLOS ES = %d \n", numeroBocadillos);
                    System.out.println("----------------------------");
                    System.out.printf("El numero de REFRESCOS ES = %d \n", numeroRefrescos);
                    System.out.println("----------------------------");
                    System.out.printf("El numero de MENUS ES = %d \n", numeroMenus);
                    System.out.println("----------------------------");
                    System.out.printf("El numero de CAFES ES = %d \n", numeroCafes);
                    System.out.println("----------------------------");
                    System.out.printf("EL PRECIO TOTAL ES : %.2f \n", cuenta);

                    break;

            }

        } while (opcion < 5);

    }

}
