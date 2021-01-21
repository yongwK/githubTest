import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class ReadWrite {

	public ReadWrite() {
		
		
		try {
			
			File f = new File("d://work/member.xls");
			
			FileInputStream ir = new FileInputStream(f);
			
			POIFSFileSystem poi = new POIFSFileSystem(ir);
			
			HSSFWorkbook workbook = new HSSFWorkbook(poi);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new ReadWrite();

	}

}
