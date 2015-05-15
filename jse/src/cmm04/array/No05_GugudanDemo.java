package cmm04.array;

public class No05_GugudanDemo {
	public static void main(String[] args) {
		
	      for(int i=1; i<=9; i++) {
	            for(int j=2; j<=5; j++) {
	                System.out.printf("%d * %d = %2d", j, i, (j*i));
	                System.out.print("\t");
	            }
	            System.out.println();
	        }
	 
	        System.out.println();
	 
	        for(int i=1; i<=9; i++) {
	            for(int j=6; j<=9; j++) {
	                System.out.printf("%d * %d = %2d", j, i, (j*i));
	                System.out.print("\t");
	            }
	            System.out.println();
	        }
	    }
	 
	}
