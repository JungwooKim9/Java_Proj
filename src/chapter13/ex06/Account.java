package chapter13.ex06;

public class Account {
	
	private long balance = 10000;		// 은행의 예금된 잔고: 10000원
	
	// 기본 생성자
	Account() {}
	
	// getter: 메소드를 호출시 필드의 정보를 출력, private 필드의 정보를 출력
	public long getBalance() {
		return balance;
	}
	
	// 예금을 입금하는 메소드: money에 + 가 인풋되면 예금을 추가, 인풋 값을 받아서 잔고에 적용
	public void deposit (int money) {
		// 코드 완성
		System.out.println("입금 전 잔고는 " + balance + "원이고 " + money + "원이 입금 되었습니다.");
		balance += money;	// balance = balance + money
		System.out.println("총 예금 잔고는 " + balance + "원입니다.");
		
	}
	// 예금을 출금하는 메소드: money를 인풋 받아서 예금 잔고보다 크면 BalanceException ("예금 잔고가 부족합니다.")
	public void withdrow (int money) throws BalanceException {
		// 코드 완성
		if (balance < money) {		// 출금액이 예금액보다 많으면 예외를 처리함
			
			System.out.println("현재 예금 잔고는: " + balance + "원이고 " + "출금액은 " + money + "원입니다.");
			throw new BalanceException("예금 잔고가 부족합니다. " + (money - balance) + "원 모자랍니다.");		// 예외를 강제 발생(일반 예외)
			
		}else {
			System.out.println("현재 예금 잔고는: " + balance + "원이고 " + "출금액은 " + money + "원입니다.");
			balance -= money;		// balance = balance - money
			System.out.println("잔액은 " + balance + "원입니다.");
		}
		
		
	}
	
	
}
