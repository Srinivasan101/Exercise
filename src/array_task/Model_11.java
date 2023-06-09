package array_task;

public class Model_11 {

	public static void main(String[] args) {
		int [][] x = {{1,2,3},{4,5,6},{7,8,9}};
		int [][] y = {{9,8,7},{6,5,4},{3,2,1}};
		int [][] z = new int[3][3];
		
		for(int i = 0; i < x.length; i++) {
			for (int j = 0; j < x [0].length;j++ ) {
				 z [i][j] = x[i][j] + y[i][j];
			}
		}
		System.out.println("sum of the matrix");
		for(int i = 0; i < z.length; i++) {
			for(int j = 0; j < z[0].length; j++) {
				System.out.print(z[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
