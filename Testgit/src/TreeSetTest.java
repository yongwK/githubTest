import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public TreeSetTest() {
	
		int[] a = {1,2,3,4,5,55,4,9,3,2};
		int[] b = { 2, 5, 6, 2, 5, 6, 6 ,2, 7,8};
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		for( int n : a ) {
			ts.add(n);
		}
		
		TreeSet<Integer> ts2 = new TreeSet<Integer>();
		for( int n : b) { ts2.add(n); }
		
		
		System.out.println(ts.size());  // ts 사이즈 확인
		System.out.println(ts.toString()); // ts 안의 값 확인
		
		Iterator<Integer> ii = ts.iterator();  // ts의 주소가 ii에 전달?복사된다. // 오름차순정렬
		
		while(ii.hasNext()){
			System.out.println(ii.next());
		}
		System.out.println("ts size() =? "+ts.size());
		
		
		
		Iterator<Integer> iii = ts2.descendingIterator();   //ts2 내림차순으로 정렬 , 중복된값 x
		while(iii.hasNext()) {
			System.out.println(iii.next());
		}
		
		
		
		
		
		
	}

	public static void main(String[] args) {
	
		new TreeSetTest();

	}

}
