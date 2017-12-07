
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
public class orden {
    Cajeros c;
    Clientes cl;
    ArrayList<Productos> producto = new ArrayList();

    public orden() {
    }

    public orden(Cajeros c, Clientes cl) {
        this.c = c;
        this.cl = cl;
    }    

    public Cajeros getC() {
        return c;
    }

    public void setC(Cajeros c) {
        this.c = c;
    }

    public Clientes getCl() {
        return cl;
    }

    public void setCl(Clientes cl) {
        this.cl = cl;
    }

    public ArrayList<Productos> getProducto() {
        return producto;
    }

    public void setProducto(ArrayList<Productos> producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "orden{" + "c=" + c + ", cl=" + cl + ", producto=" + producto + '}';
    }
}
