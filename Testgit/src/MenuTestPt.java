import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;



public class MenuTestPt extends JFrame implements ActionListener {
	JTextArea ta = new JTextArea();
	JScrollPane  sp = new JScrollPane(ta);
	
	// JMenuBar
	JMenuBar jb = new JMenuBar();
		JMenu fileMenu = new JMenu("파일");
			JMenuItem newMenuItem = new JMenuItem("새문서");
			JMenuItem openMenuItem = new JMenuItem("열기");
			JMenuItem saveMenuItem = new JMenuItem("저장");
			JMenuItem endMenuItem = new JMenuItem("종료");
		JMenu editMenu = new JMenu("편집");
			JMenuItem cutMenuItem = new JMenuItem("오려두기");
			JMenuItem copyMenuItem = new JMenuItem("복사하기");
			JMenuItem pasteMenuItem = new JMenuItem("붙여넣기");
		JMenu runMenu = new JMenu("실행");
			JMenuItem chromMenuItem = new JMenuItem("크롬");
			JMenu editor = new JMenu("편집기");
				JMenuItem memoMenuItem = new JMenuItem("메모장");
			JMenuItem compileMenuItem = new JMenuItem("컴파일");
			
	// ToolBar
	JToolBar tb = new JToolBar();	
		ImageIcon img1 = new ImageIcon("icon/new01.gif"); JButton newBtn = new JButton(img1);
		ImageIcon img2 = new ImageIcon("icon/save01.gif"); JButton saveBtn = new JButton(img2);
		ImageIcon img3 = new ImageIcon("icon/open01.gif"); JButton openBtn = new JButton(img3);
		ImageIcon img4 = new ImageIcon("icon/bold01.gif"); JButton boldBtn = new JButton(img4);
		ImageIcon img5 = new ImageIcon("icon/italic01.gif"); JButton italicBtn = new JButton(img5);
		
	//JComboBOx
		
	JComboBox<String> fontName;
	
	JComboBox<Integer> fontSize = new JComboBox<Integer>();
	DefaultComboBoxModel<Integer> fontSizeModel = new DefaultComboBoxModel<Integer>();
	
	//Font 
	Font font = new Font("궁서체", Font.BOLD, 20);
	int bold = 0, italic = 0;
	
	//saveText
	String saveTxt = "";
	public MenuTestPt() {
		
		super("메모장");
		
		add(sp);
		
		fileMenu.add(newMenuItem);
		fileMenu.add(openMenuItem);
		fileMenu.add(saveMenuItem);
		fileMenu.addSeparator();
		fileMenu.add(endMenuItem);
		jb.add(fileMenu);
		
		editMenu.add(cutMenuItem);
		editMenu.add(copyMenuItem);
		editMenu.add(pasteMenuItem);
		jb.add(editMenu);
		
		runMenu.add(chromMenuItem);
		runMenu.add(editor);
			editor.add(memoMenuItem);
		runMenu.add(compileMenuItem);
		jb.add(runMenu);
		
		//JMenuBar 추가 super() 
		setJMenuBar(jb);
		
		// ToolBar 추가
		tb.add(newBtn);
		tb.add(saveBtn);
		tb.add(openBtn);
		tb.add(boldBtn);
		tb.add(italicBtn);
		add(tb,BorderLayout.NORTH);
		
		// JComboBoxModel 요소 추가 // fontSize에 JComboBoxModel 추가 
		// ToolBar 에 추가 JComboBox 의 초기 셋팅값 설정 
		for(int i = 13; i<=70; i+=2) {	fontSizeModel.addElement(i);   }
		fontSize.setModel(fontSizeModel);
		tb.add(fontSize);
		fontSize.setSelectedItem(19);
		
		
		
		// 윈도우 기본 글꼴 가져오기
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		String[] fontList = ge.getAvailableFontFamilyNames();
		fontName = new JComboBox(fontList);
		tb.add(fontName);
		fontName.setSelectedItem("굴림체");
		
		//단축키 설정 메서드(만들어야함)
		setShortCut();
		
	
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		newMenuItem.addActionListener(this);
		openMenuItem.addActionListener(this);
		saveMenuItem.addActionListener(this);
		endMenuItem.addActionListener(this);
		
		cutMenuItem.addActionListener(this);
		copyMenuItem.addActionListener(this);
		pasteMenuItem.addActionListener(this);
		
		chromMenuItem.addActionListener(this);
		memoMenuItem.addActionListener(this);
		compileMenuItem.addActionListener(this);
		
		newBtn.addActionListener(this);
		openBtn.addActionListener(this);
		saveBtn.addActionListener(this);
		boldBtn.addActionListener(this);
		italicBtn.addActionListener(this);
		fontSize.addActionListener(this);
		fontName.addActionListener(this);

	}

	

	
	public void actionPerformed(ActionEvent ae) {
		Object eventObj = ae.getSource();
		
		if(eventObj instanceof JMenuItem) {
			if(eventObj == openMenuItem) {
				fileOpen();
			}
			else if(eventObj == endMenuItem) {
				System.exit(0);
			}
			else if(eventObj == copyMenuItem) {
				fileCopy();
			}
			else if(eventObj == pasteMenuItem) {
				filePaste();
			}
			else if(eventObj == cutMenuItem) {
				fileCut();
			}
			else if(eventObj == chromMenuItem) {
				startRuntime("C://ProgramData/Microsoft/Windows/Start Menu/Programs/chrom.exe");
			}
			else if(eventObj == memoMenuItem) {
				startRuntime("notepad.exe");
			}
		}
		else if(eventObj instanceof JButton) {
			if(eventObj == boldBtn) {
				if(bold == 0) {
					bold = 1;
				}else {
					bold = 0;
				}
				font = new Font((String)fontName.getSelectedItem(), bold+italic, (Integer)fontSize.getSelectedItem());
				ta.setFont(font);
			}
			else if(eventObj == italicBtn){
				if(italic == 0 ) { italic =2; }
				else { italic = 0; }
				font = new Font((String)fontName.getSelectedItem(), bold+italic, (Integer)fontSize.getSelectedItem());
				ta.setFont(font);
			}
			else if(eventObj == openBtn) {
				fileOpen();
			}
		}
		else if(eventObj instanceof JComboBox) {
			if(eventObj == fontSize || eventObj == fontName) {
				font = new Font((String)fontName.getSelectedItem(), bold+italic, (Integer)fontSize.getSelectedItem());
				ta.setFont(font);
			}
		}
	}
	
	//단축키 설정
	public void setShortCut() {
		// 마스크(ActionEvnet 의 멤버변수에 있음) 와 키 (KeyEvent의 멤버변수에 있음)를 이용하여 단축키 설정 
		// 종료 단축키 ( ctrl + e )
		endMenuItem.setMnemonic(KeyEvent.VK_E);
		endMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.CTRL_MASK));
		
		// 새문서 단축키 ( ctrl + n )
		newMenuItem.setMnemonic(KeyEvent.VK_N);
		newMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));

		// 열기 단축키 ( alt + o )
		openMenuItem.setMnemonic(KeyEvent.VK_O);
		openMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.ALT_MASK));
		
		// 저장 단축키 ( ctrl + s )
		saveMenuItem.setMnemonic(KeyEvent.VK_S);
		saveMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
		
	}
	
	
	//외부 프로그램 실행시키기
	public void startRuntime(String process) {
		Runtime run = Runtime.getRuntime();
		try {
			run.exec(process);	
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	//잘라내기
	public void fileCut() {
		saveTxt = ta.getSelectedText();
		ta.replaceSelection("");
	}
	
	//붙여넣기
	public void filePaste() {
		if(saveTxt != null && !saveTxt.equals("")) {
			ta.replaceSelection(saveTxt);	
		}
	}
	//복사
	public void fileCopy() {
		saveTxt = ta.getSelectedText();
	}
	
	//파일열기
	public void fileOpen() {
		File f = new File("D://SAMPLE");
		
		JFileChooser fc = new JFileChooser(f);
		
		fc.setMultiSelectionEnabled(true);
		
		FileFilter ff1 = new FileNameExtensionFilter("이미지","jpg","jpeg","gif","png","bmp");
		fc.addChoosableFileFilter(ff1);
		FileFilter ff2 = new FileNameExtensionFilter("Java", "java","JAVA","JAVA");
		fc.addChoosableFileFilter(ff2);
		
		int state = fc.showOpenDialog(this);
	
		
		if(state == 0) {
			try {
				ta.setText("");
				File selFile[] = fc.getSelectedFiles();
				
				for(File ff : selFile) {
					FileReader fr = new FileReader(ff);
					BufferedReader bf = new BufferedReader(fr);
					
					while(true) {
						String inData = bf.readLine();
						if(inData == null) break;
						else System.out.println(inData+"\n");
					}
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		new MenuTestPt();

	}

}
