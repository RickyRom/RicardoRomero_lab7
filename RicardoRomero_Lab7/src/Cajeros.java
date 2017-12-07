
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

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
    
    
    public void run() {
        
        Supermercado2 nuevo = new Supermercado2();
        nuevo.pack();
        nuevo.setLocationRelativeTo(null);
        nuevo.nombre_cajero.setText(nombre);
        nuevo.nombre_cliente.setText(nombre);
        nuevo.setVisible(true);
        while (true) {            
            nuevo.jt_procliti.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Edad", "ID", "Lugar"
            }
        ));
            DefaultTableModel modelo = (DefaultTableModel) nuevo.jt_procliti.getModel();
            for (int i = 0; i < ordenes.size(); i++) {
                if(ordenes.get(i).getC().equals(nombre)) {
                    Object [] newrow = {ordenes.get(i).getC(),ordenes.get(i).getCl(),ordenes.get(i).getProducto()};
                    modelo.addRow(newrow);
                    nuevo.jt_procliti.setModel(modelo);
                }
            }
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
            }
        }
        
    }
}
