package chapter16.ex10;

// 제너릭 클래스
// X: x좌표의 포인트
// Y: y좌표의 포인트
// Point 클래스는 점의 (x, y)를 표시하는 클래스

class Point <X, Y> {
	X x;
	Y y;
	
	// 생성자를 사용해서 필드의 값 입력
	Point(X x, Y y) {
		this.x = x;
		this.y = y;
	}
	
	// getter로 필드의 값을 출력
	public X getX() {
		return x;
	}
	
	public Y getY() {
		return y;
	}
}

// 제너릭 메소드가 포함된 클래스 생성
class GenericM {
	
	// 두 점의 좌표를 매개 변수로 받아서 넓이를 구해서 리턴(더블): p1(10.5, 13.3), p2(30.5, 27.3)
	public static <T, V> double makeRectangle (Point <T,V> p1, Point <T,V> p2) {
		// 두 점의 좌표 값을 받아서 넓이를 구해서 더블형으로 리턴
		double width = (double)p2.getX() - (double)p1.getX();
		double height = (double)p2.getY() - (double)p1.getY();
		
		System.out.println("두 점의 x축의 차는: " + width);
		System.out.println("두 점의 y축의 차는: " + height);
		
		return width * height;
	}
}



public class Ex01 {

	public static void main(String[] args) {
		// 두 점의 포인트를 저장하는 객체 생성: p1(10.5, 13.3), p2(30.5, 27.3)
		Point <Double, Double> p1 = new Point <> (10.5, 13.3);
		Point <Double, Double> p2 = new Point <> (30.5, 27.3);
		
		double rectangle = GenericM.<Double, Double> makeRectangle(p1,p2);		// 제너릭 메소드 호출
		
		System.out.println("두 점의 좌표의 넓이는 " + rectangle + "입니다.");
	}

}
