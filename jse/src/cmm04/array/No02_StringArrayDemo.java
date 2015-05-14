package cmm04.array;

public class No02_StringArrayDemo {
	public static void main(String[] args) {
		String[] juso = { "서울","종로","광화문" };
		for(int i=0; i<juso.length; i++){//배열 명 + length : 배열의 끝이 나오면 조건문 종료
			System.out.println("주소는 :" + juso[i]);
		}
		//String[] juso = new String[3];
		//juso[0] = "서울";
		//juso[1] = "종로";
		//juso[2] = "광화문";
	}
}
