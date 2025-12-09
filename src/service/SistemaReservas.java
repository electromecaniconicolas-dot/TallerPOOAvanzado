package service;

import java.util.ArrayList;
import model.Reserva;

public class SistemaReservas {

    public ArrayList<Reserva> reservas = new ArrayList<>();

    public void agregarReserva(Reserva r) {
        reservas.add(r);
        System.out.println("Reserva agregada (ID " + r.getId() + ")");
    }

    public void eliminarReserva(int id) throws Exception {

        boolean encontrada = false;

        // Se recorre la lista buscando el ID
        for (int i = 0; i < reservas.size(); i++) {
            if (reservas.get(i).getId() == id) {
                reservas.remove(i);
                encontrada = true;
                System.out.println("Reserva eliminada con éxito.");
                break;
            }
        }

        if (!encontrada) {
            throw new Exception("No se encontró una reserva con ese ID.");
        }
    }

    public void listarReservas() {
        System.out.println("\n--- Reservas actualmente registradas ---");
        if (reservas.size() == 0) {
            System.out.println("No hay reservas guardadas.");
        } else {
            for (Reserva r : reservas) {
                r.mostrarInfo();
            }
        }
    }

    public int contarReservas() {
        return reservas.size();
    }
}

