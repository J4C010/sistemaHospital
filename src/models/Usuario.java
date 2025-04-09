package models;

public abstract class Usuario {
    // Clase bae para Paciente y Médico
    protected String nombre;
    protected String cedula;
    protected String direccion;
    protected String telefono;

    public Persona(String nombre, String cedula, String direccion, String telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    // Getters y setters...


}
