import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CalendarGui extends JFrame implements ActionListener{
	JButton before = new JButton("◀");
	JButton after = new JButton("▶");
	
	JComboBox year = new JComboBox();
	DefaultComboBoxModel<Integer> yearModel = new DefaultComboBoxModel<Integer>();
	
	JComboBox month = new JComboBox();
	DefaultComboBoxModel<Integer> monthModel = new DefaultComboBoxModel<Integer>();
	
	JPanel select = new JPanel();
	JLabel yearStr = new JLabel("년");
	JLabel monthStr = new JLabel("월");
	
	JPanel jp = new JPanel(new GridLayout(0,7));
	

	String[] weekName = {"일", "월", "화", "수", "목", "금", "토","1","2","3","4","5","6","7",
						"8","9","10","11","12","13","14","15","16","17","18","19","20","21",
						"22","23","24","25","26","27","28","29","30","31"};
	
	//달력
	Calendar now = Calendar.getInstance();
	

	public CalendarGui() {
		super("캘린더");

		select.add(before);
		select.add(year);
		select.add(yearStr);
		select.add(month);
		select.add(monthStr);
		select.add(after);
		add(select, BorderLayout.NORTH);
		
		
		for(int i = 1970; i<=2300; i++) {
			yearModel.addElement(i);
		}
		year.setModel(yearModel);
		year.setSelectedItem(2021);
		
		for(int i = 1; i<=12; i++) {	
			monthModel.addElement(i);
		}
		month.setModel(monthModel);
		year.setSelectedItem(1);
		
		
		
		for(int i =0; i<weekName.length; i++) {
			JLabel lbl = new JLabel(weekName[i]);
			jp.add(lbl);
		}
		
		add(jp);
		
		
		
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		
		
		
		
	}

	
	public void actionPerformed(ActionEvent ae) {
		
	}
	
	public static void main(String[] args) {
		new CalendarGui();

	}

}
