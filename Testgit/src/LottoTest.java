import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class LottoTest {
	Scanner sc = new Scanner(System.in);
	
	public LottoTest() {
		
		while(true) {
			
			while(true) {
				int gametimes = Gametimes();
				for(int i = 0; i<gametimes; i++) {
					System.out.print(i+1 +"번쨰게임 =");
					gameStart();
					
				}
				break;
			}
			
			if(moreGame() != true) {
				break;
			}
		}
	}


	// 게임수를 물어보는 메서드
	public int Gametimes() {
		int a =0;
		while(true) {
			try {
				System.out.println("게임수" + ":");
				a =  Integer.parseInt(sc.nextLine());
				if(a<=0 ) {
					throw new Exception("1이상의 정수를 입력하세요11111111111");
				}
				break;
			}catch(NumberFormatException nfe) {
				System.out.println("정수를 입력하세요");
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
			}
		return a;
	}
	
	public void gameStart() {
		Random ran = new Random();
		
		TreeSet<Integer> ti = new TreeSet<Integer>();
		int lstnum = 0;
		while(ti.size()!=7) {
			lstnum = ran.nextInt(45)+1;		
			ti.add(lstnum);
		}
		ti.remove(lstnum);
		System.out.println(ti.toString());
		
		System.out.println("보너스 숫자 : "+ lstnum);
	}
	
	public boolean moreGame() {
		boolean more = true;
		while(true) {
			try {
				System.out.println("게임을 더하시겠습니까(Y or y = 1, N or n = 2");
				int moreNum = Integer.parseInt(sc.nextLine());
				
				if(moreNum==1) {
					more = true;
					break;
				}else if(moreNum ==2) {
					more = false;
					break;
				}
			}catch(NumberFormatException nfe) {
				System.out.println("1아니면 2만 입력해라잉");
			}
		}
		return more;
		
	}
	
	
	
	 
	
	public static void main(String[] args) {
		new LottoTest();

	}

}
