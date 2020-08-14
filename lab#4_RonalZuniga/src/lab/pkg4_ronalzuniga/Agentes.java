
package lab.pkg4_ronalzuniga;

import java.util.ArrayList;


public abstract class Agentes{
    String nombre;
    int edad;
    String genero;
    String pais;
    String descripcion;

    public Agentes() {
    }

    public Agentes(String nombre, int edad, String genero, String pais, String descripcion) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.pais = pais;
        this.descripcion = descripcion;
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
        return "Agentes{" + "nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + ", pais=" + pais + ", descripcion=" + descripcion + '}';
    }
    
    public abstract void cometer_delito(String c, int n);
    
}
