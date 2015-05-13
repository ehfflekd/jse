package cmm03.flow;

import java.util.Scanner;

public class No02_IfElse01Demo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //값을 받아들이는 영역 , 키보드로 값을 입력
		System.out.println("값을 입력하세요.."); 
		/*int i;
		i = 0;*/
		int i = 0;
		i = scanner.nextInt();
		System.out.println("입력값은 "+i+" 입니다. ");
	}
}
