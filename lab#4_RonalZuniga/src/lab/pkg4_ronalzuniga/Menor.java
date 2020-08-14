
package lab.pkg4_ronalzuniga;


public class Menor extends Delito{
    String nombre_policia;
    int id_policia;
    int num_celda;

    public Menor() {
        super();
    }

    public Menor(String nombre_policia, int id_policia, int num_celda, String nombre_victima, String culpable, String sentencia, String pais) {
        super(nombre_victima, culpable, sentencia, pais);
        this.nombre_policia = nombre_policia;
        this.id_policia = id_policia;
        this.num_celda = num_celda;
    }


    public String getNombre_policia() {
        return nombre_policia;
    }

    public void setNombre_policia(String nombre_policia) {
        this.nombre_policia = nombre_policia;
    }

    public int getId_policia() {
        return id_policia;
    }

    public void setId_policia(int id_policia) {
        this.id_policia = id_policia;
    }

    public int getNum_celda() {
        return num_celda;
    }

    public void setNum_celda(int num_celda) {
        this.num_celda = num_celda;
    }

    @Override
    public String toString() {
        return "Menor{" + "nombre_policia=" + nombre_policia + ", id_policia=" + id_policia + ", num_celda=" + num_celda + '}';
    }


    
}
