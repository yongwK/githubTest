import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame implements ActionListener{
	Font fnt = new Font("Arial",Font.BOLD, 20);
	JTextField tf = new JTextField("0.0");
	
	JPanel centerPane = new JPanel(new BorderLayout());
	JPanel northPane = new JPanel(new GridLayout(1,3));
	JPanel btnPane = new JPanel(new GridLayout(4,4,3,3));
	
	String[] btn = {"BackSpace","Clear","End",
					"7","8","9","+",
					"4","5","6","-",
					"1","2","3","*",
					"0",".","=","/"};
	
	String operator = "";
	double number = 0.0;
	public Calculator() {
		
		super("계산기");
		
		add(tf, BorderLayout.NORTH);
		tf.setFont(fnt);
		
		tf.setHorizontalAlignment(JTextField.RIGHT);
		
		add(centerPane, BorderLayout.CENTER);
		centerPane.add(northPane,BorderLayout.NORTH);
		centerPane.add(btnPane,BorderLayout.CENTER);
		
		for(int i = 0; i<btn.length; i++) {
			JButton button = new JButton(btn[i]);
			if(i<=2) {
				northPane.add(button);
			}else {
				btnPane.add(button);
				button.setBackground(Color.LIGHT_GRAY);
			}
			
			button.addActionListener(this);
		}
		
		
		
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
	}

	public void actionPerformed(ActionEvent ae) {
		String eventBtn = ae.getActionCommand();
		
		switch(eventBtn) {
			case "End": System.exit(0); break;
			
			case "0": case "1": case "2": case "3": case "4": case "5":
			case "6": case "7": case "8": case "9":	setNumber(eventBtn); break;
				
			case ".":	setPoint(); break;
				
			case "BackSpace":	setBackSpace(); break;
			
			case "+": case "-": case "*": case "/": setOperator(eventBtn); break;
			
			case "=": setResult(); break;
			
			case "Clear": break;
		}
	}
	
	public void setClear() {
		number = 0.0;
		operator = "";
		tf.setText("0.0");
	}
	
	public void setResult() {
		double secondNum = Double.parseDouble(tf.getText());
		switch(operator) {
			case "+": number += secondNum; break;
			case "-": number -= secondNum; break;
			case "*": number *= secondNum; break;
			case "/": number /= secondNum; break;
		}
		tf.setText(String.valueOf(number));
		operator = "";
	}
	
	
	public void setOperator(String operator) {
		number = Double.parseDouble(tf.getText());
		tf.setText("");
		this.operator = operator;
	}
	
	public void setBackSpace() {
		String lblStr = tf.getText();
		lblStr = lblStr.substring(0,lblStr.length()-1);
		tf.setText(lblStr);
	}
	
	public void setPoint() {
		String lblStr = tf.getText();
		if(lblStr.indexOf(".") == -1) {
			tf.setText(lblStr + ".");
		}
	}
	
	
	public void setNumber(String num) {
		String lblStr = tf.getText();
		if(lblStr.equals("0.0")) {
			tf.setText(num);
		}else {
			tf.setText(lblStr+num);
		}
	}
	
	
	public static void main(String[] args) {
		new Calculator();

	}

}
