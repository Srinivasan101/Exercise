package array_task;

public class Model_22 {

	public static void main(String[] args) {
		int arr [][] = {{10,20,30},{40,50,60},{70,80,90}};
		int x = arr.length;
		int y = arr[0].length;
		int z[][] = new int [y][x];
		for (int i=0;i<x;i++) {
			for(int j = 0; j <y;j++) {
			 z [j][i] = arr[i][j];
			}
		}
		System.out.println("find the transpose matrix :");
		for (int i=0; i< y; i++) {
			for( int j =0; j<x;j++){
			System.out.print(z[i][j] +" ");
			}
		System.out.println();
		}
}
}




