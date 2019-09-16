package gameFlappyBird;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class ManHinh extends JFrame{
	
	private TapVe TapVeM = new TapVe();
	private ConChim ConChimM = new ConChim();
	
	public ManHinh() {
		setSize(500,500);//tao khung hinh kich thuoc 500x500
		setVisible(true);//hien thi khung cua so
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// tat chuong trinh khi nhan close
		setLocation(400,100);//vi tri khung cua so hien thi
		setResizable(false);
		add(TapVeM);//them doi tuong tap ve vao man hinh
		
		addKeyListener((KeyListener) new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				//khi ban vao ban phim se lam gi
				
				ConChimM.giamY();
			}
			
		});
		addMouseListener((MouseListener) new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				ConChimM.giamY();
			}
			
		});
	}
	public static void main(String[] args) {
		ManHinh mh = new ManHinh();
	}
}
