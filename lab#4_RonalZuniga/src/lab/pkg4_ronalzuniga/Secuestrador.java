
package lab.pkg4_ronalzuniga;

public class Secuestrador extends Agentes{
    String nombre_victima;
    double rescate;

    public Secuestrador() {
        super();
    }

    public Secuestrador(String nombre_victima, double rescate) {
        this.nombre_victima = nombre_victima;
        this.rescate = rescate;
    }

    public String getNombre_victima() {
        return nombre_victima;
    }

    public void setNombre_victima(String nombre_victima) {
        this.nombre_victima = nombre_victima;
    }

    public double getRescate() {
        return rescate;
    }

    public void setRescate(double rescate) {
        this.rescate = rescate;
    }

    @Override
    public String toString() {
        return "Secuestrador{" + "nombre_victima=" + nombre_victima + ", rescate=" + rescate + '}';
    }
    
    
}
