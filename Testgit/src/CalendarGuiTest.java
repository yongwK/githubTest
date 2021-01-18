import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.Calendar;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CalendarGuiTest extends JFrame{
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
	
	String[] lblStr = {"일", "월", "화", "수", "목", "금", "토","1","2","3","4","5","6","7",
				"8","9","10","11","12","13","14","15","16","17","18","19","20","21",
				"22","23","24","25","26","27","28","29","30","31"};
	
	
	
	
	
	
	public CalendarGuiTest() {
		super("계산기");
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH);
		
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
			for(int i = 0; i<7; i++) {
				JLabel weekName = new JLabel(lblStr[i], JLabel.CENTER);
				northPane.add(weekName);
			}
		
		bigPane.add(centerPane, BorderLayout.CENTER);
		
		int space = now.get(Calendar.DAY_OF_WEEK);
		for(int empty = 1; empty <space; empty++) {
			JLabel emptyRoom = new JLabel("", JLabel.CENTER);
			centerPane.add(emptyRoom);
		}
		
		
		
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		new CalendarGuiTest();
	}

}
