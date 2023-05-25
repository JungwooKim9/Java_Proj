package chapter13.ex02;

class A {
	
}

class B extends A {
	
}

class C extends A {
	
}

public class Ex01 {

	public static void main(String[] args) {
		/*
		 
		 */
		
		int[] arr = new int[] {1,2,3,4,5};
		
		try {
		System.out.println(arr[5]);		// 예외: ArrayIndexOutOfBoundsException
		} catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("ArrayIndexOutOfBoundsException 작동됨");
		}
		
		A a1 = new B();
		
		
		try {
		C c1 = (C) a1;		// 예외: ClassCastException
		} catch(ClassCastException c) {
			System.out.println("ClassCastException 처리 작동됨");
		}
		
		
		
		System.out.println("프로그램 마지막 라인");
		
	}

}
