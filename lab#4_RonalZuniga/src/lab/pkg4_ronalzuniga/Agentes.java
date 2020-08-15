
package lab.pkg4_ronalzuniga;

import java.util.ArrayList;


public abstract class Agentes extends Criminales{
    double dinero;

    public Agentes() {
        super();
    }

    public Agentes(double dinero, String nombre, int edad, String genero, String pais, String encarcelado, String descripcion) {
        super(nombre, edad, genero, pais, encarcelado, descripcion);
        this.dinero = dinero;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        return "Agentes{" + "dinero=" + dinero + '}';
    }
    
    @Override
    public void cometer_delito(){
    
    }
   

    
}
