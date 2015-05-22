package oop02.inhebitance;
/*
Date : 2015.5.22
Authot : 김하융
Desc : 멤버 변수 상속에 관한 예제
 * */
/*
 부모클래스 ◁- 자식클래스
 * */
class Car{
	String name = "자동차";
}
class Hcar extends Car{
	String brand = "현대";
}
class Dcar extends Car{
	String brand = "대우";
}

public class MemberVarExtendsDemo522 {
	public static void main(String[] args) {
		Hcar h = new Hcar();
		
		System.out.print(h.brand + "\t");
		System.out.println(h.name );
		
		Dcar d = new Dcar();
		
		System.out.print(d.brand + "\t");
		System.out.println(d.name );
	}
}
