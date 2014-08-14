package task3;

import java.util.ArrayList;
import java.util.List;

public class getFunc {
	
	
	
	
public List<Double> func(int a, int b, int h){
		
		List<Double> arr = new ArrayList<>();
		
		int x = 1;
		while (a<=b){
			double f = Math.tan(2*x)-3;
			arr.add(f);
			x++;
			a+=h;
			
			
		}
		
		return arr;
		
		
		
	}

}
