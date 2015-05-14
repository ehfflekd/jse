package cmm03.flow;

import java.util.Scanner;

public class No07_ManOrWoman {
	public static void main(String[] args) {
		String ssn = "";
		Scanner scanner = new Scanner(System.in);
		ssn = scanner.nextLine();
		char ch = ssn.charAt(7); // 7번째 숫자 확인
		
		if(ch == '1' || ch =='3'){
			System.out.println(" 남성 ");
		}else if(ch == '2' || ch =='4'){
			System.out.println(" 여성 ");
		}else{
			System.out.println(" 입력이 잘못 되었습니다. ");
		}
		
	}
}
