package gamejar;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Timer;


public class GameEngine implements GameReporter{
	GamePanel panel;
	
	private Timer time;
	
	public GameEngine(GamePanel panel) {
		this.panel = panel;
		
		
		time = new Timer(50, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				process();
			}
		});
		
		time.setRepeats(true);
	}
	
	public void start(){
		time.start();
	}
	
	private void process(){
		panel.updateGameUI(this);
	}
}