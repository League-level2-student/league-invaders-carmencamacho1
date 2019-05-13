import javax.swing.JFrame;
import javax.swing.JPanel;

public class LeagueInvaders {
	GamePanel gPanel;
	JFrame frame;
	public static final int width = 500;
	public static final int height = 800; 
public static void main(String[] args) {
	LeagueInvaders game = new LeagueInvaders();
	game.setup();
}
LeagueInvaders(){
	gPanel = new GamePanel();
	frame = new JFrame();
	
}
void setup(){
	frame.add(gPanel);
	frame.setSize(width, height);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.addKeyListener(gPanel);
	
}
}
