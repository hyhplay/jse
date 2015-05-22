package oop02_syntax;

public class Car {
		String name = "자동차";
}
class Hcar extends Car{
	String brand = "현대";
}
class Dcar extends Car{
	String brand = "대우";
}

public class MemberVarExtendsDemo{
	public static void main(String[] args){
		Hcar h = new Hcar;
		
		System.out.println(h.brand + "\t");
		System.out.println(h.name);
		
		Dcar d = new Dcar();
		
		System.out.println(d.brand + "\t");
		System.out.println(d.name);
	}
}
