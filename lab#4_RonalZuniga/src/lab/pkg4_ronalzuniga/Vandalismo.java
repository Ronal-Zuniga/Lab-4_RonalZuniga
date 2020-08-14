
package lab.pkg4_ronalzuniga;

public class Vandalismo extends Menor{
    String edificio;
    int pisos;
    String nombre_dueño;

    public Vandalismo() {
        super();
    }

    public Vandalismo(String edificio, int pisos, String nombre_dueño) {
        this.edificio = edificio;
        this.pisos = pisos;
        this.nombre_dueño = nombre_dueño;
    }

    public String getEdificio() {
        return edificio;
    }

    public void setEdificio(String edificio) {
        this.edificio = edificio;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public String getNombre_dueño() {
        return nombre_dueño;
    }

    public void setNombre_dueño(String nombre_dueño) {
        this.nombre_dueño = nombre_dueño;
    }

    @Override
    public String toString() {
        return "Vandalismo{" + "edificio=" + edificio + ", pisos=" + pisos + ", nombre_due\u00f1o=" + nombre_dueño + '}';
    }
    
}
