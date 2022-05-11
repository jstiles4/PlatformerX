/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package platformerx;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JPanel;

/**
 *
 * @author Jx
 */
public class GamePanel extends JPanel implements ActionListener{
  
    ArrayList<Wall> walls = new ArrayList<>();
    Player player;
    
    Timer gameTimer;    
    
    
    public GamePanel(){
        gameTimer = new Timer();
        player = new Player(400,300,this);
        makeWalls();
        //keep redrawing ~60fps (17)
        gameTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                player.set();
                repaint();
            }
        },0,17);
    }

    public void makeWalls(){
        //floor blocks
        for(int i =50;i<650; i+=50){
            //floor
            walls.add(new Wall(i,600,50,50));            
        }
        //stacked walls
        //wall pos x pos y size x size y
        
        walls.add(new Wall(50,550,50,50));
        walls.add(new Wall(50,500,50,50));
        walls.add(new Wall(50,450,50,50));
        walls.add(new Wall(600,550,50,50));
        walls.add(new Wall(600,500,50,50));
        //walls.add(new Wall(600,450,50,50));
        walls.add(new Wall(500,550,50,50));
        walls.add(new Wall(450,400,50,50));
        walls.add(new Wall(350,350,50,50));
        walls.add(new Wall(250,300,50,50));
        walls.add(new Wall(550,550,50,50));
        walls.add(new Wall(550,500,50,50));
        walls.add(new Wall(575,450,50,50));
    }
    public void paint(Graphics g){
        super.paint(g);
        
        Graphics2D gtd = (Graphics2D) g;
        
        player.draw(gtd);
        for(Wall wall: walls){
            wall.draw(gtd);
        }
    }    
    

    //grabbing keys that are pressed and changing bool direction true
    void keyPressed(KeyEvent e) {
        
        if(e.getKeyChar()=='a'){player.keyLeft = true;}
        if(e.getKeyChar()=='w'){player.keyUp = true;}
        if(e.getKeyChar()=='d'){player.keyRight = true;}
        if(e.getKeyChar()=='s'){player.keyDown = true;}
    }
    
    //grabbing keys that are un-pressed and changing bool direction false
    void keyReleased(KeyEvent e) {
        if(e.getKeyChar()=='a'){player.keyLeft = false;}
        if(e.getKeyChar()=='w'){player.keyUp = false;}
        if(e.getKeyChar()=='d'){player.keyRight = false;}
        if(e.getKeyChar()=='s'){player.keyDown = false;}
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {

    }
    
}
