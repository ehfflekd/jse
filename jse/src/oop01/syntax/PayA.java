package oop01.syntax;

public class PayA {
	private String name;
	private int salary; // 급여
	public static final double TAX = 0.1; // 세율 0.1
	private int taxVal;
	private int income; // 실급여 = 급여 - 급여*세율
	
	
	public void setTax(int salary){
		//System.out.println("PayA에 넘어온 파라미터 값 :" + salary);
		this.taxVal = (int)(salary*TAX);
	}
	public void setIncome(int salary){
		this.income = (int) (salary-salary*TAX);
	}
	public int getTax(){
		return (int) TAX; //반환하는 값 출력
	}
	public int getIncome(){
		return income;
	}
}
