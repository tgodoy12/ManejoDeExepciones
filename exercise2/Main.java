package exercise2;

/**
 * Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
 * generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
 * de rango).
 */
public class Main {
    public static void main(String[] args) {
        int[] a = new int[10];

        try {
            for (int i = 0; i < 11; i++) {
                a[i] = 50;
            }

        }
        catch (Exception e) {
            System.out.println("Se han pasado los límites del array");
        }

    }
}
