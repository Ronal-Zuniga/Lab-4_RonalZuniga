
package lab.pkg4_ronalzuniga;

import java.util.ArrayList;


public class Agentes{
    ArrayList<Delito> delitos;
    String nombre;
    int edad;
    String genero;
    String pais;
    String descripcion;

    public Agentes() {
    }

    public Agentes(ArrayList<Delito> delitos, String nombre, int edad, String genero, String pais, String descripcion) {
        this.delitos = delitos;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.pais = pais;
        this.descripcion = descripcion;
    }

    public ArrayList<Delito> getDelitos() {
        return delitos;
    }

    public void setDelitos(ArrayList<Delito> delitos) {
        this.delitos = delitos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Agentes{" + "delitos=" + delitos + ", nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + ", pais=" + pais + ", descripcion=" + descripcion + '}';
    }
    
}
