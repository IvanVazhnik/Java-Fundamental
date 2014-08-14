package task5;

public class getMatrix {
	
	
	
	
	
	
	
	
	
	public int[][] initMatrix(int n){
		int[][] matrix = new int[n][n];
		
		
		for(int i=0;i<n;i++){
			
			matrix[i][i]=1;
				
								
		}
		
		
	
		
		int k =0;
		for(int j = n-1;j>=0;j--)
		{
			matrix[k][j] = 1;
			k++;
									
		}
		
		return matrix;
		
		
	}
	
	
	
			
		
		
	}
	
	
	

