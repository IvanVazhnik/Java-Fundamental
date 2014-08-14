package task3;

import java.util.List;

public class Task3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		getFunc f = new getFunc();
		int a = 0;
		int b = 10;
		int h = 2;
		List<Double> arr = f.func(a, b, h);
		
		for(int i = 0;i<arr.size();i++){
			System.out.println("x = "+i + "; F("+i+") = " + arr.get(i));
			
			
		}
		
		

	}

}
