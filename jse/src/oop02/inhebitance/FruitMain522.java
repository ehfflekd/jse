package oop02.inhebitance;

public class FruitMain522 {
	public static void main(String[] args) {
		//인터페이스는 객체를 만들 수 없다.
		FruitInterface522 apple = new AppleImpl522();
		FruitInterface522 orange; // FruitInterface 타입의 참조변수를 선언
		orange = new OrangeImpl522();
		   // 클래스 OrangeImpl 의 객체를 생성하여 orange 에 할당하였다.
		FruitInterface522 banana = new BananaImpl522();
		apple.display("맛있는 ");
		orange.display("오래된 ");
		banana.display("비싼 ");
		// orange.getCount();
		// 인터페이스에 선언된 메소드만 호출이 가능하다.
	}
}
