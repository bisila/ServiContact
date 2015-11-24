package model;

import java.util.List;

public class Cliente extends Usuario{
    private int dni;
    private String nombre;
    private Busqueda busqueda;
    private List<Servicio> serviciosSolicitados;

    public Cliente(int dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }
    
    public void solicitarBaja() {}
    
    public void registrarse() {}
    
    public void modificarPerfil () {}
    
    public void verContratos() {}
}
