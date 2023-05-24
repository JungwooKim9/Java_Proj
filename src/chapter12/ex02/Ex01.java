package chapter12.ex02;

abstract class Calc {
	abstract int add (int a, int b);		// 두 정수를 인풋 받아서 더한 값을 리턴
	abstract int diff (int a, int b);		// 빼기
	abstract int mul (int a, int b);		// 곱하기
	abstract double div (int a, int b);		// 나누기
}

class Calc_Impl extends Calc {

	@Override
	int add(int a, int b) {
		return a + b;
	}

	@Override
	int diff(int a, int b) {
		return a - b;
	}

	@Override
	int mul(int a, int b) {
		return a * b;
	}

	@Override
	double div(int a, int b) {
		return (double)a / b;
	}
	
}

public class Ex01 {

	public static void main(String[] args) {
		System.out.println("=====콘크리트 클래스를 생성해서 작동======");
		// 1. 콘크리트 클래스를 생성해서 작동		<== 매번 자주 사용 할 때
		Calc c1 = new Calc_Impl();
		System.out.println(c1.add(4, 5));
		System.out.println(c1.diff(5, 3));
		System.out.println(c1.mul(3, 8));
		System.out.println(c1.div(7, 6));
		
		System.out.println("=====익명 클래스를 생성해서 작동=====");
		// 2. 익명 클래스를 생성해서 작동		<== 한 번만 쓰고 버림
		Calc c2 = new Calc() {
			@Override
			int add(int a, int b) {
				return a + b;
			}

			@Override
			int diff(int a, int b) {
				return a - b;
			}

			@Override
			int mul(int a, int b) {
				return a * b;
			}

			@Override
			double div(int a, int b) {
				return (double)a / b;
			}
		};
		System.out.println(c2.add(7, 7));
		System.out.println(c2.diff(9, 2));
		System.out.println(c2.mul(2, 6));
		System.out.println(c2.div(8, 3));
		
	}
	
}