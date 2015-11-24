package model;

import java.util.List;

public class Servicio {
    private String tipoServicio, comentarioValoracion;
    private Puntuacion valoracion;
    private Contrato contrato;
    private List<Queja> quejas;

    public Servicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }
    
    public void solicitar(Cliente cliente, Servicio tipoServicio){}
    
    public void valorar(Cliente cliente, Puntuacion valoracion, 
                                                String comentarioValoracion) {
        this.comentarioValoracion = comentarioValoracion;
        this.valoracion = valoracion;
    }
    
    public void recomendar(Cliente cliente, Servicio tipoServicio) {}
}
