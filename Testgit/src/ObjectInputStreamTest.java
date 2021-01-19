import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ObjectInputStreamTest {

	public ObjectInputStreamTest() {
		try {
			File f = new File("d://work/ObjectTest.txt");
			FileInputStream fis = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			ArrayList lst = (ArrayList)ois.readObject();
			
			String str1 = (String)lst.get(0);
			String str2 = (String)lst.get(1);
			
			System.out.println(str1 + str2);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		new ObjectInputStreamTest();

	}

}
