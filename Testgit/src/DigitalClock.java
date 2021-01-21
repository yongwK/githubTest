import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class DigitalClock extends JFrame{
	Font fnt = new Font("굴림체", Font.BOLD, 100);
	JLabel lbl= new JLabel("00:00:00");
	SimpleDateFormat sdf = new SimpleDateFormat("HH:MM:ss");
	
	public DigitalClock() {
	
	add(lbl);
	lbl.setFont(fnt);
	pack();
	setVisible(true);
	setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	
	
	setTime();
	
	
	}
	
	public void setTime() {
		while(true) {
			// 시간을 계속 지난걸 알려주려면 여기서 
			// Calendar now = Calendar.getInstance(); 이메서드가 
			// 반복적으로 실행 되어야 한다.
			Calendar now = Calendar.getInstance();
			String time = sdf.format(now.getTime());
			lbl.setText(time);
			try {Thread.sleep(1000);} catch(Exception e) {}
		}
		
		
	}
	
	public static void main(String[] args) {
		new DigitalClock();

	}

}
