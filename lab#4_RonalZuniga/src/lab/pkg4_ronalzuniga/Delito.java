
package lab.pkg4_ronalzuniga;

public class Delito {
    String descripcion;
    String nombre_victima;
    String culpable;
    String sentencia;
    String fecha;
    String pais;
    int num_delito;

    public Delito() {
    }

    public Delito(String descripcion, String nombre_victima, String culpable, String sentencia, String fecha, String pais, int num_delito) {
        this.descripcion = descripcion;
        this.nombre_victima = nombre_victima;
        this.culpable = culpable;
        this.sentencia = sentencia;
        this.fecha = fecha;
        this.pais = pais;
        this.num_delito = num_delito;
    }

    public Delito(String nombre_victima, String culpable, String sentencia, String pais) {
        this.nombre_victima = nombre_victima;
        this.culpable = culpable;
        this.sentencia = sentencia;
        this.pais = pais;
    }
    

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre_victima() {
        return nombre_victima;
    }

    public void setNombre_victima(String nombre_victima) {
        this.nombre_victima = nombre_victima;
    }

    public String getCulpable() {
        return culpable;
    }

    public void setCulpable(String culpable) {
        this.culpable = culpable;
    }

    public String getSentencia() {
        return sentencia;
    }

    public void setSentencia(String sentencia) {
        this.sentencia = sentencia;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getNum_delito() {
        return num_delito;
    }

    public void setNum_delito(int num_delito) {
        this.num_delito = num_delito;
    }

    @Override
    public String toString() {
        return "Delito{" + "nombre_victima=" + nombre_victima + ", culpable=" + culpable + ", sentencia=" + sentencia + ", pais=" + pais + '}';
    }
    
}
