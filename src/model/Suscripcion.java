package model;

import java.util.Date;

public class Suscripcion {
    private Date fechaInicio, fechaFinal;
    private TipoSuscripcion tipoSuscripcion;
    private Pago pago;

    public Suscripcion(Pago pago) {
        this.pago = pago;
    }
    
    public void activar() {}
    
    public void cancelar() {}
    
    public void renovar() {}
    
}
