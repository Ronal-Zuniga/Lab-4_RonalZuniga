
package lab.pkg4_ronalzuniga;

public class Terrorismo extends Mayor{
    String artefacto;
    int num_victimas;

    public Terrorismo() {
        super();
    }

    public Terrorismo(String artefacto, int num_victimas, int nivel_gravedad, String nombre_victima, String culpable, String sentencia, String pais) {
        super(nivel_gravedad, nombre_victima, culpable, sentencia, pais);
        this.artefacto = artefacto;
        this.num_victimas = num_victimas;
    }

    public Terrorismo(String artefacto, int num_victimas) {
        this.artefacto = artefacto;
        this.num_victimas = num_victimas;
    }

    public String getArtefacto() {
        return artefacto;
    }

    public void setArtefacto(String artefacto) {
        this.artefacto = artefacto;
    }

    public int getNum_victimas() {
        return num_victimas;
    }

    public void setNum_victimas(int num_victimas) {
        this.num_victimas = num_victimas;
    }

    @Override
    public String toString() {
        return "Terrorismo{" + "artefacto=" + artefacto + ", num_victimas=" + num_victimas + '}';
    }
    
    
}
