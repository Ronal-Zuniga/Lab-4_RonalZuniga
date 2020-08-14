
package lab.pkg4_ronalzuniga;

public class Prostitucion extends Menor{
    String solicitante;

    public Prostitucion() {
        super();
    }

    public Prostitucion(String solicitante, String nombre_policia, int id_policia, int num_celda, String nombre_victima, String culpable, String sentencia, String pais) {
        super(nombre_policia, id_policia, num_celda, nombre_victima, culpable, sentencia, pais);
        this.solicitante = solicitante;
    }

    public String getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }

    @Override
    public String toString() {
        return "Prostitucion{" + "solicitante=" + solicitante + '}';
    }
    
}
