/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package platformerx;
import java.awt.Color;
import javax.swing.JFrame;
/**
 *
 * @author Jx
 */
public class MainFrame extends JFrame {
    public MainFrame(){
        //making window with vars
        GamePanel panel = new GamePanel();
        
        panel.setLocation(0,0);
        panel.setSize(this.getSize());
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setVisible(true);
        this.add(panel);
        
        
        addKeyListener(new KeyChecker(panel));     
    
    
    } 
    
    
}
