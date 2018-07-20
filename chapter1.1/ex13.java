import java.util.Arrays;;

public class ex13 {
	/*
	public static int[][] transform(int[][] a) {
		int M = a.length-1;
		int N = a[0].length-1;
		int[][] Ta =new int[M+1][N+1];
		for (int i=0; i<=M; i++) {
			for (int j = 0; j<=N;j++)
				Ta[i][j] = a[M-i][N-j];
		}
		
		for (int i =0; i<Ta.length; i++)
			System.out.println(Arrays.toString(Ta[i]));
		
		return Ta;	
	}
	*/
	
	public static int[][] transpose(int[][] a){
		int M = a.length;
		int N = a[0].length;
		int[][] Ta = new int[N][M];
		
		for (int i=0; i<M; i++) {
			for (int j = 0; j<N;j++)
				Ta[j][i] = a[i][j];
		}
		for (int i =0; i<Ta.length; i++)
			System.out.println(Arrays.toString(Ta[i]));
		
		return Ta;		
	}
	
	public static void main(String[] args) {
		int[][] a = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

		//for (int i=0; i<a.length; i++)
			//System.out.println(Arrays.toString(a[i]));
		transpose(a);
		
	}

}
