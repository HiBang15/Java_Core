package gameFlappyBird;

import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JPanel;

public class TapVe extends JPanel implements Runnable{
	
	ConChim ConChimT = new ConChim();
	OngNuoc OngNuocT = new OngNuoc();
	
	public TapVe() {
		Thread threadTV =  new Thread(this);
		threadTV.start();
	}

	public void paint(Graphics g) {
		g.setColor(Color.cyan);
		g.fillRect(0, 0, getWidth(), getHeight());
		OngNuocT.paint(g);
		
		g.setColor(Color.green);
		g.fillRect(0, 400, getWidth(), getHeight());
		g.setColor(Color.orange);
		g.fillRect(0, 410, getWidth(), getHeight());
		ConChimT.paint(g);
		
	}
	@Override
	public void run() {
		//vong ap vo han
		while(true) {
			repaint();// goi lai paint
			OngNuocT.giamX();//goi phuong thuc giamX cua class OngNuoc
			try {
				Thread.sleep(5);//chuong trinh dung lai 5s
			} catch (InterruptedException e) {
//				Object ex;
				// TODO Auto-generated catch block
//				e.printStackTrace();
				Logger.getLogger(TapVe.class.getName()).log(Level.SEVERE, null, e);
			}
			OngNuocT.lapLaiX();// goi den phuong thuc ...... cua class ong nuoc
			
			ConChimT.tangY(); 
		}
		
	}
}
