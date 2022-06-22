import java.awt.Canvas;
import javax.swing.JFrame;

public class Main extends Canvas implements Runnable {

	public static int WIDTH = 500, HEIGHT = 500;

	public void Game() {
		
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Small Game");
		frame.pack();
		frame.setSize(HEIGHT, WIDTH);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	
	}

	@Override
	public void run() {

	}

}
