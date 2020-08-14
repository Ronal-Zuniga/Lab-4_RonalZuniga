
package lab.pkg4_ronalzuniga;

public class Hurto extends Menor{

    String objeto;
    int valor;

    public Hurto() {
        super();
    }

    public Hurto(String objeto, int valor) {
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
