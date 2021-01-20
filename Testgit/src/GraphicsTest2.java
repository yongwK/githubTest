import java.awt.Canvas;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JFrame;

public class GraphicsTest2 extends JFrame {
	MyCanvas mc = new MyCanvas();
	
	public GraphicsTest2() {
		super("그림판");
		add(mc);
		
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		while(true) {
			mc.repaint();
			
			try {
				Thread.sleep(1000); 
			}catch(Exception e) {	}
		}
	}

	
	
	
	public class MyCanvas extends Canvas{
		Random ran = new Random();
		
		public void paint(Graphics g) {
			int x = ran.nextInt(300);
			int y = ran.nextInt(300);
			g.fillOval(x,y,10,10);
			
		}
		public void update(Graphics g) {
			paint(g); // 이전에 그린그림이 g에 담겨있다.
		}
	}
	
	
	
	public static void main(String[] args) {
		new GraphicsTest2();

	}

}
