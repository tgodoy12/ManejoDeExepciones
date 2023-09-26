package exercise3;

public class DivisionNumero {
    int num1;
    int num2;

    public DivisionNumero() {
    }

    public DivisionNumero(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int division() throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("ERROR: No se puede dividir un número por 0");
        }
        

        int cociente = num1 / num2;
        System.out.println("El resultato es: " + cociente);

        return cociente;
    }
}
