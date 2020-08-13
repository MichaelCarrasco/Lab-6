import java.util.Scanner;
public class SimpleTime {

	public static void main(String[] args) {
		System.out.print("Enter an integer: ");
		Scanner input = new Scanner(System.in);
		int N=input.nextInt(); 
		System.out.println(foo(N));
		input.close();

	}
	public static int foo(int N) {
		 int result = 0;
		 for (int i=0; i<N; i++) {
			 result++;
			 for (int j=0; j<N; j++) {
				 result++;
		 		for (int k=0; k<N; k++) {
		 			result++;

		 		}
			 }
		 }
		return result;

	}
}
