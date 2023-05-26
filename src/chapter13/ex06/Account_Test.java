package chapter13.ex06;

public class Account_Test {
	
	public static void main(String[] args) {
		
		Account a1 = new Account();
		
		// 현재 잔고 출력	필드의 접근 제어자가 private이므로 getter를 사용해서 필드 정보를 출력
		System.out.println("잔액은 " + a1.getBalance() + "원입니다.");
		System.out.println("==========================================");
		
		// 예금 입금
		a1.deposit(30000);	// 3만원 입금
		System.out.println("==========================================");
		
		// 추가 입금
		a1.deposit(50000);	// 5만원 입금
		System.out.println("==========================================");
		
		// 출금: 6만원 출금		// 일반 예외를 throws 호출하는 곳에서 예외를 처리하도록 적용
		
		try {
			a1.withdrow(60000);
		} catch (BalanceException e) {
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("==========================================");
		
		try {
			a1.withdrow(50000);
		} catch (BalanceException e) {
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
	}

}
