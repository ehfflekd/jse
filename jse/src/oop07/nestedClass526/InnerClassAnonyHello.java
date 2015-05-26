package oop07.nestedClass526;

public class InnerClassAnonyHello {
	interface GreetingService{
		public void great(String name);
	}
	public void sayHello(){
		/*
		 내부클래스 인터페이스 구현방법 1.
		 * */
		class EnglishGreetServiceImpl implements GreetingService{

			@Override
			public void great(String name) {
				System.out.println("Hello " + name);
				
			}
			
		}
		GreetingService eng = new EnglishGreetServiceImpl();
		
		/*
		 내부클래스 인터페이스 구현방법 2.
		 * */
		GreetingService kor = new GreetingService() {
			
			@Override
			public void great(String name) {
				System.out.println("안녕하세요." + name);
				
			}
		};
		eng.great("TOM");
		kor.great("톰");
	}
	public static void main(String[] args) {
		InnerClassAnonyHello great = new InnerClassAnonyHello(); 
		great.sayHello();
	}
}
