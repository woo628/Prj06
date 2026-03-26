package ex05;

class Score {
	
	// Field
	// 입력
	private int num;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	
	// 출력
	private int tot;
	private double avg;
	private char grade;
	
	
	// Constructor
	public Score(int num, String name, int kor, int eng, int mat) {
		super();
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		
		this.tot = getTot();
		this.avg = getAvg();
		this.grade = getGrade();
	}
	public Score() {}
	// 계산용
	public int getTot() {
		return  kor + eng + mat;
	}

	public double getAvg() {
		return  getTot() / 3.0;
		// return 문 일 때 getTot() 사용가능
	}
	
	public char getGrade() {
		
		  avg = getAvg();
		if ( 90 <= avg && avg <= 100) {
			grade = 'A';
		} if ( 80 <= avg && avg < 90) {
			grade = 'B';
		} if ( 70 <= avg && avg < 80) {
			grade = 'C';
		} if ( 60 <= avg && avg < 70) {
			grade = 'D';
		} if (0 <= avg && avg < 60) { 
			grade = 'F';
		}
		return grade;
	}


	// toString
	@Override
	public String toString() {
		return "Score [num=" + num + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + ", tot="
				+ tot + ", avg=" + avg + ", grade=" + grade + "]";
	}


	// getter & setter
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}
	
	
	// 제목 함수
	public static void title() {
		String title = "번호 이름 국어 영어 수학 총점 평균 등급";
		System.out.println(title);		
	}

	// display 함수
	public void disp() {
		String fmt   = "  %d   %s  %d  %d  %d  %d  %.2f  %c\n";
		System.out.printf(fmt, num, name, kor, eng, mat, tot, avg, grade);
	}
	
}

public class TestScore {

	public static void main(String[] args) {
		Score.title();
		Score m1 = new Score(1,"사나",70,80,90);
		System.out.println(m1);
		m1.disp();
		
		Score m2 = new Score(2,"모모",0,70,100);
		System.out.println(m2);
		m2.disp();
		
		Score m3 = new Score();
		System.out.println(m3);
		m3.setNum(3);
		m3.setName("쯔위");
		m3.setKor(70);
		m3.setEng(90);
		m3.setMat(100);
		m3.disp();
		
		
	}


}
