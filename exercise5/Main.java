package exercise5;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
 * debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
 * ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
 * número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
 * consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
 * ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
 * controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
 * carácter fallido como un intento.
 */
public class Main {
    public static void main(String[] args) {
        try {
            adivinarNumero();
        } catch(InputMismatchException i) {
            System.out.println(i.getMessage());
        } finally {
            adivinarNumero(); //captura el error solo una vez, a la segunda no continúa el programa
        }



    }

    public static void adivinarNumero() throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        int numRandom = (int) (Math.random() * 500);
        System.out.println("Introduce un número entre 1 y 500");
        //probar sacar el try catch de acá y usar un while con la condición de que mientras no sea un número
        //se lanza una nueva exepción
        try {
            int numUsuario = scanner.nextInt();


            while (numUsuario != numRandom) {

                if (numUsuario < numRandom) {
                    System.out.println("El número " + numUsuario + " es MENOR.");
                    System.out.println("Vuelve a intentarlo");
                    numUsuario = scanner.nextInt();
                }

                if (numUsuario > numRandom) {
                    System.out.println("El número " + numUsuario + " es MAYOR.");
                    System.out.println("Vuelve a intentarlo");
                    numUsuario = scanner.nextInt();
                }

            }

            System.out.println("CORRECTO");

        } catch (InputMismatchException i) {
            throw new InputMismatchException("Debe ingresar un número. Vuelve a intentarlo");
            //usar un finally o acá mismo para ejecutar este mismo metodo, de forma recursiva
        }

    }


}

