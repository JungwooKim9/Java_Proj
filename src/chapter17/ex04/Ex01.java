package chapter17.ex04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {
		/*
		 1. for문을 사용해서 1 ~ 100까지 HashSet에 값을 저장
		 2. Iterator를 사용해서 HashSet에 저장된 값을 출력
		 3. Enhanced for문을 사용해서 출력
		 4. HashSet에 저장된 값을 ==> 배열로 변환, 일반 for문을 사용해서 출력
		 */
		
		// 1. HashSet 선언 후 객체 내부에 값 입력
		Set <Integer> hSet1 = new HashSet();
		HashSet <Integer> hSet2 = new HashSet();
		
		for(int i=1; i<=100; i++) {
			hSet1.add(i);
		}
		System.out.println(hSet1);
		System.out.println();
		
		System.out.println("===Iterator를 사용해서 HashSet에 저장된 값을 출력===");
		Iterator <Integer> iter = hSet1.iterator();
		
		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		System.out.println();
		System.out.println();
		
		System.out.println("===Enhanced for문을 사용해서 출력===");
		for (int k : hSet1) {
			System.out.print(k + " ");
		}
		System.out.println();
		System.out.println();
		
		System.out.println("===배열로 변환, for문을 사용해서 출력===");
		Integer[] arr = hSet1.toArray(new Integer[0]);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println();

	}

}
