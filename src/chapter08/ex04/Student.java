package chapter08.ex04;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Student {

	private String stuName;
	private String stuEmail;
	private int stuAge;
	private double stuWeight;
	
	// lombok 어노테이션 (@): 클래스 블락 위에 어노테이션을 붙임.
		// @Getter	: 클래스 하위의 모든 필드에 대해서 getter를 자동으로 만듦.
		// @Setter	:						 setter
		// @ToString:						 ToString
		// @NoArgsConstructor: 기본 생성자를 자동으로 만듦	<== Student() {}
	
		// @Data	<== @Getter, @Setter, @ToString, @NoArgsConstructor
	
		// @AllArgsConstructor: 모든 생성자를 자동으로 만듦
}
