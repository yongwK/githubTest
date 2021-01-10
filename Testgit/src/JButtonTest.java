import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;

public class JButtonTest extends JFrame {

	public JButtonTest() {
		super("JButton 연습중");
		setSize(500,500);
		setLayout(new GridLayout(0,3,20,20));
		
		//Icon 생성
		ImageIcon img = new ImageIcon("img/movie01.png");
		ImageIcon img2 = new ImageIcon("img/movie02.png");
		ImageIcon img3 = new ImageIcon("img/movie03.png");
		ImageIcon img4 = new ImageIcon("img/movie04.png");
		ImageIcon img5 = new ImageIcon("img/movie05.png");
		
		// ICon있는 버튼 생성
		JButton btn = new JButton(img);
		// 버튼의 비활성화
		btn.setEnabled(false);
		
		JButton btn2 = new JButton(img2);
		JButton btn3 = new JButton(img3);
		JButton btn4 = new JButton(img4);
		JButton btn5 = new JButton(img5);
		
		
		add(btn); add(btn2); add(btn3); add(btn4); add(btn5);
		
		// 마우스 가져다 대면 변함
		btn2.setRolloverIcon(img3);
		// 마우스 가져다 대고 클릭해야변함
		btn2.setPressedIcon(img4);
		
		//JRadioButton 생성
		JPanel jpnl = new JPanel(new GridLayout(3,0) );
		
		JRadioButton jbtn = new JRadioButton("버튼1");
		JRadioButton jbtn2 = new JRadioButton("버튼2");
		JRadioButton jbtn3 = new JRadioButton("버튼3" , true);
		
		jpnl.add(jbtn); jpnl.add(jbtn2); jpnl.add(jbtn3);
		add(jpnl);
		
		//JRadioButton Group화
		ButtonGroup bg = new ButtonGroup();
		bg.add(jbtn); bg.add(jbtn2);  bg.add(jbtn3);
		
		//JToggleButton
		JToggleButton jb = new JToggleButton("토글버튼");
		JToggleButton jb2 = new JToggleButton("토글버튼", img5, true);
		add(jb);
		add(jb2);
		
		//setBackgound() 버튼 뒷배경색
		btn3.setBackground(Color.green);
		
		Color clr = new Color(200,100,50);
		btn4.setBackground(clr);
		
		//JLabel
		JLabel jLbl = new JLabel("설명정도로 이해");
		JLabel jLbl2 = new JLabel("설명정도로 이해", JLabel.CENTER);
		add(jLbl);
		add(jLbl2);
		
		//라벨은 배경이 투명처리 되있기 때문에 꺼줘야 배경이 씌워진다. 
		jLbl.setBackground(Color.green);
		// 라벨의 투명 끄기
		jLbl.setOpaque(true);
		
		//setToolTipText
		jb2.setToolTipText("설명충");
		
		
		//창보이게
		setVisible(true);
		// 메모리에서 자원 해제
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

	public static void main(String[] args) {
		new JButtonTest();
	}

}
