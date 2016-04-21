package gamejar;

import javax.swing.JFrame;
import java.awt.BorderLayout;

public class Main {
	public static void main(String[] args){
		
	
		JFrame frame = new JFrame("Space War");
		

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 650); //size of frame
		
		
		GamePanel gp = new GamePanel();
		GameEngine engine = new GameEngine(gp);
		
		
		
		frame.getContentPane().setLayout(new BorderLayout());
		frame.getContentPane().add(gp, BorderLayout.CENTER);
		
		frame.setVisible(true);
		engine.start();
	}
}