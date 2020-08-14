
package lab.pkg4_ronalzuniga;

public class Violacion extends Mayor{
    int edad_victima;

    public Violacion() {
        super();
    }

    public Violacion(int edad_victima, int nivel_gravedad, String nombre_victima, String culpable, String sentencia, String pais) {
        super(nivel_gravedad, nombre_victima, culpable, sentencia, pais);
        this.edad_victima = edad_victima;
    }

    public int getEdad_victima() {
        return edad_victima;
    }

    public void setEdad_victima(int edad_victima) {
        this.edad_victima = edad_victima;
    }

    @Override
    public String toString() {
        return "Violacion{" + "edad_victima=" + edad_victima + '}';
    }
    
}
