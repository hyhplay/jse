package oop01_syntax;

public class CardVO {
	String kind; // 카드의 무늬
	int number; // 카드의 숫자
	static int width=150; // 카드의 너비
	static int height=300; // 카드의 높이

	public CardVO(String kind,int number) {
		System.out.println("내 카드는 "+ kind + " 이고"
				+" 숫자는 "+ number +" 이다.");
	}
	public void CardVO1(String kind,int number) {
		System.out.println("당신 카드는 "+ kind + " 이고"
				+" 숫자는 "+ number +" 이다.");
	}
	
	
	public void myCard(String kind,int number){
		System.out.println("당신 카드의"+"숫자"+"는"+ number+"이고"
				+ "내 카드"+ "숫자"+"는"+ kind + "이므로"
				+ "당신이 이겼습니다.");
	}

}