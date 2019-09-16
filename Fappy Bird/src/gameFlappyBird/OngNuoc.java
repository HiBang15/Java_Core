package gameFlappyBird;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

public class OngNuoc extends JPanel{
	private static int x1 =500,x2=x1+200,x3=x2+300,x4=x3+400;
	private int h1,h2,h3,h4;
	public static boolean b11 = false;
	public static boolean b12 = false;
	public static boolean b13 = false;
	public static boolean b14 = false;
	
	public void ngaunhienH() {
		Random rd = new Random();
		if(b11 == false) {
			 h1 = rd.nextInt(200);//hien thi ra ngau nhien trong khoang tu 0-199
			 b11 = true;
		}
		if(b12 == false) {
			h2 = rd.nextInt(200);//hien thi ra ngau nhien trong khoang tu 0-199
			b12 = true;
		}
		if(b13 == false) {
			h3 = rd.nextInt(200);//hien thi ra ngau nhien trong khoang tu 0-199
			b13 = true;
		}
		if(b14 == false) {
			h4 = rd.nextInt(200);//hien thi ra ngau nhien trong khoang tu 0-199
			b14= true;
		}
		
		 
		 
		 
	}
	
	public void paint(Graphics g) {
		
		Random rd = new Random();
		ngaunhienH();
		
		//		ong nuoc phia tren
		g.setColor(Color.green);
		g.fillRect(x1, 0, 65, h1);
		
		//		ong nuoc phia duoi
		g.setColor(Color.green);
		g.fillRect(x1, h1+100, 65, 500);
		
		//		ong nuoc phia tren
		g.setColor(Color.green);
		g.fillRect(x2, 0, 65, h2);
		
		//		ong nuoc phia duoi
		g.setColor(Color.green);
		g.fillRect(x2, h2+100, 65, 500);
		
		//		ong nuoc phia tren
		g.setColor(Color.green);
		g.fillRect(x3, 0, 65, h3);
		
		//		ong nuoc phia duoi
		g.setColor(Color.green);
		g.fillRect(x3, h3+100, 65, 500);
		
		//		ong nuoc phia tren
		g.setColor(Color.green);
		g.fillRect(x4, 0, 65, h4);
		
		//		ong nuoc phia duoi
		g.setColor(Color.green);
		g.fillRect(x4, h4+100, 65, 500);
	}
	public void giamX() {
		x1--;
		x2--;
		x3--;
		x4--;
	}
	public void lapLaiX() {
		if(x1 == -65) {
			x1=500;
			b11= false;
		}
		if(x2 == -65) {
			x2=500;
			b12 = false;
		}
		if(x3 == -65) {
			x3=500;
			b13 = false;
		}
		if(x4 == -65) {
			x4=500;
			b14 = false;
		}
	}
}
