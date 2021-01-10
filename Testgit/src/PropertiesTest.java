import java.util.Enumeration;
import java.util.Properties;

public class PropertiesTest {

	public PropertiesTest() {
	
		Properties pt = new Properties();
		
		
		pt.setProperty("1", "손담비");
		pt.setProperty("2", "송지효");
		pt.setProperty("3", "유재석");
		pt.setProperty("4", "이광수");
		
		
		String name = pt.getProperty("1");
		System.out.println(name);
		
		Enumeration<?> ekeylst = pt.propertyNames();
		while(ekeylst.hasMoreElements()) {
			String name1 = (String) ekeylst.nextElement();
			System.out.println(pt.getProperty(name1));
		}
		
		
	
		
		
		
		
	}

	
	
	
	public static void main(String[] args) {
	
		new PropertiesTest();

	}

}
