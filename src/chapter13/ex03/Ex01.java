package chapter13.ex03;

class A {
	int a;
}

class B extends A {
	int b;
}

class C extends A {
	int c;
}

public class Ex01 {

	public static void main(String[] args) {
		
		A a1 = new B();
	//	C c1 = (C) a1;		// 예외 발생
		
		String [] arr = new String [] {"안녕","오늘","날씨","맑음"};
	//	System.out.println(arr[4]);		// 예외 발생
		
		String str = null;
	//	System.out.println(str.charAt(1));	// 예외 발생
		
		
		System.out.println("=====첫번째 방법으로 예외 처리(각각 처리)=====");
		
		A a2 = new B();
		try {
			C c1 = (C) a1;		// 예외 발생
		} catch (ClassCastException e) {
			System.out.println("ClassCastException 작동됨");
		}
		
		String [] arr1 = new String [] {"안녕","오늘","날씨","맑음"};
		try {
			System.out.println(arr[4]);		// 예외 발생
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException 작동됨");
		}
		
		String str1 = null;
		try {
			System.out.println(str.charAt(1));	// 예외 발생			
		} catch (NullPointerException e) {
			System.out.println("NullPointerException 작동됨");
		}
		
		System.out.println();
		
		System.out.println("=====두번째 방법으로 예외 처리(여러 catch로 예외 처리)=====");
		
		
		A a3 = new B();
		String [] arr2 = new String [] {"안녕","오늘","날씨","맑음"};
		String str2 = null;
		
		try {
			
			C c1 = (C) a1;		// 예외 발생
			System.out.println(arr[4]);		// 예외 발생
			System.out.println(str.charAt(1));	// 예외 발생
			
		} catch (ClassCastException e) {
			
			System.out.println("ClassCastException 작동됨");
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("ArrayIndexOutOfBoundsException 작동됨");
			
		} catch (NullPointerException e) {
			
			System.out.println("NullPointerException 작동됨");
		}
		
		System.out.println();
		
		System.out.println("=====세번째 방법으로 예외 처리(exception으로 한꺼번에 처리)=====");
		
		A a4 = new B();
		String [] arr3 = new String [] {"안녕","오늘","날씨","맑음"};
		String str3 = null;
		
		try {
			
			C c4 = (C) a1;		// 예외 발생
			System.out.println(arr[4]);		// 예외 발생
			System.out.println(str.charAt(1));	// 예외 발생
			
		} catch (Exception e) {
			System.out.println("Exception으로 한꺼번에 처리");
		}
		
		System.out.println();
		
		System.out.println("=====첫번째 방법으로 예외 처리(catch블락에서 세밀하게 처리하고 그외에는 exception으로 처리)=====");
		
		A a5 = new B();
		String [] arr4 = new String [] {"안녕","오늘","날씨","맑음"};
		String str4 = null;
		
		try {
			
			C c1 = (C) a1;		// 예외 발생
			System.out.println(arr[4]);		// 예외 발생
			System.out.println(str.charAt(1));	// 예외 발생
			
		} catch (ClassCastException e) {
			
			System.out.println("ClassCastException 작동됨");
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("ArrayIndexOutOfBoundsException 작동됨");
			
		} catch (NullPointerException e) {
			
			System.out.println("NullPointerException 작동됨");
			
		} catch (Exception e) {
			
			System.out.println("Exception을 한꺼번에 처리");
		}

	}

}
