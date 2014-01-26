/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Class;

import Guis.Loading;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * Main class of the project.
 * @author Esteban Muñoz
 */
public class Main {
    
/**
 *  Constructor method of the main class.
 *  @param args[] 
 */
    

    public static void main(String args[]){

        
         // TODO code application logic here
          try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException ex) {
            //JOptionPane.showMessageDialog(null, ex.getMessage(), "Browser", JOptionPane.ERROR_MESSAGE);           
        } catch (InstantiationException ex) {
            //JOptionPane.showMessageDialog(null, ex.getMessage(), "Browser", JOptionPane.ERROR_MESSAGE);            
        } catch (IllegalAccessException ex) {
            //JOptionPane.showMessageDialog(null, ex.getMessage(), "Browser", JOptionPane.ERROR_MESSAGE);  
        } catch (UnsupportedLookAndFeelException ex) {            
            //JOptionPane.showMessageDialog(null, ex.getMessage(), "Browser", JOptionPane.ERROR_MESSAGE);  
        }        
        Loading vt = new Loading();
        vt.start();       
    }
}
