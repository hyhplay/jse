package oop01_encapsule;

public class AverageB {
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
		
	public static void main(String[] args) {
		/* 객체 생생및 메모리 할당 */
		AverageA hulk = new AverageA();
		AverageA iron = new AverageA();
		AverageA hawk = new AverageA();
		/* 이름 저장 */
		hulk.name = "헐크";
		iron.name = "아이언";
		hawk.name = "호크";
		/* 점수 저장 */
		hulk.kor = 100;
		hulk.eng = 80;
		iron.kor = 50;
		iron.eng = 90;
		hawk.kor = 20;
		hawk.eng = 40;
		
		/* 총점, 평균 계산 */
		hulk.tot = hulk.kor + hulk.eng;
		hulk.avg = hulk.tot/2;
		iron.tot = iron.kor + iron.eng;
		iron.avg = iron.tot/2;
		hawk.tot = hawk.kor + hawk.eng;
		hawk.avg = hawk.tot/2;
		
		/*출력*/
		System.out.println("===" + iron.name+" 의 성적표===");
		System.out.println("국어 :" + iron.kor);
		System.out.println("영어 :" + iron.kor);
		System.out.println("합계 :" + iron.kor);
		System.out.println("평균 :" + iron.kor);
		System.out.println();
		System.out.println("===" + hulk.name+" 의 성적표===");
		System.out.println("국어 :" + hulk.kor);
		System.out.println("영어 :" + hulk.kor);
		System.out.println("합계 :" + hulk.kor);
		System.out.println("평균 :" + hulk.kor);
		System.out.println();
		System.out.println("===" + hawk.name+" 의 성적표===");
		System.out.println("국어 :" + hawk.kor);
	    System.out.println("영어 :" + hawk.kor);
	    System.out.println("합계 :" + hawk.kor);
	    System.out.println("평균 :" + hawk.kor);
		System.out.println();
	}
}
