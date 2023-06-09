package chapter17.ex03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayList_VS_LinkedList {

	public static void main(String[] args) {
		/*
		 List <E> 
		 	- ArrayList<E>, Vector<E>: 검색시 성능이 빠르다. 추가(add)/삭제시 부하가 많이 걸린다.
		 	- LinkedList<E>: 검색이 느리다. 추가/제거시 부하가 걸리지 않는다.
		 */
		
		// 1. 데이를 추가할 때 성능 비교
		List <Integer> aList = new ArrayList();
		List <Integer> lList = new LinkedList();
		
		// 성능을 체크하는 변수 선언
		long startTime = 0, endTime = 0;
		
		// 1-1 ArrayList의 성능 체크
		startTime = System.nanoTime();		// 현재 시간을 나노로 변환해서 정수형으로 저장
		System.out.println(startTime);
		
			// ArrayList에 1부터 1씩 증가하면서 10만개의 값을 저장
		for (int i=0; i<100000; i++) {
			aList.add(0,i);
		}
		endTime = System.nanoTime();
		
		// 프로그램을 실행한 나노타임
		System.out.println(endTime - startTime);	// 242747200 나노(초)	: ArrayList
		
		System.out.println("===========================");
		
		// LinkedList의 성능 체크
		startTime = System.nanoTime();		// 현재 시간을 나노로 변환해서 정수형으로 저장
		System.out.println(startTime);
		
			// ArrayList에 1부터 1씩 증가하면서 10만개의 값을 저장
		for (int i=0; i<100000; i++) {
			lList.add(0,i);
		}
		endTime = System.nanoTime();
		
		// 프로그램을 실행한 나노타임
		System.out.println(endTime - startTime);	// 3462000 나노(초)	: LinkedList
		
		System.out.println("========값을 검색시 차이========");
		
		// ArrayList 검색시  성능 체크
		
		startTime = System.nanoTime();
		for (int i=0; i<100000; i++) {
			aList.get(i);
		}
		endTime = System.nanoTime();
		
		System.out.println(endTime - startTime);		// 1188000 : ArrayList 검색시 시간
		
		System.out.println("============================");
		
		// LinkedList 검색시  성능 체크
		
		startTime = System.nanoTime();
		for (int i=0; i<100000; i++) {
			lList.get(i);
		}
		endTime = System.nanoTime();
		
		System.out.println(endTime - startTime);		// 2919689400 : LinkedList 검색시 시간
		
		
	}

}
