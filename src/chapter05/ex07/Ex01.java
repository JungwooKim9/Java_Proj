package chapter05.ex07;

public class Ex01 {

	public static void main(String[] args) {
		/*
		 main 메소드: args로 다음의 값을 넘깁니다.
		 
		 국어 60 영어 70 수학 80 음악 90 과학 70
		 
		 각 과목의 합계:
		 		평균:
		 */

		String a = args[0];
		String b = args[1];
		String c = args[2];
		String d = args[3];
		String e = args[4];
		String f = args[5];
		String g = args[6];
		String h = args[7];
		String i = args[8];
		String j = args[9];
		int sum = 0;
		
		for (int m=0; m<args.length; m++) {
			if (m != 0 && m%2 != 0) {
				sum += Integer.parseInt(args[m]);
			}
		}
		double avg = sum /5.0;
		
		System.out.printf("과목의 합계는 %d이고 평균 점수는 %5.2f 입니다.", sum, avg);
		
	}

}
