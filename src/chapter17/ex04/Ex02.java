package chapter17.ex04;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Student {
	int stuID;
	String stuName;
	String stuPhone;
	
	public Student(int stuID, String stuName, String stuPhone) {
		super();
		this.stuID = stuID;
		this.stuName = stuName;
		this.stuPhone = stuPhone;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			if (this.stuID == ((Student)obj).stuID) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(stuID);
	}
	
	@Override
	public String toString() {
		return stuID + " " + stuName + " " + stuPhone;
	}
	
}

public class Ex02 {

	public static void main(String[] args) {
		
		Set<Student> hset = new HashSet();
		
		// 학생 객체 5개 생성해서 set에 넣을 경우: stuID 필드에 중복된 값을 넣지 못하도록 설정
		// stuID 필드의 equals() 재정의, hashCode() 재정의
		
		Student s1 = new Student(101, "김떡볶", "갤럭시");
		Student s2 = new Student(101, "김순대", "아이폰");
		Student s3 = new Student(103, "김말이", "갤럭시");
		Student s4 = new Student(104, "김튀김", "아이폰");
		Student s5 = new Student(105, "김만두", "아이폰");
		
		hset.add(s1); hset.add(s2); hset.add(s3); hset.add(s4); hset.add(s5);
		
		System.out.println(hset);
		System.out.println(hset.size());
		
	}

}
