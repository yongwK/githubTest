import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
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

public class CalendarGuiTest extends JFrame implements ActionListener{
	Calendar now = Calendar.getInstance();
		
	JPanel selPane = new JPanel();
		JButton before = new JButton("◀");
		JComboBox<Integer> selYear = new JComboBox<Integer>();
		DefaultComboBoxModel<Integer> selYearModel = new DefaultComboBoxModel<Integer>();
		JLabel strYear = new JLabel("년");
		JComboBox<Integer> selMonth = new JComboBox<Integer>();
		DefaultComboBoxModel<Integer> selMonthModel  = new DefaultComboBoxModel<Integer>();
		JLabel strMonth = new JLabel("월");
		JButton after = new JButton("▶");
		
		
	JPanel bigPane = new JPanel(new BorderLayout());
		JPanel northPane = new JPanel(new GridLayout(0,7));
		JPanel centerPane = new JPanel(new GridLayout(0,7));
	
	String[] lblStr = {"일", "월", "화", "수", "목", "금", "토"};
	String[] lblNum = {"1","2","3","4","5","6","7",
				"8","9","10","11","12","13","14","15","16","17","18","19","20","21",
				"22","23","24","25","26","27","28","29","30","31"};
	Font f = new Font("바탕", Font.BOLD, 20);
	
	int year;
	int month;
	int lastDay;
	int space;
	
	public CalendarGuiTest() {
		super("계산기");
		year = now.get(Calendar.YEAR);
		month = now.get(Calendar.MONTH);
		now.set(year, month, 1);
		lastDay = now.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		selPane.setBackground(Color.cyan);
		selPane.add(before);
		selPane.add(selYear);
		selPane.add(strYear);
		selPane.add(selMonth);
		selPane.add(strMonth);
		selPane.add(after);
		
		for(int i = 1970; i<=2300; i++) {
			selYearModel.addElement(i);
		}
		selYear.setModel(selYearModel);
		selYear.setSelectedItem(year);
		
		for(int i = 1; i<=12; i++) {
			selMonthModel.addElement(i);
		}
		selMonth.setModel(selMonthModel);
		selMonth.setSelectedItem(month);
		
		add(selPane, BorderLayout.NORTH);
		
		
		add(bigPane, BorderLayout.CENTER);
		bigPane.add(northPane, BorderLayout.NORTH);
			for(int i = 0; i<lblStr.length; i++) {
				JLabel weekName = new JLabel(lblStr[i], JLabel.CENTER);
				northPane.add(weekName);
				if(i == 0) {
					weekName.setForeground(Color.red);
				}else if(i==6) {
					weekName.setForeground(Color.blue);
				}
				
				
			}
		
		bigPane.add(centerPane, BorderLayout.CENTER);
		
		space = now.get(Calendar.DAY_OF_WEEK);
		for(int empty = 1; empty <space; empty++) {
			JLabel emptyRoom = new JLabel("", JLabel.CENTER);
			centerPane.add(emptyRoom);
		}
		for(int i = 0; i<=lblNum.length-1; i++) {
			JLabel calNum = new JLabel(lblNum[i], JLabel.CENTER);
			centerPane.add(calNum);
			if((space + i) % 7 == 0) {
				calNum.setForeground(Color.blue);
			}else if( (space+i) % 7 == 1){
				calNum.setForeground(Color.red);
			}
		}
		
		
		
		
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		before.addActionListener(this);
		selYear.addActionListener(this);
		selMonth.addActionListener(this);
		after.addActionListener(this);
		
		
	}

	
	public void actionPerformed(ActionEvent ae) {
		Object eventObj = ae.getSource();
		
		if(eventObj instanceof JButton) {
			if(eventObj == before) {
				
			}else if(eventObj == after) {
				
			}
		}
		
		else if(eventObj instanceof JComboBox) {
			if(eventObj == selYear) {
				changeYear();
			}else if(eventObj == selMonth) {
				changeMonth();
			}
		}
	}
	
	
	
	public void setCalendar() {
			
	}
	
	public void changeYear() {
		//centerPane을 초기화시키고 다시 넣으면 될것같은데..
		int year = (int)selYear.getSelectedItem();
		now.set(year, month, 1);
		lastDay = now.getActualMaximum(Calendar.DAY_OF_MONTH);
		space = now.get(Calendar.DAY_OF_WEEK);
		for(int empty = 1; empty <space; empty++) {
			JLabel emptyRoom = new JLabel("", JLabel.CENTER);
			centerPane.add(emptyRoom);
		}
		for(int i = 0; i<=lblNum.length-1; i++) {
			JLabel calNum = new JLabel(lblNum[i], JLabel.CENTER);
			centerPane.add(calNum);
			if((space + i) % 7 == 0) {
				calNum.setForeground(Color.blue);
			}else if( (space+i) % 7 == 1){
				calNum.setForeground(Color.red);
			}
		}
		
	}
	public void changeMonth() {
		
	}
	
	
	
	public static void main(String[] args) {
		new CalendarGuiTest();
	}

}
