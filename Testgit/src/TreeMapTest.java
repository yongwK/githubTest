import java.util.Collection;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {

	public TreeMapTest() {
		
	}

	
	public void start() {
		
		Member mem1 = new Member(1, "이순신", "010-123-1234", "서울시");
		
		TreeMap<String, Member> tm= new TreeMap<String, Member>();
		
		tm.put("이순신", mem1);
		tm.put("세종대왕", new Member(2,"세종대왕", "011-123-4565","조선"));
		tm.put("장영실", new Member(3,"장영실", "011-123-4565","조선"));
		tm.put("이국주", new Member(4,"이국주", "018-123-4565","대한민국"));
		
		Member vo = tm.get("이순신");
		vo.memberPrn();
		
		System.out.println("==========keyset()으로 목록구하기=======");
		Set<String> keylst = tm.keySet();
		Iterator<String> ii = keylst.iterator();
		while(ii.hasNext()) {
			Member mem = tm.get(ii.next());
			mem.memberPrn();
		}	
		
		
		System.out.println("==========descendingkeyset()으로 목록구하기=======");
		NavigableSet<String> deckeylst = tm.descendingKeySet();
		Iterator<String> iii = deckeylst.iterator();
		while(iii.hasNext()) {
			// key값을 get()에 넣어주므로써 value값이 vvo에 들어가서
			// Member 값을 갖게 되는거고
			Member vvo = tm.get(iii.next());
			vvo.memberPrn();
		}	
			
		System.out.println("========values() 값을 이용한 목록 구하기 ========");	
		Collection<Member> cMemberV = tm.values();
		Iterator<Member> iiii = cMemberV.iterator();
		while(iiii.hasNext()) {
			// 애초에 iiii에는 value값을 가지고 있기 떄문에 
			// 바로 vvvo에 넣어주면 된다.
			Member vvvo = iiii.next();
			vvvo.memberPrn();
		}
		
		
		
	}
	
	public static void main(String[] args) {
		new TreeMapTest().start();

	}

}
