package exercise1.main;

import exercise1.entidad.Persona;
import exercise1.service.ServicePersona;

/**
 * Inicializar un objeto de la clase Persona ejercicio 3 de la guía 8 Servicios, a null y tratar
 * de invocar el método esMayorDeEdad() a través de ese objeto. Luego, englobe el código
 * con una cláusula try-catch para probar la nueva excepción que debe ser controlada.
 */

public class Main {
    public static void main(String[] args) {
        ServicePersona servPersona = new ServicePersona();

        Persona p1 = servPersona.crearPersona("Maria", 25, "M", 60, 1.65);
        boolean esMayor = servPersona.esMayorDeEdad(p1);
        System.out.println(esMayor);

    }
}

