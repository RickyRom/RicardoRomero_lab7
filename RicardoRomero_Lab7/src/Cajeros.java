
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
public class Cajeros {
    private String nombre;
    private int id;
    ArrayList<orden> ordenes = new ArrayList();

    public Cajeros() {
    }

    public Cajeros(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<orden> getOrdenes() {
        return ordenes;
    }

    public void setOrdenes(ArrayList<orden> ordenes) {
        this.ordenes = ordenes;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
