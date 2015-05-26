package oop01_encapsule;

public class PayA {
	String name;
	int salary; // 급여
	public static final double tax = 0.1;
	int income;
	double tax2;
	double Salary2;
	
	public void setname(String name){
		this.name = name;
	}
	
	public void setIncome(int income){
		this.income = income;
	}
	
	
	/* 세금을구하는기능 */
	public void setPee(int income){
		this.tax2 = this.tax*income;
	}
	
	
	
	/* 실수령액 */
	
	public void setSalary2(int income){
		this.Salary2 = income-(this.tax*income);
	}
	
	public double getTax(){
		return tax2;
	}
	
	public double getsalary(){
		return Salary2;
	}
	
	
}
