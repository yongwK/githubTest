import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class calculatorTest extends JFrame implements ActionListener {
	JTextArea ta = new JTextArea();
	JTextField tf = new JTextField();
	JPanel pnl1= new JPanel();
	JPanel pnl2= new JPanel();
	JButton strBtn = new JButton("BackSpace"); JButton strBtn2 = new JButton("Clear"); JButton strBtn3 = new JButton("End");
	JPanel pnl3 = new JPanel();
	JButton btn1 = new JButton("7");		JButton btn2 = new JButton("8");	JButton btn3 = new JButton("9");
	JButton btn4 = new JButton("+");	JButton btn5 = new JButton("4");	JButton btn6 = new JButton("5");
	JButton btn7 = new JButton("6");	JButton btn8 = new JButton("-");	JButton btn9 = new JButton("1");
	JButton btn10 = new JButton("2");	JButton btn11 = new JButton("3");	JButton btn12 = new JButton("*");
	JButton btn13 = new JButton("0");	JButton btn14 = new JButton(".");	JButton btn15 = new JButton("=");
	JButton btn16 = new JButton("/");
	
	
	
	public calculatorTest() {
		super();
		add(pnl1, BorderLayout.NORTH);
		pnl1.setLayout(new GridLayout(0,1));
		pnl1.add(tf);
		
		pnl1.add(pnl2);
		pnl2.setLayout(new GridLayout(0,3));
		pnl2.add(strBtn); pnl2.add(strBtn2); pnl2.add(strBtn3);
		
		add(pnl3);
		pnl3.setLayout(new GridLayout(0,4,3,3));
		pnl3.add(btn1); pnl3.add(btn2); pnl3.add(btn3); pnl3.add(btn4); pnl3.add(btn5); pnl3.add(btn6);
		pnl3.add(btn7); pnl3.add(btn8); pnl3.add(btn9); pnl3.add(btn10); pnl3.add(btn11); pnl3.add(btn12);
		pnl3.add(btn13); pnl3.add(btn14); pnl3.add(btn15); pnl3.add(btn16);
		
		
		
		setSize(270,230);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		strBtn.addActionListener(this); strBtn2.addActionListener(this); strBtn3.addActionListener(this);
		
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		Object obj = ae.getSource();
		if(obj == strBtn3) {
			System.exit(0);
		}else if(obj == strBtn2) {
			tf.setText("");
		}else if(obj == strBtn) {
			
		}else {
		
		}
			
	
	}
		
	
	
	

	public static void main(String[] args) {
		new calculatorTest();

	}

}
