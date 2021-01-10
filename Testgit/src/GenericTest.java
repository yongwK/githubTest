import java.text.SimpleDateFormat;
import java.util.Calendar;

public class GenericTest<T> {
	private T username;
	
	public GenericTest() {}
	public GenericTest(T username) {
		this.username = username;
	}


	public T getUsername() {
		return username;
	}


	public void setUsername(T username) {
		this.username = username;
	}

	public void dateOutput() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String fmt = format.format(((Calendar)username).getTime());
		System.out.println("fmt->"+fmt);
	}
	
}	

/* 제너릭 -> 타입에 따라서 결정짓게만듬
 * E : elements
 * K : key
 * V : value
 */
