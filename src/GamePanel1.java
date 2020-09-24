import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GamePanel1 extends JPanel{
	@Override
	public void paintComponent(Graphics g){
		if(currentState == MENU){
		    drawMenuState(g);
		    g.setColor(Color.BLUE);
		    g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		}else if(currentState == GAME){
		    drawGameState(g);
		    g.setColor(Color.BLACK);
		    g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		}else if(currentState == END){
		    drawEndState(g);
		    g.setColor(Color.RED);
		    g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		}
	}
	final int MENU = 0;
    final int GAME = 1;
    final int END = 2;
    int currentState = MENU;
    Font titleFont ;
    void updateMenuState() {  }
    void updateGameState() {  }
    void updateEndState()  {  }
    void drawMenuState(Graphics g) {  }
    void drawGameState(Graphics g) {  }
    void drawEndState(Graphics g)  {  }
    GamePanel1() {
    	 titleFont = new Font("Arial", Font.PLAIN, 48);
    }
}