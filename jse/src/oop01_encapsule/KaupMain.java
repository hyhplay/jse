package oop01_encapsule;

import java.util.Scanner;

public class KaupMain {
		public static void main(String[] args) {
			double height=0;
			double weight=0;
			int idx = 0;
			
			Scanner scanner = new Scanner(System.in);
			KaupVO vo = new KaupVO(height, weight);
			System.out.println("키를 입력해 주세요.");
			height = scanner.nextDouble();

			System.out.println("몸무계를 입력해 주세요.");
			weight = scanner.nextDouble();
		
			vo.setWeight(weight);
			vo.setHeight(height);
			vo.setIdx(idx);
			vo.getMsg();
			System.out.println(vo.toString());
			System.out.println("완료");
		}
}