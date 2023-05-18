package chapter08.ex03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		//
		int[] coinUnit = {500,100,50,10};		// 거슬러 줘야하는 돈
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("금액을 입력하세요 >>");
		int money = sc.nextInt();		// money: 변수의 돈을 위의 거스름 돈으로 나누어 주려고 함
		
		System.out.println("money = " + money);
		
		for (int i=0; i<coinUnit.length; i++) {
			// 나누어줄 거스름돈이 아래와 같이 출력 되도록 코드 작성
			int a = money / coinUnit[i];
			System.out.println(coinUnit[i] + "원: " + a);
			money = money % coinUnit[i];
			}
	}
}

/*
실행 결과:
money = 2680
500원: 5
100원: 1
50원: 1
10원: 3
*/