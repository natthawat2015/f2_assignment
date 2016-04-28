package gamejar;

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;

//Abstract class
public abstract class Sprite { 
	int x , y, width, hieght;
	
	public Sprite(int x, int y, int width, int hieght) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.hieght = hieght;
	}

	//Abstract mathod
	abstract public void draw(Graphics2D g);
	
	public Double getRectangle() {
		return new Rectangle2D.Double(x, y, width, hieght);
	}
}