package cmm03.flow;

import java.util.Scanner;

public class No7_ManOrWoman02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("주민번호 입력 (ex.123456-1234567)");
		String ssn = scanner.nextLine();
		
		char ch = ssn.charAt(7);
		
		switch (ch){
		case '1' : System.out.println("남자"); break;
		case '2' : System.out.println("여자"); break;
		case '3' : System.out.println("남자"); break;
		case '4' : System.out.println("여자"); break;
		case '5' : System.out.println("외국인"); break;
		case '6' : System.out.println("외국인"); break;
		
		default:System.out.println("틀렸습니다.");
		break;
		}
	}
}
