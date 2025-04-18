package co.edu.uniquindio;

import interfaces.Registrable;
import interfaces.Consultable;

public class Paciente extends Usuario implements Registrable, Consultable {
    // Representa a un paciente
    private String numeroHistoriaClinica;

    public Paciente(String nombre, String cedula, String direccion, String telefono, String numeroHistoriaClinica) {
        super(nombre, cedula, direccion, telefono);
        this.numeroHistoriaClinica = numeroHistoriaClinica;
    }
    //Se implementan interfaz en la clase
    @Override
    public void registrar() {
        System.out.println("Registrando paciente: " + nombre);
    }

    @Override
    public void mostrarInformacion(){
        System.out.println("Paciente: " + nombre + ", Cédula: " + cedula);
    }

    // Getters y setters...

    public String getNumeroHistoriaClinica() {
        return numeroHistoriaClinica;
    }

    public void setNumeroHistoriaClinica(String numeroHistoriaClinica) {
        this.numeroHistoriaClinica = numeroHistoriaClinica;
    }
}

