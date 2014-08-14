package task2;

import java.util.List;

public class Task2 {

	
	public static void main(String[] args) {
		
		getMin g =new getMin();
		double e = 0.006;
		
		List<Double> arr = g.func(e);
		g.getMinValue(arr);
		
		
		
	}

}
