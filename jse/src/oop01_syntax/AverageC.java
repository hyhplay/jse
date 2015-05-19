package oop01_syntax;

public class AverageC {
	String name;
	int kor;
	int eng;
	int tot; // 합계
	double avg;
	
	/* 이름 저장하는 기능*/
	public void setName(String name){
		this.name = name; // parameters
	}
	
	/* 점수를 저장하는 기능 */
	public void setkor(int kor){
		this.kor = kor;
	}
	
	public void setEng(int eng){
		this.eng = eng;
	}
	/* 합계를 구하는 기능*/
	public void setSum(int kor,int eng){
		this.tot = kor+eng;
	}
	/* 평균점수를 구하는 방법 */
	public void setAvg(int tot){
		this.avg = this.tot/2;
	}
	/* 평균점수를 구하는 방법 2...국어 영어점수 두개만으로 구하기 */
	/* Overloading : 오버로딩 */
	public void setAvg2(int kor, int eng){
		this.avg = (kor+eng)/2;
	}
}
