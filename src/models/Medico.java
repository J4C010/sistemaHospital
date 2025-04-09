package models;

public class Medico extends Usuario {
    // Representa a un médico
    private String especialidad;
    private String numeroLicencia;

    public Medico(String nombre, String cedula, String direccion, String telefono, String especialidad, String numeroLicencia) {
        super(nombre, cedula, direccion, telefono);
        this.especialidad = especialidad;
        this.numeroLicencia = numeroLicencia;
    }

    // Getters y setters...

}
