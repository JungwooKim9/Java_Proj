package chapter17.ex04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

class Member {
	String  memberID;		// 식별자, equals(), hashCode()
	String memberName;
	
	// 생성자를 통해서 필드의 값을 입력
	public Member (String memberID, String memberName) {
		this.memberID = memberID;
		this.memberName = memberName;
	}
	
	// 객체를 출력시 필드의 내용을 출력
	@Override
	public String toString() {
		return "ID = " + memberID + ", Name = " + memberName;
	}
	
	// set의 중복된 값을 식별: equals(), hashCode() 오버라이딩
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			if (this.memberID == ((Member)obj).memberID) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(memberID);
	}
	
}

class MemberMethod {
	// Set을 정의
	Set<Member> memSet;
	
	// MemberMethod 객체를 생성시 Set을 활성화 시킴
	MemberMethod() {
		this.memSet = new HashSet();
	}
	
	// 메소드를 정의: Member 객체를 인풋으로 던지면 set에 저장
	public void addMember(Member member) {
		// 코드
		this.memSet.add(member);
		
	}
	
	// 정수를 받음: memberID ==> set에 저장된 Member객체 안에 memberID를 Iterator를 통해 검색: 인풋 받은 memberID를 삭제
	public boolean removeMember(String memberID) {
		// 코드
		Iterator <Member> iter = memSet.iterator();
		
		while(iter.hasNext()) {
			Member member = iter.next();
			
			if(memberID == member.memberID) {
				memSet.remove(member);
				return true;
			}
			
		}
		System.out.println("ID가 검색되지 않았습니다.");
		
		return false;	// 잘 삭제되면 true, 해당 ID가 존재하지 않는 경우 return false
	}
	
	// Set에 저장된 Member 객체의 필드의 값을 출력
	public void showMember() {
		
		Iterator <Member> iter = memSet.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());	// ir.next() <== Member가 들어가 있음
		}
		
	}
	

	// Set에 저장된 총 갯수 출력
	public void showSize() {
		System.out.println("Set에 저장된 총 갯수: " + memSet.size());
	}
	
}

public class Ex03 {

	public static void main(String[] args) {
		/*
		 Member 객체 5개 생성 후 MemberMethod 객체의 메소드를 사용해서 Set에 객체를 저장하고 삭제/출력
		 */
		
		
		// Member 객체 생성
		Member m1 = new Member("101", "김개");
		Member m2 = new Member("101", "김냥이");
		Member m3 = new Member("103", "김쥐");
		Member m4 = new Member("104", "김소");
		Member m5 = new Member("105", "김말");
		
		// MemberMethod 객체화
		MemberMethod mm = new MemberMethod();
		
		mm.addMember(m1);
		mm.addMember(m2);
		mm.addMember(m3);
		mm.addMember(m4);
		mm.addMember(m5);
		
		// Set에 저장된 총 갯수
		mm.showSize();
		
		System.out.println("====================");
		
		// Set에 저장된 Member 객체를 출력
		mm.showMember();
		
		// memberID 값을 넣어서 삭제
		mm.removeMember("105");
		
		System.out.println("====================");
		
		// 삭제 확인
		mm.showMember();

	}

}
