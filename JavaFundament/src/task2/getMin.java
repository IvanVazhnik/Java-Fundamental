package task2;

import java.util.ArrayList;
import java.util.List;

public class getMin {
	
	
		
	
	
public List<Double> func(double e){
		
		List<Double> arr = new ArrayList<>();
		
		double n = 1;
		double a = 1/Math.pow(n+1, 2);
		
		while(a>e){
			a = 1/Math.pow(n+1, 2);
			arr.add(a);
			n++;
			
			
		}
		
	
		
		return arr;
		
		
		
		
	}


public double getMinValue(List<Double> arr){
	
	double min = 10;
	
	for(int i=0;i<arr.size();i++){
		if(min>arr.get(i))
		{
			min=arr.get(i);
		}
		System.out.println(arr.get(i));
		
	}
	System.out.println("min element = "+min);
	
	
	
	
	return min;
	
}
	
	

}
