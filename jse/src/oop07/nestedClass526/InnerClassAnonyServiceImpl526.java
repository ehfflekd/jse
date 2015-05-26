package oop07.nestedClass526;

public class InnerClassAnonyServiceImpl526 {
	String data = "Hello Anonymous World !!";
	public void print(){
		new InnerClassAnnonyService526(){

			@Override
			public void printData() {
				System.out.println("익명 내부 클래스 출력 :" +data);
				
			}
			
		}.printData();
	}
}
