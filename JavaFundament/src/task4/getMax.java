package task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class getMax {
	
	
	
	
	public  List<Integer> arrayInit(int n){
		
		 Random rand = new Random();
		
		int[] arr = new int[n] ;
		
		int len =arr.length;
		List<Integer> arr2 = new ArrayList<>();
				
		
		for(int k = 0;k<len;k++){
			arr[k]=rand.nextInt(10);
				
		}
				
		for(int i = 0; i<len/2;i++){
			arr2.add(arr[i]+arr[len-i-1]);
		
			
		}
			
						
		return arr2;
		
		
	}
	

     public int getMaxValue(List<Integer> arr){
		
    	 
    	 
    	 int max = 0;
 		for(int i = 0 ; i<arr.size();i++){
 			if(max<arr.get(i)){
 				max = arr.get(i);
 			}
 			
 		}
 		
		return max;
		
	}
	
	
}
	

	
	
	


