package chapter17.ex05;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

class Goods {		// Map: Key: 중복되면 안됨, equals(), hashCode()
	int goodsCode;		// 중복되면 안되도록 처리
	String goodsName;
	
	Goods (int goodsCode, String goodsName) {
		this.goodsCode = goodsCode;
		this.goodsName = goodsName;
	}
	
	@Override
	public String toString() {
		return goodsName + "상품의 코드는 " + goodsCode + "입니다.";
	}

	@Override
	public int hashCode() {
		return Objects.hash(goodsCode);
	}

	@Override
	public boolean equals(Object obj) {
		if (this.goodsCode == ((Goods)obj).goodsCode) {
			return true;
		} 
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Goods other = (Goods) obj;
		return goodsCode == other.goodsCode;
	}
	
}

public class Ex1_H {

	public static void main(String[] args) {
		Goods g1 = new Goods(101,"인형");
		Goods g2 = new Goods(102,"티셔츠");
		Goods g3 = new Goods(103,"청바지");
		Goods g4 = new Goods(101,"시계");
		
		 Map<Goods, String> linkMap = new LinkedHashMap();
		 linkMap.put(g1, "");
		 linkMap.put(g2, "");
		 linkMap.put(g3, "");
		 linkMap.put(g4, "");
		 
		 System.out.println(linkMap);

	}

}
