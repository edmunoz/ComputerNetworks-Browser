/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Guis;

import java.awt.Color;
import javax.swing.*;

/**
 * Class that inherits from a thread 
 * and can simulate the load of the project.
 * @author Esteban Muñoz
 */
public class Loading extends Thread{
     JFrame cargando=new JFrame();
     
/**
 * Method constructor that initializes the attributes
 * of the case charging. 
 */
    public Loading(){
        JLabel fondo =new JLabel();
        fondo.setIcon(new ImageIcon(getClass().getResource("/images/cargando.jpg")));
        cargando.add(fondo);
        cargando.setUndecorated(true);
        cargando.setSize(450,405);
        cargando.getContentPane().setBackground(Color.LIGHT_GRAY);
        cargando.setLocationRelativeTo(null);
        cargando.setVisible(true);
    }
    @Override
    public void run(){
        try {
            sleep(2000);//keeps charging two seconds.
            cargando.dispose();
             new Browser().setVisible(true);      
        }catch(InterruptedException ex){
            JOptionPane.showMessageDialog(null, "Error.....", "Thread", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
