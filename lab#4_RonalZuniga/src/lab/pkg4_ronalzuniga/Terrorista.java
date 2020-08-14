
package lab.pkg4_ronalzuniga;


public class Terrorista extends Agentes{
    String pais_ataque;
    String ciudad;
    String metodo;

    public Terrorista() {
        super();
    }

    public Terrorista(String pais_ataque, String ciudad, String metodo) {
        this.pais_ataque = pais_ataque;
        this.ciudad = ciudad;
        this.metodo = metodo;
    }

    public String getPais_ataque() {
        return pais_ataque;
    }

    public void setPais_ataque(String pais_ataque) {
        this.pais_ataque = pais_ataque;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    @Override
    public String toString() {
        return "Terrorista{" + "pais_ataque=" + pais_ataque + ", ciudad=" + ciudad + ", metodo=" + metodo + '}';
    }
    
}
