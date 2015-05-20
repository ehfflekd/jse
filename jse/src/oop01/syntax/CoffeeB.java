package oop01.syntax;

public class CoffeeB {
	public CoffeeB() {
		System.out.println("돈을 넣다.");
	}
	public CoffeeB(int money) {
		this();
		System.out.println(money + "원");
	}
	public CoffeeB(int money, boolean exist) {//파라미터 값은 중요하지 않고 타입이름이 중요
		this(money);
		System.out.println("구매가능여부 : " + (exist == true ? "커피종류선택" : "커피없음")); // 삼항연산자
	}
}
