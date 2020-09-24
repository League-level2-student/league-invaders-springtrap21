import javax.swing.JFrame;

public class LeagueInvaders {
	JFrame frame;
	static GamePanel1 gm1;
	public static final int HEIGHT = 800;
	public static final int WIDTH = 500;
	LeagueInvaders() {
		frame = new JFrame();
		gm1 = new GamePanel1();
	}
	void setup() {
		frame.add(gm1);
		frame.setSize(WIDTH, HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
public static void main(String[] args) {
	LeagueInvaders li = new LeagueInvaders();
	li.setup();
	
	
}
}
