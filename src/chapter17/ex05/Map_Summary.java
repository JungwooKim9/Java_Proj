package chapter17.ex05;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map_Summary {

	public static void main(String[] args) {
		/*
		 map <K,V>: K: Key		: 중복되면 안됨, Set 관리됨	<== 방번호(List)
		 			V: Value	: 중복된 값을 넣을 수 있음.
		 			
		 	- HashMap <K,V>		: Key(HashSet) 임의로 출력됨, 싱글 쓰레드(ArrayList),
		 	- Hashtable <K,V>	: Key(HashSet) 임의로 출력됨, 멀티 쓰레드(Vector), 모든 메소드가 동기화 처리됨
		 	- LinkedHashMap <K,V>: Key(LinkedHashSet) 넣은 순서대로 출력됨
		 	- TreeMap<K,V>		: Key(TreeSet) Key가 정렬되어서 들어감 <오름차순 정렬>
		 */
		
		// 1. HashMap: 입력 순서와 출력 순서가 다르다. , 싱글 쓰레드 환경		<== ArrayList
		Map<String, Integer> hmap = new HashMap();
		hmap.put("다", 30);
		hmap.put("마", 40);
		hmap.put("나", 50);
		hmap.put("가", 60);
		hmap.put("가", 70);
		
		System.out.println(hmap);
		
		// 2. Hashtable: 입력 순서와 출력 순서가 다르다. 모든 메소드가 동기화, 멀티 쓰레드 환경		<== Vector
		Map<String, Integer> tmap = new Hashtable();
		tmap.put("다", 30);
		tmap.put("마", 40);
		tmap.put("나", 50);
		tmap.put("가", 60);
		tmap.put("가", 70);
		
		System.out.println(tmap);
		
		// 3. LinkedHashMap: 입력된 순서로 출력됨
		Map <String, Integer> lmap = new LinkedHashMap();
		lmap.put("다", 30);
		lmap.put("마", 40);
		lmap.put("나", 50);
		lmap.put("가", 60);
		lmap.put("가", 70);
		
		System.out.println(lmap);
		
		// 4. TreeMap: Key가 정렬되어서 입력됨, 오름차순 정렬
		Map <String, Integer> treemap = new TreeMap();
		treemap.put("다", 30);
		treemap.put("마", 40);
		treemap.put("나", 50);
		treemap.put("가", 60);
		treemap.put("가", 70);
		
		System.out.println(treemap);
		

	}

}
