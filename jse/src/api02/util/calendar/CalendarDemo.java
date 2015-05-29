package api02.util.calendar;

import java.util.Calendar;

public class CalendarDemo {
		public static void main(String[] args) {
			//Calendar의 getInstance() 는 
			//클래스를 통해 바로 불러와서 인스턴스를 생성한다.
			//그래서 new Calendar()와 같은
			// 생성자 문법을 사용하지 않고 아래처럼 생성했다.
			Calendar date = Calendar.getInstance();
			System.out.println("오늘날짜:"); // println은 줄 개행까지 포함이고, ln을 지우면 개행이 없다.
			System.out.println(date.get(Calendar.YEAR)+"년");
			System.out.println((date.get(Calendar.MONTH)+1)+"월");
			System.out.println(date.get(Calendar.DATE)+"일");
			
			System.out.println();
			
			
			
			/*
			 * 스케쥴 프로그램
			 */
			date.set(Calendar.HOUR, 22);
			date.set(Calendar.MINUTE, 30);
			date.set(Calendar.SECOND, 45);
			System.out.println("수정된 시간은:");
			System.out.println(date.get(Calendar.HOUR)+"시");
			System.out.println(date.get(Calendar.MINUTE)+"분");
			System.out.println(date.get(Calendar.SECOND)+"초");
			
			/*바로 출력을 하면 시스템에서 제공하는 시간들이 나옵니다.
			 * 따라서 toString()을 오버라이딩 해야 합니다.
			 * 여기서는 static 으로 별도로 작성합니다.
			 */
		}
		public static String toString(Calendar date){
			return date.get(Calendar.YEAR)+"년"
			        +date.get(Calendar.MONTH)+"월"
                     +date.get(Calendar.DATE)+"일";		
		}
}