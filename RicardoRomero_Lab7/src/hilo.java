
import java.util.ArrayList;
import javax.swing.JFrame;
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
public class hilo implements Runnable {

    protected JFrame f;
    ArrayList<Cajeros> lista = new ArrayList();

    public hilo(JFrame f) {
        this.f = f;
    }

    public JFrame getF() {
        return f;
    }

    public void setF(JFrame f) {
        this.f = f;
    }

    @Override
    public void run() {
        Supermercado2 nuevo = new Supermercado2();
        nuevo.pack();
        nuevo.setLocationRelativeTo(null);
        nuevo.setVisible(true);
        while (true) {
            nuevo.jt_procliti.setModel(new javax.swing.table.DefaultTableModel(
                    new Object[][]{
                        {null, null, null}
                    },
                    new String[]{
                        "Producto", "Cliente", "Tiempo"
                    }
            ));
            DefaultTableModel modelo = (DefaultTableModel) nuevo.jt_procliti.getModel();
        }
    }
}
