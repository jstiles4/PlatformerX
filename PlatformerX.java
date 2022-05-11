/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package platformerx;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author Jx
 */
public class PlatformerX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MainFrame frame = new MainFrame();
        
        frame.setSize(700, 700);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((int)(screenSize.getWidth()/2 - frame.getSize().getWidth()/2), (int)(screenSize.getHeight()/2 - frame.getSize().getHeight()/2));
        frame.setResizable(false);
        frame.setTitle("PlatformerX");
        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
    
}
