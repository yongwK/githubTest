import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ObjectCompareTest {
	public ObjectCompareTest() {start();}
	public void start() {
		List<Member> lst = new ArrayList<Member>();
		
		lst.add(new Member(4, "홍길동", "010-1111-1234", "강원도 삼척시"));
		lst.add(new Member(3, "이순신", "010-5555-1587", "부산광역시"));
		lst.add(new Member(1, "세종대왕", "010-2222-7777", "서울시 중구"));
		lst.add(new Member(2, "김정희", "010-8888-9999", "경기도 안산시"));
		lst.add(new Member(5, "장영실", "010-9999-7777", "대전직할시"));
		
		System.out.println("============정렬전=================");
		for(Member mem : lst) {	mem.memberPrn();	}
		
		System.out.println("============이름을 이용한 내림차순 정렬===========");
		Collections.sort(lst, new compareDecName());
		for(Member mem : lst) {		mem.memberPrn();	}
			
		System.out.println("==============이름을 이용한 오름차순정렬============");
		Collections.sort(lst, new compareAscName()); // 정렬를 해주고 출력해야 됨
		for(Member mem : lst) {	mem.memberPrn();		}	
		
		System.out.println("=============번호를 이용한 오름차순 정렬 ==============");
		Collections.sort(lst, new compareAscNum());
		for( Member mem : lst) {	mem.memberPrn();	}
		
		System.out.println("=============번호를 이용한 내림차순 정렬 ==============");
		Collections.sort(lst, new compareDecNum());
		for( Member mem : lst) {	mem.memberPrn();	}
	}

	// 내부클래스
	class compareDecName implements Comparator<Member>{
		public int compare(Member m1, Member m2) {//내림차순은 m2>m1
			return m2.getUsername().compareTo(m1.getUsername());
		}
	}
	
	class compareAscName implements Comparator<Member>{
		public int compare(Member m1, Member m2) {//오름차순은 m1>m2
			return m1.getUsername().compareTo(m2.getUsername());
		}
	}
	
	
	class compareDecNum implements Comparator<Member>{
		public int compare(Member m1, Member m2) {
			return (m1.getNo() < m2.getNo() ) ? 1 : (m1.getNo()==m2.getNo())? 0 : -1 ;
		}
	}
	
	class compareAscNum implements Comparator<Member>{
		public int compare(Member m1, Member m2) {
			return (m1.getNo()>m2.getNo()) ? 1 : (m1.getNo()==m2.getNo())? 0 : -1 ;
		}
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		new ObjectCompareTest();

	}

}
