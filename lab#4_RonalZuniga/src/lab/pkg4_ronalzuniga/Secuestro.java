
package lab.pkg4_ronalzuniga;

public class Secuestro extends Mayor{
    int tiempo;
    String estado_vida;

    public Secuestro() {
        super();
    }

    public Secuestro(int tiempo, String estado_vida, int nivel_gravedad, String nombre_victima, String culpable, String sentencia, String pais) {
        super(nivel_gravedad, nombre_victima, culpable, sentencia, pais);
        this.tiempo = tiempo;
        this.estado_vida = estado_vida;
    }

    public Secuestro(int tiempo, String estado_vida) {
        this.tiempo = tiempo;
        this.estado_vida = estado_vida;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
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
