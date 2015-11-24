package model;

public class Administrador extends Usuario{
    private int dni;
    private String nombre;

    public Administrador(int dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }
    
    public void aceptarSolicitudRegistro() {}
    
    public void denegarSolicitudRegistro() {}
    
    public void darDeBajaUsuario() {}
    
    public void darDeBajaEmpresa() {}
    
    public void comprobarSuscripcion() {}
    
}
