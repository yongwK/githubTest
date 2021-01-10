import java.awt.GridLayout;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JFrameTest extends JFrame{

	public JFrameTest() {
		super("JFame 연습중");
		
		setSize(500,500);
		
		Panel pel = new Panel(new GridLayout());
		// GridLayout -> 바둑판실 배열
		
		JButton btn = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		JButton btn3 = new JButton("버튼3");
		JButton btn4 = new JButton("버튼4");
		JButton btn5 = new JButton("버튼5");
		
		pel.add(btn); pel.add(btn2); pel.add(btn3); pel.add(btn4); pel.add(btn5);
		
		add(pel);
		
		
		
		
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		
	}

	public static void main(String[] args) {
		new JFrameTest();

	}

}
