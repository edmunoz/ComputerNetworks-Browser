/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.awt.*;
import javax.swing.ImageIcon;

/**
 * BContainer class that inherits from a modal
 * that allows fears of container the project.
 * @author Esteban Muñoz
 * @author Juan Mite
 */
public class BContainer extends Container{
    private ImageIcon image; 
    
/**
 * BContainer class that inherits from a modal
 * that allows fears of container the project.
 * @param nameImage location where's the image 
 */
    public BContainer(String nameImage){
        this.image = new ImageIcon (nameImage);
    }    
    
/**
 * Method painting in the background of a JFrame an image do by @author Juan Mite.
 * @param g object of type Graphics helping to get the coordinates for painting.
 */
    @Override
    public void paint (Graphics g){
        Rectangle r = g.getClipBounds();
        g.setColor(this.getBackground());
        g.fillRect (r.x, r.y, r.width, r.height);
        g.drawImage (image.getImage(), 0, 0, this.getWidth(), this.getHeight(), this.getBackground(), this);       
        super.paint(g);                        
    } 
    
}
