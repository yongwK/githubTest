import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JTableTest extends JFrame{
	String[] title = {"번호","조","직책","나이",};
	String[][] data = {
			{"1","1조","사원","22"},
			{"2","2조","사장","55"},
			{"3","3조","대리","31"},
			{"4","4조","차장","42"}
	};
	
	
	DefaultTableModel model = new DefaultTableModel(data, title);
	JTable table = new JTable(model);
	JScrollPane sp = new JScrollPane(table);
	

	JLabel lbl = new JLabel("선택하면 해당 내용이 출력됩니다.", JLabel.LEFT);
	
	public JTableTest() {
		
	add(sp);
	add(lbl, "South");
	
	
	setSize(500,500);
	setVisible(true);
	setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	
	table.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			int clickBtn = e.getButton();
			if(clickBtn ==1) {
				int selRow = table.getSelectedRow();
				String txt = "";
				for(int c= 0; c<table.getColumnCount(); c++) {
				Object obj = table.getValueAt(selRow, c);
				txt += obj+ ",  ";
				}
				lbl.setText(txt);
			}
		}
	});
	
	setTable();
	}
	
	public void setTable() {
		Object[] d = {"5","6조","과장","사람"};
		try {Thread.sleep(1000); }catch(Exception e) {}
		model.addRow(d);
		
		Object[] d2 = {"55","62조","과장","물개"};
		try {Thread.sleep(1000); }catch(Exception e) {}
		model.insertRow(3, d2);
		
		Object[] d3 = {"5125","1조","과장","들개"};
		try {Thread.sleep(1000); }catch(Exception e) {}
		model.moveRow(4, 5, 1);
		
		
		try {Thread.sleep(1000); }catch(Exception e) {}
		model.addColumn("사람이니");
		
		try {Thread.sleep(1000); }catch(Exception e) {}
		model.removeRow(3);
		
		try {Thread.sleep(1000); }catch(Exception e) {}
		table.removeColumn(table.getColumn("조"));
		
	}

	public static void main(String[] args) {
		new JTableTest();
		
	}

}
