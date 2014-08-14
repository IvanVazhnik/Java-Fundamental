package task4;

import java.util.List;

public class Task4 {

	
	public static void main(String[] args) {
		
		getMax m = new getMax();
		
		int n =10;
		
		List<Integer> arr = m.arrayInit(n);
		System.out.println(m.getMaxValue(arr));
		
		
	}

}
