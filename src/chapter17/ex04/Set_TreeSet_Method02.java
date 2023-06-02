package chapter17.ex04;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Set_TreeSet_Method02 {

	public static void main(String[] args) {
		/*
		 TreeSet은 Set<E>, SortedSet<E>(정렬 기능), NavigableSet<E>(검색 기능) 인터페이스를 구현한 클래스
		 	-- TreeSet을 객체화 해서 Set 타입으로 지정할 경우 Set의 메소드만 사용 가능
		 	-- TreeSet을 객체화 해서 TreeSet 타입으로 지정하면 정렬/검색 기능의 메소드를 사용 가능하다.
		 	-- 값을 저장할 때 오름차순 정렬되어서 값이 저장(1 ==> 9, A ==> Z, 가 ==> 하)
		 */
		
		// 중요: TreeSet을 객체화 해서 TreeSet 타입으로 지정
		TreeSet<Integer> treeSet = new TreeSet();
		
		// TreeSet에 값을 입력: 50에서 2씩 감소하면서 저장	<== 정렬 되어서 입력됨(오름차순 정렬)
		for (int i=50; i>0; i-=2) {
			treeSet.add(i);
		}
		
		// 출력: Iterator
		Iterator<Integer> ir = treeSet.iterator();
		while (ir.hasNext()) {
			System.out.print(ir.next() + " ");
		}
		System.out.println();
		
		System.out.println(treeSet);
		
		System.out.println("==========검색 기능 사용(가져오기)==========");
		// 1. first(): 제일 처음 값 가져오기
		System.out.println(treeSet.first());		// 2
		// 2. last(): 제일 마지막 값 가져오기
		System.out.println(treeSet.last());			// 50
		// 3. lower(E element): element 보다 작은 값을 출력
		System.out.println(treeSet.lower(26));		// 24
		// 4. higher(E element): element 보다 큰 값을 출력
		System.out.println(treeSet.higher(26));		// 28
		// 5. floor(E element): element를 포함해서 작은 값 출력
		System.out.println(treeSet.floor(26));		// 26
		// 6. ceiling(E element): element를 포함해서 큰 값 출력
		System.out.println(treeSet.ceiling(26));	// 26
		
		System.out.println("==========데이터 꺼내기: pollFirst==========");
		// 7. pollFirst(); 제일 첫번째 값 꺼내기
		int treeSetSize = treeSet.size();
		System.out.println("treeSetSize = " + treeSetSize);		// 25
		for (int i=0; i<treeSet.size(); i++) {
			System.out.print(treeSet.pollFirst() + " ");	// 25번 루프 돌면서 첫번째 값만 끄집어 낸다.
		}
		System.out.println();
		System.out.println("treeSet에 남은 값: " + treeSet);
		System.out.println("treeSetSize = " + treeSet.size());
		
		// treeSet 값 다시 할당
		for (int i=50; i>0; i-=2) {
			treeSet.add(i);
		}
		
		System.out.println("==========데이터 꺼내기: pollLast==========");
		// 8. pollLast(); 제일 마지막 값 꺼내오기
		System.out.println("treeSetSize = " + treeSetSize);		// 25
		for (int i=0; i<treeSet.size(); i++) {
			System.out.print(treeSet.pollLast() + " ");
		}
		System.out.println();
		System.out.println("treeSet에 남은 값: " + treeSet);
		System.out.println("treeSetSize = " + treeSet.size());
		
		System.out.println("=====================headSet:SortedSet=========================");
		// 9. SortedSet<E> headSet(E element): element 값의 Head 쪽으로 정렬해서 값을 저장 <element는 미포함>
		for (int i=50; i>0; i-=2) {
			treeSet.add(i);
		}
		System.out.println(treeSet);
		
		// Set<Integer> sSet = treeSet.headSet(20)
		SortedSet<Integer> sSet = treeSet.headSet(20);
		System.out.println(sSet);
		
		System.out.println("=====================headSet:NavigableSet=========================");
		// 10. NavigableSet<E> headSet(E element): element 값의 Head 쪽으로 정렬해서 값을 저장 <element 포함>
		for (int i=50; i>0; i-=2) {
			treeSet.add(i);
		}
		System.out.println(treeSet);
		
		NavigableSet<Integer> nSet = treeSet.headSet(20, true);
		System.out.println(nSet);
		
		System.out.println("=====================tailSet:SortedSet=========================");
		
		// SortedSet은 끝 포함 여부 제어 불가: Head 쪽으로 갈때는 끝 미포함, Tail쪽으로 갈때는 끝 포함
		
		// 11. SortedSet<E> tailSet(E element): element 값의 Tail 쪽으로 정렬해서 값을 저장 <element 포함>
		for (int i=50; i>0; i-=2) {
			treeSet.add(i);
		}
		System.out.println(treeSet);
		
		SortedSet sSet2 = treeSet.tailSet(20);
		System.out.println(sSet2);
		
		System.out.println("=====================tailSet:NavigableSet=========================");
		// 12. NavigableSet<E> tailSet(E element): element 값의 Tail 쪽으로 정렬해서 값을 저장 <element 미포함>
		for (int i=50; i>0; i-=2) {
			treeSet.add(i);
		}
		System.out.println(treeSet);
		
		NavigableSet<Integer> nSet2 = treeSet.tailSet(20, false);
		System.out.println(nSet2);
		
		System.out.println("=====================특정 범위의 값을 가져오기: subSet()=====================");
		// 13. SortedSet<E>
		for (int i=50; i>0; i-=2) {
			treeSet.add(i);
		}
		System.out.println(treeSet);
		
		SortedSet<Integer> sSet3 = treeSet.subSet(10, 20);		// 10(포함) ~ 20(미포함) 사이의 값을 잘라서 저장
		System.out.println(sSet3);
		
		// 14. NavigableSet<E>
		for (int i=50; i>0; i-=2) {
			treeSet.add(i);
		}
		System.out.println(treeSet);
		
		NavigableSet<Integer> nSet3 = treeSet.subSet(10, true, 20, true);
		System.out.println(nSet3);
		
		System.out.println("========================반대로 정렬하기(desending)========================");
		for (int i=50; i>0; i-=2) {
			treeSet.add(i);
		}
		System.out.println(treeSet);
		
		NavigableSet<Integer> desc = treeSet.descendingSet();
		System.out.println(desc);
		
		System.out.println("========================반대로 정렬한 걸 반대로 정렬하기(desending)========================");
		// desc는 내림차순 정렬되어 있다.
		NavigableSet<Integer> asc = desc.descendingSet();
		System.out.println(asc);
		
		
	}
	
}
