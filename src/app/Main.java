package app;

import model.Reserva;
import service.SistemaReservas;

public class Main {

    public static void main(String[] args) {

        SistemaReservas sistema = new SistemaReservas();

        // Crear reservas como un principiante
        Reserva r1 = new Reserva(1, "Pedro", "2025-03-10", 2);
        Reserva r2 = new Reserva(2, "Ana", "2025-03-12", 3);

        // Agregar reservas al sistema
        sistema.agregarReserva(r1);
        sistema.agregarReserva(r2);

        // Usamos un setter para cambiar algo
        System.out.println("\nModificando la duración de la reserva 1...");
        r1.setDuracionHoras(5);

        // Listamos las reservas
        sistema.listarReservas();

        // Mostramos cuántas reservas hay
        System.out.println("\nTotal de reservas: " + sistema.contarReservas());

        // Intentamos eliminar una reserva
        System.out.println("\nIntentando eliminar reservas...");
        try {
            sistema.eliminarReserva(1);  // Esta sí existe
            sistema.eliminarReserva(99); // Esta no existe → lanza error
        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        }

        // Volvemos a listar para ver el cambio
        sistema.listarReservas();

        System.out.println("\nTotal final: " + sistema.contarReservas());
    }
}
