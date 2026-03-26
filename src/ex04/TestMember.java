package ex04;

class Member {
	// Field : package level 변수 ( 같은 폴더에서 변수 공유)
	// package level : access modifier(public, private, protected, default)를 안붙인거
	
	// Field 는 전부 private
	private int id;
	private String name;
	private String email;
	
	// Constructor
	public Member() {}
	public Member(int id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}

	// to string
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
	// Setter 함수 : 외부클래스에서 내부 Field 에 값을 넣는 방법
	// private 쓰면 setter 써야함 field 외부값 변경
 /*	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	} */
	
	// Getter 함수 :  외부클래스로 내부 Field 에 값을 내보는 방법 
	// 불러올때는 get 사용
 /*	public String getName() {
		return this.name;
	}
	
	public int getId() {
		return id;
	}
	public String getEmail() {
		return email;
	} */
		
	// Setter & Getter 단축키로 한번에
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
		
} // class end

public class TestMember {

	public static void main(String[] args) {
		
		Member m1 = new Member();
		m1.setId ( 1 );
		m1.setName ( "박찬호" );
		m1.setEmail ( "parkch@lotte.com" );		
		System.out.println(m1); 
		
		String name1 = m1.getName();
		System.out.println("m1의 이름:" + name1 ); 
		
		Member m2 = new Member(2,"강호동","kanghd@busan.com");
		System.out.println(m2);
		m2.setEmail ("kanghd@samsung.com");
		// m2.email = "kanghd@samsung.com"; // not visible 
		System.out.println(m2);
		System.out.println("====================================");
		
		
		System.out.println("m2의 아이디:" + m2.getId() ); 
		System.out.println("m2의 이름:" + m2.getName() ); 
		System.out.println("m2의 이메일:" + m2.getEmail() ); 
		
	}

}
