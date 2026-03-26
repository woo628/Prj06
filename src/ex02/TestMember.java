package ex02;

import java.util.Objects;

class Member {
	
	// Field
	int id;
	String name;

	// Constructor
	// 기본생성자
	public Member() {
		
	}
	
	// 인자있는 생성자
	public Member(int id, String name) {
		this.id = id;
		this.name = name;
	}
	

	// Method
	void disp() {
		System.out.println(id + " " + name);
	}

	// 비교 method 새로만든 equals → Object 를 재정한 것이 아니다 그래서 override 사용 불가
	// @Override - annotation → 컴파일러에게 알려주는 기능
	/*
	boolean equals(Member m3) {
		boolean result = false;
		
		if (this.id == m3.id) {
			if (this.name.equals(m3.name)) {
				result = true;
			} 
		}
		return result;
	} */
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	// override equals (object 를 상속받은) 
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
	
	
}

public class TestMember {

	public static void main(String[] args) {
		Member m1 = new Member();
		m1.id = 1;
		m1.name = "단종";
		m1.disp();
		
		System.out.println(m1);				// ex02.Member@18b4aac2
		System.out.println(m1.toString());	// ex02.Member@18b4aac2
		
		
		Member m2 = new Member(2,"엄흥도");
		m2.disp();
		
		System.out.println(m2);				// ex02.Member@764c12b6
		System.out.println(m2.toString());	// ex02.Member@764c12b6
		
		System.out.println(m1 == m2);		// false
		
		Member m3 = new Member(1, "단종");
		System.out.println(m3);    			// ex02.Member@c387f44
		System.out.println(m1 == m3);		// false  주소를 비교
		
		// 객체를 비교하여 주소가 아니라 내용을 비교
		// m1.equals(m3) 은 주소비교이다 → 내용비교를 위해 기능을 수정해야 한다
		System.out.println(m1.equals(m3));  // false
	}

}
