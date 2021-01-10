import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;

public class FrameTest {

	public FrameTest() {
		
		Frame frm = new Frame();

		frm.setTitle("이거야이거");
		//frm.getTitle();
		//Frame frm = new Frmae("이거야이거"); //위와 동일
		//창 사이즈 결정
		//frm.setSize(200,200); 

		Dimension dm = new Dimension(500,500);
		//frm.setSize(dm);
		
		//frm.setBounds(100, 100, 600, 500);
		
		Rectangle rt = new Rectangle(300,300,500,500);
		frm.setBounds(rt);
		
		// 프레임 이미지 바꾸기
		// frm.setIconImage(Image image)--> Image 만들어서 대입
		// Image ----- getImage(String filename) < Toolkit class >
		// Toolkit 추상 매서드이므로 new 로 객체 생성하지 못하므로
		// return 을 Toolkit 하는 매서드를 사용해야 한다.
		Toolkit kit = Toolkit.getDefaultToolkit();
		Image img = kit.getImage("img/1.jpg");
		frm.setIconImage(img);
		
		
		
		// button
		Button btn = new Button();
		
		btn.setLabel("이게맞나");
		//btn.getLabel();
		
		//Button btn = new Button("이게맞나"); 위와 동일
		
		frm.add(btn, BorderLayout.CENTER);
		
		Button btn2 = new Button("생성자에서 라벨을 바로 만들어도됨");
		frm.add(btn2, BorderLayout.NORTH);
		
		frm.add(new Button("3번쨰 버튼"), BorderLayout.SOUTH);
		frm.add(new Button("4번쨰 버튼"), BorderLayout.EAST);
		frm.add(new Button("5번쨰 버튼"), BorderLayout.WEST);
		
		
		
		//창 보이게 설정
		frm.setVisible(true);
		// 버튼도 안보이게 설정가능
		//btn2.setVisible(false);
		
		
	}

	public static void main(String[] args) {
		new FrameTest();

	}

}
