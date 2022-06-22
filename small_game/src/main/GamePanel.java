package main;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable {
	// Screen settings
	final int orignal_tile_size = 16; // 16x16
	final int scale = 3; // 16 x 3 = 48px

	final int tile_size = orignal_tile_size * scale; // 48px
	// 4 by 3, game window (panel)
	final int max_screen_column = 16;
	final int max_screen_row = 12;
	final int screen_width = max_screen_column * tile_size; // 38 x 16 = 758px
	final int screen_height = max_screen_row * tile_size; // 48 x 12 = 576px

	Thread game_thread; // Something we can start and stop (useful for repetition)

	public GamePanel() {
		// Sets the size of the window
		this.setPreferredSize(new Dimension(screen_width, screen_height));
		this.setBackground(Color.black);
		this.setDoubleBuffered(true); // Makes the rendering more performatic
	}

	public void start_game_thread() {
		game_thread = new Thread(this);
		game_thread.start();
	}

	@Override
	public void run() {

	}
}
