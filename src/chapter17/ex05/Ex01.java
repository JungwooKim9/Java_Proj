package chapter17.ex05;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

class Student {		// Map: Key: 중복되면 안됨, equals(), hashCode()
	int stuID;		// 중복되면 안되도록 처리
	String stuName;
	
	Student (int stuID, String stuName) {
		this.stuID = stuID;
		this.stuName = stuName;
	}
	
	@Override
	public String toString() {
		return stuName + "학생의 아이디는 " + stuID + "입니다.";
	}

	@Override
	public int hashCode() {
		return Objects.hash(stuID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this.stuID == ((Student)obj).stuID) {
			return true;
		} 
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return stuID == other.stuID;
	}
	
}

public class Ex01 {

	public static void main(String[] args) {
		Student s1 = new Student(1111,"홍길동");
		Student s2 = new Student(1112,"김길동");
		Student s3 = new Student(1113,"백길동");
		Student s4 = new Student(1111,"야길동");
		
		// Key: Student
		 Map<Student, String> linkMap = new LinkedHashMap();
		 linkMap.put(s1, "");
		 linkMap.put(s2, "");
		 linkMap.put(s3, "");
		 linkMap.put(s4, "");
		 
		 System.out.println(linkMap);

	}

}
