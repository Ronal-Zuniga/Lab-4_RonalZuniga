
package lab.pkg4_ronalzuniga;

public class Trafico extends Mayor{
    String nombre_droga;
    int cantidad;

    public Trafico() {
        super();
    }

    public Trafico(String nombre_droga, int cantidad, int nivel_gravedad, String nombre_victima, String culpable, String sentencia, String pais) {
        super(nivel_gravedad, nombre_victima, culpable, sentencia, pais);
        this.nombre_droga = nombre_droga;
        this.cantidad = cantidad;
    }


    public String getNombre_droga() {
        return nombre_droga;
    }

    public void setNombre_droga(String nombre_droga) {
        this.nombre_droga = nombre_droga;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Trafico{" + "nombre_droga=" + nombre_droga + ", cantidad=" + cantidad + '}';
    }
    
    
}
