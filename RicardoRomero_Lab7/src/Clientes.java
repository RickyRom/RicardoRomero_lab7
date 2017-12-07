
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricky
 */
public class Clientes {
    private String nombre;
    private int edad;
    private String orden;
    

    public Clientes() {
    }

    public Clientes(String nombre, int edad, String orden) {
        this.nombre = nombre;
        this.edad = edad;
        this.orden = orden;
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

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }
    
    @Override
    public String toString() {
        return nombre;
    }
    
    
}
