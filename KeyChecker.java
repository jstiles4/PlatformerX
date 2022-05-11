/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package platformerx;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 *
 * @author Jx
 */
public class KeyChecker extends KeyAdapter {
    
    GamePanel panel;
    
    public KeyChecker(GamePanel panel){
        this.panel = panel;
    }
    
    @Override
    public void keyPressed(KeyEvent e){
        panel.keyPressed(e);
    }
    
    @Override
    public void keyReleased(KeyEvent e){
        panel.keyReleased(e);
    }
        
    
}
