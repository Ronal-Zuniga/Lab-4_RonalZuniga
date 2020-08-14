
package lab.pkg4_ronalzuniga;

public class Asesinato extends Mayor{

    String arma;
    int num_cuerpos;

    public Asesinato() {
        super();
    }

    public Asesinato(String arma, int num_cuerpos, int nivel_gravedad, String nombre_victima, String culpable, String sentencia, String pais) {
        super(nivel_gravedad, nombre_victima, culpable, sentencia, pais);
        this.arma = arma;
        this.num_cuerpos = num_cuerpos;
    }

    public Asesinato(String arma, int num_cuerpos) {
        this.arma = arma;
        this.num_cuerpos = num_cuerpos;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public int getNum_cuerpos() {
        return num_cuerpos;
    }

    public void setNum_cuerpos(int num_cuerpos) {
        this.num_cuerpos = num_cuerpos;
    }

    @Override
    public String toString() {
        return "Asesinato{" + "arma=" + arma + ", num_cuerpos=" + num_cuerpos + '}';
    }
    
}
