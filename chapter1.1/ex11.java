
public class ex11 {
	/*
	public static void main(String[] args) {
		boolean[][] b =  {{true,false,true},{false,true,true},{true,false,true}};
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++)
				System.out.print(b[i][j]? '*' : ' ');
		System.out.println();
		}
			
	}
	 */

	public static void printBoolean(boolean[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			System.out.print(i+"row:");
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] ? '*' : ' ');
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		boolean[][] b = {{true,false,true},{false,true,true},{true,false,true}};
		
		printBoolean(b);
	}	
	
	/*
	public static void printBooleanMatrix(boolean[][] matrix) {
		System.out.print(' ');
		for (int i = 0; i < matrix[0].length; i++) {
			System.out.print(i);
		}
		System.out.println();
		for (int i = 0; i < matrix.length; i++) {
			System.out.print(i);
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] ? '*' : ' ');
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		boolean[][] a = { { true, false, true }, { false, true, false },
				{ true, true, false } };
		printBooleanMatrix(a);
	}
	*/

}
