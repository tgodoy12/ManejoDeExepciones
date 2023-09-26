package exercise3;

import java.util.Scanner;

/**
 * Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
 * números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
 * para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
 * una división con los dos numeros y mostrar el resultado.
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introducir un número");
        int numero1 = Integer.parseInt(scanner.next());
        System.out.println("Introducir otro número");
        int numero2 = Integer.parseInt(scanner.next());


        DivisionNumero dNumero = new DivisionNumero(numero1, numero2);

        try {
            int cociente = dNumero.division();
        } catch (ArithmeticException a) {
            System.out.println(a.getMessage());
        } catch (Exception a) {
            System.out.println(a.getMessage());
        }

    }
}
