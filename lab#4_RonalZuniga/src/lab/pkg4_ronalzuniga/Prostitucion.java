
package lab.pkg4_ronalzuniga;

public class Prostitucion extends Menor{
    String solicitante;

    public Prostitucion() {
        super();
    }

    public Prostitucion(String solicitante) {
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
