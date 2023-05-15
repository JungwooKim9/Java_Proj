package chapter06.ex01;

class Student2{
	// 기본 생성자
	public Student2() {}
	
	// 필드
	String sName;		// 학생 이름
	int sAge;			// 학생 나이
	String sAddr;		// 학생 주소
	String sEmail;		// 학생 이메일 주소
	
	// 메소드: 필드의 내용을 출력 하는 메소드
	public void print() {
		System.out.println("이름: " + sName);
		System.out.println("나이: " + sAge);
		System.out.println("주소: " + sAddr);
		System.out.println("메일주소: " + sEmail);
	}
}

public class Object06 {

	public static void main(String[] args) {
		// kim 객체: 김길동/20/서울/aaa@aaa.com
		// lee 객체: 이순신/30/부산/bbb@bbb.com
		// hong 객체: 홍길동/45/광주/ccc@ccc.com
		
		// 각 객체의 필드의 값 입력 후, 배열에 넣어서 저장 후 끄집어 내어서 다시 출력 .....
		
		// 1. 객체 생성
		Student2 kim = new Student2();
		Student2 lee = new Student2();
		Student2 hong = new Student2();
		
		// 2. 각 객체의 필드값 입력
		kim.sName = "김길동";
		kim.sAge = 20;
		kim.sAddr = "서울";
		kim.sEmail = "aaa@aaa.com";
		
		lee.sName = "이순신";
		lee.sAge = 30;
		lee.sAddr = "부산";
		lee.sEmail = "bbb@bbb.com";
		
		hong.sName = "홍길동";
		hong.sAge = 45;
		hong.sAddr = "광주";
		hong.sEmail = "ccc@ccc.com";
		
		System.out.println("===각 객체의 필드의 값 출력: print()===");
		kim.print();
		lee.print();
		hong.print();
		
		System.out.println("===배열을 선언 후 객체를 배열에 저장===");
		
		// 3. 배열을 선언하면서 바로 배열에 값을 할당
		Student2[] arr1 = new Student2[] {kim, lee, hong};
		
		/* 배열에 하나씩 할당할 때
		Student2[] arr1 = new Student2[3];
		arr1[0] = kim;
		arr1[1] = lee;
		arr1[2] = hong;
		*/
		
		System.out.println(kim);		// 626b2d4a (Heap 메모리 주소 값)
		System.out.println(lee);		// 5e91993f
		System.out.println(hong);		// 1c4af82c
		
		//배열의 각 방에 저장된 객체를 끄집어 냄
		Student2 s1 = arr1[0];			// kim
		Student2 s2 = arr1[1];			// lee
		Student2 s3 = arr1[2];			// hong
		
		System.out.println("===============================");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println("=======객체의 print()메소드 호출=======");
		System.out.println("=======kim 객체의 정보를 출력=======");
		s1.print();			// kim
		System.out.println("=======lee 객체의 정보를 출력=======");
		s2.print();			// lee
		System.out.println("=======hong 객체의 정보를 출력=======");
		s3.print();			// hong
		

	}

}
