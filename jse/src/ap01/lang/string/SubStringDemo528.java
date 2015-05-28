package ap01.lang.string;
/*
 java.lang.String 에서
 subString(n) 은 n 부터 끝까지 잘라낸다.
 subString(n,m) 은 n 부터 m 까지 잘라낸다.
 n <= x < m (시작하는 글자는 이상 끝글자는 앞에서 잘라낸다.)
 
 * */
public class SubStringDemo528 {
	public static void main(String[] args) {
		String str = "Hello Java";
		System.out.println(str.substring(6));
		System.out.println(str.substring(6, 8));
	}
}
