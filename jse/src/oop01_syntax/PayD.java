package oop01_syntax;

public class PayD {
		public static void main(String[] args) {
			PayC hulk = new PayC();
			PayC iron = new PayC();
			PayC tore = new PayC();
			
			hulk.name = "헐크";
			iron.name = "아이언";
			tore.name = "토르";
			
			
			hulk.income = 200;
			iron.income = 300;
			tore.income = 500;
			
			hulk.setTax2(hulk.income);
			iron.setTax2(iron.income);
			tore.setTax2(tore.income);
			
			hulk.setSalary2(hulk.income);
			iron.setSalary2(iron.income);
			tore.setSalary2(tore.income);
			
			
			System.out.println("=== "+ hulk.name +"의 5월 급여내역 === ");
			System.out.println("급여 : " + hulk.income );
			System.out.println("세금 : " + hulk.getTax());
			System.out.println("실수령액 : "+ hulk.getSalary());
			System.out.println();
			System.out.println("=== "+ iron.name +"의 5월 급여내역 === ");
			System.out.println("급여 : " + iron.income);
			System.out.println("세금 : " + iron.getTax());
			System.out.println("실수령액 : " + iron.getSalary());
			System.out.println();
			System.out.println("=== "+ tore.name +"의 5월 급여내역 === ");
			System.out.println("급여 : " + tore.income);
			System.out.println("세금 : " + tore.getTax());
			System.out.println("실수령액 : "+ tore.getSalary());
			System.out.println();
		}
}
