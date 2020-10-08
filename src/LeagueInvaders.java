import javax.swing.JFrame;

public class LeagueInvaders {
	JFrame frame;
	GamePanel1 gp1;
	public static final int HEIGHT = 800;
	public static final int WIDTH = 500;

	LeagueInvaders() {
		frame = new JFrame();
		gp1 = new GamePanel1();
	}

	void setup() {
		frame.add(gp1);
		frame.setSize(WIDTH, HEIGHT);
		frame.addKeyListener(gp1);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new LeagueInvaders().setup();

	}
}
