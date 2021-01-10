import java.text.SimpleDateFormat;
import java.util.Calendar;

public class GenericTestMain {

	public GenericTestMain() {
		GenericTest<String> gt = new GenericTest<String>();
		gt.setUsername("홍길동");
		System.out.println("gt -> " + gt.getUsername());
		
		GenericTest<Calendar> gt2 = new GenericTest<Calendar>();
		gt2.setUsername(Calendar.getInstance());
		gt2.dateOutput();
		
		
	}
	
	

	public static void main(String[] args) {
		new GenericTestMain();

	}

}
