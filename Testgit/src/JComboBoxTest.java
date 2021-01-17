import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JComboBoxTest extends JFrame implements ItemListener{
	JTextArea ta = new JTextArea();
	JScrollPane sp = new JScrollPane(ta);
	JPanel pnl = new JPanel();
	JComboBox<String> cb, cb2, cb3;
	String[] colorName = {"red", "blue" ,"pink","cyan","gray"};
	Color[] color = {Color.red, Color.blue, Color.pink, Color.cyan, Color.gray};
	DefaultComboBoxModel<String> dcbm = new DefaultComboBoxModel<String>();
	public JComboBoxTest() {
		super();
		
		add(sp);
		add(pnl, BorderLayout.NORTH);
		
		//cb  --> JComboBox(E[] items)
		cb = new JComboBox<String>(colorName);
		pnl.add(cb);
		
		//cb2  --> JComboBox(Vector<E> items)
		Vector<String> vt = new Vector<String>();
		vt.add("홍길동"); vt.add("김길동"); vt.add("최길동"); vt.add("유길동"); vt.add("감길동"); 
		cb2 = new JComboBox<String>(vt);
		pnl.add(cb2);
		
		//cb3--> JComboBox(ComboBoxModel<E> aModel)
		dcbm.addElement("Java"); dcbm.addElement("Oracle");dcbm.addElement("Spring");dcbm.addElement("Mybatis");    
		cb3 = new JComboBox<String>(dcbm);
		pnl.add(cb3);
	
		
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		cb.addItemListener(this);
		cb3.addItemListener(this);
		
	}
	
	public void itemStateChanged(ItemEvent e) {
		Object obj = e.getSource();
		if(obj == cb3) {
			String str = (String)cb3.getSelectedItem();
			ta.append(str +"\n");
		}else if(obj == cb) {
			int index = cb.getSelectedIndex();
			ta.setBackground(color[index]);
		}
	}
	
	

	public static void main(String[] args) {
		new JComboBoxTest();

	}

}
