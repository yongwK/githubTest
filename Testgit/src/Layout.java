import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Layout extends JFrame {
	JPanel northPane = new JPanel(new GridLayout(0,1));
		JPanel numPane = new JPanel(new FlowLayout(FlowLayout.LEFT));
			JLabel numlbl = new JLabel("번호         ");
			JTextField numStr = new JTextField(3);
		JPanel namePane = new JPanel(new FlowLayout(FlowLayout.LEFT));
			JLabel namelbl = new JLabel("이름         ");
			JTextField nameStr = new JTextField(10);
		JPanel telPane = new JPanel(new FlowLayout(FlowLayout.LEFT));
			JLabel tellbl = new JLabel("전화번호");
			JTextField telStr = new JTextField(30);
		JPanel emailPane = new JPanel(new FlowLayout(FlowLayout.LEFT));
			JLabel emaillbl = new JLabel("이메일    ");
			JTextField emailStr = new JTextField(30);
		JPanel addrPane = new JPanel(new FlowLayout(FlowLayout.LEFT));
			JLabel addrlbl = new JLabel("주소        ");
			JTextField addrStr = new JTextField(50);
		JPanel writeDayPane = new JPanel(new FlowLayout(FlowLayout.LEFT));
			JLabel writeDaylbl = new JLabel("등록일   ");
			JTextField writeDayStr = new JTextField(50);
			
		JPanel centerPane = new JPanel(new BorderLayout());				
			JPanel btnPane = new JPanel(new GridLayout(0,7));
				JButton addBtn = new JButton("추가");
				JButton editBtn = new JButton("수정");
				JButton delBtn = new JButton("삭제");
				JButton eraserBtn = new JButton("지우기");
				JButton exitBtn = new JButton("종료");
				JButton saveToExcelBtn = new JButton("엑셀로저장");
				JButton pullToExcelBtn = new JButton("엑셀불러오기");
			
			JScrollPane sp = new JScrollPane();
			JTable table;
			String title[] = {"번호","이름","전화번호","이메일","주소","등록일"};
			String data[][];
			DefaultTableModel model;
			
			JPanel southPane = new JPanel();
				JTextField search = new JTextField(50);
				JButton searchBtn = new JButton("search");
		

	public Layout(){
		
		
		
		add(northPane, "North");
		northPane.add(numPane);
			numPane.add(numlbl);
			numPane.add(numStr);
		northPane.add(namePane);
			namePane.add(namelbl);
			namePane.add(nameStr);
		northPane.add(telPane);
			telPane.add(tellbl);
			telPane.add(telStr);
		northPane.add(emailPane);
			emailPane.add(emaillbl);
			emailPane.add(emailStr);
		northPane.add(addrPane);
			addrPane.add(addrlbl);
			addrPane.add(addrStr);
		northPane.add(writeDayPane);
			writeDayPane.add(writeDaylbl);
			writeDayPane.add(writeDayStr);
		
		add(centerPane,"Center");
		centerPane.add(btnPane, "North");
			btnPane.add(addBtn);
			btnPane.add(editBtn);
			btnPane.add(delBtn);
			btnPane.add(eraserBtn);
			btnPane.add(exitBtn);
			btnPane.add(saveToExcelBtn);
			btnPane.add(pullToExcelBtn);
			
		model = new DefaultTableModel(data, title);
		table = new JTable(model);
		sp = new JScrollPane(table);	
		
		centerPane.add(sp);
		centerPane.add(southPane, "South");
			southPane.add(search);
			southPane.add(searchBtn);
			
	
		setSize(1000,1000);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		
		
		
	}

	public static void main(String[] args) {
		new Layout();

	}

}
