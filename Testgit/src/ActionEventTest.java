import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;



public class ActionEventTest implements ActionListener {

	JFrame frm = new JFrame("Action Event");
	JButton btn = new JButton("클릭");
	JButton btn2 = new JButton("3단");
	JTextArea ta = new JTextArea("버튼을 클릭하세요");
	JScrollPane sp = new JScrollPane(ta);
	
	public ActionEventTest() {
		
		frm.add(btn, BorderLayout.NORTH);
		frm.add(sp);
		frm.add(btn2, BorderLayout.SOUTH);
		
		
		
		frm.setSize(500,500);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(frm.DISPOSE_ON_CLOSE);
		
		
		btn.addActionListener(this);
		btn2.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae) {
		// 라벨을 불러오는 방식
		/*
		String label = ae.getActionCommand();
		if(label.equals("클릭")) {
			ta.append("btn버튼 클릭\n");
		}else if(label.equals("3단")){
			gugudan(3);
		}
		*/
		//객체로 불러오는방법
		Object obj = ae.getSource();
		if(obj == btn) {
			ta.append("클릭\n");
		}else if(obj == btn2) {
			gugudan(9);
		}
	}
	
	
	public void gugudan(int dan) {
		for(int i = 1; i<=9; i++) {
			ta.append(dan + "*" + i +" = " + (dan*i) + "\n" );
		}
	}
	
	public static void main(String[] args) {
		new ActionEventTest();

	}

}
