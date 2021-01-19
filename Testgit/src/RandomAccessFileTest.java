import java.io.File;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public RandomAccessFileTest() {
		try {
			
			File f = new File("d://work/random.txt");
			RandomAccessFile raf = new RandomAccessFile(f, "rw");
			
			String str = "Hello Java hack NoDap";
			raf.writeChars(str);
			
			String str2 = "Sample haha jamjam";
			
			raf.seek(3);
			byte str2Arr[] = str2.getBytes();
			raf.write(str2Arr,0,str2Arr.length);
			
			
			
			//읽어오기
			raf.seek(3);
			String readData = raf.readLine();
			System.out.println(readData);
			
			byte[] readData2 = new byte[20]; 
			raf.seek(3);
			int strCount = raf.read(readData2, 0, readData2.length);
			
			String readData3 = new String(readData2,0,strCount);
			System.out.println(readData3);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

	public static void main(String[] args) {
		new RandomAccessFileTest();

	}

}
