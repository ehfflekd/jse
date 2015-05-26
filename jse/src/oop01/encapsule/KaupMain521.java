package oop01.encapsule;
import java.util.Scanner;
public class KaupMain521 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("키를 입력해 주세요.");
		double height=scanner.nextDouble();
		System.out.println("몸무게를 입력해 주세요.");
		double weight=scanner.nextDouble();
		KaupVO521 vo = new KaupVO521(height, weight);
		vo.setHeight(height);
		vo.setWeight(weight);
		int idx=0;
		vo.setIdx(height, weight);
		vo.getMsg();
		System.out.println(vo.toString());
		System.out.println("완료");
	}
}
