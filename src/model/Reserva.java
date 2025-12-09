package model;

public class Reserva {

    private int id;
    private String cliente;
    private String fecha;
    private int duracionHoras;

    public Reserva(int id, String cliente, String fecha, int duracionHoras) {
        this.id = id;
        this.cliente = cliente;
        this.fecha = fecha;
        this.duracionHoras = duracionHoras;
    }

    // getters y setters simples
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(int duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    public void mostrarInfo() {
        System.out.println("ID: " + id + " | Cliente: " + cliente +
                " | Fecha: " + fecha + " | Duración: " + duracionHoras + " horas");
    }
}

