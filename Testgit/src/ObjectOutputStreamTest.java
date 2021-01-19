import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectOutputStreamTest {

	public ObjectOutputStreamTest() {
		ArrayList<String> lst = new ArrayList<String>();
		
		lst.add(new String("해피해피"));
		lst.add(new String("뉴욕뉴욕"));
		
		try {
			File f = new File("d://work/ObjectTest.txt");
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(lst);
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new ObjectOutputStreamTest();

	}

}
