package lab.pkg4_ronalzuniga;

import java.util.ArrayList;

public class Terrorista extends Agentes {
    ArrayList<Terrorismo> t;
    String pais_ataque;
    String ciudad;
    String metodo;

    public Terrorista() {
        super();
    }

    public Terrorista(String pais_ataque, String ciudad, String metodo, double dinero, String nombre, int edad, String genero, String pais, String encarcelado, String descripcion) {
        super(dinero, nombre, edad, genero, pais, encarcelado, descripcion);
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
        return "Terrorista{" + "pais_ataque=" + pais_ataque + ", ciudad=" + ciudad + ", metodo=" + metodo + ", ataques=" + t+ '}';
    }

    @Override
    public void cometer_delito(String c, int n) {
       t.add(new Terrorismo(c,n));
    }
}
