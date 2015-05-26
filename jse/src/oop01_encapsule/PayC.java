package oop01_encapsule;

public class PayC {
	String name;
	int salary; // 급여
	public static final double tax = 0.1;
	int income;
	double tax2;
	double Salary2;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public double getTax() {
		return this.tax2;
	}
	
	public void setIncome(int income) {
		this.income = income;
	}
	
	
	public void setTax2(int income) {
		this.tax2 = tax*income;
	}
	public double getSalary() {
		return Salary2;
	}
	public void setSalary2(int income) {
		this.Salary2 = income-(tax*income);
	}
	
	
}
