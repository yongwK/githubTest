import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashTable {

	public HashTable() {
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		
		ht.put(1, "서울시"); 		ht.put(2, "인천시");
		ht.put(3,  "평택시"); 	ht.put(4, "천안시");
		System.out.println(ht.size());
		
		System.out.println(ht.toString());
		
		
		ht.replace(1, "서울은 추워여");
		ht.replace(2, "인천시", "인천광역시");
		System.out.println(ht.toString());
		
		System.out.println(ht.get(1)); // 키값1에 해당하는 value값 출력
		
		
		System.out.println("=============keys() ==============");
		Enumeration<Integer> ei = ht.keys();
		while(ei.hasMoreElements()) { //키값들을 확인
			System.out.println(ei.nextElement());
		}
		
		System.out.println("=============keyset() ==============");
		Set<Integer> keylst = ht.keySet();
		Iterator<Integer> ikeylst = keylst.iterator();
		while(ikeylst.hasNext()) {
			System.out.println(ikeylst.next());
		}
		
		System.out.println("=============values() ==============");
		Collection<String> value = ht.values();
		Iterator<String> ivalue = value.iterator();
		while(ivalue.hasNext()) {
			String n = ivalue.next();
			System.out.println(n);
		}
		
		
		
	}

	public static void main(String[] args) {
	 new HashTable();
	 
	}

}
