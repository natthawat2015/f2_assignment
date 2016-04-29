package gamejar;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Timer;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.Iterator;


public class GameEngine implements GameReporter{
	GamePanel panel;
	
	private SpaceShip v;
	
	private ArrayList<Enemy> enemies = new ArrayList<Enemy>();
	private Timer time;
	
	private double difficulty = 0.1;
	
	public GameEngine(GamePanel panel, SpaceShip v) {
		this.panel = panel;
		this.v = v;
		
		gp.sprites.add(v);
		
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
	private void generateEnemy(){
		Enemy e = new Enemy((int)(Math.random()*390), 30);
		gp.sprites.add(e);
		enemies.add(e);
	}
	
	private void process(){
		if(Math.random() < difficulty){
			generateEnemy();
		}
		
		Iterator<Enemy> e_iter = enemies.iterator();
		while(e_iter.hasNext()){
			Enemy e = e_iter.next();
			e.proceed();

			if(!e.isAlive()){
				e_iter.remove();
				gp.sprites.remove(e);

			}
		}

		gp.updateGameUI(this);
		
		Rectangle2D.Double er;
		for(Enemy e : enemies){
			er = e.getRectangle();
			return;

			}
	}
	

	
	@Override
	public void keyPressed(KeyEvent e) {
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		//do nothing
	}

	@Override
	public void keyTyped(KeyEvent e) {
		//do nothing		
	}
	

}
