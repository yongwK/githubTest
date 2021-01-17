import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calTest extends JFrame implements ActionListener{
	
	JTextField tf = new JTextField();
	JPanel pnl = new JPanel();
	JButton strBtn = new JButton("BackSpace"); JButton strBtn2 = new JButton("Clear"); JButton strBtn3 = new JButton("End");
	JPanel pnl2 = new JPanel();
	JButton btn1 = new JButton("7");		JButton btn2 = new JButton("8");	JButton btn3 = new JButton("9");
	JButton btn4 = new JButton("+");	JButton btn5 = new JButton("4");	JButton btn6 = new JButton("5");
	JButton btn7 = new JButton("6");	JButton btn8 = new JButton("-");	JButton btn9 = new JButton("1");
	JButton btn10 = new JButton("2");	JButton btn11 = new JButton("3");	JButton btn12 = new JButton("*");
	JButton btn13 = new JButton("0");	JButton btn14 = new JButton(".");	JButton btn15 = new JButton("=");
	JButton btn16 = new JButton("/");
	
	
	
	public calTest() {
		super();
	
		
		
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		Image img = kit.getImage("img/사진.png");
		setIconImage(img);
		
		
		
		
		
		add(tf, BorderLayout.NORTH); 
		add(pnl);
		pnl.add(strBtn, FlowLayout.LEFT); pnl.add(strBtn2); pnl.add(strBtn3,FlowLayout.RIGHT);
		
		
		add(pnl2, BorderLayout.SOUTH);
		pnl2.setLayout(new GridLayout(0,4,3,3));
		pnl2.setBackground(Color.blue);
		
		pnl2.add(btn1); pnl2.add(btn2); pnl2.add(btn3); pnl2.add(btn4); pnl2.add(btn5); pnl2.add(btn6);
		pnl2.add(btn7); pnl2.add(btn8); pnl2.add(btn9); pnl2.add(btn10); pnl2.add(btn11); pnl2.add(btn12);
		pnl2.add(btn13); pnl2.add(btn14); pnl2.add(btn15); pnl2.add(btn16);
		btn1.setBackground(Color.gray);	btn2.setBackground(Color.gray);	btn3.setBackground(Color.gray);
		btn4.setBackground(Color.gray);	btn5.setBackground(Color.gray);	btn6.setBackground(Color.gray);
		btn7.setBackground(Color.gray);	btn8.setBackground(Color.gray);	btn9.setBackground(Color.gray);
		btn10.setBackground(Color.gray); btn11.setBackground(Color.gray); btn12.setBackground(Color.gray);
		btn13.setBackground(Color.gray); btn14.setBackground(Color.gray); btn15.setBackground(Color.gray);
		btn16.setBackground(Color.gray);
	
		
		
		
		
		
		setSize(270,230);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		
	}	
	public void actionPerformed(ActionEvent ae) {
		Object obj = ae.getSource();
		if(obj == strBtn3) {
			System.exit(0);
		}
		
	}
		
		
	

	public static void main(String[] args) {
		new calTest();

	}

}
