
package lab.pkg4_ronalzuniga;

public class Secuestro extends Mayor{
    String tiempo;
    String estado_vida;

    public Secuestro() {
        super();
    }

    public Secuestro(String tiempo, String estado_vida) {
        this.tiempo = tiempo;
        this.estado_vida = estado_vida;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getEstado_vida() {
        return estado_vida;
    }

    public void setEstado_vida(String estado_vida) {
        this.estado_vida = estado_vida;
    }

    @Override
    public String toString() {
        return "Secuestro{" + "tiempo=" + tiempo + ", estado_vida=" + estado_vida + '}';
    }
    
}
