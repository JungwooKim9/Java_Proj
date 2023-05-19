package chapter10.ex02;
// 상속, 캐스팅
class Customer {			// 부모 클래스: 고객의 정보를 담은 클래스
	String name;		// 고객 이름
	long customerID;	// 고객 아이디
	int customerPoint;	// 고객
	
	void customerInfo() {
		System.out.println("고객 이름: " + name + ", 고객 아이디: " + customerID + ", 고객 포인트: " + customerPoint);
	}
}

// 자식 클래스: GoldMember, SilverMember, BronzeMember		<== int goldPoint, 10점/5점/3점, 메소드 goldInfo() 골드 회원입니다.

class GoldMember extends Customer {
	int goldPoint;
	void goldInfo() {
		System.out.println("고객 이름: " + name + ", 고객 아이디: " + customerID + ", 고객 포인트: " + goldPoint);
	}
	
}

class SilverMember extends Customer {
	int silverPoint;
	void silverInfo() {
		System.out.println("고객 이름: " + name + ", 고객 아이디: " + customerID + ", 고객 포인트: " + silverPoint);
	}
	
}

class BronzeMember extends Customer {
	int bronzePoint;
	void bronzeInfo() {
		System.out.println("고객 이름: " + name + ", 고객 아이디: " + customerID + ", 고객 포인트: " + bronzePoint);
	}
}

public class Ex01 {
	public static void main(String[] args) {
		// 각 개체를 생성해서 부모 클래스의 필드와 메소드 접근 가능한지 확인 후 업캐스팅 <==> 다운캐스팅
		// 1. Customer
		Customer c1 = new Customer();
			// c1: Customer
		
		System.out.println("===========GoldMember===========");
		// 2. GoldMember
		GoldMember g1 = new GoldMember();
			// g1: GoldMember / Customer 타입을 모두 가지고 있음
		g1.name = "홍길동";			// Customer
		g1.customerID = 11L;		// Customer
		g1.goldPoint=10;			// GoldMember 클래스의 필드
		g1.goldInfo();
		
		// 3. SilverMember
		System.out.println("==========SilverMember==========");
		SilverMember s1 = new SilverMember();
		s1.name = "이순신";
		s1.customerID = 22L;
		s1.silverPoint=5;
		s1.silverInfo();
		
		// 4. BronzeMember
		System.out.println("==========BronzeMember==========");
		BronzeMember b1 = new BronzeMember();
		b1.name = "세종대왕";
		b1.customerID = 33L;
		b1.bronzePoint=3;
		b1.bronzeInfo();
		
		System.out.println("=========================================");
		
		// c1(Customer), g1(GoldMember / Customer), s1(SilverMember / Customer), b1(BronzeMember / Customer)을
			// Customer 타입으로 배열에 저장
		
		// 객체를 배열 arr에 넣음: upCasting 됨
		// 배열 arr에 저장된 모든 객체는 Customer 타입을 내포하고 있고, Customer 타입으로 upCasting되어 들어가 있음
		
		// arr에 들어가 있는 객체는 Customer타입으로 업캐스팅 되어 있음
		Customer[] arr = new Customer[] {c1, g1, s1, b1};
		
		// 배열에 저장된 객체를 가지고 온다
		Customer cc1 = arr[0];		// Customer
		Customer cc2 = arr[1];		// Customer / GoldMember
		Customer cc3 = arr[2];		// Customer / SilverMember
		Customer cc4 = arr[3];		// Customer / BronzeMember
		
		//
		cc1.customerInfo();
		
		// 다운 캐스팅
		GoldMember gg2 = (GoldMember) cc2;
		gg2.goldInfo();
		
		SilverMember ss2 = (SilverMember) cc3;
		ss2.silverInfo();
		
		BronzeMember bb2 = (BronzeMember) cc4;
		bb2.bronzeInfo();
		
		System.out.println("=========================================");
		
		// 객체 생성시 타입을 저장
		
		// 1. Customer 객체 생성시 타입 지정
		Customer cus1 = new Customer();
		
		// 2. GoldMember 객체 생성시 타입 지정: Customer로 지정
		Customer cus2 = new GoldMember();
				// cus2: GoldMember, Customer를 내포하고 있고, Customer로 지정
			cus2.name = "고객 이름";		// Customer만 접근 가능
			
			GoldMember gm1 = (GoldMember) cus2;
			gm1.goldPoint = 10;
			gm1.goldInfo();
		
		// 3. GoldMember 객체 생성시 타입 지정: GoldMember로 지정: GoldMember /Customer 모두 접근 가능
		GoldMember gm2 = new GoldMember();
		
		// 4. SilverMember 객체화 하면서 Custom 타입으로 지정
		Customer cus3 = new SilverMember();		// cus3: SilverMember / Customer 모두 가지고 있고 Customer로 타입 지정됨
		
		SilverMember sil1 = (SilverMember) cus3;
		
		// 5. SilverMember를 객체화 하면서 SilverMember 타입으로 지정:
		SilverMember sil2 = new SilverMember();
			// sil3: SilverMember / Customer 모두 가지고 있고 SilverMember로 타입 지정
		
		System.out.println("=========================================");
		
		Customer ccc1 = new GoldMember();		// ccc1: GoldMember / Customer
		Customer ccc2 = new SilverMember();		// ccc2: SiverMember / Customer
		Customer ccc3 = new BronzeMember();		// ccc3: BronzeMemeber / Customer
		
		// 자식 클래스를 부모 타입으로 객체화 해서 배열에 저장
		Customer [] arr2 = new Customer[] {ccc1, ccc2, ccc3};
		
		// 각 배열의 방의 값을 끄집어 내면서 다운 캐스팅
		GoldMember gm11 = (GoldMember) arr2[0];
		SilverMember sil11 = (SilverMember) arr2[1];
		BronzeMember bro11 = (BronzeMember) arr2[2];
		
		
		
		
		
		
	}
}
