
import java.util.ArrayList;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricky
 */
public class hilo implements Runnable{
    
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
        
    }
    
}
