package model;

import java.util.List;

public class Empresa extends Usuario{
    private int nif;
    private String razonSocial;
    private List<Servicio> serviciosOfrecidos;
    private Suscripcion suscripcion = null;

    public Empresa(int nif, String razonSocial, Suscripcion suscripcion) {
        this.nif = nif;
        this.razonSocial = razonSocial;
        this.suscripcion = suscripcion;
    }
    
    public void solicitarRegistro() {}
            
    public void solicitarBaja() {}
    
    public void modificarPerfil() {}
    
    public void aceptarServicio() {}
    
    public void rechazarServicio() {}
    
    public void verHistorialDeServicios() {}
           
    public void mostrarEstadisticas() {}
    
}
