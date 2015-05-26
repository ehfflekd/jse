package oop07.nestedClass526;

public class InnerClassMain526 {
	public static void main(String[] args) {
		InnerClassMain526 inn = new InnerClassMain526();
	//	inn.getInnerClassInstance526(); 인스턴스 내부 클래스 호출시
		inn.getInnerClassLocal526();
	}
	/*
	 내부클래스 형태 중... 첫번째인 인스턴스 내부클래스 호출 방법
	 * */
	public void getInnerClassInstance526(){
		InnerClassInstance526.Inner inner = new InnerClassInstance526().new Inner();
		inner.printData();
	}
	public void getInnerClassStatic526(){
	 // 스태틱 클래스는 객체를 생성하지 않고.. 클래스에서 직접 접근한다.
	 // 따라서 InnerClassStatic.Inner() 으로 접근하는 형태에 주의 !!
		InnerClassStatic526.Inner Inner = new InnerClassStatic526.Inner();
		Inner.printData();
	}
	public void getInnerClassLocal526(){
	InnerClassLocal526 outer = new InnerClassLocal526();
	outer.innerTest(1000);
	}
}
