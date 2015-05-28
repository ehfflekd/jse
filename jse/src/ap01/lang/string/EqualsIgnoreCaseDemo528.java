package ap01.lang.string;

public class EqualsIgnoreCaseDemo528 {
	public static void main(String[] args) {
		System.out.println(
				"Hello".equals("hello")?"같습니다":"다릅니다"
				);
		System.out.println(
				"Hello".equalsIgnoreCase("hello")?"같습니다":"다릅니다"
				);
	}
}
