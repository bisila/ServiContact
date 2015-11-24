package model;

public class Busqueda {
    private Resultado resultado;

    public Busqueda(Resultado resultado) {
        this.resultado = resultado; 
    }
    
    public Resultado buscar(Servicio servicio) {
        return new Resultado();
    }
    
}
