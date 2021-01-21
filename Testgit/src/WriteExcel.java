import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class WriteExcel {

	public WriteExcel() {
		HSSFWorkbook workBook = new HSSFWorkbook();
		
		HSSFSheet sheet = workBook.createSheet("Excel 쓰기 연습");
		
		HSSFRow row = sheet.createRow(0);
		
		HSSFCell cell = row.createCell(0);
		
		// value 값 셋팅
		cell.setCellValue("번호");
		
		//한번에 생성 및 값 셋팅 방법
		row.createCell(1).setCellValue("이름");
		row.createCell(2).setCellValue("연락처");
		row.createCell(3).setCellValue("이메일");
	
	
	
		String data[][] = {
			{"1","홍길동","010-1234-5678","aaaaa@nate.com"},
			{"2","김길동","010-1111-2222","bbbbb@nate.com"},
			{"3","박길동","010-7777-8888","ccccc@nate.com"},
			{"4","이길동","010-1234-2222","eeeee@nate.com"},
			{"5","최길동","010-8888-5678","fffff@nate.com"}
		};
	
		for(int r = 1; r<=data.length; r++) { // 1,2,3,4, 5
		
		
		HSSFRow cRow = sheet.createRow(r);
		
		
		for(int c = 0; c<data[r-1].length; c++) { //0,1,2,3
			
			// 엑셀에 데이터를 대입할떄 숫자는 문자-> 숫자로 바꿔야한다.
			
			if(c==0)
			cRow.createCell(c).setCellValue(Integer.parseInt(data[r-1][c]));
			
			else 
			cRow.createCell(c).setCellValue(data[r-1][c]);
			
			}
		}
	
		//데이터를 생성해서 저장했으니  파일을 write한다
		// 데이터 타입이 현재 문자와 숫자이므로 FileOutputStream으로 해야한다.
		// 만약에 다른 데이터 타입이면 데이터 타입에 맞게 사용해야 한다
		
		File f = new File("d://work/member.xls");
		
		try {
			
			FileOutputStream fos = new FileOutputStream(f);
			workBook.write(fos);
			workBook.close();
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("엑셀쓰기완료");
	
	
	}
	
	
	public static void main(String[] args) {
		new WriteExcel();

	}

}
