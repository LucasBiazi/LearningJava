package main;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		
		// Creating a new window
		JFrame window = new JFrame();
		// Close window so it won't run in the background
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false); // Not resizable
		window.setTitle("Small Game"); // Window title
		
		window.setLocationRelativeTo(null); // Spawn window on the center of the screen
		window.setVisible(true); // Make it visible
	}

}
