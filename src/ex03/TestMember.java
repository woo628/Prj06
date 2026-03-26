package ex03;

class Member {
	// Field (package level)
	int id;
	String name;
	String email;
	
	// Constructor
	public Member() {
		System.out.println("객체 생성");
	}
	
	public Member(String msg) {
		System.out.println(msg + "객체 생성");
	}
	
	public Member(int id, String name, String email) {
		this("msg"); // 기본생성자 Member() 호출하였다. - this: 나 자신
		//super();  // super: 부모클래스 → parent, super(); : 부모클래스의 기본생성자를 호출해
		this.id = id;
		this.name = name;
		this.email = email;
		System.out.println("객체 생성");
	}
	
	// Method
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", email=" + email + "]";
	}


	
} // class end


public class TestMember {

	public static void main(String[] args) {
		Member m1 = new Member();
		m1.id = 1;
		m1.name = "박찬호";
		m1.email = "parkch@lotte.com";		
		System.out.println(m1);
		
		Member m2 = new Member(2,"강호동","kanghd@busan.com");
		System.out.println(m2);
	}

}
