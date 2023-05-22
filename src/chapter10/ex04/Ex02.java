package chapter10.ex04;

class Car {
	String companyName = "현대자동차";		// 회사명
	int carYear;			// 생산년도
}

class Hcar extends Car {
	
	String carName;		// 자동차 모델 (에쿠스, 제네시스, 아반떼, 봉고)
	int maxSpeed;		// 최대 Speed
	int oilLiter;		// 각 차의 기름이 최대 몇 리터 들어가는지
}

class BMW extends Car {
	
}

public class Ex02 {
	
	Car[] arr = null;
	void carInfo (Car c1, Car c2, Car c3, Car c4) {
		// 현대 자동차 객체를 인풋으로 받아서 arr배열 변수에 저장
		// 현대 자동차의 배열에 저장된 최대 스피드의 평균을 출력
		// 현대 자동차의 배열에 저장된 오일의 합을 출력
		arr = new Car[] {c1,c2,c3,c4};
		avgMaxSpeed(arr);
		System.out.println("현대 자동차의 배열에 저장된 오일의 합은 " + sumOil(arr) + "L입니다.");
	}
	
	void avgMaxSpeed (Car[] arr) {
		int avg = 0;
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			if (arr[i] instanceof Hcar) {
				sum += ((Hcar)arr[i]).maxSpeed;
				avg = sum / arr.length;
			}
		}
		System.out.println("현대 자동차의 배열에 저장된 최대 스피드의 평균은 " + avg + "km입니다.");
	}
	
	int sumOil (Car[] arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			if (arr[i] instanceof Hcar) {
				sum += ((Hcar)arr[i]).oilLiter;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// 현대 자동차의 객체를 생성해서 필드의 값 입력
		//	연식	   차종	최고속도 최대 오일
		Hcar h1 = new Hcar();	// 2000 / 에쿠스 / 350 / 60
		Hcar h2 = new Hcar();	// 2010 / 제네시스 / 300 / 50
		Hcar h3 = new Hcar();	// 2022 / 그랜져 / 250 / 55
		Hcar h4 = new Hcar();	// 2023 / 아반떼 / 200 / 40
		
		h1.carYear = 2000;
		h1.carName = "에쿠스";
		h1.maxSpeed = 350;
		h1.oilLiter = 60;
		
		h2.carYear = 2010;
		h2.carName = "제네시스";
		h2.maxSpeed = 300;
		h2.oilLiter = 50;
		
		h3.carYear = 2022;
		h3.carName = "그랜져";
		h3.maxSpeed = 250;
		h3.oilLiter = 55;
		
		h4.carYear = 2023;
		h4.carName = "아반떼";
		h4.maxSpeed = 200;
		h4.oilLiter = 40;
		
		Ex02 e1 = new Ex02();
		
		e1.carInfo(h1, h2, h3, h4);

	}

}
