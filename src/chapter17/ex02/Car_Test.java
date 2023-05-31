package chapter17.ex02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Car_Test {

	public static void main(String[] args) {
		// 1. Car 타입의 객체 5개 생성 후
		Car c1 = new Car("기아", "K5", "검은색", 200);
		Car c2 = new Car("현대", "그랜져", "검은색", 250);
		Car c3 = new Car("기아", "K7", "흰색", 250);
		Car c4 = new Car("현대", "아반떼", "회색", 200);
		Car c5 = new Car("현대", "제네시스", "남색", 250);
		
		// 2. ArrayList에 저장
		List <Car> a1 = new ArrayList<>();
		a1.add(c1);
		a1.add(c2);
		a1.add(c3);
		a1.add(c4);
		a1.add(c5);
		
		// 3. Vector에 저장
		List <Car> v1 = new Vector<>();
		v1.add(c1);
		v1.add(c2);
		v1.add(c3);
		v1.add(c4);
		v1.add(c5);
		
		// 4. LinkedList에 저장
		List <Car> l1 = new LinkedList<>();
		l1.add(c1);
		l1.add(c2);
		l1.add(c3);
		l1.add(c4);
		l1.add(c5);
		
		// 5. 리스트에 저장된 Car 객체를 가지고 와서 출력: For문으로 출력
		System.out.println("============For문을 사용해서 ArrayList에 저장된 값을 출력============");
		for(int i=0; i<a1.size(); i++) {
			System.out.print(a1.get(i) + "\n");		// c1, c2, c3, c4, c5
		}
		System.out.println();
		
		for(int i=0; i<v1.size(); i++) {
			System.out.print(v1.get(i) + "\n");
		}
		System.out.println();
		
		for(int i=0; i<l1.size(); i++) {
			System.out.print(l1.get(i) + "\n");
		}
		System.out.println();
		
		// 6. 리스트에 저장된 Car 객체를 가지고 와서 출력: Enhanced For문으로 출력
		System.out.println("========Enhanced For문을 사용해서 ArrayList에 저장된 값을 출력========");
		for (Car k : a1) {
			System.out.println(k);
		}
		System.out.println();
		
		for (Car k : v1) {
			System.out.println(k);
		}
		System.out.println();
		
		for (Car k : l1) {
			System.out.println(k);
		}
		System.out.println();
		
	}

}
