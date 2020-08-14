
package lab.pkg4_ronalzuniga;

import java.util.ArrayList;

public class Asesino extends Agentes{
    String nombre_victima;
    String arma;
    ArrayList<Asesinato> a;

    public Asesino() {
        super();
    }

    public Asesino(String nombre_victima, String arma, ArrayList<Asesinato> a, String nombre, int edad, String genero, String pais, String descripcion) {
        super(nombre, edad, genero, pais, descripcion);
        this.nombre_victima = nombre_victima;
        this.arma = arma;
        this.a = a;
    }


    public String getNombre_victima() {
        return nombre_victima;
    }

    public void setNombre_victima(String nombre_victima) {
        this.nombre_victima = nombre_victima;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    @Override
    public String toString() {
        return "Asesino{" + "nombre_victima=" + nombre_victima + ", arma=" + arma + ", a=" + a + '}';
    }

    @Override
    public void cometer_delito(String c, int n) {
        a.add(new Asesinato(c, n));
    }
    
    
}
