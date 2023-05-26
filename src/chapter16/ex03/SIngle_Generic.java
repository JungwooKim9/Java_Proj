package chapter16.ex03;

class Apple {String apple = "사과";}

class Banana {String banana = "바나나";}

class Pencil {String pencil = "연필";}




class Goods <T> {	// 클래스 이름 뒤에 <T>는 객체를 생성할 때 지정되는 타입
	private T t;
	
	// getter
	public T getT() {
		return t;
	}
	
	//setter
	public void setT(T t) {
		this.t = t;
	}
	
}


public class SIngle_Generic {

	public static void main(String[] args) {
		/*
		 제너릭 클래스: 다양한 타입을 저장 할 수 있는 클래스
		 	- 클래스 이름 뒤에: <T>		<== 인풋 되는 타입을 지정함.	T: Type
		 	- 객체를 생성 할 때 <T>에 들어있는 타입을 지정해서 객체를 생성하게 함
		 	- <T>에 들어오는 타입은 반드시 객체형 자료형이어야 한다. 기본 자료형은 올 수 없다. wrapper class를 사용함
		 	
		 		wrapper class: 기본 자료형을 객체형 자료형으로 만듦
		 			기본자료형 <=====> 객체형자료형
		 			- boolean <==> Boolean
		 			- char <==> Charter
		 			- byte <==> Byte
		 			- short <==> Short
		 			- int <==> Integer
		 			- long <==> Long
		 			- float <==> Float
		 			- double <==> Double
		 	
		 */

		// 사과 객체 생성
		Goods <Apple> apple = new Goods <Apple>();
		
		// Setter를 사용해서 Apple 객체를 주입
		apple.setT(new Apple());		// setter를 사용해서 Apple 객체를 주입
		
		// Getter를 사용해서 Apple 객체를 가져옴	// 자신이 원하는 객체를 주입 후 다운 캐스팅 없이 출력
		System.out.println(apple.getT().apple);
		
		// Banana 객체 저장
		Goods <Banana> banana = new Goods <Banana>();
		
		// Setter를 사용해서 Banana 객체 주입
		banana.setT(new Banana());
		
		// Getter를 사용해서 Banana 객체를 가져와서 필드의 내용을 출력	// 다운 캐스팅 없이 필드의 내용을 출력
		System.out.println(banana.getT().banana);
		
		// 연필 객체를 저장
		Goods <Pencil> pencil = new Goods <>();	// 타입을 한번만 지정해도 사용 가능
		
		// Setter를 사용해서 Pencil 객체를 저장
		pencil.setT(new Pencil());
		
		// Getter를 사용해서 Pencil 객체의 필드 출력
		System.out.println(pencil.getT().pencil);
	}

}
