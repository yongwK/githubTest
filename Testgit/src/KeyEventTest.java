import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class KeyEventTest extends JFrame implements KeyListener {
	
	JTextArea ta = new JTextArea();
	JScrollPane sp = new JScrollPane(ta);
	
	JPanel jp = new JPanel();
	JTextField tf = new JTextField(20);
	JButton btn = new JButton("보내기");
	

	public KeyEventTest() {
		super("key 이벤트");
		
		add(sp, BorderLayout.CENTER);
		add(jp, BorderLayout.SOUTH);
		
		jp.add(tf);
		jp.add(btn);
		
		
		
		
		
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		tf.addKeyListener(this);
		btn.addActionListener(new SendButton(ta,tf));
		
	}

	public void keyPressed(KeyEvent e) {	}
	public void keyReleased(KeyEvent e) {
		char keychar = e.getKeyChar();
		int keyint = e.getKeyCode();
		//System.out.println(keychar + keyint);
		if(keyint == KeyEvent.VK_ENTER) {
			ta.append(tf.getText()+"\n");
			tf.setText("");
		}
	}
	public void keyTyped(KeyEvent e) {	}
	
	
	
	
	
	
	public static void main(String[] args) {
		new KeyEventTest();
		

	}

}
