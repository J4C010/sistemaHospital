package models;

public class Paciente extends Usuario {
    // Representa a un paciente
    private String numeroHistoriaClinica;

    public Paciente(String nombre, String cedula, String direccion, String telefono, String numeroHistoriaClinica) {
        super(nombre, cedula, direccion, telefono);
        this.numeroHistoriaClinica = numeroHistoriaClinica;
    }

    // Getters y setters...
}

