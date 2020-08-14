
package lab.pkg4_ronalzuniga;

public class Asesino extends Agentes{
    String nombre_victima;
    String arma;

    public Asesino() {
        super();
    }

    public Asesino(String nombre_victima, String arma) {
        this.nombre_victima = nombre_victima;
        this.arma = arma;
    }

    public String getNombre_victima() {
        return nombre_victima;
    }

    public void setNombre_victima(String nombre_victima) {
        this.nombre_victima = nombre_victima;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    @Override
    public String toString() {
        return "Asesino{" + "nombre_victima=" + nombre_victima + ", arma=" + arma + '}';
    }
    
    
}
