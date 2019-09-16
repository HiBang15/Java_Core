package gameFlappyBird;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class ConChim extends JPanel{
	private static int y = 200;
	
	public void paint(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(100, y, 45, 45);
	}
	//con chim roi xuong dat
	public void tangY() {
		y++;
	}
	//con chim bay len troi
	public void giamY() {
		y-=30;
	}
}
