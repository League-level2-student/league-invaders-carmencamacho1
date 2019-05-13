import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
    final int MENU = 0;
    final int GAME = 1;
    final int END = 2; 
    Font titleFont;
    Font enterFont;
    Timer frameDraw;
    int currentState = MENU;
	@Override
	
	public void paintComponent(Graphics g){
		if(currentState == MENU){
		    drawMenuState(g);
		}else if(currentState == GAME){
		    drawGameState(g);
		}else if(currentState == END){
		    drawEndState(g);
		}
	}
	void updateMenuState(){
		
	}
	void updateGameState(){
		
	}
	void updateEndState(){
		
	}
	void drawMenuState(Graphics g){
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);
		g.setFont(titleFont);
		g.setColor(Color.YELLOW);
		g.drawString("LEAGUE INVADERS",15,125);
		g.setFont(enterFont);
		g.setColor(Color.YELLOW);
		g.drawString("Press ENTER to start",120 ,350);
		g.drawString("Press SPACE for instructions",75 ,550);
	}
	void drawGameState(Graphics g){
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);
	}
	void drawEndState(Graphics g){
		g.setColor(Color.RED);
		g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);
		g.setFont(titleFont);
		g.setColor(Color.BLACK);
		g.drawString("GAME OVER :(",90,400);
	}
	GamePanel (){
		titleFont = new Font ("Arial", Font.PLAIN, 48);
		enterFont = new Font ("Arial", Font.PLAIN, 25);
	    frameDraw = new Timer(1000/60,this);
	    frameDraw.start();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(currentState == MENU){
		    updateMenuState();
		}else if(currentState == GAME){
		    updateGameState();
		}else if(currentState == END){
		    updateEndState();
		}
		System.out.println("action");
		repaint();
		
	}
	@Override
	public void keyPressed(KeyEvent e ) {
		if (e.getKeyCode()==KeyEvent.VK_ENTER) {
		    if (currentState == END) {
		        currentState = MENU;
		    } else {
		        currentState++;
		    }
		} 
		if(currentState == GAME){
			if (e.getKeyCode()==KeyEvent.VK_UP) {
			    System.out.println("UP");
			}
			if (e.getKeyCode()==KeyEvent.VK_DOWN) {
			    System.out.println("DOWN");
			}
			if (e.getKeyCode()==KeyEvent.VK_LEFT) {
			    System.out.println("LEFT");
			}
			if (e.getKeyCode()==KeyEvent.VK_RIGHT) {
			    System.out.println("RIGHT");
			}
		}
		
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
