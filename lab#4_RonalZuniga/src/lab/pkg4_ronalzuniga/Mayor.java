
package lab.pkg4_ronalzuniga;

public class Mayor extends Delito {
    int nivel_gravedad;

    public Mayor() {
        super();
    }

    public Mayor(int nivel_gravedad, String nombre_victima, String culpable, String sentencia, String pais) {
        super(nombre_victima, culpable, sentencia, pais);
        this.nivel_gravedad = nivel_gravedad;
    }

    public int getNivel_gravedad() {
        return nivel_gravedad;
    }

    public void setNivel_gravedad(int nivel_gravedad) {
        this.nivel_gravedad = nivel_gravedad;
    }

    @Override
    public String toString() {
        return "Mayor{" + "nivel_gravedad=" + nivel_gravedad + '}';
    }
    
}
