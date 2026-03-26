package ex01;

/*
num,name,kor,eng,mat
번호,이름,국어,영어,수학
1,사나,70,80,90
2,모모,0,70,100
3,쯔위,70,90,90
4,정연,80,90,70
5,원영,90,90,89
6,유진,100,100,100
*/

class Score {
//입력:번호,이름,국어,영어,수학
//     num, name, kor, eng, mat	
//출력:번호 이름 국어 영어 수학 총점 평균 등급
//     num, name, kor, eng, mat, tot, avg, grade
	
	// Field
	// 입력
	int num;
	String name;
	int kor;
	int eng;
	int mat;
	
	// 출력
	int tot;
	double avg;
	char grade;
	
	// Constructor - alt + shift + s 소스생성
	/*
	 * public Score(int num, String name, int kor, int eng, int mat, int tot, double
	 * avg, char grade) { super(); this.num = num; this.name = name; this.kor = kor;
	 * this.eng = eng; this.mat = mat; this.tot = tot; this.avg = avg; this.grade =
	 * grade; }
	 */
	/*
	 * public Score(int num, String name, int kor, int eng, int mat) {
	 * 
	 * 	this.num = num; // this = 나 sc1일땐 sc1.num = num; sc2일떈 sc2.num = num; this= sc1,sc2.... 
	 * 	this.name = name;
	 *  this.kor = kor; 
	 *  this.eng = eng; 
	 *  this.mat = mat;
	 * }
	 */
	
	public Score(int num, String name, int kor, int eng, int mat) {

		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		
		//계산
		getTot();
		getAvg();
		getGrade();
	}
	
	
	private void  getTot() {
		this.tot = this.kor + this.eng + this.mat;
	}
	
	private void getAvg() {
		this.avg = (this.kor + this.eng + this.mat) / 3.0;
	}

//	private void getGrade() {  // if 문
//		if ( 90 <= this.avg && this.avg <= 100) {
//			this.grade = 'A';
//		} if ( 80 <= this.avg && this.avg < 90) {
//			this.grade = 'B';
//		} if ( 70 <= this.avg && this.avg < 80) {
//			this.grade = 'C';
//		} if ( 60 <= this.avg && this.avg < 70) {
//			this.grade = 'D';
//		} if (0 <= this.avg && this.avg < 60) { 
//			this.grade = 'F';
//		}
	
	private void getGrade() { // switch 문  정수, 문자열만 가능
		
		int v = (int) this.avg / 10;
		switch (v) {
		case 10 : 
		case 9 : this.grade = 'A'; break;
		case 8 : this.grade = 'B'; break;
		case 7 : this.grade = 'C'; break;
		case 6 : this.grade = 'D'; break;
		default : this.grade = 'F'; break;
		}
	}
	

	
	static void title( ) {
		String title = "번호 이름 국어 영어 수학 총점 평균 등급";
		System.out.println(title);		
	}
	
	// Method
	void disp() {
		String fmt   = "  %d   %s  %d  %d  %d  %d  %.2f  %c\n";
		System.out.printf(fmt,num, name, kor, eng, mat, tot, avg, grade);
	} // disp end

	
} // class end



public class TestScore {

	public static void main(String[] args) {
        // Score sc1 = new Score();  // 기본생성자가 없고 다른 생성자만 존재할 때
		Score.title();
		Score sc1 = new Score (1,"사나",70,80,90);
		sc1.disp();
		
		Score sc2 = new Score (2,"모모",0,70,100);
		sc2.disp();
		
		Score sc3 = new Score (3,"쯔위",70,90,90);
		sc3.disp();
		
		Score sc4 = new Score (4,"정연",80,90,70);
		sc4.disp();
		
		Score sc5 = new Score (5,"원영",90,90,89);
		sc5.disp();
		
		Score sc6 = new Score (6,"유진",100,100,100);
		sc6.disp();
	}

}
