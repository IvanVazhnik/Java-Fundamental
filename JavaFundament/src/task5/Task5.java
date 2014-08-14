package task5;

public class Task5 {

	
	public static void main(String[] args) {
		
		getMatrix m = new getMatrix();
		int n =7;
		int[][] matrix = m.initMatrix(n);
		for(int i = 0 ;i < n;i++){
			System.out.println(" ");
			for(int j = 0;j<n;j++)
				System.out.print(matrix[i][j]);
		}
		
		
		
	}

}
