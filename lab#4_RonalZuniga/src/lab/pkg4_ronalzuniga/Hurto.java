
package lab.pkg4_ronalzuniga;

public class Hurto extends Menor{

    String objeto;
    int valor;

    public Hurto() {
        super();
    }

    public Hurto(String objeto, int valor, String nombre_policia, int id_policia, int num_celda, String nombre_victima, String culpable, String sentencia, String pais) {
        super(nombre_policia, id_policia, num_celda, nombre_victima, culpable, sentencia, pais);
        this.objeto = objeto;
        this.valor = valor;
    }


    public String getObjeto() {
        return objeto;
    }

    public void setObjeto(String objeto) {
        this.objeto = objeto;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Hurto{" + "objeto=" + objeto + ", valor=" + valor + '}';
    }
    
}
