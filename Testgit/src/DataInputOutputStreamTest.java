import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputStreamTest {

	public DataInputOutputStreamTest() {
		
		
		
		try {

			File f = new File("d://io","happy.txt");
			FileOutputStream is = new FileOutputStream(f);
			DataOutputStream dos = new DataOutputStream(is);
			
			int num = 123456;
			char str= 'c';
			double num2 = 325.235;
			boolean boo = true;
			
			dos.writeInt(num);
			dos.writeChar(str);
			dos.writeDouble(num2);
			dos.writeBoolean(boo);
			dos.close();
			
			FileInputStream fis = new FileInputStream(f);
			DataInputStream dis = new DataInputStream(fis);
			
			int numIn = dis.readInt();
			char charIn = dis.readChar();
			double num2In = dis.readDouble();
			boolean booIn = dis.readBoolean();
		
			System.out.println("numIn=" + numIn);
			System.out.println("charIn=" + charIn);
			System.out.println("num2In=" + num2In);
			System.out.println("booIn=" + booIn);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		 
	}

	public static void main(String[] args) {
		new DataInputOutputStreamTest();

	}

}
