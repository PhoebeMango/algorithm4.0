
public class ex09 {
	public static void main(String[] args) {
		int A = 100;
		String a = Integer.toBinaryString(A);
		System.out.println(a);
		
		int N = 100;
		String s = "";
		for (int n = N; n > 0; n/=2) {
			s = (n%2)+s;
			System.out.println(s);
		}
		System.out.println(s);
	}



}
