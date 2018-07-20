
public class ex14 {
	public static int lg(int N) {
		int i = 0;
		int product = 1;
		
		while (product <= N ) {
			product *= 2;
			i++;
		} 
		return i;
		
		
	}
	
	public static void main(String[] args) {
		int N = 7;
		int count = lg(N);
		System.out.println(count);
	}

}
